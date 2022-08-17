package tinhn;

import java.util.Scanner;

public class baitap {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhap input : ");
        int n = sc.nextInt();
        int output = 1;
        for(int i = 2; i <= n; i++) {
            output *= i;
        }
        System.out.print("Giai thua cua " + n + " la: " + output);
}
}
