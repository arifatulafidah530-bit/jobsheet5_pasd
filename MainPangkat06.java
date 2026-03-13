import java.util.Scanner;
public class MainPangkat06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen : ");
        int elemen = input.nextInt();

        Pangkat06[] png = new Pangkat06[elemen];
        for(int i = 0; i < elemen; i++){
            System.out.print("Masukkan nilai basis elemen ke-" + (i+1) + " : ");
            int nilai = input.nextInt();

            System.out.print("Masukkan nilai pangkat elemen ke-" + (i+1) + " : ");
            int pangkat = input.nextInt();

            png[i] = new Pangkat06(nilai, pangkat);
        }
        System.out.println("--------------------------------");

        System.out.println("HASIL PANGKAT DENGAN BRUTEFORCE");
        for(int i = 0; i < elemen; i++){
            System.out.println(png[i].nilai + "^" + png[i].pangkat + " = " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }
        System.out.println("--------------------------------");

        System.out.println("HASIL PANGKAT DENGAN DIVIDE AND CONQUER");
        for(int i = 0; i < elemen; i++){
            System.out.println(png[i].nilai + "^" + png[i].pangkat + " = " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }
    }
}