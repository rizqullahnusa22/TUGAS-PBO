class Grosir extends Swalayan {
    private int jumlah;


    public Grosir(String pembeli, int jumlah) {
        super(pembeli);
        this.jumlah = jumlah;
    }

    private int hitungTotalHarga() {
        int hargaSatuan = getHarga();
        return hargaSatuan * jumlah;
    }

    public void cetak() {
        System.out.println("Pembeli atas nama dafa " + pembeli + " membeli " + jumlah + " barang.");
        System.out.println("Total harga pembelian pelanggan atas nama dafa : " + hitungTotalHarga() + " rupiah.");
    }
}
