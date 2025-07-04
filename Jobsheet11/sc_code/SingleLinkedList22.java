package sc_code;

public class SingleLinkedList22 {
    Node22 head;
    Node22 tail;

    boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            Node22 tmp = head;
            System.out.println("Isi Linked List: \t");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(Mahasiswa22 input) {
        Node22 ndInput = new Node22(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa22 input) {
        Node22 ndInput = new Node22(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, Mahasiswa22 input) {
        Node22 ndInput = new Node22(input, null);
        Node22 temp = head;

        while (temp != null) {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }
    }

    public void insertAt(int index, Mahasiswa22 input) {
        if (index < 0) {
            System.out.println("Indeks salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node22 temp = head;
            for (int i = 0; i < index - 1; i++) {
                if (temp == null) {
                    System.out.println("Indeks melebihi panjang list");
                    return;
                }
                temp = temp.next;
            }
            Node22 ndInput = new Node22(input, temp.next);
            temp.next = ndInput;
            if (ndInput.next == null) {
                tail = ndInput;
            }
        }
    }

    //percobaan 2
    public void getData(int index) {
        Node22 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        tmp.data.tampilInformasi();
    }

    public int indexOf(String key) {
        Node22 tmp = head;
        int index = 0;
        while (tmp != null && !tmp.data.nama.equalsIgnoreCase(key)) {
            tmp = tmp.next;
            index++;
        }

        if (tmp == null) {
            return -1;
        }
        else {
            return index;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("linked list masih kosong, tidak dapat dihapus!");
        }
        else if (head == tail) {
            head = tail = null;
        }
        else {
            Node22 temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus!");
        }
        else if (head == tail) {
            head = tail = null;
        }
        else {
            Node22 temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }


    public void remove(String key) {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus!");
        }
        else {
            Node22 temp = head;
            while ( temp!= null) {
                if ((temp.data.nama.equalsIgnoreCase(key)) && (temp == head)) {
                    this.removeFirst();
                    break;
                }
                else if (temp.data.nama.equalsIgnoreCase(key)) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        }
        else {
            Node22 temp = head;
            for (int i = 0; i < index; i++) {
                if (temp.next == null) {
                    tail = head;
                }
            }
        }
    }
}
