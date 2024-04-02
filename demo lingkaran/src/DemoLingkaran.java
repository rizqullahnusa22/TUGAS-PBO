class Lingkaran {
    final double phi = 3.14;
    double radius;

    public Lingkaran(double radius) {
        this.radius = radius;
    }

    public double hitungLuas() {
        return radius * radius * phi;
    }
}

class Silinder extends Lingkaran {
    double tinggi;

    public Silinder(double radius, double tinggi) {
        super(radius);
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return hitungLuas() * tinggi;
    }
}

public class DemoLingkaran {
    public static void main(String[] args) {
        Silinder obj = new Silinder(20, 15);
        System.out.println("Volume silinder: " + obj.hitungVolume());
    }
}
