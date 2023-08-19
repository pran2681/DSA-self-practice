public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={5,3,4,1,2};
        int n=arr.length;

        for(int i=0;i<=n-2;i++){
            int min=i;
            for(int j=i+1;j<=n-1;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }

        for(int i=0;i<=n-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
