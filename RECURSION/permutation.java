package StringsRecursion;

import java.util.ArrayList;

public class permutation {
    public static void main(String[] args) {
       ArrayList<String> ans= PermutationList("" ,"abc");
       System.out.println(ans);
//       ArrayList<String> list = new ArrayList<>();
//       Permutation("","abc",list);
//       System.out.println(list);
        System.out.println(PermutationCount("" , "abc"));
    }

    static void Permutation(String made, String given ,ArrayList<String> list){
        if(given.isEmpty()){
            list.add(made);
            return;
        }
        char ch = given.charAt(0);
        for(int i = 0 ; i <= made.length() ; i++){
            String f = made.substring(0,i);
            String  s = made.substring(i, made.length());
            Permutation(f + ch + s , given.substring(1),list);
        }
    }

    static ArrayList<String> PermutationList(String made, String given){
        ArrayList<String> list = new ArrayList<>();
        if(given.isEmpty()){
            list.add(made);
            return list;
        }
        char ch = given.charAt(0);
        for(int i = 0 ; i <= made.length() ; i++){
            String first = made.substring(0,i);
            String  second = made.substring(i, made.length());
            ArrayList<String> collect = PermutationList(first + ch + second , given.substring(1));
            list.addAll(collect);
        }
        return list;
    }

    static int PermutationCount(String made, String given ){
        if(given.isEmpty()){
            return 1;
        }
        char ch = given.charAt(0);
        int count = 0;
        for(int i = 0 ; i <= made.length() ; i++){
            String f = made.substring(0,i);
            String  s = made.substring(i, made.length());
            count = count + PermutationCount(f + ch + s , given.substring(1));
        }
        return count;
    }
}
