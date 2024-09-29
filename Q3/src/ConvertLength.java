import java.util.Scanner;

public class ConvertLength {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length in Centimetres(cm):");

        double length = scanner.nextFloat();
        double inches = length /2.54;
        int feet = (int)inches/12;
        inches = inches%12;

        System.out.print(length + " cm: "+ feet + " feets: "+ inches + " inches");

    }
}