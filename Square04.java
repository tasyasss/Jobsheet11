package Jobsheet11;
import java.util.Scanner;
public class Square04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah bintang: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // --- pertanyaan 1 ---
        // for (int i = 0; i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // --- pertanyaan 4 ---
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         System.out.print("*");
        //     }
        // }

        sc.close();
    }
}
