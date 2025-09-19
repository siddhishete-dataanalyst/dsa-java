public class power2 {
    public static int optimizedPower(int a,int n){
        if(n == 0){
            return 1;
        }
        int halfPowersq =optimizedPower(a,n/2 )* optimizedPower(a ,n/2);
        //n is odd
        if (n%2 !=0){
            halfPowersq =a* halfPowersq;
        }
        return halfPowersq;
    
    }
    public static void main(String[] args) {
        int a =2;
        int n=5;
        System.out.println(optimizedPower(a,n));
    }
    
}
