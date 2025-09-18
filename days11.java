import java.util.Scanner;
public class day11 {
    public static void main(String[] args) {
        Scanner inputt = new Scanner(System.in);

        System.out.print("Masukkan nama Anda: ");
        String nama = inputt.nextLine();

        System.out.print("Masukkan umur Anda: ");
        int umur = inputt.nextInt();
        System.out.println("Nama Anda: " + nama);
        System.out.println("Umur Anda: " + umur);

    }
}
