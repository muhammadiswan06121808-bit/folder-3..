import java.util.Scanner;

class Kalkulator {
    double angka1, angka2;
    char operator;

    Kalkulator(double a1, double a2, char op) {
        angka1 = a1;
        angka2 = a2;
        operator = op;
    }

    double tambah() {
        return angka1 + angka2;
    }

    double kurang() {
        return angka1 - angka2;
    }

    double kali() {
        return angka1 * angka2;
    }

    double bagi() {
        if (angka2 == 0) {
            System.out.println("Error: pembagian dengan nol!");
            return 0;
        }
        return angka1 / angka2;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char lagi;

        do {
            System.out.print("Angka 1 : ");
            double a1 = sc.nextDouble();

            System.out.print("Angka 2 : ");
            double a2 = sc.nextDouble();

            System.out.print("Operator (+,-,*,/) : ");
            char op = sc.next().charAt(0);

            Kalkulator k = new Kalkulator(a1, a2, op);
            double hasil = 0;

            switch (op) {
                case '+': hasil = k.tambah(); break;
                case '-': hasil = k.kurang(); break;
                case '*': hasil = k.kali(); break;
                case '/': hasil = k.bagi(); break;
                default: System.out.println("Operator tidak dikenal");
            }

            System.out.printf("Hasil: %.2f %c %.2f = %.2f\n", a1, op, a2, hasil);

            System.out.print("Hitung lagi? (y/n): ");
            lagi = sc.next().charAt(0);

        } while (lagi == 'y');
    }
}