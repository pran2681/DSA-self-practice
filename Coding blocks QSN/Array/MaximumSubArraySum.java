public class MaximumSubArraySum {
    public static void main(String[] args) {
        int[] arr={-1,2,3,-4};
        int n=4;

        int MaxSum=Integer.MIN_VALUE;
        for(int si=0;si<=n-1;si++){
            for(int ei=si;ei<=n-1;ei++){
                int cSum=0;
                for(int k=si;k<=ei;k++){
                    cSum+=arr[k];
                }
                if(cSum>MaxSum){
                    MaxSum=cSum;
                }
            }
        }
        System.out.println(MaxSum);
    }
}
