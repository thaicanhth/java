package tinhn;

import java.util.Scanner;

public class Timkiemsapxep {

    public static void main(String[] args) {
        int[] Timkiemsapxep = new int[10];
        Scanner xuat = new Scanner(System.in);
        System.out.println("Vui lòng nhập giá trị Timkiemsapxep");
        for (int i = 0; i < Timkiemsapxep.length; i++) {
            Timkiemsapxep[i] = xuat.nextInt();
        }
        System.out.println("Timkiemsapxep duoc nhập là");
        for (int x : Timkiemsapxep) {
            System.out.println(x);
        }
        System.out.println("Vui lòng nhập for tìm kiem");
        int k = xuat.nextInt();
        for (int i = 0 ; i < Timkiemsapxep.length -1; i++) {
            if (k == Timkiemsapxep[i]){
                System.out.println("Tìm phần tử 0 vị trí "+i);
            }
        }
    }
}

