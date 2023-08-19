public class PairSum {
    public static void pairSum(int[]arr, int n, int t){
        int s=0,e=n-1;//s=starting index, e=ending index
        while(s<e){
            int sum=arr[s]+arr[e];
            if(sum<t){
                s++;
            }else if(sum>t){
                e--;
            }else{
                System.out.println(s+" "+e);
                s++;
                e--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,3,5,7,10,11,12,13};
        int n=arr.length;
        int t=16;//target
        pairSum(arr,n,t);
        
    }
}
