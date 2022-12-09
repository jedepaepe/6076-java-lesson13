import java.util.Scanner;

public class ReceipeForm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Formulaire d'encodage d'une recette");
        Receipe receipe = new Receipe();

        System.out.print("nom: ");
        receipe.name = scanner.nextLine();

        System.out.print("catégorie: ");
        receipe.caterory = scanner.nextLine();

        System.out.print("origin: ");
        receipe.origin = scanner.nextLine();

        System.out.print("difficulté (1, 2, 3, 4, 5): ");
        receipe.difficulty = scanner.nextInt();
        scanner.nextLine();

        System.out.print("durée en minutes: ");
        receipe.duration = scanner.nextInt();
        scanner.nextLine();

        System.out.println("ingrédients: ");
        receipe.ingredients = scanner.nextLine();

        // sauve la recette dans une base de données

        System.out.println("\nLa recettes " + receipe.name + " est encodée");
        scanner.close();
    }
}
