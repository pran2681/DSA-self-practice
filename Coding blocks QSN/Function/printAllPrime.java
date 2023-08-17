import java.util.Scanner;

public class printAllPrime {
    public static boolean checkPrime(int n){
        int currNum=2;
        while(currNum<=n-1){
            if(n%currNum==0){
                return false;
            }
            currNum++;
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number till you want: ");
        int n=sc.nextInt();
        int curr=2;
        while(curr<=n){
            if(checkPrime(curr)==true){
                System.out.print(curr+" ");
            }
            curr++;
        }
    }
}
