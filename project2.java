package kuliah.tugas_alpro_2_modul_3.praktikum_modul_3;

public class project2 {
    public static void main(String[] args) {
        int a [] = {5,2,9,7,1,6,8,3};
        int n = 8, batasAtas = 0, batasBawah = n -1, tengah = 0;
        int cari = 2;
        boolean ketemu = false;

        while((batasAtas <= batasBawah) && (ketemu == false)) {
            tengah = (batasAtas + batasBawah) / 2;
            if(a[tengah] == cari) {
                ketemu = true;
            } else if (a[tengah] <= cari){
                batasAtas = tengah + 1;
            } else {
                batasBawah = tengah -1;
            }
        }

        if (ketemu == true) {
            System.out.println("Angka : " + cari + " ditemukan, data berada di indeks " + tengah);
        } else {
            System.out.println("angka : " + cari + "data tidak di temukan.");
        }
    }

    public static int binarySearch (int[] array, int number) {
        int bawah = 0;
        int atas = array.length - 1;
        while(bawah <= atas) {
            int temTengah = (bawah + atas)/ 2;
            int tengah = array[temTengah];
            if (number == tengah) {
                return temTengah;
            }
            if (number > tengah) {
                atas = temTengah - 1;
            } else {
                bawah = temTengah + 1;
            }
        }
        return -1;
    }
}
