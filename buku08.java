import java.util.Scanner;

public class buku08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String jenisbuku;
        double diskon = 0;
        int jumlah;

        System.out.println("masukkan jenis buku (kamus/novel/lainnya) = ");
        jenisbuku = input.nextLine().toLowerCase();
        System.out.println("jumlah = ");
        jumlah = input.nextInt();

        if (jenisbuku.equals("kamus")) {
            diskon = 10.0;
            if (jumlah > 2) {
                diskon += 2.0;
        } 
            
        } else if (jenisbuku.equals("novel")) {
            diskon = 7.0;
            if (jumlah > 3) {
                diskon += 2.0;
                
            }
            
        } else if (jenisbuku.equals("lainnya")) {
            if (jumlah > 3) {
                diskon = 5.0;
                
            } 
            
        } 
        double totaldiskon = (diskon / 100);

        System.out.println("total diskon yang diberikan = " + diskon + "%");
        }

    }
