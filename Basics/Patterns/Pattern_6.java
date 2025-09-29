// To print the following right angled triangle pattern, the number of rows (N) should be taken as input from the user.
// For example, if the user inputs 4, the output should be:
// 1 
// 2 2 
// 3 3 3 
// 4 4 4 4

import java.util.Scanner;

class Pattern_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int N = input.nextInt();
        for (int row = 1; row < N + 1; row++) {
            for (int col = N; col >= row; col--) {
                System.out.print((N-col+1)  +" ");
            }
            System.out.println();
        }
    }
}