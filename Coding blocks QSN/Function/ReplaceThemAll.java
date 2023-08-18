import java.util.Scanner;

public class ReplaceThemAll{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int input=sc.nextInt();
        int n=input;
        int result=replace(n);
        System.out.println(result);
        
    }
    public static int replace(int n){
        if(n==0){
            return 5;
        }
        int result=0;
        int multiplier=1;
        boolean isNegative=false;
        if(n<0){
            isNegative=true;
            n=Math.abs(n);
        }
        while(n!=0){
            int digit=n%10;
            if(digit==0){
                digit=5;
            }
            result +=digit*multiplier;
            multiplier *=10;
            n/=10;
        }
        return result;
    }
}