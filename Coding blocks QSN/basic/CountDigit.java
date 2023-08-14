import java.util.Scanner;

public class CountDigit {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int count=0;

        for(int i=0;i<=n;i++){
            int lastDigit=n%10;
            if(lastDigit==target){
                count++;
            }
            n/=10;
        }
        System.out.println(count);

        sc.close();

    }
}
