package sc_code;

import java.util.Arrays;
import java.util.Scanner;

public class DosenDemo22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen22[] dosen = new Dosen22[3];

        for (int i = 0; i < dosen.length; i++) {
            dosen[i] = new Dosen22();
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            dosen[i].kode = sc.nextLine();
            System.out.print("Nama          : ");
            dosen[i].nama = sc.nextLine();
            while (true) {
                System.out.print("Jenis Kelamin : ");
                String gender = sc.nextLine().trim();
                if (gender.equalsIgnoreCase("Pria")) {
                    dosen[i].JenisKelamin = true;
                    break;
                } else if (gender.equalsIgnoreCase("Wanita")) {
                    dosen[i].JenisKelamin = false;
                    break;
                } else {
                    System.out.println("Input tidak valid. Masukkan 'Pria' atau 'Wanita'.");
                }
            }
            System.out.print("Usia          : ");
            dosen[i].usia = sc.nextInt();
            System.out.println("----------------------------");
            sc.nextLine();
        }

        System.out.println();
        System.out.println("---------- DAFTAR DATA DOSEN ----------");
        System.out.println();

        for (Dosen22 dsn : dosen) {
            System.out.println("Data Dosen ke-" + (Arrays.asList(dosen).indexOf(dsn) + 1));
            System.out.println("Kode         : " + dsn.kode);
            System.out.println("Nama         : " + dsn.nama);
            System.out.println("JenisKelamin : " + (dsn.JenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia         : " + dsn.usia);
            System.out.println("----------------------------");
        }
        
        DataDosen22 dsn = new DataDosen22();
        System.out.println();
        dsn.jumlahDosenPerJenisKelamin(dosen);
        System.out.println();
        dsn.rerataUsiaDosenPerJenisKelamin(dosen);
        System.out.println();
        dsn.infoDosenPalingTua(dosen);
        System.out.println();
        dsn.infoDosenPalingMuda(dosen);
    }
}