import java.util.Scanner;

public class prime {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int cp=2;
        if(n==1){
            System.out.println("Prime");
        }else{
            while(cp<=n-1){
            if(n%cp==0){
                System.out.println("not prime");
                break;
            }
            cp++;
        }
        if(n==cp){
            System.out.println("prime");
        }

        }
        


        sc.close();
    }
}
