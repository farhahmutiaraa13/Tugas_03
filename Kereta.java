public class Kereta {
    private String namaKereta;
    private Ticket[] tiket;
    private int batasTiket;

    // Default Constructor untuk Kereta Komuter
    public Kereta() {
        this.namaKereta = "Komuter";
        this.batasTiket = 1000;
        this.tiket = new Ticket[batasTiket];
    }

    // Default Constructor untuk KAJJ (Kereta Api Jarak Jauh)
    public Kereta(String namaKereta, int jumlahTiket) {
        this.namaKereta = namaKereta;
        this.batasTiket = jumlahTiket;
        this.tiket = new Ticket[batasTiket];
    }

    // Overload method untuk menambahkan tiket untuk kereta komuter
    public void tambahTiket(String namaPenumpang) {
        // jika tiket lebih dari nol pesan tiket berhasil
        if (batasTiket > 0) {
            int index = tiket.length - batasTiket;
            tiket[index] = new Ticket();
            tiket[index].setNamaPenumpang(new String[] { namaPenumpang });
            batasTiket--;

            System.out.println("=================================================");
            System.out.println("Tiket berhasil dipesan");

            if (batasTiket < 30) {
                System.out.println(" Sisa tiket tersedia: " + batasTiket);
            }
        } else {
            System.out.println("=================================================");
            System.out.println("Maaf, tiket sudah habis terjual.");
        }
    }

    // Overload method untuk menambah tiket KAJJ
    public void tambahTiket(String namaPenumpang, String asal, String tujuan) {
        // Print jika jumlah tiket masih tersedia
        if (batasTiket > 0) {
            int index = tiket.length - batasTiket;
            tiket[index] = new Ticket();
            tiket[index].setNamaPenumpang(new String[] { namaPenumpang });
            tiket[index].setAsal(new String[] { asal });
            tiket[index].setTujuan(new String[] { tujuan });
            batasTiket--;

            System.out.println("=================================================");
            System.out.print("Tiket berhasil dipesan");

            // Print sisa jika kumlah tiket kurang dari 30
            if (batasTiket < 30) {
                System.out.println(" Sisa tiket tersedia: " + batasTiket);
            }
        } else {
            // Print jika tiket habis
            System.out.println("=================================================");
            System.out.println("Kereta telah habis dipesan, silahkan cari jadwal keberangkatan lainnya");
        }
    }

    // Method untuk menampilkan tiket
    public void tampilkanTiket() {
        System.out.println("=================================================");
        System.out.println("Daftar penumpang kereta api " + namaKereta);
        System.out.println("----------------------------------");
        for (int i = 0; i < tiket.length; i++) {
            if (tiket[i] != null) {
                if (namaKereta.equals("Komuter")) {
                    System.out.println("Nama: " + tiket[i].getNamaPenumpang()[0]);
                } else {
                    System.out.println("Nama: " + tiket[i].getNamaPenumpang()[0]);
                    System.out.println("Asal: " + tiket[i].getAsal()[0]);
                    System.out.println("Tujuan: " + tiket[i].getTujuan()[0]);
                    System.out.println("----------------------------------");
                }
            }
        }
    }
}
