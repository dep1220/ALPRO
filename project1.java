package kuliah.tugas_alpro_2_modul_3.praktikum_modul_3;
import java.util.Scanner;
public class project1 {
  public static void main(String[] args) {
    System.out.println("\033[H\033[2J");
    try (Scanner input = new Scanner(System.in)) {
        int [] data = {99,20,17,8,27,5,21,10,41,11};
        int cari,i;
        boolean ditemukan = false;
        System.out.print("Cari dalam data : ");
        cari = input.nextInt();

        for( i = 0; i < data.length; i++) {
            if(data[i] == cari) {
                ditemukan = true;
                break;
            }
        }

        if (ditemukan == true) {
            System.out.println("data " + cari + " Ditemukan pada indeks ke " + i +".");
        } else {
            System.out.println("data tidak di temukan pada ke-"+i+" indeks");
        }
    // input.close();
    }
    }
}
