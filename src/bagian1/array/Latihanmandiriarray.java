package bagian1.array;

public class Latihanmandiriarray {
    public static void main(String[] args) {

        // ============================================
        // LATIHAN 1: Suhu tertinggi dan terendah
        // ============================================
        System.out.println("===== LATIHAN 1: Suhu Harian =====");

        double[] suhu = {31.5, 28.0, 33.2, 29.8, 35.1, 27.4};

        double tertinggi = suhu[0];
        double terendah  = suhu[0];

        for (double s : suhu) {
            if (s > tertinggi) tertinggi = s;
            if (s < terendah)  terendah  = s;
        }

        System.out.println("Data suhu     : ");
        for (int i = 0; i < suhu.length; i++) {
            System.out.println("  Hari ke-" + (i + 1) + " : " + suhu[i] + " C");
        }
        System.out.println("Suhu tertinggi: " + tertinggi + " C");
        System.out.println("Suhu terendah : " + terendah  + " C");

        // ============================================
        // LATIHAN 2: Nama hari lebih dari 5 huruf
        // ============================================
        System.out.println();
        System.out.println("===== LATIHAN 2: Nama Hari =====");

        String[] namaHari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};

        System.out.println("Semua hari    : ");
        for (String h : namaHari) {
            System.out.println("  " + h + " (" + h.length() + " huruf)");
        }

        System.out.println("Lebih dari 5 huruf: ");
        for (String h : namaHari) {
            if (h.length() > 5) {
                System.out.println("  -> " + h);
            }
        }

        // ============================================
        // LATIHAN 3: Hitung angka genap
        // ============================================
        System.out.println();
        System.out.println("===== LATIHAN 3: Angka Genap =====");

        int[] angka = {4, 8, 15, 16, 23, 42};
        int jumlahGenap = 0;

        for (int a : angka) {
            if (a % 2 == 0) {
                jumlahGenap++;
                System.out.println("  " + a + " -> genap");
            } else {
                System.out.println("  " + a + " -> ganjil");
            }
        }

        System.out.println("Jumlah angka genap: " + jumlahGenap);
    }
}
