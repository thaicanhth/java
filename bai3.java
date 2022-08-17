import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;
        System.out.println("Enter number: ");
        number = in.nextInt();
        System.out.println("Sum by For: " + sumByFor(number));
        System.out.println("Sum by While: " + sumByWhile(number));
        System.out.println("Sum by DoWhile: " + sumByDoWhile(number));
    }

    public static int sumByFor(int number) {
        int result = 0;
        // fori
        for (int i = 0; i <= number; i++) {
            result = result + i;
        }
        return result;
    }

    public static int sumByWhile(int number) {
        int result = 0, i = 0;
        while (i <= number) {
            result = result + i;
            i++;
        }
        return result;
    }

    public static int sumByDoWhile(int number) {
        int result = 0, i = 0;
        do {
            result = result + i;
            i++;
        } while (i <= number);
        return result;
    }
}
/*
to
 */




