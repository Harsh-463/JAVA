package ArraysRecur;

public class binarysearchRecu {
    public static void main(String[] args) {
        int arr[] = {2,5,8,3,8,9,4};
        System.out.println(Binaryfind(arr,5,0,arr.length-1));
    }
    static int Binaryfind(int arr[],int target, int s , int e){
        if(s > e){
            return -1;
        }
        int mid = s + (e-s)/2;
        if(target == arr[mid]){
            return mid;
        }
        if(arr[s] <= arr[mid]){
            if(target>=arr[s] && target <=arr[mid]){
                return  Binaryfind(arr,target,s,e=mid-1);
            }else {
                return Binaryfind(arr,target,e,s=mid+1);
            }
        }
        if(target>=arr[mid] && target <= arr[e]){
            return Binaryfind(arr,target,s=mid+1 , e);
        }
        return Binaryfind(arr,target,s, e=mid-1);
    }
}
