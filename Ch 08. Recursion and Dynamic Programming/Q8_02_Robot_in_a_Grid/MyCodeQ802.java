package Q8_02_Robot_in_a_Grid;

import CtCILibrary.AssortedMethods;

import java.util.ArrayList;

/**
 * @ClassName:MyCodeQ802
 * @Auther: uruom
 * @Description: find route bfs
 * @Date: 2023/1/10 16:32
 * @Version: v1.0
 */
public class MyCodeQ802 {
    static ArrayList<Point> points = new ArrayList<>();
    public static Boolean isRouteAccess(boolean[][] maze,int row,int col){
       // System.out.println("row="+row+",col="+col);
        if(maze[row][col]==false)
            return false;
        if(row==0&&col==0){
            if(maze[row][col]==true){
                points.add(new Point(row,col));
                return true;
            }
        }

        if(row>0){
            if(isRouteAccess(maze,row-1,col)){
                points.add(new Point(row,col));
                return true;
            }
        }
        if(col>0){
            if(isRouteAccess(maze,row,col-1)){
                points.add(new Point(row,col));
                return true;
            }
        }
        return false;
    }
    public static ArrayList<Point> getPath(boolean[][] maze){
        if(isRouteAccess(maze, maze.length-1, maze[0].length-1)){
            return points;
        }else{
            return null;
        }
    }
    public static void main(String[] args) {
        int size = 5;
        boolean[][] maze = AssortedMethods.randomBooleanMatrix(size, size, 70);

        AssortedMethods.printMatrix(maze);

        ArrayList<Point> path = getPath(maze);
        if (path != null) {
            System.out.println(path.toString());
        } else {
            System.out.println("No path found.");
        }
    }
}
