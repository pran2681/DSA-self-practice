import java.util.Scanner;

public class DelhiOddEven {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        
        for(int i=0;i<N;i++){
            int CarNumber=sc.nextInt();
            int EvnSum=0;
            int OddSum=0;
            
            while(CarNumber>0){
                int digit=CarNumber%10;
                if(digit%2==0){
                    EvnSum+=digit;
                }else{
                    OddSum+=digit;
                }
                CarNumber/=10;
            }
            if(EvnSum%4==0||OddSum%3==0){
                System.out.println("Allow");
            }else{
                System.out.println("Not allow");
            }
        }
        
    }
    
}
