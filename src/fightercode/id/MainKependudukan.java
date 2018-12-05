package fightercode.id;

import fightercode.id.function.Kependudukan;

import java.util.Scanner;

public class MainKependudukan {

    public static void main(String[] args) {

        // Class Inputan
        Scanner input = new Scanner(System.in);

        // Class Fungsi Kependudukan
        Kependudukan fungsitampilkan = new Kependudukan();

        //Variable Global
        int pilih_wilayah;

        //Data Konstan Base Wilayah
        String[] nama_wilayah = {
                "Bekasi Barat",
                "Bekasi Timur",
                "Bekasi Selatan",
                "Bekasi Utara"
        };

        int[] total_penduduk = {
                8760,
                7485,
                9685,
                3932
        };

        int[] total_kepalarumahtangga = {
                6785,
                6574,
                5674,
                3425
        };

        int[] luas_wilayah = {
                8578000,
                7688000,
                6975000,
                9879000
        };

        int[] angka_kemiskinan = {
                1349,
                2399,
                2633,
                3522
        };

        System.out.println("Aplikasi Sistem Kependudukan");
        System.out.println("====================================================");
        System.out.println("1. Bekasi Barat");
        System.out.println("2. Bekasi Timur");
        System.out.println("3. Bekasi Selatan");
        System.out.println("4. Bekasi Utara");
        System.out.println("0. Keluar Program");
        System.out.println("====================================================");
        System.out.print("Pilih Wilayah [0-4]: ");
        pilih_wilayah = input.nextInt();

        switch (pilih_wilayah){
            case 0:
                System.out.println("Anda Keluar Program!");
                break;
            case 1:
                fungsitampilkan.dataKependudukan(nama_wilayah[0], total_penduduk[0], total_kepalarumahtangga[0], luas_wilayah[0], angka_kemiskinan[0]);
                break;
            case 2:
                fungsitampilkan.dataKependudukan(nama_wilayah[1], total_penduduk[1], total_kepalarumahtangga[1], luas_wilayah[1], angka_kemiskinan[1]);
                break;
            case 3:
                fungsitampilkan.dataKependudukan(nama_wilayah[2], total_penduduk[2], total_kepalarumahtangga[2], luas_wilayah[2], angka_kemiskinan[2]);
                break;
            case 4:
                fungsitampilkan.dataKependudukan(nama_wilayah[3], total_penduduk[3], total_kepalarumahtangga[3], luas_wilayah[3], angka_kemiskinan[3]);
                break;
            default:
                System.out.println("Pilihan Anda Tidak Ada!");
                break;
        }
    }
}
