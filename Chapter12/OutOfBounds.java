import java.util.Random;
import java.util.Scanner;

public class OutOfBounds {
    public static void main (String []args){
        Random randonum = new Random();
        Scanner scan = new Scanner(System.in);
        int[] array = new int[100];
        for(int i = 0; i<100; i++){
            array[i]= randonum.nextInt();
        }
        System.out.print("Enter number 1-100: ");
        int inp = scan.nextInt();
        System.out.println();
        if (inp<=100 && inp>=1) {
            System.out.println("The value is " + array[inp - 1]);
        } else {
            System.out.println("Out Of Bounds");
        }
    }
}
