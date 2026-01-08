import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        boolean lanjut = true;

        int angkaAcak;
        int jumlahPercobaan = 0;
        int maxTebakan = 3;

        angkaAcak = random.nextInt(1, 100);

        System.out.println("Selamat datang di game tebak angka!");
        System.out.println("Saya telah memiliki angka dari 1 sampai 100, silahkan tebak!");

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

            System.out.println("Sisa percobaan: " + (maxTebakan - jumlahPercobaan));

        }

        if (lanjut == true) {
            System.out.println("Anda sudah memenuhi batas menebak!");
            System.out.println("Angka rahasinya nya adalah " + angkaAcak);
            System.out.println("Terimakasih sudah bermain.");
        }

        input.close();

    }
}