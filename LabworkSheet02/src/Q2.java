import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");

        int num = scanner.nextInt();
        int count = 0;

        while(num>=0) {
            if (num == 0) {
                count = 1;
                System.out.println("Number of digits: " + count);
            } else {
                while (num > 0) {
                    num = num / 10;
                    count++;

                }
                System.out.println("Number of digits: " + count);
            }
            System.out.print("Enter the number: ");

            num = scanner.nextInt();
            count = 0;
        }
    }
}
