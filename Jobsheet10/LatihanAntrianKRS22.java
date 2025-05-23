public class LatihanAntrianKRS22 {
    LatihanMahasiswa22[] data;
    int front;
    int rear;
    int size;
    int max;
    int kuota = 30;

    public LatihanAntrianKRS22() {
        max = 10;
        data = new LatihanMahasiswa22[max];
        front = size = 0;
        rear = -1;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        }
        else {
            return false;
        }
    }

    public void clear() {
        if (isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan");
        }
        else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void tambahAntrian(LatihanMahasiswa22 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println();
        System.out.println(mhs.nama + " berhasil masuk ke antrian");
    }

    public LatihanMahasiswa22[] layaniMahasiswa() {
        LatihanMahasiswa22[] dilayani = new LatihanMahasiswa22[2];
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
            return null;
        }
        if (size < 2) {
            System.out.println("Mahasiswa di dalam antrian masih kurang dari 2");
            return null;
        }
        dilayani[0] = data[front];
        dilayani[1] = data[front + 1];
        front = (front + 2) % max;
        size -= 2;
        kuota -= 2;
        return dilayani;
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
            return;
        }
        System.out.println("== DAFTAR MAHASISWA DALAM ANTRIAN ==");
        System.out.println();
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size ; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void lihatDuaDepan() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        }
        else {
            System.out.println("== MAHASISWA 2 TERDEPAN ==");
            System.out.println();
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
            data[front + 1].tampilkanData();
        }
    }

    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        }
        else {
            System.out.println("== MAHASISWA TERAKHIR ==");
            System.out.println();
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }

    public void jumlahAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        }
        else {
            System.out.println("Jumlah Antrian = " + size);
        }
    }

    public void belumProses() {
        System.out.println("Mahasiswa yang belum melakukan proses KRS: " + (kuota - size));
    }

    public void sudahProses() {
        System.out.println("Mahasiswa yang sudah melakukan proses KRS: " + (30 - kuota + size));
    }
}
