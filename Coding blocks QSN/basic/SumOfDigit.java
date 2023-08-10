public class SumOfDigit {
    public static void main(String args[]){
        int num=123456;
        int sum=0;

        while(num !=0){
            int digit=num%10;
            num=num/10;
            sum +=digit;
        }
        System.out.println(sum);
    }
}
