package Jobsheet11;
import java.util.Scanner;

public class Individu2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int n = sc.nextInt();
        // i = baris, j = kolom
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {                
                // baris 1 & n SAMA kolom 1 & n angkanya diprint semua
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(n + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
