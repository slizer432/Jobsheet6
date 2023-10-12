import java.util.Scanner;
public class pemilihan2Percobaan123 {
    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);
        System.out.print("Masukkan Tahun : ");
        int tahun = input23.nextInt();
        if (tahun % 4 == 0 ) {
            if (tahun % 100 != 0)
            System.out.println("Tahun kabisat");
            else 
            System.out.println("Bukan tahun kabisat");
        }else
        System.out.println("Bukan tahun kabisat");
    }
}
