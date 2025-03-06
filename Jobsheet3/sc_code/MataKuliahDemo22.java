package sc_code;
import java.util.Scanner;

public class MataKuliahDemo22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah data mata kuliah: ");
        int jumlahData = sc.nextInt();

        MataKuliah22[] arrayOfMataKuliah = new MataKuliah22[jumlahData];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Masukkan Data Mata Kuliah ke-" + (i + 1));
            arrayOfMataKuliah[i] = new MataKuliah22();
            arrayOfMataKuliah[i].tambahData();
            System.out.println("-----------------------------------------");
        }

        System.out.println();
        System.out.println("---------- DAFTAR DATA MATA KULIAH ----------");
        System.out.println();

        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Data Mata Kuliah ke-" + (i + 1));
            arrayOfMataKuliah[i].cetakInfo();
            System.out.println("-----------------------------------------");
        }
    }
}
