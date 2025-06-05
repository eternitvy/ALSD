package sc_code;

public class LatAntrianLayanan {
    LatNodeMhs head;
    LatNodeMhs tail;
    int size;
    int currentSize;

    public LatAntrianLayanan(int size) {
        head = null;
        tail = null;
        this.size = size;
        currentSize = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    boolean isFull() {
        return currentSize == size;
    }

    public void tambah(LatMhs data) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        LatNodeMhs temp = new LatNodeMhs(data, null);
        if (head == null) {
            head = temp;
            tail = temp;
        }
        else {
            tail.next  = temp;
            tail = temp;
        }
        currentSize++;
    }

    public void lihatTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian Kosong!");
        }
        else {
            head.data.tampilInformasi();
        }
    }

    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian Kosong");
        }
        else {
            tail.data.tampilInformasi();
        }
    }

    public void layaniMahasiswa() {
        if (isEmpty()) {
            System.out.println("Antrian Kosong");
        }
        else {
            head.data.tampilInformasi();
            head = head.next;
            currentSize--;
        }
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian Kosong!");
        }
        else {
            LatNodeMhs temp = head;
            while (temp != null) {
                temp.data.tampilInformasi();
                temp = temp.next;
            }
        }
    }

    public void clear() {
        head = null;
        tail = null;
        currentSize = 0;
        System.out.println("Antrian dikosongkan");
    }
}
