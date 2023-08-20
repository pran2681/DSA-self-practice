public class GenerateSubArray {
    public static void main(String args[]){
        int[] arr={1,2,3,4};
        int n=4;

        for(int si=0;si<=n-1;si++){
            for(int ei=si;ei<=n-1;ei++){
                for(int k=si;k<=ei;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
}
