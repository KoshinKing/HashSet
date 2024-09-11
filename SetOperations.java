import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetOperations{
    public static void main(String args[]){
        Set<Integer> one=new TreeSet<Integer>();
        one.add(5);
        one.add(7);
        one.add(9);

        Set<Integer> two=new TreeSet<Integer>();
        two.add(9);
        two.add(11);
        two.add(13);

        Set<Integer> three=new TreeSet<Integer>();
        three.addAll(one);
        three.addAll(two);
        System.out.println(three);

        three.clear();
        three.addAll(one);
        three.retainAll(two);//intersection
        System.out.println(three);

        three.clear();
        three.addAll(one);
        three.removeAll(two);
        System.out.println(three);

    }
}