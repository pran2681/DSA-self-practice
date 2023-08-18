import java.util.Scanner;

public class printArmstrongInRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        
        int n1=sc.nextInt();//taking the input of range start
        int n2=sc.nextInt();//taking the input of range end
        ArmstrngInRange(n1,n2);
        
    }
    private static void ArmstrngInRange(int n1,int n2){//function to print the all armdtrong nunber between te range
        for(int n=n1;n<=n2;n++){
            if(isArmstrng(n)){
                System.out.println(n);
            }
        }
    }
    private static boolean isArmstrng(int n){//function to check armstrong
        int originalNum=n;
        int numDigit=countDigit(n);
        int sum=0;
        while(n!=0){
            int digit=n%10;
            sum+=Math.pow(digit, numDigit);
            n/=10;
        }
        return sum==originalNum;
    }
    private static int countDigit(int n){//function to count digit in the number
        int count=0;
        while(n!=0){
            n/=10;
            count++;
        }
        return count;
    }
    
}
