import java.util.Scanner;

public class CarForm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car car = new Car();
        System.out.println("Formulaire d'encodage d'une voiture");

        System.out.print("immatriculation: ");
        car.licensePlate = scanner.nextLine();
        System.out.print("marque: ");
        car.brand = scanner.nextLine();

        System.out.print("modèle: ");
        car.model = scanner.nextLine();

        System.out.print("couleur: ");
        car.color = scanner.nextLine();

        System.out.print("année de construction: ");
        car.constructionYear = scanner.nextInt();
        scanner.nextLine();

        System.out.print("prix d'achat: ");
        car.buyPrice = scanner.nextDouble();

        // enregistre dans une db

        System.out.println("La voiture " + car.licensePlate + " a été encodée");
        scanner.close();
    }
}
