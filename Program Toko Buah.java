import java.util.Scanner;

class Buah {
    String nama;
    double harga;
    int stok;

    Buah(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    boolean tersedia(int qty) {
        if (stok >= qty) {
            stok -= qty;
            return true;
        }
        return false;
    }

    double hitungTotal(int qty) {
        return harga * qty;
    }

    String info() {
        return nama + " Rp" + harga + " (stok:" + stok + ")";
    }
}

class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Buah[] katalog = {
            new Buah("Apel", 15000, 10),
            new Buah("Jeruk", 12000, 8),
            new Buah("Mangga", 20000, 5)
        };

        double total = 0;
        int pilih;

        do {
            System.out.println("\n=== KATALOG ===");
            for (int i = 0; i < katalog.length; i++) {
                System.out.println((i+1) + ". " + katalog[i].info());
            }

            System.out.print("Pilih (0=stop): ");
            pilih = sc.nextInt();

            if (pilih == 0) break;

            System.out.print("Jumlah: ");
            int qty = sc.nextInt();

            if (katalog[pilih-1].tersedia(qty)) {
                double harga = katalog[pilih-1].hitungTotal(qty);
                total += harga;
                System.out.println("OK +Rp" + harga);
            } else {
                System.out.println("Stok tidak cukup!");
            }

        } while (pilih != 0);

        System.out.println("Total: Rp" + total);
    }
}