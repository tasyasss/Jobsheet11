package Jobsheet11;
import java.util.Scanner;

public class Star04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah bintang: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }

        // --- pertanyaan 1 ---
        // for (int i = 0; i <= n; i++) {
        //     System.out.print("*");
        // }

        // --- pertanyaan 2 ---
        // for (int i = 0; i > n; i++) {
        //     System.out.print("*");
        // }

        // --- pertanyaan 3 ---
        // for (int i = 1; i <= n; i--) {
        //     System.out.print("*");
        // }

        sc.close();
    }
}
