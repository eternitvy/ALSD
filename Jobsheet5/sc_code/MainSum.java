package sc_code;
import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = sc.nextInt();
        System.out.println();

        Sum sm = new Sum(elemen);
        for(int i = 0; i < elemen; i++) {
            System.out.print("Masukkan keuntungan ke-" + (i + 1) + ": ");
            sm.keuntungan[i] = sc.nextDouble();
        }
        System.out.println();

        System.out.println("Total keuntungan menggunakan Bruteforce: " + sm.TotalBF());
        System.out.println("Total keuntungan menggunakan Divide Conquer: " + sm.TotalDC(sm.keuntungan, 0, elemen - 1));
    }
}
