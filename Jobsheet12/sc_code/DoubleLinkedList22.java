package sc_code;

public class DoubleLinkedList22 {
    Node22 head;
    Node22 tail;
    int size;

    public DoubleLinkedList22() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void add(Mahasiswa22 data, int index) {
        if (index < 0 || index > size) {
            System.out.println("Index salah!");
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == size) {
            addLast(data);
            return;
        }

        Node22 newNode = new Node22(data);
        Node22 current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        newNode.next = current;
        newNode.prev = current.prev;
        current.prev.next = newNode;
        current.prev = newNode;
        size++;

        System.out.println("Data berhasil ditambahkan pada indeks " + index);
    }

    public void addFirst(Mahasiswa22 data) {
        Node22 newNode = new Node22(data);
        if (isEmpty()) {
            head = tail = newNode;
        }
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Mahasiswa22 data) {
        Node22 newNode = new Node22(data);
        if (isEmpty()) {
            head = tail = newNode;
        }
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void insertAfter(String keyNim, Mahasiswa22 data) {
        Node22 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan");
            return;
        }

        Node22 newNode = new Node22(data);

        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        }
        else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }

        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak ada yang bisa dihapus");
            return;
        }

        Mahasiswa22 removed = head.data;
        if (head == tail) {
            head = tail = null;
        }
        else {
            head = head.next;
            head = head.next;
        }
        size--;

        System.out.println("DATA BERHASIL DIHAPUS\n");
        System.out.println("Data yang dihapus: ");
        removed.tampil();
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak ada yang bias dihapus");
            return;
        }

        Mahasiswa22 removed = head.data;
        if (head == tail) {
            head = tail = null;
        }
        else {
            tail = tail.next;
            tail.prev = null;
        }
        size--;

        System.out.println("DATA BERHASIL DIHAPUS\n");
        System.out.println("Data yang dihapus: ");
        removed.tampil();
    }

    public void removeAfter(String keyNim) {
        Node22 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan");
            return;
        }

        if (current.next == null) {
            System.out.println("Tidak ada node setelah NIM " + keyNim);
            return;
        }

        Node22 toDelete = current.next;

        if (toDelete == tail) {
            tail = current;
            current.next = null;
        } else {
            current.next = toDelete.next;
            toDelete.next.prev = current;
        }
        size--;

        System.out.println("DATA BERHASIL DIHAPUS\n");
        System.out.println("Data yang dihapus: ");
        toDelete.data.tampil();
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index tidak valid");
            return;
        }
        if (index == 0) {
            removeFirst();
            return;
        }
        if (index == size - 1) {
            removeLast();
            return;
        }

        Node22 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        current.prev.next = current.next;
        current.next.prev = current.prev;
        size--;

        System.out.println("DATA BERHASIL DIHAPUS\n");
        System.out.println("Data yang dihapus: ");
        current.data.tampil();
    }
    
    public Node22 search(String keyNim) {
        Node22 current = head;
        while (current != null) {
            if (current.data.nim.equals(keyNim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public Node22 getFirst() {
        return head;
    }

    public Node22 getLast() {
        return tail;
    }

    public Mahasiswa22 getIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Indeks tidak valid");
            return null;
        }

        Node22 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.data;
    }

    public int size() {
        return size;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong! Tidak ada data yang ditampilkan");
        } 
        else {
            Node22 current = head;
            while (current != null) {
                current.data.tampil();
                current = current.next;
            }
        }
    }
}
