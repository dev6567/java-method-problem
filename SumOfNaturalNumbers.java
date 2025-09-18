import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static int sumRecursive(int n) {
        if (n == 0) return 0;
        return n + sumRecursive(n - 1);
    }

    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Enter a natural number greater than 0");
            return;
        }
        int recursiveSum = sumRecursive(n);
        int formulaSum = sumFormula(n);
        System.out.println("Sum using Recursion: " + recursiveSum);
        System.out.println("Sum using Formula: " + formulaSum);
        System.out.println("Both are equal: " + (recursiveSum == formulaSum));
    }
}
