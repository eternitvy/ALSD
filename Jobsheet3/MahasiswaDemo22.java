public class MahasiswaDemo22 {
    public static void main(String[] args) {
        Mahasiswa22[] arrayOfMahasiswa22 = new Mahasiswa22[3];
        
        arrayOfMahasiswa22[0] = new Mahasiswa22();
        arrayOfMahasiswa22[0].nim = "244107060033";
        arrayOfMahasiswa22[0].nama = "AGNES TITANIA KINANTI";
        arrayOfMahasiswa22[0].kelas = "SIB - 1E";
        arrayOfMahasiswa22[0].ipk = (float) 3.75;

        arrayOfMahasiswa22[1] = new Mahasiswa22();
        arrayOfMahasiswa22[1].nim = "2341720172";
        arrayOfMahasiswa22[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayOfMahasiswa22[1].kelas = "TI - 2A";
        arrayOfMahasiswa22[1].ipk = (float) 3.36;

        arrayOfMahasiswa22[2] = new Mahasiswa22();
        arrayOfMahasiswa22[2].nim = "244107023006";
        arrayOfMahasiswa22[2].nama = "DIRHAMAWAN PUTRANTO";
        arrayOfMahasiswa22[2].kelas = "TI - 2E";
        arrayOfMahasiswa22[2].ipk = (float) 3.80;

        System.out.println("NIM     : " + arrayOfMahasiswa22[0].nim);
        System.out.println("Nama    : " + arrayOfMahasiswa22[0].nama);
        System.out.println("Kelas   : " + arrayOfMahasiswa22[0].kelas);
        System.out.println("IPK     : " + arrayOfMahasiswa22[0].ipk);
        System.out.println("----------------------------------------");
        System.out.println("NIM     : " + arrayOfMahasiswa22[1].nim);
        System.out.println("Nama    : " + arrayOfMahasiswa22[1].nama);
        System.out.println("Kelas   : " + arrayOfMahasiswa22[1].kelas);
        System.out.println("IPK     : " + arrayOfMahasiswa22[1].ipk);
        System.out.println("----------------------------------------");
        System.out.println("NIM     : " + arrayOfMahasiswa22[2].nim);
        System.out.println("Nama    : " + arrayOfMahasiswa22[2].nama);
        System.out.println("Kelas   : " + arrayOfMahasiswa22[2].kelas);
        System.out.println("IPK     : " + arrayOfMahasiswa22[2].ipk);
        
    }
}