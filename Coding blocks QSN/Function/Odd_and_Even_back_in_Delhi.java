import java.util.*;

public class Odd_and_Even_back_in_Delhi{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N =sc.nextInt();
        for(int i=0;i<N;i++){
            int carNum=sc.nextInt();
            if(isAllowed(carNum)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
        sc.close();
    }
    public static boolean isAllowed(int carNum){
        int sumEvn=0;
        int sumOdd=0;

        while(carNum>0){
            int digit=carNum%10;

            if(digit%2==0){
                sumEvn+=digit;
            }else{
                sumOdd+=digit;
            }
            carNum /=10;
        }
        return sumEvn%4 ==0 || sumOdd%3==0;
    }
}