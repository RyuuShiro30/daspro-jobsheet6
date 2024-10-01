import java.util.Scanner;

public class merksepatu08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String merk;
        int ukuran;
        String kategori;
        int harga = 0;

        System.out.println("merk (converse, sketcher, nike) = ");
        merk = input.nextLine();
        System.out.println("kategori (slip on, high top, woman, man, adult, kids) = ");
        kategori = input.nextLine();
        System.out.println("ukuran = ");
        ukuran = input.nextInt();

        if (merk.equals("converse")) {
            if (kategori.equals("slip on") && (ukuran >= 36 && ukuran <= 40)) {
                harga = 800000;
            
            } else if (kategori.equals("high top") && (ukuran >= 40 && ukuran <= 44))  {
                harga = 1200000;
                
            }
            
        } else if (merk.equals("sketcher")) {
            if (kategori.equals("woman") && (ukuran >= 36 && ukuran <= 41)) {
                harga = 1000000;
                
            } else if (kategori.equals("man") && (ukuran >= 41 && ukuran <= 44)) {
                harga = 18000000;
                
            }
            
        } else if (merk.equals("nike")) {
            if (kategori.equals("kids") && (ukuran >= 36 && ukuran <= 40)) {
                harga = 750000;

                
            } else if (kategori.equals("adult") && (ukuran >= 40 && ukuran <= 44)) {
                harga = 1500000;
                
            }
            
        } if (harga > 0) {
            System.out.println("harga yang harus dibayar = " + harga);
            
        } else {
            System.out.println("ukuran tidak sesuai");
        }
    }
}