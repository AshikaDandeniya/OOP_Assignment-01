import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your odd-length word :");

        String word = scanner.next();
        int length = word.length();

        if(length % 2 == 0){
            System.out.print("Not an odd-length word!");
        }
        else{
            System.out.print("Middle character of "+ word +" is " + word.charAt(length/2));
        }
    }
}
