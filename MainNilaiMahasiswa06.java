public class MainNilaiMahasiswa06 {
    public static void main(String[] args) {
        NilaiMahasiswa06 nm = new NilaiMahasiswa06();

        int maxIndex = nm.maxUTS(0, nm.jumlah-1);
        int minIndex = nm.minUTS(0, nm.jumlah-1);

        System.out.println("UTS Tertinggi");
        System.out.println("Nama : " + nm.nama[maxIndex]);
        System.out.println("NIM  : " + nm.nim[maxIndex]);
        System.out.println("Nilai UTS : " + nm.uts[maxIndex]);

        System.out.println();

        System.out.println("UTS Terendah");
        System.out.println("Nama : " + nm.nama[minIndex]);
        System.out.println("NIM  : " + nm.nim[minIndex]);
        System.out.println("Nilai UTS : " + nm.uts[minIndex]);

        System.out.println();
        System.out.println("Rata-rata Nilai UAS : " + nm.rataUAS());
    }
}