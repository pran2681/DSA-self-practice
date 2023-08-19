import java.util.Scanner;

public class LinearSearch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();

        int[] arr=new int[size];
        System.out.println("Enter the elements in the array: ");;
        for(int i=0;i<=size-1;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the number you want to find: ");
        int key=sc.nextInt();
        
        int i;
        for( i=0;i<=size-1;i++){
            if(arr[i]==key){
                System.out.println(key+" is found"+" at index "+i);
                break;
            }

        }
        if(i==size){
            System.out.println("not found");
        }
    }
}