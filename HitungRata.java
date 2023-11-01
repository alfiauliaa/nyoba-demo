
import java.util.Scanner;

/**
 * @author Alfi Aulia 
 */

public class HitungRata {
    public static void main(String[] args) {
        // Buat objek Scanner untuk mengambil input dari pengguna
        Scanner aa = new Scanner(System.in);

        // Inisialisasi variabel
        int jumlahAngka = 0;
        double total = 0;

        // Meminta pengguna untuk memasukkan angka-angka
        System.out.print("Masukkan jumlah angka yang ingin dihitung rata-ratanya: ");
        jumlahAngka = aa.nextInt();

        // Meminta pengguna memasukkan angka-angka
        for (int i = 1; i <= jumlahAngka; i++) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            double angka = aa.nextDouble();
            total += angka;
        }

        // Hitung rata-rata
        double rataRata = total / jumlahAngka;

        // Tampilkan hasil
        System.out.println("Rata-rata dari " + jumlahAngka + " angka yang dimasukkan adalah: " + rataRata);

        // Tutup objek Scanner
        aa.close();
    }
}
