package ArraysRecur;

import java.util.ArrayList;
import java.util.Arrays;

public class FindDigit {
    public static void main(String[] args) {
        int[] arr = {1,23,5,5,46,7};
        System.out.println(findallindex2(arr, 5,0));
//        find(arr,5,0);
//        System.out.println(list);
//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Integer> ans = findallindex(arr,5,0,list);
//        System.out.println(ans);
//        System.out.println(list);

    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void find(int arr[], int target, int index){
        if(index==arr.length){
             return;
        }
        if(arr[index]==target){
            list.add(index);
        }
        find(arr, target, index + 1);
    }

    static ArrayList<Integer> findallindex(int arr[], int target , int index , ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findallindex(arr,5,index+1,list);
    }

    static ArrayList<Integer> findallindex2(int arr[] , int target , int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCall =  findallindex2(arr,target,index+1);
        list.addAll(ansFromBelowCall);
        return list;
    }
}



