import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class AddressArgs {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 6) {
            System.out.println("Veuillez introduire 6 arguments:");
            System.out.println("nom-fichier-csv rue numéro code-postal ville pays");
            return;
        }

        String fileName = args[0];
        PrintWriter writer = new PrintWriter(new FileOutputStream(fileName, true));
        Address a = new Address();
        a.street = args[1];
        a.number = args[2];
        a.zip = args[3];
        a.city = args[4];
        a.country = args[5];
        writer.println(a.street + ";" + a.number + ";" + a.zip + ";" + a.city + ";" + a.country);
        writer.close();
    }
}
