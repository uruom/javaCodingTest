package Q4_01_Route_Between_Nodes;

import java.util.LinkedList;

/**
 * @ClassName:MyCodeQ401
 * @Auther: uruom
 * @Description: isConnect
 * @Date: 2022/12/21 20:38
 * @Version: v1.0
 */
public class MyCodeQ401 {
    Graph graph = null;
    int tempOrder = 0;
    public MyCodeQ401(){
        Graph graph = new Graph();
//        System.out.println("1");
        this.graph = graph;
    }
    public Boolean isConnect(int num1,int num2){
        Node node1=graph.getNode(num1);
        Node node2= graph.getNode(num2);
//        System.out.println("2");
        Boolean isConnect[] = new Boolean[graph.nodeNum()];

        isConnect[node1.order] = true;
        LinkedList<Node> linkedList = new LinkedList<>();
        linkedList.add(node1);
//        System.out.println("3");
        while(!linkedList.isEmpty()){
            Node tempNode = linkedList.remove();
            Route tempRoute = tempNode.head;
//            System.out.println("7");
//            System.out.println(tempNode);
//            if(tempNode.head==null) System.out.println("EEEE");
            while(tempRoute.target!=null){
//                System.out.println("AAA");
//                System.out.println(tempRoute.target.order);

                if(isConnect[tempRoute.target.order]==null){
//                    System.out.println("BBB");
                    linkedList.add(tempRoute.target);
                    isConnect[tempRoute.target.order]=true;
                }
//                System.out.println("aaa");
                tempRoute = tempRoute.nextRoute;
                if(tempRoute==null) tempRoute=new Route();
            }
//            System.out.println("8");
        }
//        System.out.println("4");
        if(isConnect[node2.order]==true) return true;
        else return false;

    }


    public class Route{
        Node target = null;
        Route lastRoute = null;
        Route nextRoute = null;

    }

    public class Node{
        int order;
        int routeNum;
        String name;
        Route route = null;
        Route head = null;
        public Node(String name,int routeNum){
            this.name = name;
            this.routeNum = routeNum;

            route = new Route();
            head = route;


            order = tempOrder;
            tempOrder++;
//            System.out.println(tempOrder);
        }
        public void addAdjacent(Node node){
//            System.out.println("6");
            route.target = node;
            route.nextRoute = new Route();
//            System.out.println("5");
            route.nextRoute.lastRoute = route;
            route = route.nextRoute;


        }
    }

    public class Graph{
        Node[] temp = new Node[6];
        public Graph(){
//            System.out.println("2");

            temp[0] = new Node("a", 3);
            temp[1] = new Node("b", 0);
            temp[2] = new Node("c", 0);
            temp[3] = new Node("d", 1);
            temp[4] = new Node("e", 1);
            temp[5] = new Node("f", 0);
//            System.out.println("4");
            temp[0].addAdjacent(temp[1]);
            temp[0].addAdjacent(temp[2]);
            temp[0].addAdjacent(temp[3]);
            temp[3].addAdjacent(temp[4]);
            temp[4].addAdjacent(temp[5]);
//            System.out.println("3");
        }
        public int nodeNum(){
            return 6;
        }
        public Node getNode(int num){
            return temp[num];
        }
    }


}
