package  OneDArray;



public class FindSmallestE {
    public static  char nextGreatestLetter(char [] letters, char target) {
        int s = 0;
        int e = letters.length - 1;
        
      
        while (s <= e) {
            int mid = s + (e - s) / 2;
           
          
                if (target > letters[mid]) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            } 
        
        return letters[s%letters.length];
    }  
    
    public static void main(String[]args){
        char letters[]={'c','f','j'};
        char target='a';
        System.out.println(nextGreatestLetter(letters,target));
    }
    
}
