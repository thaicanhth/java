import java.util.Scanner;

public class Baitap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a >= 2 && b >=2 && c >= 2)
        if (a >= b && a >= c) {
            System.out.println(a);
        } else if (b >= c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }

    }
}
