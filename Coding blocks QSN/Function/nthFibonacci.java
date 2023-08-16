import java.util.Scanner;

public class nthFibonacci{
    public static int nthFib(int n){
        if(n==1){
            return 0;
        }else if(n==2){
            return 1;
        }else{
            int a=0,b=1,c=0;
            for(int i=1;i<=n-2;i++){
                c=a+b;
                a=b;
                b=c; 
            }
            return c;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        System.out.println(nthFib(n));
    }
}