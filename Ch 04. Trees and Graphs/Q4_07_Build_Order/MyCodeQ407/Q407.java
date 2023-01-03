package Q4_07_Build_Order.MyCodeQ407;

import java.util.ArrayList;

/**
 * @ClassName:Q407
 * @Auther: uruom
 * @Description: Main
 * @Date: 2022/12/22 16:06
 * @Version: v1.0
 */
public class Q407 {

    private static Project findProject(String name,ArrayList<Project> arrayList){
        for(Project project:arrayList){
            if(project.isEqual(name)) return project;
        }
        throw new RuntimeException("No project found");
    }
    public static String[] buildOrderWrapper(String[] nodeName,String[][] dependencies){
        int n = nodeName.length;
        ArrayList<Project> arrayList = new ArrayList<>();
        for(String name:nodeName){
            Project project = new Project(name);
            arrayList.add(project);
        }
        for(String[] dependent:dependencies){
            Project preProject = findProject(dependent[0],arrayList);
            Project postProject = findProject(dependent[1],arrayList);
            preProject.addDependent(postProject);
            postProject.needProject++;
        }
        String[] ans = new String[n];
        int l = 0;
        int r =-1;
        for(Project project:arrayList){
            if(project.ready()){
                ans[++r] = project.name;
                project.useProject();
            }
        }
        while(l<=r){
            findProject(ans[l],arrayList).subDependencies();
            for(Project project:arrayList){
                if(project.ready()){
                    project.useProject();
                    ans[++r] = project.name;
                }
            }
            l++;
        }
        for(Project project:arrayList){
            if(!project.isUsed){
                throw new RuntimeException("No Answer");
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        String[] projects = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        String[][] dependencies = {
                {"a", "b"},
                {"b", "c"},
                {"a", "c"},
                {"d", "e"},
                {"b", "d"},
                {"e", "f"},
                {"a", "f"},
                {"h", "i"},
                {"h", "j"},
                {"i", "j"},
                {"g", "j"}};
        String[] buildOrder = buildOrderWrapper(projects, dependencies);
        if (buildOrder == null) {
            System.out.println("Circular Dependency.");
        } else {
            for (String s : buildOrder) {
                System.out.println(s);
            }
        }
    }
}
