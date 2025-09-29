// To print the following inverted right angled triangle pattern, the number of rows (N) should be taken as input from the user.
// For example, if the user inputs 4, the output should be:
// * * * *
// * * *
// * *
// *

import java.util.Scanner;

class Pattern_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int N = input.nextInt();
        for (int row = 1; row < N + 1; row++) {
            for (int col = N; col >= row; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}