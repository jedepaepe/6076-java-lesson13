import java.util.Scanner;

public class ConsoleScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tapez un texte: ");
        String text = scanner.nextLine();
        System.out.println("Le texte tapé est: " + text);

        System.out.print("Tapez un nombre entier: ");
        int integer = scanner.nextInt();
        scanner.nextLine();
        System.out.println("L'entier tapé est: " + integer);

        System.out.print("Tapez un nombre réel: ");
        double real = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Le réel tapé est: " + real);

        System.out.print("Tapez un booléen (true/false): ");
        boolean bool = scanner.nextBoolean();
        scanner.nextLine();
        System.out.println("Le booléen tapé est: " + bool);
    }
}
