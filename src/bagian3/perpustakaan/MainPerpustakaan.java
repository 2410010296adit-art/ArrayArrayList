package bagian3.perpustakaan;

public class MainPerpustakaan {

    public static void main(String[] args) {

        Perpustakaan perpus = new Perpustakaan();

        perpus.tambahBuku(new Buku("Laskar Pelangi",    "Andrea Hirata", 2005));
        perpus.tambahBuku(new Buku("Bumi Manusia",      "Pramoedya",     1980));
        perpus.tambahBuku(new Buku("Negeri 5 Menara",   "Ahmad Fuadi",   2009));
        perpus.tambahBuku(new Buku("Anak Semua Bangsa", "Pramoedya",     1981));

        perpus.tampilkanKoleksi();
        System.out.println();

        // ✅ Latihan 1: uji pinjam dan kembalikan
        System.out.println("===== Latihan 1: Kembalikan Buku =====");
        perpus.pinjamBuku("Bumi Manusia");
        perpus.pinjamBuku("Bumi Manusia");       // coba pinjam lagi
        perpus.kembalikanBuku("Bumi Manusia");   // kembalikan
        perpus.kembalikanBuku("Bumi Manusia");   // coba kembalikan lagi
        perpus.kembalikanBuku("Laskar Pelangi"); // belum pernah dipinjam
        System.out.println();

        // ✅ Latihan 2: tampilkan koleksi dengan tahun terbit
        System.out.println("===== Latihan 2: Tahun Terbit =====");
        perpus.tampilkanKoleksi();
        System.out.println();

        // ✅ Latihan 3: cari berdasarkan penulis
        System.out.println("===== Latihan 3: Cari Penulis =====");
        perpus.cariPenulis("Pramoedya");
        System.out.println();
        perpus.cariPenulis("J.K. Rowling");
        System.out.println();

        System.out.println("Buku tersedia: " + perpus.jumlahTersedia());
    }
}