import java.util.Scanner;

public class DemoScannerString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("hello 10 5,33");
        String text = scanner.next();
        int integer = scanner.nextInt();
        double real = scanner.nextDouble();
        System.out.println(text + " " + integer + " " + real);
        scanner.close();
    }
}
