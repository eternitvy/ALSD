package sc_code;
public class mahasiswaberprestasi22 {
    mahasiswa22[] listmhs;
    int idx;

    void initializelist(int size) {
        listmhs = new mahasiswa22[size];
    }

    void tambah(mahasiswa22 mhs) {
        if (idx < listmhs.length) {
            listmhs[idx] = mhs;
            idx++;
        }
    }

    void tampil() {
        for (mahasiswa22 mhs : listmhs) {
            if (mhs != null) {
                mhs.tampilinformasi();
                System.out.println("-----------------------");
            }
        }
    }

    int sequentialsearching(double cari) {
        int posisi = -1;
        for (int i = 0; i < listmhs.length; i++) {
            if (listmhs[i].ipk == cari) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    int findbinarysearch(double cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listmhs[mid].ipk) {
                return mid;
            }
            else if (listmhs[mid].ipk > cari) {
                return findbinarysearch(cari, left, mid - 1);
            }
            else {
                return findbinarysearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    void tampilposisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("data mahasiswa dengan IPK: " + x + " ditemukan pada indeks " + pos);
        }
        else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }
    
    void tampildatasearch(double x, int pos) {
        if (pos != -1) {
            System.out.println("Nim\t : " + listmhs[pos].nim);
            System.out.println("Nama\t : " + listmhs[pos].nama);
            System.out.println("Kelas\t : " + listmhs[pos].kelas);
            System.out.println("IPK\t : " + x);
        }
        else {
            System.out.println("Data mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }
}
