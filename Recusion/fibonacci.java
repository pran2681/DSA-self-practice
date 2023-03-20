public class fibonacci{
    public static int fibo(int n){
        if(n<=1){
            return 1;
        }
        else{
            return fibo(n-1)+fibo(n-2);
        }
    }
    public static void main(String args[]){
        int n=5;
        for(int i=0;i<n;i++){
            System.out.print(fibo(i)+" ");
        }
        // // for sum of n fibonacci number
        // int n=5;
        // inr sum=0;
        // for(int i=0;i<n;i++){
        //     sum=fibo(i);
        // }
        // System.out.println(sum);
    }
}