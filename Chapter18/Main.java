import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first value: ");
        int x = scan.nextInt();
        System.out.println("Enter second value: ");
        int y = scan.nextInt();
        System.out.println(gcd(x,y));
    }
    public static int gcd(int x, int y){
        int out=0;
        if (x%y == 0){
            out = y;
        } else {
            int m = y;
            int n = (x%y);
            if (m%n == 0){
                out = n;
            }
        }
        return out;
    }
}
