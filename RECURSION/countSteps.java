package Recursion;

public class countSteps {
    public static void main(String[] args) {
        System.out.println(CountStepToZero(14));
    }
    static int CountStepToZero(int n ){
        return helperFunction(n,0);
    }
    private static  int helperFunction(int n , int count){
        if(n==0){
            return count;
        }
        if(n%2==0){
            return helperFunction(n/2,count+1);
        }
        return helperFunction(n-1,count+1);
    }
}
