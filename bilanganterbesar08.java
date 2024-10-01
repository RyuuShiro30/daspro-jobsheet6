import java.util.Scanner;

public class bilanganterbesar08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //deklarasi
        int bil1 = 28; 
        int bil2 = 54; 
        int bil3 = 15;
        int terbesar;

        System.out.println("bilangan 1 = ");
        bil1 = input.nextInt();
        System.out.println("bilangan 2 = ");
        bil2 = input.nextInt();
        System.out.println("bilangan 3 = ");
        bil3 = input.nextInt();

        if (bil1 > bil2) {
            if (bil1 > bil3) {
                terbesar = bil1;
                
            } else {
                terbesar = bil3;
            }
            
        } else if (bil2 > bil3) {
            terbesar = bil2;
            
        } else {
            terbesar = bil3;
        }
        System.out.println("bilangan terbesar adalah " + terbesar);
    }
}
