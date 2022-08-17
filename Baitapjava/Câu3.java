package Baitapjava;

import java.util.Scanner;

public class Câu3 {
    public static void main(String[] args) {
        int N;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào độ dài của mảng: ");
        N = scanner.nextInt();

        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.println("Nhập vào phần tử thứ " + i + ": ");
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            System.out.println("Phần tử thứ " + i + ": " + array[i]);
        }
        //Hàm nhập và hiển thị các giá trị mảng A
            int n, sum = 0, tempSort;

            do {
                System.out.println("Nhập vào số phần tử của mảng: ");
                n = scanner.nextInt();
            } while (n < 0);

            // khởi tạo và cấp phát bộ nhớ cho mảng
            int A[] = new int[n];

            System.out.println("Nhập các phần tử cho mảng: ");
            for (int i = 0; i < n; i++) {
                System.out.print("Nhập phần tử thứ " + i + ": ");
                array[i] = scanner.nextInt();
            }
            // Hiển thị mảng vừa nhập
            System.out.println("\nMảng ban đầu: ");
            for (int i = 0; i < n; i++) {
                System.out.print(array[i] + "\t");
            }
        // Chương trình sắp xếp các phần tử của mảng A theo thứ tự tăng dần
        System.out.print("Nhập số phần tử của mảng: ");
        int v = scanner.nextInt();
        // khởi tạo A
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < v; i++) {
            System.out.printf("a[%d] = ", i);
            A[i] = scanner.nextInt();
        }
        // sắp xếp dãy số theo thứ tự tăng dần
        System.out.println("Dãy số được sắp xếp tăng dần: ");
            int temp = A[0];
            for (int i = 0 ; i < A.length - 1; i++) {
                for (int j = i + 1; j < A.length; j++) {
                    if (A[i] > A[j]) {
                        temp = A[j];
                        A[j] = A[i];
                        A[i] = temp;
                    }
                }
            }
        //Hiển thị ra tổng của phần tử đầu tiên và cuối cùng trong mảng A
        for (int i = 0; i < n; i++) {
            sum += A[i];
        }
        System.out.println("\nTổng các phần tử có trong mảng = " + sum);
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                if (A[i] < A[j]) {
                    tempSort = A[i];
                    A[i] = A[j];
                    A[j] = tempSort;
                }
            }
        }
        System.out.println("Mảng sau khi sắp xếp là: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }

        System.out.println("\nPhần tử cuối cùng là " + array[n - 1]);
        //hàm đếm xem có bao nhiêu phần tử trong mảng A có giá trị lớn hơn hoặc bằng giá trị trung bình của tất cả các giá trị trong mảng A
        int max = A[0];
        if (A[n] > max) {
            max = A[n];
            System.out.print("\nPhần tử lớn nhất trong mảng là " + max);
        }
        //Viết hàm hiển thị ra màn hình những số chẵn trong mảng A
        int m = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            A[i] = scanner.nextInt();
        }
        for(int i=0;i<m;i++) {
            if(A[i] % 2 == 0) {
                System.out.print(A[i] + " ");
            }
        }
        //Viết chương trình chính (main) thực thi các hàm đã tạo ra ở trên
        System.out.println("Nhập vào độ dài của mảng");
    }
}








