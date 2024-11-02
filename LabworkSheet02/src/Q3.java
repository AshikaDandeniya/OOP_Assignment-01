import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");

        int rows = scanner.nextInt();
        int asteriks = 1;
        int spaces = rows -1;

        for(int i=0; i< rows; i++){
            for(int j=0; j<spaces; j++){
                System.out.print(" ");
            } spaces--;

            for(int k=0; k< asteriks; k++){
                System.out.print("* ");

            } asteriks++;
            System.out.println();
        }

    }
}
/*    rows :3
__*     spaces:2 astricks:1
_* *     spaces:1 astricks:2
* * *    spaces:0 astricks:3
 */
