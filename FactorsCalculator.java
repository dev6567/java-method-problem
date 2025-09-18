import java.util.Scanner;

public class FactorsCalculator {
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) if (number % i == 0) count++;
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) if (number % i == 0) factors[index++] = i;
        return factors;
    }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) product *= f;
        return product;
    }

    public static int sumOfSquares(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += Math.pow(f, 2);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] factors = findFactors(number);
        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println("\nSum: " + sumOfFactors(factors));
        System.out.println("Product: " + productOfFactors(factors));
        System.out.println("Sum of Squares: " + sumOfSquares(factors));
    }
}
