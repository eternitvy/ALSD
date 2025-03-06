package sc_code;
import java. util.Scanner;

public class MataKuliah22 {
    String kode;
    String nama;
    int sks;
    int jumlahJam;
    MataKuliah22[] arrayOfMataKuliah = new MataKuliah22[3];

    public MataKuliah22() {
    }

    public MataKuliah22(String kode, String nama, int sks, int jmlJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tambahData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kode       : ");
        this.kode = sc.nextLine();
        System.out.print("Nama       : ");
        this.nama = sc.nextLine();
        System.out.print("SKS        : ");
        this.sks = sc.nextInt();
        System.out.print("Jumlah Jam : ");
        this.jumlahJam = sc.nextInt();
    }
    
    public void cetakInfo() {
        System.out.println("Kode       : " + this.kode);
        System.out.println("Nama       : " + this.nama);
        System.out.println("SKS        : " + this.sks);
        System.out.println("Jumlah jam : " + this.jumlahJam);

    }
}    
