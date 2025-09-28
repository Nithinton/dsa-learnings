// To print the following right angled triangle pattern, the number of rows (N) should be taken as input from the user.
// For example, if the user inputs 4, the output should be:
// 1 
// 1 2 
// 1 2 3 
// 1 2 3 4 

import java.util.Scanner;

class Pattern_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int N = input.nextInt();
        for (int row = 0; row < N; row++) {
            for (int col = 1; col <= row + 1; col++) {
                System.out.print(col +" ");
            }
            System.out.println();
        }
    }
}