public class pattern2 {
    public static void main(String args[]){
        int n=5;
        int row=1;
        int nst=1;
        while(row<=n){
            int col=1;
            while(col<=nst){
                System.out.print("*");
                col++;
            }
            nst++;
            System.out.println();
            row++;
        }
    }
}
