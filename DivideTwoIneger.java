//package OneDArray;




public class DivideTwoIneger {
public static int  divide(int dividend,int divisor){
    if(divisor==0){
        throw new  ArithmeticException("Cannot divide by zero");

    }
    if(dividend==Integer.MIN_VALUE&&divisor==-1){
        return Integer.MIN_VALUE;
    }
    int r=dividend/divisor;
    if(r>Integer.MAX_VALUE){
        return Integer.MAX_VALUE;
    }
    if(r<Integer.MIN_VALUE){
        return  Integer.MIN_VALUE;

    }
    return r;
}

    public static void main(String[] args) {
        int dividend=7;
        int divisor=-3;
        System.out.println(divide(dividend,divisor));

    }
}

