public class TowerOfHanoi {
    // static void tof(int n,char from_rof,char to_rod,char aux_rod){
    //     if(n==0){
    //         return;
    //     }
    //     tof(n-1,from_rof,aux_rod,to_rod);
    //     System.out.println("Move disk"+n+"from rod"+from_rof+"to rod"+to_rod);
    //     tof(n-1,aux_rod,to_rod,from_rof);
    // }
    // public static void main(String args[]){
    //     int N=3;
    //     tof(N,'A','B','C');
    // }

    static void tof(int n,char from_rod,char to_rod,char aux_rod){
        if(n==0){
            return;
        }
        tof(n-1,from_rod,aux_rod,to_rod);
        System.out.println("Move"+n+"from"+from_rod+"to"+to_rod);
        tof(n-1,aux_rod,to_rod,from_rod);
    }
    public static void main(String args[]){
        int N=0;
        tof(N,'A','B','C');
    }

}