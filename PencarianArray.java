public class PencarianArray {

    public static void main(String[] args) {

        // program mencari nilai dalam array
        int [] nilai = {75, 80, 85, 70, 95, 88};
        int cari = 90;
        boolean ketemu = false;
        int indeks = -1;
        
        // mencari nilai
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == cari) {
                ketemu = true;
                indeks = i;
                break;
            }
        }

        // menampilkan hasil
        if (ketemu) {
            System.out.println("Nilai " + cari + " ditemukan pada indeks " + indeks);
        } else {
            System.out.println("Nilai " + cari + " tidak ditemukan ");
        }
    }
}