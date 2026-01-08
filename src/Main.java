import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        boolean lanjut = true;

        int angkaAcak;
        int jumlahPercobaan = 0;
        int maxTebakan = 0;

        angkaAcak = random.nextInt(1, 100);

        System.out.println("Selamat datang di game tebak angka!");
        System.out.println("pilih level kesulitan: ");
        System.out.println("1 EASY (10 percobaan)");
        System.out.println("2 MEDIUM (5 percobaan)");
        System.out.println("3 Hard (3 percobaan)");
        System.out.println("pilihan mu (1/2/3): ");
        int pilihanLevel = input.nextInt();

        if (pilihanLevel == 1) {
            maxTebakan = 10;
        } else if (pilihanLevel == 2) {
            maxTebakan = 5;
        } else if (pilihanLevel == 3) {
            maxTebakan = 3;
        } else {
            System.out.println("Tidak valid! Kamu dialihkan ke level MEDIUM.");
            maxTebakan = 5;
        }

        System.out.println("Saya telah memiliki angka dari 1 sampai 100, silahkan tebak!");
        System.out.println("============================================================");

        while (jumlahPercobaan < maxTebakan && lanjut == true) {

            System.out.println("Masukkan tebakan anda: ");
            int tebakan = input.nextInt();
            jumlahPercobaan++;

            if (tebakan < angkaAcak) {
                System.out.println("Tebakan terlalu rendah! coba lagi.");
            } else if (tebakan > angkaAcak) {
                System.out.println("Tebakan terlalu tinggi! coba lagi.");
            } else {
                System.out.println("Selamat! anda berhasil menebak dalam " + jumlahPercobaan + " Percobaan.");
                lanjut = false;
            }

            if (lanjut && jumlahPercobaan < maxTebakan) {
                System.out.println("Sisa percobaan: " + (maxTebakan - jumlahPercobaan));
            }

        }

        if (lanjut == true) {
            System.out.println("Anda sudah memenuhi batas menebak!");
            System.out.println("Angka rahasinya nya adalah " + angkaAcak);
            System.out.println("Terimakasih sudah bermain.");
        }

        input.close();

    }
}