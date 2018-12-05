package fightercode.id.function;

import java.util.Scanner;

public class TokoBaju {

    // Class Inputan
    Scanner input = new Scanner(System.in);

    String kode_brg, nama_brg;
    int harga_brg, total_harga;

    // Variable Global
    String langsung_transaksi;
    int total_barang, total_bayar;

    public void deskripsiBarang(String kd, String nm, int hrg) {
        System.out.println("----------------------------------------------------");
        System.out.println("Informasi Barang CV. Cloth Indo");
        System.out.println("====================================================");
        System.out.println("Kode Barang         : " + kd);
        System.out.println("Nama Barang         : " + nm);
        System.out.println("Harga (Per Satuan)  : " + hrg);
        System.out.println("====================================================");
        System.out.print("Langsung Transaksi [Y/T] : ");
        langsung_transaksi = input.nextLine();

        switch (langsung_transaksi) {
            case "Y":
                System.out.print("Berapa yang dibeli? : ");
                total_barang = input.nextInt();
                System.out.println("----------------------------------------------------");
                System.out.println("Invoice Transaksi CV. Cloth Indo");
                System.out.println("====================================================");
                System.out.println("Kode Barang         : " + kd);
                System.out.println("Barang Yang dibeli  : " + nm);
                System.out.println("Harga Barang        : Rp. " + hrg + ".00-,");
                System.out.println("Total Beli          : " + total_barang +" Buah");
                total_harga = hrg * total_barang;
                System.out.println("Total Harga         : Rp. " + total_harga + ".00-,");

                if (total_harga >= 500000) {
                    System.out.println("=================SELAMAT-DISKON-20%=================");
                    int harga_potongan = ((total_harga*20)/100);
                    System.out.println("Diskon 20%          : Rp. " + harga_potongan + ".00-,");
                    System.out.println("----------------------------------------------------");
                    total_bayar = total_harga - harga_potongan;
                    System.out.println("Total Bayar         : Rp. " + total_bayar + ".00-,");
                    System.out.println("====================================================");
                    System.out.println("Terima Kasih sudah Berbelanja, Sampai Jumpa Lagi! :-D");
                } else if (total_harga <= 500000) {
                    total_bayar = total_harga;
                    System.out.println("====================================================");
                    System.out.println("Total Bayar         : Rp. " + total_bayar + ".00-,");
                    System.out.println("====================================================");
                    System.out.println("Terima Kasih sudah Berbelanja, Sampai Jumpa Lagi! :-D");
                }
                break;
            case "T":
                System.out.println("Pilihan Anda Tidak Melanjutkan Transaksi, \nTerima kasih sudah menggunakan Aplikasi ini.");
                break;
            default:
                System.out.println("Pilihan Anda Tidak teridentifikasi, Apps is Closed!");
                break;
        }
    }

    public void unidentifiedBarang(String kd_tempt) {
        System.out.println("Kode barang '" + kd_tempt + "' tidak teridentifikasi!");
    }

}
