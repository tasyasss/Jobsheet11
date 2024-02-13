package Jobsheet11;
import java.util.Scanner;

public class NestedLoop04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan banyak Kota: ");
        int k = sc.nextInt();

        double[][] suhu = new double[k][4];

        for (int i = 0; i < suhu.length; i++) {
            System.out.println("KOTA KE-" + (i+1));

            for (int j = 0; j < suhu[i].length; j++) {
                System.out.print("Suhu ke-" + (j+1) + ": ");
                suhu[i][j] = sc.nextInt();
            }
        }
        // --- langkah nomer 7 ---
        // for (int i = 0; i < suhu.length; i++) {
        //     System.out.print("KOTA KE-" + (i+1) + ": ");

        //     for (int j = 0; j < suhu[i].length; j++) {
        //         System.out.print(suhu[i][j] + " ");
                
        //     }
        //     System.out.println();
        // }

        // --- pertanyaan 1 ---
        // for (int i = 0; i < suhu.length; i++) {
        //     System.out.print("KOTA KE-" + (i+1) + ": ");

        //     //  for each looping 
        //     for (double temp : suhu[i]) {
        //         System.out.print(temp + " ");
        //     }
        //     System.out.println();
        // }

        // --- pertanyaan 2 ---
        System.out.println();
        for (int i = 0; i < suhu.length; i++) {
            System.out.print("KOTA KE-" + (i+1) + ": ");
            double mean, jumlah = 0;
            for (int j = 0; j < suhu[i].length; j++) {
                System.out.print(suhu[i][j] + " ");
                jumlah += suhu[i][j];
            }
            System.out.println();
            mean = jumlah / suhu[i].length;
            System.out.println("Suhu Rata-rata: " + mean);
        }

        sc.close();
    }
}
