package sc_code;

public class SLLPercobaan2 {
    public static void main(String[] args) {
        SingleLinkedList22 sll = new SingleLinkedList22();

        sll.addFirst(new Mahasiswa22("24212200", "Alvaro", "1A", 4.0));
        sll.addFirst(new Mahasiswa22("23212201", "Bimon", "2B", 3.8));
        sll.addFirst(new Mahasiswa22("22212202", "Cintia", "3C", 3.5));
        sll.addFirst(new Mahasiswa22("21212203", "Dirga", "4D", 3.6));

        System.out.println("Data indeks 1: ");
        sll.getData(1);
        System.out.println();

        System.out.println("Data mahasiswa an Bimon berada pada indeks: " + sll.indexOf("Bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}
