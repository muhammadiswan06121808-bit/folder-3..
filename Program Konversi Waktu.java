import java.util.Scanner;

class KonversiWaktu {
    long totalDetik, detik, menit, jam;

    KonversiWaktu(long totalDetik) {
        this.totalDetik = totalDetik;
    }

    void konversi() {
        detik = totalDetik % 60;
        long totalMenit = totalDetik / 60;

        menit = totalMenit % 60;
        long totalJam = totalMenit / 60;

        jam = totalJam % 24;
    }

    void tampil() {
        System.out.printf("Waktu: %02d:%02d:%02d\n", jam, menit, detik);
    }
}

class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan total detik: ");
        long detik = sc.nextLong();

        KonversiWaktu k = new KonversiWaktu(detik);
        k.konversi();
        k.tampil();
    }
}