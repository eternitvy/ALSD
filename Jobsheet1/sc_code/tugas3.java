package Jobsheet1.sc_code;

import java.util.Scanner;

public class tugas3 {

    static Scanner sc = new Scanner(System.in);
    static int n;
    static String[] matkul;
    static String[] hari;
    static int[] sks;
    static int[] semester;
    static String inputhari, inputnama;
    static int inputsemester;

    public static void inputdata() {
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nama mata kuliah ke-" + (i + 1) + ": ");
            matkul[i] = sc.nextLine();
            System.out.print("Masukkan jumlah SKS mata kuliah: ");
            sks[i] = sc.nextInt();
            System.out.print("Masukkan semester mata kuliah: ");
            semester[i] = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Masukkan hari mata kuliah: ");
            hari[i] = sc.nextLine();
        }
        System.out.println();
    }

    public static void tampildata() {
        System.out.printf("%-40s %-20s %-20s %-20s\n", "Mata Kuliah", "SKS", "Semester", "Hari");
        System.out.println("-----------------------------------------------------------------------------------------------");

        for (int i = 0; i < matkul.length; i++) {
            System.out.printf("%-40s %-20d %-20d %-20s\n", matkul[i], sks[i], semester[i], hari[i]);
        }
    }

    public static void carihari() {
        System.out.printf("%-40s %-20s %-20s %-20s\n", "Mata Kuliah", "SKS", "Semester", "Hari");
        System.out.println("-----------------------------------------------------------------------------------------------");

        boolean found = false;
        for (int i = 0; i < matkul.length; i++) {
            if (hari[i].equalsIgnoreCase(inputhari)) {
                System.out.printf("%-40s %-20d %-20d %-20s\n", matkul[i], sks[i], semester[i], hari[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Mata kuliah pada hari " + inputhari + " tidak ditemukan");
        }
    }

    public static void carinama() {
        System.out.printf("%-40s %-20s %-20s %-20s\n", "Mata Kuliah", "SKS", "Semester", "Hari");
        System.out.println("-----------------------------------------------------------------------------------------------");

        boolean found = false;
        for (int i = 0; i < matkul.length; i++) {
            if (matkul[i].equalsIgnoreCase(inputnama)) {
                System.out.printf("%-40s %-20d %-20d %-20s\n", matkul[i], sks[i], semester[i], hari[i]);
                found = true; 
            }
        }
        if (!found) {
            System.out.println("Mata kuliah dengan nama " + inputnama + " tidak ditemukan");
        }
    }

    public static void carisemester() {
        System.out.printf("%-40s %-20s %-20s %-20s\n", "Mata Kuliah", "SKS", "Semester", "Hari");
        System.out.println("-----------------------------------------------------------------------------------------------");

        boolean found = false;
        for (int i = 0; i < matkul.length; i++) {
            if (semester[i] == inputsemester) {
                System.out.printf("%-40s %-20d %-20d %-20s\n", matkul[i], sks[i], semester[i], hari[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Mata kuliah pada semester " + inputsemester + " tidak ditemukan");
        }
    }

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah mata kuliah: ");
        n = sc.nextInt();
        sc.nextLine(); 

        matkul = new String[n];
        hari = new String[n];
        sks = new int[n];
        semester = new int[n];

        inputdata();

        while (true) {
            System.out.println("DATA MATA KULIAH");
            System.out.println("1. Menampilkan data mata kuliah");
            System.out.println("2. Mencari mata kuliah berdasarkan hari");
            System.out.println("3. Mencari mata kuliah berdasarkan semester");
            System.out.println("4. Mencari mata kuliah berdasarkan nama matkul");
            System.out.println("5. Keluar");
            System.out.println();

            System.out.print("Masukkan pilihan menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (pilihan) {
                case 1:
                    tampildata();
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Masukkan hari mata kuliah: ");
                    inputhari = sc.nextLine();
                    carihari();
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Masukkan semester mata kuliah: ");
                    inputsemester = sc.nextInt();
                    carisemester();
                    System.out.println();
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah: ");
                    inputnama = sc.nextLine();
                    carinama();
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Menu selesai");
                    return;
                default:
                    System.out.println("Pilihan tidak tersedia");
                    break;
            }
        }
    }
}