package fightercode.id.function;

public class Kependudukan {

    public void dataKependudukan(String nama_lokasi, int total_penduduk, int total_krt, int luas_wilayah, int kemiskinan_angka){

        // Proses Pengambilan Nilai Persen
        float persen_krt = ((total_krt*100)/total_penduduk);
        float persen_kemiskinan = ((kemiskinan_angka*100)/total_penduduk);

        System.out.println("----------------------------------------------------");
        System.out.println("Data Kependudukan");
        System.out.println("====================================================");
        System.out.println("Nama Wilayah Bagian : " + nama_lokasi);
        System.out.println("Total Penduduk : " + total_penduduk + " Jiwa");
        System.out.println("Total Kepala Rumah Tanggal (%): " + persen_krt + "%");
        System.out.println("Luas Wilayah Misal: " + luas_wilayah + " KM3");
        System.out.println("Angka Kemiskinan (%): " + persen_kemiskinan + "%");
        System.out.println("====================================================");
    }
}
