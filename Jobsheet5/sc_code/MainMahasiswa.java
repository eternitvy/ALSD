package sc_code;

public class MainMahasiswa {
    public static void main(String[] args) {
        Mahasiswa[] mahasiswa = {
            new Mahasiswa("Ahmad", "220101001", 2022, 78, 82),
            new Mahasiswa("Budi", "220101002", 2022, 85, 88),
            new Mahasiswa("Cindy", "220101003", 2021, 90, 87),
            new Mahasiswa("Dian", "220101004", 2021, 76, 79),
            new Mahasiswa("Eko", "220101005", 2023, 92, 95),
            new Mahasiswa("Fajar", "220101006", 2020, 88, 85),
            new Mahasiswa("Gina", "220101007", 2023, 80, 83),
            new Mahasiswa("Hadi", "220101008", 2020, 82, 84),
        };
        

        System.out.println("-- DATA MAHASISWA --");
        System.out.println();

        System.out.printf("%-10s %-10s %-12s %-9s %-9s%n", "Nama", "NIM", "Tahun Masuk", "Nilai UTS", "Nilai UAS");
        for (Mahasiswa m : mahasiswa) {
           System.out.printf("%-10s %-10s %-12d %-9d %-9d%n", m.nama, m.nim, m.tahunmasuk, m.nilaiUTS, m.nilaiUAS);
        }
        
        System.out.println();
        int tertinggiUTS = mahasiswa[0].cariTertinggiUTS(mahasiswa, 0, mahasiswa.length - 1);
        System.out.println("Nilai UTS tertinggi: " + tertinggiUTS);

        int terendahUTS = mahasiswa[0].cariTerendahUTS(mahasiswa, 0, mahasiswa.length -1);
        System.out.println("Nilai UTS terendah: " + terendahUTS);

        double rerataUAS = mahasiswa[0].rerataUAS(mahasiswa);
        System.out.println("Rata-rata nilai UAS: " + rerataUAS);
    }
}