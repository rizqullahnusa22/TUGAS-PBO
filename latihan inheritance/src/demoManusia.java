class Manusia {
    private int umur;
    public String nama;

    public Manusia(int umur, String nama) {
        this.umur = umur;
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void cetak() {
        System.out.println("nama: " + nama + ", umur: " + umur);
    }
}

class Mahasiswa extends Manusia {
    public int nim;

    public Mahasiswa(int nim, int umur, String nama) {
        super(umur, nama);
        this.nim = nim;
    }

    public void cetak() {
        System.out.println("nim: " + nim + ", nama: " + nama + ", umur: " + getUmur());
    }
}

public class demoManusia {
    public static void main(String[] args) {
        Mahasiswa objMahasiswa = new Mahasiswa(123456, 20, "Bagas");
        objMahasiswa.cetak();
    }
}