import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        rev(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        ///System.out.println(Arrays.toString(arr));
    }
    public static void rev(int[] arr){
        int L=0;
        int R=arr.length-1;
        while(L<R){
            int temp=arr[L];
            arr[L]=arr[R];
            arr[R]=temp;
            L++;
            R--;
        }
    }
}
