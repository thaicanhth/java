package tinhn;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Sohoanhao {
    public static void main(String[] args) throws IOException {
        BufferedReader kbd = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(" Vui lòng nhập n: ");
        String s=kbd.readLine();
        int b=Integer.parseInt(s);
        for(int i = 1; i<b; i++)
        {
            int tong=0;
            for(int j=1; j<i; j++)
            {
                if(i%j==0) tong+=j;
            }
            if(i==tong)
            {
                System.out.println(i);
                System.out.print("là số hoàn hảo");
            }
        }
    }
}
