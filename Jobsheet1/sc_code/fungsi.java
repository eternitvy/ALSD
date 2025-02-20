package Jobsheet1.sc_code;

public class fungsi {

    static int stokbunga[][] = {
        {10, 5, 15, 7},
        {6, 9, 11, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };

    static int hargabunga[] = {75000, 50000, 60000, 10000};

    public static void hitungpendapatan() {
        System.out.println("pendapatan tiap cabang jika semua bunga terjual");
        for (int i = 0; i < stokbunga.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < stokbunga[i].length; j++) {
                pendapatan += stokbunga[i][j] * hargabunga[j];
            }
            System.out.println("royalgarden " + (i + 1) + ": Rp" + pendapatan);
        }
    }

    public static void hitungtotalstok() {
        int totalstok[] = new int[4];
        for (int i = 0; i < stokbunga.length; i++) {
            for (int j = 0; j < stokbunga[i].length; j++) {
                totalstok[j] += stokbunga[i][j];
            }
        }
        System.out.println("\ntotal stok tiap jenis bunga di seluruh cabang: ");
        System.out.println("aglonema:\t" + totalstok[0]);
        System.out.println("keladi:\t\t" + totalstok[1]);
        System.out.println("alocasia:\t" + totalstok[2]);
        System.out.println("mawar:\t\t" + totalstok[3]);
    }

    public static void stokbungamati() {
        int pengurangan[] = {-1, -2, 0, -5};

        for (int i = 0; i < stokbunga[3].length; i++) {
            stokbunga[3][i] += pengurangan[i];
            if (stokbunga[3][i] < 0) {
                stokbunga[3][i] = 0;
            }
        }

        System.out.println("\nstok royalgarden 4 telah berubah: ");
        System.out.println();
        System.out.println("royalgarden " + (4) + ": ");
        System.out.println("aglonema:\t" + stokbunga[3][0]);
        System.out.println("keladi:\t\t" + stokbunga[3][1]);
        System.out.println("alocasia:\t" + stokbunga[3][2]);
        System.out.println("mawar:\t\t" + stokbunga[3][3]);
        System.out.println();
    
    }
    public static void main(String[] args) {
        hitungpendapatan();
        hitungtotalstok();
        stokbungamati();
    }
}
