package sc_code;
public class datadosen22 {
    dosen22[] datadosen = new dosen22[100];
    int indeks = 0;

    void tambah(dosen22 dosen) {
        if (indeks < datadosen.length){
            datadosen[indeks] = dosen;
            indeks++;
        }
        else {
            System.out.println("Data Dosen Penuh!");
        }
    }

    void tampil() {
        for (int i = 0; i < indeks; i++) {
            System.out.println("Data Dosem ke-" + (i + 1) + ": ");
            datadosen[i].tampil();
            System.out.println("-------------------------");
        }
    }

    void ascending() {
        for (int i = 0; i < indeks - 1; i++) {
            for (int j = 0 ; j < indeks - 1 - i; j++) {
                if (datadosen[j].usia > datadosen[j + 1].usia) {
                    dosen22 temp = datadosen[j];
                    datadosen[j] = datadosen[j + 1];
                    datadosen[j + 1] = temp;
                }
            }
        }
    }

    void descending() {
        for (int i = 0; i < indeks - 1; i++) {
            for (int j = 0 ; j < indeks - 1 - i; j++) {
                if (datadosen[j].usia < datadosen[j + 1].usia) {
                    dosen22 temp = datadosen[j];
                    datadosen[j] = datadosen[j + 1];
                    datadosen[j + 1] = temp;
                }
            }
        }
    }

    void pencariandatasequential22(String nama) {
        dosen22[] pencarian = new dosen22[indeks];
        int count = 0;

        for (int i = 0; i < indeks; i++) {
            if (datadosen[i].nama.equalsIgnoreCase(nama)) {
                pencarian[count] = datadosen[i];
                count++;
            }
        }
        if (count > 1) {
            System.out.println("Ditemukan lebih dari satu data dosen dengan nama '" + nama + "'!");
        }
        else if (count == 1) {
            System.out.println("-- DATA DOSEN DITEMUKAN --");
            pencarian[0].tampil();
        }
        else {
            System.out.println("Data dosen dengan nama '" + nama + "' tidak ditemukan");
        }
    }

    void pencariandatabinary22(int usia) {
        ascending();
        int left = 0;
        int right = indeks - 1;
        dosen22[] pencarian = new dosen22[indeks];
        int count = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (datadosen[mid].usia == usia) {
                pencarian[count] = datadosen[mid];
                count++;

                for (int i = mid - 1; i >= 0 && datadosen[i].usia == usia; i--) {
                    pencarian[count] = datadosen[i];
                    count++;
                }

                for (int i = mid + 1; i < indeks && datadosen[i].usia == usia; i++) {
                    pencarian[count] = datadosen[i];
                    count++;
                }
                break;
            }
            else if (datadosen[mid].usia < usia) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        if (count > 1) {
            System.out.println("Ditemukan lebih dari satu data dosen dengan usia " + usia + " tahun!!");
        }
        else if (count == 1) {
            System.out.println("-- DATA DOSEN DITEMUKAN --");
            pencarian[0].tampil();
        }
        else {
            System.out.println("Data dosen dengan usia " + usia + " tahun tidak ditemukan");
        }
        
    }
}