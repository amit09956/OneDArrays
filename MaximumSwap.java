package OneDArray;


import java.util.ArrayList;//==================not complete==================================
import java.util.Collections;

public class MaximumSwap {
    // public static int swap(int a,int b){
    //     a
    // }
    public static  int maximumSwap(int nums) {
     ArrayList<Integer> number=new ArrayList<>();
     
     while(nums>0){
        number.add(nums%10);
        nums=nums/10;
     }
    Collections.reverse(number);
     int max=number.get(0);
     
     for(int i=1;i<number.size();i++){
        if(number.get(i)>max){
            max=number.get(i);
        }  
    }
    number.remove((Integer) max);
    number.add(0,max);
    System.out.println(number);
    int sum=0;
    for(int i:number){
        sum=sum*10+i;    
    }
    return sum;
}


    public static void main(String [] args){
        int n=9935;
        System.out.println(maximumSwap(n));
    }
    
}
