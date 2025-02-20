package Jobsheet1.sc_code;

import java.util.Scanner;

public class tugas2 {
    
    public static double hitungVolume(double sisi) {
        return sisi * sisi * sisi;
    }

    public static double hitungLuasPermukaan(double sisi) {
        return 6 * sisi * sisi;
    }
    
    public static double hitungKeliling(double sisi) {
        return 12 * sisi;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean kondisi = true;

        while (kondisi) {
            System.out.println("Pilih perhitungan yang ingin dilakukan:");
            System.out.println("1. Volume Kubus");
            System.out.println("2. Luas Permukaan Kubus");
            System.out.println("3. Keliling Kubus");
            System.out.print("Masukkan pilihan (1-3): ");
        
            int pilihan = sc.nextInt();
            if (pilihan < 1 || pilihan > 3) {
                System.out.println();
                System.out.println("Pilihan tidak valid");
                break;
            }
            
            System.out.print("Masukkan panjang sisi kubus: ");
            double sisi = sc.nextDouble();
            if (sisi <= 0) {
                System.out.println("Panjang sisi harus positif");
                break;
            }

            switch (pilihan) {
                case 1:
                    System.out.printf("Volume kubus: %.2f\n", hitungVolume(sisi));
                    System.out.println();
                    break;
                case 2:
                    System.out.printf("Luas permukaan kubus: %.2f\n", hitungLuasPermukaan(sisi));
                    System.out.println();
                    break;
                case 3:
                    System.out.printf("Keliling kubus: %.2f\n", hitungKeliling(sisi));
                    System.out.println();
                    break;
            }

            System.out.print("Apakah Anda ingin melakukan perhitungan lain? (ya/tidak): ");
            String response = sc.next();
            System.out.println();
            if (!response.equalsIgnoreCase("ya")) {
                kondisi = false;
            }
        }

        sc.close();
        System.out.println("Program selesai.");
    }
}
