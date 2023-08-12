public class pattern4 {
    public static void main(String args[]){
        int n=5;
        int row=1;
        int nsp=n-1;
        int nst=1;

        while(row<=n){

            int col=1;
            while(col<=nsp){
                System.out.print(" ");
                col++;
            }
            col=1;
            while(col<=nst){
                System.out.print("*");
                col++;
            }
            System.out.println();
            nsp--;
            nst++;

            row++;
        }
    }
}
