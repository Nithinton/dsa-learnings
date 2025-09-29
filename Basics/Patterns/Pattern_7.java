// To print the following pyramid pattern, the number of rows (N) should be taken as input from the user.
// For example, if the user inputs 4, the output should be:
//     *
//    ***
//   *****
//  *******

import java.util.Scanner;

class Pattern_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int N = input.nextInt();
        for (int row = N; row >= 1; row--) {
            for (int spaces = 1; spaces <= row; spaces++ ){
                System.out.print(" ");
            }
            for (int stars=1; stars <= 2*(N-row)+1;  stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}