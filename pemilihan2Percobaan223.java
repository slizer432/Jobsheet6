import java.util.Scanner;
public class pemilihan2Percobaan223 {
    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);
        System.out.print("Masukkan besar sudut 1: ");
        float sudut1 = input23.nextInt();
        System.out.print("Masukkan besar sudut 2: ");
        float sudut2 = input23.nextInt();
        System.out.print("Masukkan besar sudut 3: ");
        float sudut3 = input23.nextInt();
        float totalSudut = sudut1 + sudut2 + sudut3;
        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || ((sudut3 == 90))) 
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            else if (sudut1 == 60 || sudut2 == 60 || sudut3 == 60)
                System.out.println("Segitiga tersebut adalah segitiga sama sisi");
            else if (sudut1 == sudut2 || sudut1 == sudut3 || sudut2 == sudut3)
                System.out.println("Segitiga tersebut merupakan segitiga sama kaki");
            else 
                System.out.println("Segitiga tersebut merupakan segitiga sembarang");
        }else
            System.out.println("Bukan segitiga");
    }
}
