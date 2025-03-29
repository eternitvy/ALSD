package sc_code;
import java. util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int elemen = sc.nextInt();
        System.out.println();

        pangkat[] png = new pangkat[elemen];
        for(int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai basis elemen ke-" + (i + 1) + ": ");
            int basis = sc.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-" + (i + 1) + ": ");
            int pangkat = sc.nextInt();
            png[i] = new pangkat(basis, pangkat);
            System.out.println();
        }

        System.out.println("HASIL PANGKAT BRUTEFORCE: ");
        for(pangkat p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatBF(p.nilai, p.pangkat));
        }

        System.out.println();
        System.out.println("HASIL PANGKAT DIVIDE AND CONQUER:");
        for(pangkat p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatDC(p.nilai, p.pangkat));
        }
    }
}
