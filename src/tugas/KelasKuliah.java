package tugas;

import java.util.ArrayList;

public class KelasKuliah {

    private ArrayList<Mahasiswa> daftar = new ArrayList<>();

    public void tambahMahasiswa(Mahasiswa m) {
        daftar.add(m);
    }

    public void tampilkanSemua() {
        System.out.println("== Daftar Mahasiswa ==");
        for (int i = 0; i < daftar.size(); i++) {
            System.out.println((i + 1) + ". " + daftar.get(i).info());
        }
        System.out.println("Total mahasiswa: " + daftar.size());
    }

    public double hitungRataRata() {
        if (daftar.isEmpty()) return 0;
        double total = 0;
        for (Mahasiswa m : daftar) {
            total += m.getNilai();
        }
        return total / daftar.size();
    }

    public int jumlahLulus() {
        int lulus = 0;
        for (Mahasiswa m : daftar) {
            if (m.lulus()) lulus++;
        }
        return lulus;
    }
}