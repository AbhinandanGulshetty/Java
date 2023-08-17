import java.util.*;


class java {

    public static boolean isPrime(int n){
        if(n == 2){
            return true;
        }

        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void primesInRange(int n) {

        for(int i=2; i<=n; i++) {
            if(isPrime(i)) { //true
                System.out.print(i+" ");

            }
        }
        System.out.println();
    }

public static void decToBin(int n) {
    int myNum = n;
    int pow = 0;
    int binNum = 0;

    while(n > 0) {
        int rem = n % 2;
        binNum = binNum + (rem * (int)Math.pow(10, pow));
        pow++;
        n = n/2;  
    } 
    System.out.println("binary form of" + myNum + " = "+ binNum);
}




public static void main(String args[]) {
    decToBin(12);
}
}
