import java.util.Scanner;
public class ex18_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str = in.nextLine();
        reverseDisplay(str);
    }
    private static void reverseDisplay(String str){
        if (str.length() == 1) {
            System.out.print(str);
        } else {
            String out;
            out = String.valueOf(str.charAt(str.length()-1));
            System.out.print(out);
            reverseDisplay(str.substring(0,str.length()-1));
        }
    }
}