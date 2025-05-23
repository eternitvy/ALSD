public class AntrianLayanan22 {
    Mahasiswa22[] data;
    int front;
    int rear;
    int size;
    int max;

    public AntrianLayanan22(int max) {
        this.max = max;
        this.data = new Mahasiswa22[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
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

    public void lihatTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        }
        else {
            System.out.print("== MAHASISWA TERDEPAN ==");
            System.out.println();
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("== DAFTAR MAHASISWA DALAM ANTRIAN ==");
        System.out.println();
        System.out.println("NIM - NAMA - PRODI - KELAS");

        int i = front;
        for (int j = 0; j < size; j++) {
            System.out.print((j + 1) + ". ");
            data[i].tampilkanData();
            i = (i + 1) % max;
        }
    }

    public int getJumlahAntrian() {
        return size;
    }

    public void tambahAntrian(Mahasiswa22 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
        }

    public Mahasiswa22 layaniMahasiswa() {
        if (isEmpty())  {
            System.out.println("Antriam kosong");
            return null;
        }
        Mahasiswa22 mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }

    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("== MAHASISWA PALING BELAKANG ==");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }
}


