import java.util.Scanner;

public class reverse {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int  N=sc.nextInt();
        int reverse=0;
        while(N !=0){
            int rem=N%10;
            reverse=reverse*10+rem;
            N=N/10;
        }

        System.out.println(reverse);
        


        sc.close();

    }
}
