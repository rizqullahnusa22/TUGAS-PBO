
class Mobil extends Kendaraan {
    private String merkMobil;
    public Mobil(int kecepatan, String merkMobil) {
        super(kecepatan);
        this.merkMobil = merkMobil;
    }


    public String cekKecepatan() {
        int kecepatan = super.getKecepatan();
        if (kecepatan > 100) {
            return "kena tilang karena kecepatan melebihi 100 km/jam";
        } else {
            return "tidak kena tilang";
        }
    }

    public void cetak() {
        System.out.println("Mobil dengan merk " + merkMobil + ": " + cekKecepatan());
    }
}
