package sc_code;
public class DataDosen22 {
    Dosen22[] dataDosen = new Dosen22[100];
    int indeks = 0;

    void tambah(Dosen22 dosen) {
        if (indeks < dataDosen.length){
            dataDosen[indeks] = dosen;
            indeks++;
        }
        else {
            System.out.println("Data Dosen Penuh!");
        }
    }

    void tampil() {
        for (int i = 0; i < indeks; i++) {
            System.out.println("Data Dosem ke-" + (i + 1) + ": ");
            dataDosen[i].tampil();
            System.out.println("-------------------------");
        }
    }

    void ascending() {
        for (int i = 0; i < indeks - 1; i++) {
            for (int j = 0 ; j < indeks - 1 - i; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen22 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }

    void descending() {
        for (int i = 0; i < indeks - 1; i++) {
            for (int j = 0 ; j < indeks - 1 - i; j++) {
                if (dataDosen[j].usia < dataDosen[j + 1].usia) {
                    Dosen22 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }
}
