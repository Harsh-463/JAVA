package StringsRecursion;

import java.util.ArrayList;

public class ASCII {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//        ASCII("" , "abc");
        System.out.println( ASCII("","abc"));
    }
    static ArrayList<String> ASCII(String made , String given) {
        ArrayList<String> list = new ArrayList<>();
        if (given.isEmpty()) {
            list.add(made);
            return list;
        }
        char ch = given.charAt(0);
        ArrayList<String> first = ASCII(made + ch, given.substring(1));
        ArrayList<String> second = ASCII(made, given.substring(1));
        ArrayList<String> third = ASCII(made + (ch + 0), given.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }

}



