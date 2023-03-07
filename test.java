package kuliah.tugas_alpro_2_modul_3.praktikum_modul_3;
import java.util.Scanner;

public class test {
  public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
      System.out.println("\033[H\033[2J");
            // inisialisasi array produk dan harga
            String[] produk = {"Jaguar", "Lamborgini", "Honda", "Audi", "Suzuki", "Mazda", "Daihatsu", "Ford", "Hyundai", "Mitsubishi"};
            long[] harga = {1340000000, 34500000000L, 350000000, 2000000000, 245000000, 500000000, 169000000, 789000000, 122900000, 278100000};
    
            // menampilkan menu
            while (true) {
                System.out.println("MENU");
                System.out.println("1. Cari Produk");
                System.out.println("2. Urutkan Harga");
                System.out.println("3. Tampilkan Harga Produk Termurah Nomor K");
                System.out.println("0. Keluar");

                System.out.print("Masukkan pilihan Anda: ");
                int pilihan = scanner.nextInt();
    
                switch (pilihan) {
                    case 1:
                        // input produk yang ingin dicari
                        scanner.nextLine(); // mengabaikan newline character setelah input int sebelumnya
                        System.out.print("\nMasukkan nama produk yang ingin dicari: ");
                        String keyword = scanner.nextLine();
    
                        // mencari produk yang diinputkan
                        int index = cariProduk(produk, keyword);
                        if (index == -1) {
                            System.out.println("Produk " + keyword + " tidak ditemukan");
                        } else {
                            System.out.println("Produk " + keyword + " berada di indeks ke-" + index);
                        }
                        break;
    
                    case 2:
                        // mengurutkan data harga dari nilai termurah hingga termahal
                        sortHarga(harga);
                        System.out.println("\nDaftar harga produk dari termurah hingga termahal:");
                        printHarga(harga);
                        break;
    
                    case 3:
                        // input nomor produk termurah yang ingin ditampilkan
                        System.out.print("\nMasukkan nomor produk termurah yang ingin ditampilkan: ");
                        int nomor = scanner.nextInt();
                        System.out.println("Harga produk termurah nomor ke-" + nomor + " adalah " + harga[nomor-1]);
                        break;
    
                    case 0:
                        // keluar dari program
                        System.out.println("Terima kasih telah menggunakan program ini");
                        scanner.close();
                        System.exit(0);
                        break;
    
                    default:
                        System.out.println("Pilihan tidak valid");
                }
    
                System.out.println();
            }
        }
    
        public static int cariProduk(String[] produk, String keyword) {
            for (int i = 0; i < produk.length; i++) {
                if (produk[i].equalsIgnoreCase(keyword)) {
                    return i;
                }
            }
            return -1;
        }
                public static void printHarga(long[] harga) {
                  for (int i = 0; i < harga.length; i++) {
                      System.out.println("Harga " + (i+1) + ": " + harga[i]);
                  }
                }

        public static void sortHarga(long[] harga) {
            int n = harga.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (harga[i] > harga[j]) {
                        long temp = harga[i];
                        harga[i] = harga[j];
                        harga[j] = temp;
                    }
                  }
                }


  }
}
