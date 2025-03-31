package sc_code;
public class Mahasiswa {
    String nama;
    String nim;
    int tahunmasuk;
    int nilaiUTS;
    int nilaiUAS;
    

    public Mahasiswa(String nama, String nim, int tahunmasuk, int nilaiUTS, int nilaiUAS) {
        this.nama = nama;
        this.nim = nim;
        this.tahunmasuk = tahunmasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    int cariTertinggiUTS(Mahasiswa[] mahasiswa, int tertinggi, int terendah) {
        if (terendah == tertinggi) {
            return mahasiswa[terendah].nilaiUTS;
        }

        int mid = (terendah + tertinggi) / 2;
        int lMaks = cariTertinggiUTS(mahasiswa, terendah, mid);
        int rMaks = cariTertinggiUTS(mahasiswa, mid + 1, tertinggi);
        return Math.max(lMaks, rMaks);
    }

    int cariTerendahUTS(Mahasiswa[] mahasiswa, int tertinggi, int terendah) {
        if (terendah == tertinggi) {
            return mahasiswa[terendah].nilaiUTS;
        }
        
        int mid = (terendah + tertinggi) / 2;
        int lMin = cariTerendahUTS(mahasiswa, terendah, mid);
        int rMin = cariTerendahUTS(mahasiswa, mid + 1, tertinggi);
        return Math.min(lMin, rMin);
    }

    double rerataUAS(Mahasiswa[] mahasiswa) {
        int total = 0;
        for (int i = 0; i < mahasiswa.length; i++) {
            total = total + mahasiswa[i].nilaiUAS;
        }
        return (double) total / mahasiswa.length;
    }
}
