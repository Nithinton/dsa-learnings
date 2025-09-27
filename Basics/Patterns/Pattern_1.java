// To print the following square pattern, the number of rows and columns (N) should be taken as input from the user.
// For example, if the user inputs 4, the output should be:
// ****
// ****
// ****
// ****
// Here is a simple Java program to achieve this:

import java.util.Scanner;

class Pattern_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns: ");
        int N = input.nextInt();
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}