import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DemoScannerFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("file.txt"));
        String text = scanner.next();
        int integer = scanner.nextInt();
        double real = scanner.nextDouble();
        System.out.println(text + " " + integer + " " + real);
        scanner.close();
    }
}
