package sc_code;
import java.util.concurrent.ForkJoinPool;

public class DataDosen22 {
    Dosen22[] dosen;
    int dosenPria = 0;
    int dosenWanita = 0;

    void dataSemuaDosen(Dosen22[] dosen) {
        for (int i = 0; i < dosen.length; i++) {
            System.out.println("Kode          : " + dosen[i].kode);
            System.out.println("Nama          : " + dosen[i].nama);
            System.out.println("Jenis Kelamin : " + (dosen[i].JenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + dosen[i].usia);
            System.out.println("----------------------------");
        }
    }

    void jumlahDosenPerJenisKelamin(Dosen22[] dosen){
        for (int i = 0; i < dosen.length; i++) {
            if (dosen[i].JenisKelamin == true) {
                dosenPria++;
            } else {
                dosenWanita++;
            }
        }
        if (dosenPria == 0) {
            System.out.println("Jumlah Dosen Pria : 0");
        }else{
            System.out.println("Jumlah Dosen Pria   : " + dosenPria);
        }
        if (dosenWanita == 0) {
            System.out.println("Jumlah Dosen Wanita : 0");
        }else{
            System.out.println("Jumlah Dosen Wanita : " + dosenWanita);
        }
    }

    void rerataUsiaDosenPerJenisKelamin(Dosen22[] dosen){
        int totalPria = 0;
        int totalWanita = 0;
        int jumlahPria = 0;
        int jumlahWanita = 0;

        for (int i = 0; i < dosen.length; i++) {
            if (dosen[i].JenisKelamin == true) {
                totalPria += dosen[i].usia;
                jumlahPria++;
            } else {
                totalWanita += dosen[i].usia;
                jumlahWanita++;
            }
        }

        if (jumlahPria == 0) {
            System.out.println("Rerata Usia Dosen Pria : 0");
        }else{
            System.out.println("Rerata Usia Dosen Pria   : " + totalPria / jumlahPria);
        }
        if (jumlahWanita == 0) {
            System.out.println("Rerata Usia Dosen Wanita : 0");
        }else{
            System.out.println("Rerata Usia Dosen Wanita : " + totalWanita / jumlahWanita);
        }
    }


    void infoDosenPalingTua(Dosen22[] dosen){
        int usiaPalingTua = 0;
        
        for(int i = 0;i < dosen.length;i++){
            if(dosen[i].usia > usiaPalingTua){
                usiaPalingTua = dosen[i].usia;
            }
        }

        System.out.println("Data Dosen Paling Tua:");
        for (int i = 0; i < dosen.length; i++) {
            if (dosen[i].usia == usiaPalingTua) {
                System.out.println("Kode           : " + dosen[i].kode);
                System.out.println("Nama           : " + dosen[i].nama);
                System.out.println("Jenis Kelamin  : " + (dosen[i].JenisKelamin ? "Pria" : "Wanita"));
                System.out.println("Usia           : " + dosen[i].usia);
                System.out.println("----------------------------");
            }
        }
    }
    
    void infoDosenPalingMuda(Dosen22[] dosen){
        int usiaPalingMuda = Integer.MAX_VALUE;
        
        for(int i = 0;i < dosen.length;i++){
            if(dosen[i].usia < usiaPalingMuda){
                usiaPalingMuda = dosen[i].usia;
            }
        }

        System.out.println("Data Dosen Paling Muda:");
        for (int i = 0; i < dosen.length; i++) {
            if (dosen[i].usia == usiaPalingMuda) {
                System.out.println("Kode           : " + dosen[i].kode);
                System.out.println("Nama           : " + dosen[i].nama);
                System.out.println("Jenis Kelamin  : " + (dosen[i].JenisKelamin ? "Pria" : "Wanita"));
                System.out.println("Usia           : " + dosen[i].usia);
                System.out.println("----------------------------");
            }
        }
    }
}