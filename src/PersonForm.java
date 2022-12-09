import java.util.Scanner;

public class PersonForm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();

        System.out.println("Formulaire d'encodage d'une personne");

        System.out.print("numéro national: ");
        person.identifier = scanner.nextLine();

        System.out.print("prénom: ");
        person.firstName = scanner.nextLine();

        System.out.print("nom de famille: ");
        person.lastName = scanner.nextLine();

        System.out.print("email: ");
        person.email = scanner.nextLine();

        System.out.print("année de naissance: ");
        person.birthYear = scanner.nextInt();

        // sauve la personne dans une base de données

        System.out.println("Nouvelle personne encodée:");
        System.out.println(person.identifier + " " + person.firstName + " " + person.lastName + " " +
                person.email + " " + person.birthYear);
        scanner.close();
    }
}
