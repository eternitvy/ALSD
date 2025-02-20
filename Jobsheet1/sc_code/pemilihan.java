package Jobsheet1.sc_code;

import java.util.Scanner;

public class pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("======================");

        System.out.print("Masukkan Nilai Tugas: ");
        int tugas = sc.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        int kuis = sc.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        int uts = sc.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        int uas = sc.nextInt();

        System.out.println("======================");
        System.out.println("======================");

        if (tugas < 0 || tugas > 100 ||kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("nilai tidak valid");

            System.out.println("======================");
            System.out.println("======================");
        }
        else {
            double nilaiakhir = ((0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.4 * uas));

            String nilaihuruf, keterangan;
            if ((nilaiakhir <= 100) && (nilaiakhir > 80)) {
                nilaihuruf = "A";
                keterangan = "SELAMAT ANDA LULUS";
            }
            else if ((nilaiakhir <= 80) && (nilaiakhir > 73)) {
                nilaihuruf = "B+";
                keterangan = "SELAMAT ANDA LULUS";
            }
            else if ((nilaiakhir <= 73) && (nilaiakhir > 65)) {
                nilaihuruf = "B";
                keterangan = "SELAMAT ANDA LULUS";
            }
            else if ((nilaiakhir <= 65) && (nilaiakhir > 60)) {
                nilaihuruf = "C+";
                keterangan = "SELAMAT ANDA LULUS";
            }
            else if ((nilaiakhir <= 60) && (nilaiakhir > 50)) {
                nilaihuruf = "C";
                keterangan = "SELAMAT ANDA LULUS";
            }
            else if ((nilaiakhir <= 50) && (nilaiakhir > 39)) {
                nilaihuruf = "D";
                keterangan = "SELAMAT ANDA LULUS";
            }
            else {
                nilaihuruf = "E";
                keterangan = "ANDA TIDAK LULUS";
            }

            System.out.println("nilai akhir: " + nilaiakhir);
            System.out.println("nilai huruf: " + nilaihuruf);

            System.out.println("======================");
            System.out.println("======================");

            System.out.println(keterangan);
        }

    }
}