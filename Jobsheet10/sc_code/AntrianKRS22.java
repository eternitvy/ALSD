public class AntrianKRS22 {
    KRS22[] antrian;

    int front;
    int rear;
    int size;
    int max;
    int sudahProses;

    public AntrianKRS22(int max) {
        this.max = max;
        this.antrian = new KRS22[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.sudahProses = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void kosongkanAntrian() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian telah dikosongkan");
    }

    public void tambahAntrian(KRS22 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh");
            return;
        }
        rear = (rear + 1) % max;
        antrian[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " masuk antrian");
    }

    public void prosesKRS() {
        if (size < 2) {
            System.out.println(",i");
        }
    }


}
