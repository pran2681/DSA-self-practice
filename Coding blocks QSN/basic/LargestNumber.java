import java.util.Scanner;

public class LargestNumber {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter how many number you want to give: ");
        int n=sc.nextInt();
        System.out.println("Now enter "+n+" numbers here:");
        int largest=0;
        int i=0;

        while(i<n){
            int num=sc.nextInt();
            if(num>largest){
                largest=num;
            }
            i++;
        }
        System.out.println("The largesr number among these is: "+largest);
        sc.close();

    }
}
