import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScanner {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 1) {
            System.out.println("Veuillez préciser le nom du fichier, par exemple java FileScanner input.txt");
            return;
        }

        String fileName = args[0];
        Scanner scanner = new Scanner(new File(fileName));

        String text = scanner.nextLine();
        System.out.println("le texte est: " + text);

        int integer = scanner.nextInt();
        System.out.println("le nombre entier est: " + integer);

        double real = scanner.nextDouble();
        System.out.println("le nombre réel est: " + real);

        boolean bool = scanner.nextBoolean();
        System.out.println("le booléen est: " + bool);

        scanner.close();
    }
}
