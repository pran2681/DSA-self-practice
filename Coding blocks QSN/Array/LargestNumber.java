import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();

        int[] arr=new int[size];
        System.out.println("Enter the elements in the array: ");;
        for(int i=0;i<=size-1;i++){
            arr[i]=sc.nextInt();
        }

        int largest=Integer.MIN_VALUE;

        for(int i=0;i<=size-1;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("The largest value is: "+largest);
    }
}
