import java.util.Scanner;

public class isArnstrong{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();// in this we taking the input of the number which we want to check
        boolean isArmstrng=isarmstrng(n);// in this we check the number is armstrong or not by usning the function bellow
        System.out.println(isArmstrng);//print the boolean value that is true ir false
    }
    public static boolean isarmstrng(int n){//fuction to check the number is armstrong or not
        int originalNum=n;//store the oringinal number in a bucket to check later
        int sum=0;
        int numDigit=countDigit(n);//in this take how many digit in the number by using countDgit function bellow

        while(n!=0){//logic of armstrong number
            int digit=n%10;//split the digit
            sum+=Math.pow(digit, numDigit);//sum of power of the digit
            n/=10;//number is decreased
        }
        return sum==originalNum;// check the sum is equal to the originak number or not if yes then it is a armstrong number

    }
    public static int countDigit(int n){//function to count the number of digit in the number
        int count=0;
        while(n!=0){
            n/=10;//split the number
            count++;//increase the count as how many times the number is splited until 0
        }
        return count;
    }
}