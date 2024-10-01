import java.util.Scanner;

public class Pemilihan2Percobaan208 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String menu, member, jumlahbeli;
        double totalbayar;
        int pilihan_menu;
        double diskon; 
        int harga;
        harga = input.nextInt();
        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("-------------------------------------");
        System.out.println("masukkan angka dari menu yang dipilih = ");
    
        pilihan_menu = input.nextInt();
        input.nextLine();
        System.out.println("Apakah punya member (y/n) ? = ");
        member = input.nextLine();
        System.out.println("-------------------------------------");

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("harga ricebowl = " + harga);
                
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("harga ice tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("harga bunding = " + harga);

            } else {
                System.out.println("masukkan pilihan menu dengan benar");
            }
            
            totalbayar =  harga - (harga * diskon);
            System.out.println("total bayar setelah diskon = " + totalbayar);
            
        } else if (member.equalsIgnoreCase("n")) {
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("harga ricebowl = " + harga);
                
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("harga ice tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("harga bunding = " + harga);

            } else {
                System.out.println("masukkan pilihan menu dengan benar");
                return;
            }
            System.out.println("Total bayar = " + harga);
        
        } else {
            System.out.println("member tidak valid");
        }
        System.out.println("----------------------------------------------");
    }
}