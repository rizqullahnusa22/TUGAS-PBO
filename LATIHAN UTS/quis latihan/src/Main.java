// Class Kendaraan
class Kendaraan {
    private int kecepatan;

    // Constructor
    public Kendaraan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    // Method private untuk mendapatkan kecepatan
    public int getKecepatan() {
        return kecepatan;
    }
}

// Class Mobil yang merupakan subclass dari Kendaraan
class Mobil extends Kendaraan {
    private String merkMobil;

    // Constructor
    public Mobil(int kecepatan, String merkMobil) {
        super(kecepatan);
        this.merkMobil = merkMobil;
    }

    // Method untuk mengecek kecepatan mobil dan memberikan tilang jika melebihi 100
    private void cekKecepatan() {
        int kecepatan = super.getKecepatan();
        if (kecepatan > 100) {
            System.out.println("Mobil " + merkMobil + " kena tilang karena kecepatan melebihi 100 km/jam.");
        } else {
            System.out.println("Mobil " + merkMobil + " tidak kena tilang.");
        }
    }

    // Method untuk mencetak informasi mobil dan apakah kena tilang atau tidak
    public void cetak() {
        System.out.print("Mobil dengan merk " + merkMobil + ": ");
        cekKecepatan();
    }
}

// Class utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek mobil
        Mobil mobil1 = new Mobil(120, "Toyota");
        Mobil mobil2 = new Mobil(90, "Honda");

        // Memanggil method cetak untuk mencetak informasi mobil
        mobil1.cetak();
        mobil2.cetak();
    }
}
