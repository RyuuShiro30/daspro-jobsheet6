import java.util.Scanner;

public class Pemilihan2Percobaan108 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // deklarasi
        int tahun;

        System.out.println("tahun: ");
        tahun = input.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0) {
                System.out.println("tahun kabisat");

            } else {
                System.out.println("bukan tahun kabisat");
            }

        }
    }
}