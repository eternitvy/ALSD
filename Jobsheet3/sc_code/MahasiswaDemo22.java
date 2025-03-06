package sc_code;
import java.util.Scanner;

public class MahasiswaDemo22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa22[] arrayOfMahasiswa22 = new Mahasiswa22[3];
        String dummy;
        
        for (int i = 0; i < arrayOfMahasiswa22.length; i++) {
            arrayOfMahasiswa22[i] = new Mahasiswa22();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM     : ");
            arrayOfMahasiswa22[i].nim = sc.nextLine();
            System.out.print("Nama    : ");
            arrayOfMahasiswa22[i].nama = sc.nextLine();
            System.out.print("Kelas   : ");
            arrayOfMahasiswa22[i].kelas = sc.nextLine();
            System.out.print("IPK     : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa22[i].ipk = Float.parseFloat(dummy);
            System.out.println("----------------------------------------");
        }

        System.out.println();
        System.out.println("---------- DAFTAR DATA MAHASISWA ----------");
        System.out.println();
        
        for (int i = 0; i < arrayOfMahasiswa22.length; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            arrayOfMahasiswa22[i].cetakInfo();
            System.out.println("----------------------------------------");
        }
    }
}