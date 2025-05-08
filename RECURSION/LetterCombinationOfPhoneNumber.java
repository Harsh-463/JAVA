package StringsRecursion;

import java.util.ArrayList;

public class LetterCombinationOfPhoneNumber {
    public static void main(String[] args) {
        System.out.println(padret("" , "22"));
    }

    static ArrayList<String> padret(String made , String given){
        ArrayList<String> list = new ArrayList<>();
        if(given.isEmpty()){
            list.add(made);
            return list;
        }
        int digit = given.charAt(0) - '0'; // this will convert '2' into 2
        if(digit < 2||digit >9){
            return list;
        }
        ArrayList<String> collect = new ArrayList<>();
        for(int i = (digit-1)*3 ; i<(digit)*3 ; i++){
             char ch = (char)('a'+ i);
              collect.addAll(padret(made + ch , given.substring(1)));
        }
        return collect;
    }
}
