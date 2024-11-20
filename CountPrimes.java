//package OneDArray;


import java.util.*;

public class CountPrimes {
    public static int countPrimes(int n) {
        int count=0;
        if(n==0 ||n==1)return 0;
        
        
        for(int i=2;i<n;i++){
            boolean  isPrime=true;

            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                
                }
            }
            if(isPrime)count++;
        }
        return count;

        }
        
    
    public static void main(String[]args){
        int n=10;
        System.out.println(countPrimes(n));
    }
}
