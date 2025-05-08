public class DataPenilaian {
    int indeks = 0;

    Mahasiswa mahasiswa;
    MataKuliah mataKuliah;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    double nilaiAkhir;

    Penilaian[] listNilai = new Penilaian[5];
    int idx;
    Penilaian DP = new Penilaian();
    Mahasiswa DM = new Mahasiswa();

    void initializelist(int size) {
        listNilai = new Penilaian[size];
    }

    void tambah(Penilaian n) {
        if (idx < listNilai.length) {
            listNilai[idx] = n;
            idx++;
        }
        else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampilDataNilai() {
        for (Penilaian n : listNilai) {
            n.tampilPenilaian();
            System.out.println();
        }
    }

    void urutanNilaiAkhir() {
        for (int i = 0; i < listNilai.length; i++) {
            for (int j = 1 ; j < listNilai.length - i; j++) {
                if (listNilai[j].nilaiAkhir > listNilai[j - 1].nilaiAkhir) {
                    Penilaian temp = listNilai[j];
                    listNilai[j] = listNilai[j - 1];
                    listNilai[j - 1] = temp;
                }
            }
        }
    }

    void jumlahNilaiMhs() {
        for (int i = 0; i < listNilai.length; i++) {
            for (int j = 0; j < listNilai.length - i - 1; j++) {
                if (listNilai[j].mahasiswa.nim.compareTo(listNilai[j + 1].mahasiswa.nim) > 0) {
                    String temp = listNilai[j].mahasiswa.nim;
                    listNilai[j].mahasiswa.nim = listNilai[j + 1].mahasiswa.nim;
                    listNilai[j + 1].mahasiswa.nim = temp;
                }
            }
        }

        int count1 = 0;
        int countsama1 = 0;
        int countmhs = 0;
        int countmhs2 = 0;

        for (int i = 0; i < listNilai.length; i++) {
            count1 = i;
            for (int j = 0; j < listNilai.length - i -1; j++) {
                if (listNilai[j].mahasiswa.nim == listNilai[j + 1].mahasiswa.nim)
                    if (listNilai[j].nilaiAkhir > 80) {
                        countsama1++;
                    }
                    else if (listNilai[j].nilaiAkhir <= 80 && listNilai[j].nilaiAkhir >= 70) {
                        countmhs++;
                    }
                    else {
                        countmhs2++;
                    }
                }

            }
        }

    //     int count2 = 0;
    //     int count3 = 0;
    //     int countsama2 = 0;
    //     int countsama3 = 0;

    //     int index = 0;
    //     int tes = 0;
    //     int tes2 = 0;
    //     int tes3 = 0;
        

    //     for (int i = 0; i < listNilai.length; i++) {
    //         if (listNilai[i].nilaiAkhir > 80) {
    //             tes++;
    //             if ((listNilai[i].mahasiswa) == (listNilai[i - 1].mahasiswa)) {
    //                 countsama1 = 1;
    //             }
    //             else {
    //                 count1++;
    //             }
    //         }
    //         else if ((listNilai[i].nilaiAkhir <= 80) && (listNilai[i].nilaiAkhir >= 70)) {
    //             tes2++;
    //             if ((listNilai[i].mahasiswa) == (listNilai[i - (i - 1)].mahasiswa)) {
    //                 countsama2 = 1;
    //             }
    //             else  {
    //                 count2++;
    //             }
    //         }
    //         else if (listNilai[i].nilaiAkhir < 70) {
    //             tes3++;
    //             if ((listNilai[i].mahasiswa) == (listNilai[i - (i - 1)].mahasiswa)) {
    //                 countsama3 = 1;
    //             }
    //             else {
    //                 count3++;
    //             }
    //         }    
            
            
    //         index++;
    //     }
    //     System.out.println("Jumlah Mahasiswa Dengan Nilai Akhir >= 80          : " + (count1 + countsama1));
    //     System.out.println("Jumlah Mahasiswa Dengan Nilai Akhir < 80 dan >= 70 : " + (count2 + countsama2));
    //     System.out.println("Jumlah Mahasiswa Dengan Nilai Akhir < 70           : " + (count3 + countsama3));
    


    

    void cariDataPenilaianBerdasarkanNim(String nim) {
        boolean found = false;
    
        for (int i = 0; i < idx; i++) {
            if (listNilai[i].mahasiswa.nim.equalsIgnoreCase(nim)) {
                if (!found) {
                    System.out.println("-- DATA MAHASISWA DITEMUKAN --");
                    found = true;
                }
                listNilai[i].tampilPenilaian();
            }
        }
        if (!found) {
            System.out.println("Data Mahasiswa dengan NIM '" + nim + "' tidak ditemukan");
        }
    }
}
 
