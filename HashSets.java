import java.util.HashSet;
import java.util.Set;


public class HashSets{
    public static void main(String args[]){
        Set<Double> vals=new HashSet<Double>();
        vals.add(.3);
        vals.add(1.2);
        vals.add(2.6);
        vals.add(42.42);
        vals.add(7.5);
        vals.add(-25.4);
        System.out.println(vals);
        vals.remove(.3);
        System.out.println(vals.remove(.3));
        System.out.println(vals);
    }
}