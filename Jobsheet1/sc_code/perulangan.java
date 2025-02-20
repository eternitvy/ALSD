package Jobsheet1.sc_code;

import java.util.Scanner;

public class perulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan NIM Anda: ");
        String nim = sc.nextLine();

        String duadigit = nim.substring(nim.length() - 2);
        int n = Integer.valueOf(duadigit);

        if (n < 10) {
            n = n + 10;
        }

        System.out.println("======================");
        System.out.println("n: " + n);

        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
              continue;
            }
            if (i % 2 == 1) {
              System.out.print("* ");
            } 
            else {
              System.out.print(i + " ");
            }
        }


    }
}