package StringsRecursion;

import java.util.ArrayList;
import java.util.SplittableRandom;

public class subseq {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//        subseq("","abc",list);
//        System.out.println(list);
        System.out.println(subseq2("" , "abc"));
     }
    static void subseq(String made , String given , ArrayList<String> list){
        if(given.isEmpty()){
            list.add(made);
            return;
        }
        char ch = given.charAt(0);
         subseq( made + ch , given.substring(1),list);
         subseq( made, given.substring(1),list);

    }
    static ArrayList<String> subseq2(String made , String given){
        ArrayList<String> list = new ArrayList<>();
        if(given.isEmpty()){
            list.add(made);
            return list;
        }
        char ch = given.charAt(0);
        ArrayList<String> left = subseq2( made + ch , given.substring(1));
        ArrayList<String> right = subseq2( made, given.substring(1));
        left.addAll(right);
        return left;
    }
}
