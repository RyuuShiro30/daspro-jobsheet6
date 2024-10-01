import java.util.Scanner;

public class Pemilihan2Percobaan208 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //deklarasi
        float sudut1;
        float sudut2;
        float sudut3;
        float totalsudut;

        System.out.print("sudut 1: ");
        sudut1 = input.nextFloat();
        System.out.print("sudut 2: ");
        sudut2 = input.nextFloat();
        System.out.print("sudut 3: ");
        sudut3 = input.nextFloat();

        totalsudut = sudut1 + sudut2 + sudut3;

        if (totalsudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)) {
                System.out.println("segitiga siku-siku");
                
            } else {
                System.out.println("bukan segitiga siku-siku");
            }
        
        } else {
            System.out.println("bukan segitiga");
        }
    }
}
