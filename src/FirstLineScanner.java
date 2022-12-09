import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FirstLineScanner {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("persons.csv"));
        System.out.println(scanner.nextLine());
        scanner.close();
    }
}
