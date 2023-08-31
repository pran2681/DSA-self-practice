import java.util.Scanner;

public class SpiralPrint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        
        int val=1;

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=val;
                val++;
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        spiralPrint(arr, r, c);
    }
    public static void spiralPrint(int[][] arr,int r,int c){

        int sr=0,sc=0,er=r-1,ec=c-1;

        while(sc<=ec && sr<=er){
            //print sr(sc to ec)sr++
            for(int cc=sc;cc<=ec;cc++){
                System.out.print(arr[sr][cc]+" ");
            }
            sr++;


            //print ec(sr to er)ec--
            for(int cr=sr;cr<=er;cr++){
                System.out.print(arr[cr][ec]+" ");
            }
            ec--;


            //print er(ec to sc)er--
            for(int cc=ec;cc>=sc;cc--){
                System.out.print(arr[er][cc]+" ");
            }
            er--;



            //print sc(er to sr)sc++
            for(int cr=er;cr>=sr;cr--){
                System.out.print(arr[cr][sc]+" ");
            }
            sc++;
        }
    }
}
