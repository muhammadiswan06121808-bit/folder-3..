import java.util.Scanner;

class Mahasiswa {
    String nama, nim;
    int jumlahMK;
    int[] nilai;

    Mahasiswa(String nama, String nim, int jumlahMK) {
        this.nama = nama;
        this.nim = nim;
        this.jumlahMK = jumlahMK;
        nilai = new int[jumlahMK];
    }

    void inputNilai(Scanner sc) {
        for (int i = 0; i < jumlahMK; i++) {
            System.out.print("Nilai MK-" + (i+1) + ": ");
            nilai[i] = sc.nextInt();
        }
    }

    double hitungRata() {
        int total = 0;
        for (int n : nilai) {
            total += n;
        }
        return (double) total / jumlahMK;
    }

    char grade() {
        double avg = hitungRata();
        if (avg >= 85) return 'A';
        else if (avg >= 75) return 'B';
        else if (avg >= 60) return 'C';
        else return 'D';
    }

    boolean lulus() {
        return hitungRata() >= 60;
    }

    void tampil() {
        System.out.println("\n=== RAPOR ===");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        for (int i = 0; i < jumlahMK; i++) {
            System.out.println("MK-" + (i+1) + " : " + nilai[i]);
        }
        System.out.printf("Rata  : %.2f\n", hitungRata());
        System.out.println("Grade : " + grade());
        System.out.println("Lulus : " + lulus());
    }
}

class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama  : ");
        String nama = sc.nextLine();

        System.out.print("NIM   : ");
        String nim = sc.nextLine();

        System.out.print("Jumlah MK : ");
        int jmk = sc.nextInt();

        Mahasiswa m = new Mahasiswa(nama, nim, jmk);
        m.inputNilai(sc);
        m.tampil();
    }
}