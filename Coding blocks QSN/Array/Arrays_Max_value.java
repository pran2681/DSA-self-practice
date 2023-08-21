import java.util.Scanner;

public class Arrays_Max_value {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter the size of the array: ");
        int n=sc.nextInt();
        

        int[] arr=new int[n];
        System.out.println("Enter items in the array: ");

        for(int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
        int MaxValue=findMaxValue(arr);
        System.out.println("The maximum vakue in the array is: ");
        System.out.println(MaxValue);
    }
    public static int findMaxValue(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
