package fightercode.id;

import fightercode.id.function.TokoBaju;

import java.util.Scanner;

public class MainTokoBaju {

    public static void main(String[] args) {

        // Class Inputan
        Scanner input = new Scanner(System.in);

        //Variable Global
        String lihat_barang;

        // Class Fungsi Toko Baju
        TokoBaju methodToko = new TokoBaju();

        // Data Array
        String[] kode_barang = {
                "KM-01",
                "KM-02",
                "KM-03",
                "CLT-01"
        };
        String[] nama_barang = {
                "Kemeja Kotak-Kotak",
                "Kemeja Garis Biru",
                "Kemeja Putih",
                "Kaos Adem"
        };

        int[] harga_barang = {
                75000,
                120000,
                85000,
                98000
        };

        System.out.println("Aplikasi Toko Baju (Diskon 20%)");
        System.out.println("====================================================");
        System.out.println("KM-01. Kemeja Kotak-Kotak");
        System.out.println("KM-02. Kemeja Garis Biru");
        System.out.println("KM-03. Kemeja Putih");
        System.out.println("CLT-01. Kaos Adem");
        System.out.println("0. Keluar Program");
        System.out.println("====================================================");
        System.out.print("Lihat Informasi Barang [Tulis Kode: KM-0*] : ");
        lihat_barang = input.nextLine();

        switch (lihat_barang) {
            case "KM-01":
                methodToko.deskripsiBarang(kode_barang[0], nama_barang[0], harga_barang[0]);
                break;
            case "KM-02":
                methodToko.deskripsiBarang(kode_barang[1], nama_barang[1], harga_barang[1]);
                break;
            case "KM-03":
                methodToko.deskripsiBarang(kode_barang[2], nama_barang[2], harga_barang[2]);
                break;
            case "CLT-01":
                methodToko.deskripsiBarang(kode_barang[3], nama_barang[3], harga_barang[3]);
                break;
            case "0":
                System.out.println("Anda Keluar dari Program! Thanks.");
                break;
            default:
                methodToko.unidentifiedBarang(lihat_barang);
                break;
        }
    }
}
