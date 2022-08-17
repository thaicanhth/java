package Baitapjava;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Câu4 {
    public static void main(String[] args) {
        int n;
        String chuoi;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào chuỗi bất kỳ: ");
        chuoi = scanner.nextLine();
        System.out.println("Nhập vào số nguyên N: ");
        n = scanner.nextInt();

        if (n >= 5)
        {
            System.out.println(chuoi);
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print(chuoi);
            }
        }
        //tính tổng
        float sum = 0, temp = 1;
        // làm tròn đến 2 chữ số thập phân
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        do {
            System.out.println("Mời bạn nhập vào số n: ");
            n = scanner.nextInt();
        } while (n < 1);
        for (int i = 1; i <= n; i++) {
            temp *= i;  // tính giai thừa
            sum += (float) 1/temp;
        }
        System.out.println("Tổng = " + decimalFormat.format(sum));
    }
}

