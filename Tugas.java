package Jobsheet11;

public class Tugas {
    public static void main(String[] args) {
        // a. 
        for (int i = 10; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        
        //  b.
        for (int i = 0; i <= 10; i=i+1) {
            for (int j = 0; j < 10 - i; ++j) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; ++k) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j < 10 - i; ++j) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; ++k) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
