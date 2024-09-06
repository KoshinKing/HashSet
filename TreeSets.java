import java.util.Set;
import java.util.TreeSet;

public class TreeSets{
    public static void main(String args[]){
        Set<String> vals=new TreeSet<String>();
        vals.add("aplus");
        vals.add("comp");
        vals.add("sci");
        vals.add("rocks");
        System.out.println(vals);
        vals.remove("comp");
        System.out.println(vals);
    }
}