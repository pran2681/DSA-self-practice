import java.util.Scanner;

public class BostonNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sumOfDigit=calculateSumOfDigit(n);
        int sumOfPrimeFcator=calculateSumOfPrimeFactor(n);
        if(sumOfDigit==sumOfPrimeFcator){
            System.out.println("It is a Boston number");
        }else{
            System.out.println("It is not a Boston number");
        }
    }
    private static int calculateSumOfDigit(int n){
        int sum=0;
        while(n!=0){
            int digit=n%10;
            sum+=digit;
            n/=10;
        }
        return sum;
    }
    private static int calculateSumOfPrimeFactor(int n){
        int sum=0;
        for(int factor=2;factor<=n;factor++){
            if(n%factor==0){
                sum+=calculateSumOfDigit(factor);
                n/=factor;
                factor--;
            }
        }
        return sum;
    }

}