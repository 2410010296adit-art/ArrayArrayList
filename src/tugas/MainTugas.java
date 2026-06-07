// Nama : [Aditya Kurniawan]
// NPM  : [2410010296]
package tugas;

public class MainTugas {

    public static void main(String[] args) {

        // ✅ Poin 4: array mata kuliah ukuran tetap
        String[] mataKuliah = {
            "Pemrograman Berbasis Objek 1",
            "Basis Data",
            "Matematika Diskrit"
        };

        System.out.println("===== Mata Kuliah =====");
        for (String mk : mataKuliah) {
            System.out.println("- " + mk);
        }
        System.out.println();

        // membuat objek KelasKuliah
        KelasKuliah kelas = new KelasKuliah();

        // ✅ Poin 3: minimal 5 mahasiswa
        kelas.tambahMahasiswa(new Mahasiswa("Andi",   "2301001", 85.0));
        kelas.tambahMahasiswa(new Mahasiswa("Budi",   "2301002", 55.0));
        kelas.tambahMahasiswa(new Mahasiswa("Citra",  "2301003", 72.5));
        kelas.tambahMahasiswa(new Mahasiswa("Dewi",   "2301004", 90.0));
        kelas.tambahMahasiswa(new Mahasiswa("Eko",    "2301005", 48.0));

        // tampilkan semua mahasiswa
        kelas.tampilkanSemua();
        System.out.println();

        // ✅ Poin 5: tampilkan rata-rata dan jumlah lulus
        System.out.println("===== Statistik Kelas =====");
        System.out.printf("Rata-rata nilai : %.2f%n", kelas.hitungRataRata());
        System.out.println("Jumlah lulus    : " + kelas.jumlahLulus()
                           + " dari " + 5 + " mahasiswa");
        System.out.println();

        // ✅ Poin 6: tambah mahasiswa baru lalu tampilkan jumlah terbaru
        System.out.println("===== Tambah Mahasiswa Baru =====");
        kelas.tambahMahasiswa(new Mahasiswa("Fitri", "2301006", 78.0));
        System.out.println("Mahasiswa baru berhasil ditambahkan.");
        System.out.println();

        kelas.tampilkanSemua();
        System.out.println();

        System.out.println("===== Statistik Terbaru =====");
        System.out.printf("Rata-rata nilai : %.2f%n", kelas.hitungRataRata());
        System.out.println("Jumlah lulus    : " + kelas.jumlahLulus()
                           + " dari " + kelas.jumlahLulus()
                           + " mahasiswa");
    }
}