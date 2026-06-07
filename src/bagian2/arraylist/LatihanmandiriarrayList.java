package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanmandiriarrayList {
    public static void main(String[] args) {

        // ============================================
        // LATIHAN 1: Daftar Belanja
        // ============================================
        System.out.println("===== LATIHAN 1: Daftar Belanja =====");

        ArrayList<String> belanja = new ArrayList<>();
        belanja.add("Beras");
        belanja.add("Telur");
        belanja.add("Minyak");
        belanja.add("Gula");

        System.out.println("Sebelum dihapus : " + belanja);
        System.out.println("Jumlah awal     : " + belanja.size());

        belanja.remove(1); // hapus item ke-2 (indeks 1)

        System.out.println("Setelah dihapus : " + belanja);
        System.out.println("Jumlah akhir    : " + belanja.size());

        // ============================================
        // LATIHAN 2: Nilai Terbesar
        // ============================================
        System.out.println();
        System.out.println("===== LATIHAN 2: Nilai Terbesar =====");

        ArrayList<Integer> angka = new ArrayList<>();
        angka.add(45);
        angka.add(82);
        angka.add(67);
        angka.add(91);
        angka.add(38);

        System.out.println("Data angka : " + angka);

        int terbesar = angka.get(0); // anggap elemen pertama terbesar dulu
        for (int a : angka) {
            if (a > terbesar) {
                terbesar = a;
            }
        }

        System.out.println("Nilai terbesar : " + terbesar);

        // ============================================
        // LATIHAN 3: Nama Berawalan Huruf A
        // ============================================
        System.out.println();
        System.out.println("===== LATIHAN 3: Nama Berawalan A =====");

        ArrayList<String> nama = new ArrayList<>();
        nama.add("Andi");
        nama.add("Budi");
        nama.add("Ani");
        nama.add("Citra");
        nama.add("Ahmad");
        nama.add("Deni");

        System.out.println("Semua nama : " + nama);
        System.out.println("Nama berawalan huruf A:");
        for (String n : nama) {
            if (n.startsWith("A")) {
                System.out.println("  -> " + n);
            }
        }
    }
} 

