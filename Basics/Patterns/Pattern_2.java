// To print the following right angled triangle pattern, the number of rows (N) should be taken as input from the user.
// For example, if the user inputs 4, the output should be:
// * 
// * * 
// * * * 
// * * * * 

import java.util.Scanner;

class Pattern_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int N = input.nextInt();
        for (int row = 0; row < N; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}