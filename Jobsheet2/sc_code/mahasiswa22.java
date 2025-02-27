package sc_code;

import java.util.Scanner;

public class mahasiswa22 {

    String nama;
    String nim;
    String kelas;
    double ipk;

    public mahasiswa22() {
        
    }

    public mahasiswa22(String nm, String nim, double ipk, String kls) {
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }

    void tampilkaninformasi(String kelasbaru) {
        System.out.println("nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("kelas: " + kelas);
    }

    void ubahkelas(String kelasbaru) {
        kelas = kelasbaru;
    }

    void updateipk(double ipkbaru) {
        ipk = ipkbaru;
    }

    String nilaikinerja() {
        if (ipk <= 0 || ipk >= 4.0) {
            return "IPK tidak valid. Harus antara 0.0 dan 4.0";
        }
        else if (ipk >= 3.5) {
            return "kinerja sangat baik";
        }
        else if (ipk >= 3.0) {
            return "kinerja baik";
        }
        else if (ipk >= 2.0) {
            return "kinerja cukup";
        }
        else {
            return "kinerja kurang";
        }
    }
}