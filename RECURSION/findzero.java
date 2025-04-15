package Recursion;

public class findzero {
    public static void main(String[] args) {
        System.out.println(find(20202));
    }
    static int find(int n ){
        return helperfunction(n,0);
    }
    static int helperfunction(int n,int count){
        if (n==0){
            return count;
        }
        int rem = n%10;
        if(rem==0){
            return helperfunction(n/10,count+1);
        }
        return helperfunction(n/10,count);
    }
}
