import java.util.Scanner;

public class days12 {
    public static void main(String[] args) {
        // Membuat scanner untuk menerima input
        Scanner inputt = new Scanner(System.in);

        // Input data
        System.out.print("Masukkan Nama: ");
        String nama = inputt.nextLine();

        System.out.print("Masukkan Umur : ");
        int umur = inputt.nextInt();

        System.out.print("Masukkan Tinggi : ");
        double tb = inputt.nextDouble();

        // Output menggunakan println, print, dan printf
        System.out.println("Data Mahasiswa:");
        System.out.print("Nama: " + nama + "\n");
        System.out.printf("Umur: %d tahun\n", umur);
        System.out.printf("Tinggi Badan: %.2f\n", tb) ;

    }
}
