import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileEcho {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 1) {
            System.out.println("Merci de préciser le nom du fichier, par exemple java FileEcho test.txt");
            return;
        }

        String fileName = args[0];
        Scanner scanner = new Scanner(new File(fileName));
        while (scanner.hasNext()) {
            String text = scanner.nextLine();
            System.out.println(text);
        }
        scanner.close();
    }
}
