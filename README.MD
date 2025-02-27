//Latihan 1

public class LatihanArray1 {} : digunakan untuk mendeklarasi kelas

public static void main(String[] args) {} : metode utama main yang akan dijalankan

int[] bilanganGenap = new int[10]; 
int jumlah = 0; 
: membuat Array elemen yang bertipe int dan menyimpan total elemen pada Array

for (int i = 0; i < bilanganGenap.length; i++) {}
            bilanganGenap[i] = (i + 1) * 2;
: Perulangan yang mengisi Array dari indeks 0 sampai 9 dan mengisi Array bilangan genap mulai dari 2   

System.out.println("Isi array:"); : mencetak baris ke bawah "Isi array"

for (int bilangan : bilanganGenap) {}
            System.out.print(bilangan + " ");
            jumlah += bilangan;
: Perulangan mencetak elemen dalam bilanganGenap, mencetak sebaris ditambahkan dengan spasi, menambahkan nilai bilangan ke jumlah

System.out.println("\\nJumlah semua elemen: " + jumlah); : mencetak ke baris yang baru, menampilkan total semua elemen pada Array

//Latihan 2

public class PencarianArray {} : digunakan untuk mendeklarasi kelas

public static void main(String[] args) {} : metode utama main yang akan dijalankan

int [] nilai = {75, 80, 85, 70, 95, 88};
        int cari = 90;
        boolean ketemu = false;
        int indeks = -1;
: membuat Array yang berisi angka-angka, int cari menentukan nilai yang dicari dalam Array, ketemu digunakan untuk tanda apakah nilai yang dicari ada atau tidak, indeks digunakan untuk menyimpan nilai yang ada dan -1 tanda nilai tidak ada

for (int i = 0; i < nilai.length; i++) {}
            if (nilai[i] == cari) {}
                ketemu = true;
                indeks = i;
                break;
: perulangan untuk mengecek elemen Array, jika elemen Array sama dengan cari ketemu = true tanda nilai ada dan indeks = i menyimpan indeks elemen yang ada kemudian break menghentikan pencarian setelah menemukan nilai yang cocok

if (ketemu) {}
            System.out.println("Nilai " + cari + " ditemukan pada indeks " + indeks);
: jika ketemu bernilai true maka tampilkan indeks nilai dalam Array

else {}
            System.out.println("Nilai " + cari + " tidak ditemukan ");
: jika bernilai false maka nilai tidak ditemukan

//Latihan 3

public class StatistikArray {} : digunakan untuk mendeklarasi kelas

public static void main(String[] args) {} : metode utama main yang akan dijalankan

int [] nilai = {75, 80, 65, 90, 85, 70, 95, 88}; : membuat nilai yang berisi nilai mahasiswa

int tertinggi = nilai[0];
        int terendah = nilai[0];
        int total = nilai[0];
: nilai awal tertinggi diisi dengan elemen pertama, nilai awal terendah diisi dengan elemen pertama, total nilai awal diisi dengan elemen pertama

for (int i = 0; i < nilai.length; i++) {} : perulangan for untuk mengecek nilai Array

if (nilai[i] > tertinggi) {}
                tertinggi = nilai[i];
: nilai[i] lebih besar dari tertinggi, tertinggi diperbarui

if (nilai[i] < terendah) {}
                terendah = nilai[i];
                total += nilai[i];
: nilai[i] lebih kecil dari terendah, terendah diperbarui total += nilai[i] memastikan nilai dijumlahkan dengan benar

double rataRata = (double) total / nilai.length; : mengubah total nilai ke tipe double agar hasil lebih akurat dan total / nilai.length menghitung rata-rata nilai

System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);
        System.out.println("Rata-Rata : " + rataRata);
: mencetak hasil nilai tertinggi, terendah, dan rata-rata

//Latihan 4

public class OperasiMatriks {} : digunakan untuk mendeklarasi kelas

public static void main(String[] args) {} : metode utama main yang akan dijalankan

int [][] matriksA = {
            {1, 2, 3},
            {4, 5, 6}
        };
int [][] matriksB = {
            {7, 8, 9},
            {10, 11, 12}
        };
: matriksA dan matriksB, matriks 2*3 yang berisi angka dijumlahkan elemen per elemen

int [][] hasil = new int[2][3]; : menyimpan hasil penjumlahan matriksA + matriksB

for (int i = 0; i < matriksA.length; i++) {}
            for (int j = 0; j < matriksA[0].length; j++) {}
                hasil [i][j] = matriksA[i][j] + matriksB[i][j];
