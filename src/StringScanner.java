import java.util.Scanner;

public class StringScanner {
    public static void main(String[] args) {
        String input = "Ceci est un texte\n10\n1,1\ntrue";
        Scanner scanner = new Scanner(input);

        String text = scanner.nextLine();
        System.out.println("le texte: " + text);

        int integer = scanner.nextInt();
        System.out.println("l'entier: " + integer);

        double real = scanner.nextDouble();
        System.out.println("le nombre réel: " + real);

        boolean bool = scanner.nextBoolean();
        System.out.println("le booléen: " + bool);
    }
}
