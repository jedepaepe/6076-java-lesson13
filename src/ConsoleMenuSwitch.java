import java.util.Scanner;

/**
 * version en ligne de commande du site de l'EPFC
 */
public class ConsoleMenuSwitch {
    public static void main(String[] args) {
        System.out.println("Bienvenue à l'EPFC");
        Scanner scanner = new Scanner(System.in);
        String cmd;
        do {
            System.out.println("Tapez une des commandes suivantes:");
            System.out.println("A pour l'accueil");
            System.out.println("F pour le catalogue des formations");
            System.out.println("I pour l'inscription");
            System.out.println("S pour le service aux étudiants");
            System.out.println("R pour les FAQ");
            System.out.println("C pour le contact et l'accès");
            System.out.println("Q pour quitter l'application");

            cmd = scanner.nextLine();

            switch (cmd) {
                case "A" -> System.out.println("\nACCEUIL\n...\n");
                case "F" -> System.out.println("\nFORMATION\n...\n");
                case "I" -> System.out.println("\nINSCRIPTION\n...\n");
                case "S" -> System.out.println("\nSERVICE AUX ETUDIANTS\n...\n");
                case "R" -> System.out.println("\nFAQ\n...\n");
                case "C" -> System.out.println("\nCONTACT ET ACCESS\n...\n");
                case "Q" -> {}
                default -> System.out.println("La commande que vous avez tapé '" + cmd + " n'est pas correcte.");
            }
        } while (! cmd.equals("Q"));
        scanner.close();
    }
}