: perulangan for digunakan untuk mengakses elemen dalam matriks i untuk indeks baris dan j untuk indeks kolom, hasil [i][j] adalah penjumlahan dari matriksA dan matriksB

System.out.println("Hasil penjumlahan matriks : "); : mencetak baris ke bawah dan menampilkan teks "Hasil penjumlahan matriks : "

for (int[] baris : hasil) {} : mengambil setiap baris dalam hasil

for (int nilai : baris) {} : mengambil setiap elemen dalam baris

System.out.print( nilai + " "); : mencetak elemen matriks dalam sebaris dan ditambahkan spasi

System.out.println(); : mencetak baris berikutnya 

//Latihan 5

public class SistemNilai {} : digunakan untuk mendeklarasi kelas

public static void main(String[] args) {} : metode utama main yang akan dijalankan

String [] namaSiswa = {"Ani", "Budi", "Cici", "Dodi", "Edi"};
        int [][] nilai = {
            {80, 85, 90}, // nilai Ani
            {75, 70, 85}, // nilai Budi
            {85, 80, 88}, // nilai Cici
            {90, 85, 95}, // nilai Dodi
            {70, 75, 80}  // nilai Edi
        };
String [] mapel = {"Matematika", "Bahasa Inggris", "IPA"};
: namaSiswa Arrat yang menyimpan nama lima siswa, nilai Array dua dimensi baris menunjukkan siswa dan kolom menujukkan nilai, mapel menyimpan nama mata pelajaran

System.out.println("Rata-rata nilai per siswa : "); : mencetak baris ke bawah dan menampilkan teks "Rata-rata nilai per siswa : "

for (int i = 0; i < nilai.length; i++) {}
            double total = 0;
            for (int n : nilai[i]) {}
                total += n;
: looping untuk setiap nama siswa akan berjalan lima kali, variabel total digunakan untuk menjumlahkan nilai siswa, looping untuk setiap nilai siswa, total += n; untuk menambahkan nilai ke total

double rataSiswa = total / nilai[i].length;
            System.out.printf("%s:%.2f\n", namaSiswa[i], rataSiswa);
: menghitung rata-rata siswa dibagi banyak mapel, mencetak hasil rata-rata nilai siswa dengan 2 angka di belakang koma

System.out.println("\nRata-rata nilai per mata pelajaran : "); : mencetak baris ke bawah dan menampilkan teks "Rata-rata nilai per mata pelajaran : "

for (int j = 0; j < nilai[0].length; j++) {}
            double total = 0;
            for (int i = 0; i < nilai.length; i++) {}
                total += nilai[i][j];
: looping untuk setiap mata pelajaran beralan tiga kali, variabel total untuk menjumlahkan nilai pada mata pelajaran, looping untuk mengambil nilai semua siswa pada mata pelajaran, total += nilai[i][j] menambahkan nilai siswa ke total

double rataMapel = total / nilai.length;
            System.out.printf("%s:%.2f\n", mapel[j], rataMapel);
: menghitung rata-rata nilai per mata pelajaran dibagi banyak siswa, mencetak hasil rata-rata tiap mapel dengan 2 angka di belakang koma

//Latihan 6

public class TicTacToe {} : digunakan untuk mendeklarasi kelas

public static void main(String[] args) {} : metode utama main yang akan dijalankan

char [][] papan = new char[3][3]; : array 2d yang berukuran 3*3

for (int i = 0; i < 3; i++) {}
            for (int j = 0; j < 3; j++) {}
                papan [i][j] = '-';
: for dalam for untuk mengisi seluruh elemen papan jika '_' yang berarti masih kosong

papan [0][0] = 'X';
papan [1][1] = 'Y';
papan [2][2] = 'Z';
: mengisi dengan simbol 'X', 'Y', 'Z'

System.out.println("Status papan : ");
        tampilkanPapan(papan);
: mencetak baris ke bawah dan menampilkan "Status papan : ", memanggil metode tampilkanPapan(papan) untuk mencetak isi

public static void tampilkanPapan(char [][] papan) {} : mendeklarasi metode statis dengan Array 2d

for (int i = 0; i < 3; i++) {}
            for (int j = 0; j < 3; j++) {
                System.out.print(papan[i][j] + " ");
            }
            System.out.println();
: dua loop for untuk menelusuri elemen baris per baris, mencetak setiap elemen ditambahkan spasi, mencetak baris berikutnya