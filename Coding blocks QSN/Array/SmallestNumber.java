import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();

        int[] arr=new int[size];
        System.out.println("Enter the elements in the array: ");;
        for(int i=0;i<=size-1;i++){
            arr[i]=sc.nextInt();
        }

        int smallest=Integer.MAX_VALUE;

        for(int i=0;i<=size-1;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("The smallest value is: "+smallest);
    }
}
