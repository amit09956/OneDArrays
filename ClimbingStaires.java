//package OneDArrays;



public class ClimbingStaires {
    public static int climbStaires(int n){
        if(n <= 2){
            return n;
        }
        int count=0;
        int j=0;
        for(int i=1;i<n;i++){
            count=count+i;
            if(count==n){
                j++;
            }
            else{
                count=0;
            }
        }
        return j;
    }
    public static void main(String[]args){
        int n=3;
        System.out.println(climbStaires(n));
    }
}

