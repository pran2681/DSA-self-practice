public class Nmbr_star_pattern {
    public static void main(String args[]){
        int n=5;
        int row=1;
        
        while(row<=n){
            int col=1;
            while(col<=n-row+1){
                System.out.print(col);
                col++;
            }
            col=1;
            while(col<=2*row-3){
                System.out.print("*");
                col++;
            }
           
            System.out.println();
            
            row++;
        }
    }
}
