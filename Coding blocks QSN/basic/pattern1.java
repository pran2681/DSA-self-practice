public class pattern1 {
    public static void main(String args[]){
        
        int n=5;
        int row=1;
        while(row<=n){
            int col=1;
            while(col<=n){
                System.out.print("*");
                col++;
            }

            System.out.println();
            row++;
        }
        

    }
}
