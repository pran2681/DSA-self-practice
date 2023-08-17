import java.util.Scanner;

public class nCrProblem {
    public static int factorial(int n){
        int ans=1;
        for(int i=1;i<=n;i++){
            ans=ans*i;
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of 'n' of nCr :");
        int n=sc.nextInt();
        System.out.println("Enter the value of 'r' of nCr :");
        int r=sc.nextInt();


        int A=factorial(n);//n!
        int B=factorial(r);//r!
        int C=factorial(n-r);//(n-r)!

        int ans=A/(B*C);

        System.out.println(ans);
    }
}
