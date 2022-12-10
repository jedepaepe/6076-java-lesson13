import java.util.Scanner;

public class EchoFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (; scanner.hasNext(); ) {
            String text = scanner.nextLine();
            System.out.println(text);
        }
        scanner.close();
    }
}
