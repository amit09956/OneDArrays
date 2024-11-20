//package OneDArray;


public class Sqrt {
    public static double sqrt(int n) {
        if (n < 2)
            return n;
        double y = n;
        double z = (y + (n / y)) / 2;
        while (Math.abs(y - z) > 0.00001) {
            y = z;
            z = (y + (n / y)) / 2;
        }
        return z;

    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println((int)sqrt(n));
    }
}

