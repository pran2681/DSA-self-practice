public class pattern3 {
    public static void main(String args[]){
        int n=10;
        int row=1;
        int nst=n;

        while(row<=n){
            int col=1;
            while(col<=nst){
                System.out.print("*");
                col++;
            }
            System.out.println();
            nst--;
            row++;
        }
    }
}
