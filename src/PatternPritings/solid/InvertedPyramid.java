package PatternPritings.solid;

import java.util.Scanner;

public class InvertedPyramid {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {

            // spaces
            for (int col = 1; col <= row - 1; col++) {
                System.out.print(" ");
            }

            // stars
            for (int col = 1; col <= 2 * n - 2 * row + 1; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}