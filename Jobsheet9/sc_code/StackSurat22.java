package sc_code;
public class StackSurat22 {
    Surat22[] stack;
    int size;
    int top;

    StackSurat22(int size) {
        this.size = size;
        stack = new Surat22[size];
        top = -1;
    }

    public boolean isFull(){
        if (top == size -1) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        else {
            return false;
        }
    }

    public void push(Surat22 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
        }
        else {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat lagi.");
        }
    }

    public Surat22 pop() {
        if (!isEmpty()) {
            Surat22 s = stack[top];
            top--;
            return s;
        }
        else {
            System.out.println("Stack kosong! Tidak ada surat yang di proses.");
            return null;
        }
    }

    public Surat22 peek() {
        if (!isEmpty()) {
            return stack[top];
        }
        else {
            System.out.println("Stack kosong! Tidak ada surat yang dikumpulkan.");
            return null;
        }
    }

    public void cariSurat(String cari) {
        if (isEmpty()) {
            System.out.println("Stack kosong! Tidak ada surat yang dikumpulkan");
            return;
        }
        else {
            boolean found = false;
            for (int i = 0; i <= top; i++) {
                if (stack[i].namaMahasiswa.equalsIgnoreCase(cari)) {
                    System.out.println("== SURAT YANG DICARI ==");
                    System.out.println();
                    stack[i].print();
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Tidak menemukan surat dengan nama " + cari);
            }
        }
    }

}
