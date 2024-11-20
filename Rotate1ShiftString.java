//package OneDArray;



public class Rotate1ShiftString {
    public static boolean  rotateString(String s, String shift) {
        if (s == null || s.length() == 0) return false;
        if(s.length()==shift.length()){
        String concanate=s+s;
        return concanate.contains(shift);
        }
        return false;
    }
    public static void main(String[]args){
        System.out.println(Rotate1ShiftString.rotateString("abcde", "deabc"));
    }

    
}

