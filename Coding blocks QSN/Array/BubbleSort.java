import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();

        int[] arr=new int[size];
        System.out.println("Enter the elements in the array: ");;
        for(int i=0;i<=size-1;i++){
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<=size-2;i++){
            for(int j=0;j<=size-2;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for(int i=0;i<=size-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
