package OneDArray;



public class RotateDigits {
    public static int rotatedDigits(int n) {
       
               int count = 0;
       
               for(int i = 1; i <= n; i++){
                   String str = Integer.toString(i) ;
                   if(str.contains("2") || str.contains("5") || str.contains("6") || str.contains("9")) {
                       if(!str.contains("3") && !str.contains("7") && !str.contains("4")){
                           count++;
                       }
                   }
               }
               
               return count;
           }
       
     
    

    public static void main(String[] args) {
        int n = 10;
        System.out.println(rotatedDigits(n));
    }

}

