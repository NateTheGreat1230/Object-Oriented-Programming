import java.io.File;
import java.util.Random;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class ReadnWrite {
    public static void main (String []args) throws IOException {

        File newfile = new File("Exercise12_15.txt");
        Random randonum = new Random();
        if (newfile.createNewFile()) {
            System.out.println("New file created.");
        } else {
            System.out.println("File already exists.");
        }
        FileWriter write = new FileWriter("Exercise12_15.txt");

        int[] array = new int[100];
        for(int i = 0; i<100; i++){
            array[i]= randonum.nextInt();
            String test = String.valueOf(array[i]);

            write.write(test);
            write.write(" ");
        }
        write.close();
        Scanner read = new Scanner(newfile);
        String out = read.nextLine();
        System.out.println(out);
    }
}
