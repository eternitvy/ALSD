import java.util.Scanner;

public class QueueMain22 {

    public static void menu() {
            System.out.println("===== MENU =====");
            System.out.println("| 1. Enqueue   |");
            System.out.println("| 2. Dequeue   |");
            System.out.println("| 3. Print     |");
            System.out.println("| 4. Peek      |");
            System.out.println("| 5. Clear     |");
            System.out.println("================");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue: ");
        int n = sc.nextInt();
        int pilih;

        Queue22 q = new Queue22(n);

        do {
            menu();
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            System.out.println();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data baru: ");
                    int dataMasuk = sc.nextInt();
                    q.Enqueue(dataMasuk);
                    System.out.println();
                    break;
            
                case 2:
                    int dataKeluar = q.Dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang dikeluarkan: " + dataKeluar);
                        System.out.println();
                        break;
                    }

                case 3:
                    q.print();
                    System.out.println();
                    break;

                case 4:
                    q.peek();
                    System.out.println();
                    break;

                case 5:
                    q.clear();
                    System.out.println();
                    break;

                default:
                    System.out.println("Pilihan Tidak Valid!");
                    break;
            }
        }
        while (pilih >= 1 && pilih <= 5);
    }
}
