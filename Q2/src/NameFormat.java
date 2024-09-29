import java.util.Scanner;

public class NameFormat{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name in the format 'first middle last':");

        String first = scanner.next();
        String middle = scanner.next();
        String last = scanner.next();

        System.out.print(last + ", " + first + " " + middle.charAt(0) + ".");

    }

}
