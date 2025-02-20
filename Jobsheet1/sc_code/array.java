package Jobsheet1.sc_code;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        String matkul[] = new String[8];
        int sks[] = new int[matkul.length];
        double nilaimatkul[] = new double[matkul.length];
        String nilaihuruf[] = new String[matkul.length];
        double nilaisetara[] = new double[matkul.length];
        int totalsks = 0;

        for (int i = 0; i < matkul.length; i++) {
            System.out.print("masukkan nama mata kuliah ke-" + (i + 1) + ": ");
            matkul[i] = sc.nextLine();
            System.out.print("Masukkan nilai untuk MK " + matkul[i] + ": ");
            nilaimatkul[i] = sc.nextDouble();
            System.out.print("masukkan jumlah SKS MK " + matkul[i] + ": ");
            sks[i] = sc.nextInt();

            totalsks += sks[i];
            sc.nextLine();
        }

        for (int i = 0; i < matkul.length; i++) {
            if (nilaimatkul[i] >= 80) {
                nilaihuruf[i] = "A";
                nilaisetara[i] = 4.00;
            }
            else if (nilaimatkul[i] >= 73) {
                nilaihuruf[i] = "B+";
                nilaisetara[i] = 3.50;
            }
            else if (nilaimatkul[i] >= 65) {
                nilaihuruf[i] = "B";
                nilaisetara[i] = 3.00;
            }
            else if (nilaimatkul[i] >= 60) {
                nilaihuruf[i] = "C+";
                nilaisetara[i] = 2.50;
            }
            else if (nilaimatkul[i] >= 50) {
                nilaihuruf[i] = "C";
                nilaisetara[i] = 2.00;
            }
            else if (nilaimatkul[i] >= 39) {
                nilaihuruf[i] = "D";
                nilaisetara[i] = 1.00;
            }
            else {
                nilaihuruf[i] = "E";
                nilaisetara[i] = 0.00;
            }
        }

        System.out.println("\n====================================");
        System.out.println("hasil Konversi Nilai");
        System.out.println("====================================");
        System.out.printf("%-40s %-20s %-20s %-20s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println("====================================");

        double totalbobot = 0;
        for (int i = 0; i < matkul.length; i++) {
            System.out.printf("%-40s %-20s %-20s %-20s\n", matkul[i], nilaimatkul[i], nilaihuruf[i], nilaisetara[i]);
            totalbobot += nilaisetara[i];
        }

        double ip = 0;
        for (int i = 0; i < matkul.length; i++) {
            ip += sks[i] * nilaisetara[i];
        }

        ip /= totalsks;
        System.out.println("====================================");
        System.out.printf("IP : %.2f\n", ip);
    }
}