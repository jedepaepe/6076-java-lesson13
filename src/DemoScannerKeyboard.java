import java.util.Scanner;

public class DemoScannerKeyboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ecrivez un texte");
        String text = scanner.nextLine();

        System.out.println("Ecrivez un entier");
        int integer = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ecrivez un nombre réel");
        double real = scanner.nextDouble();

        System.out.println(text + " " + integer + " " + real);
        scanner.close();
    }
}
