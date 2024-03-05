package pertemuan3;

class LimasSegiEmpat {
    private double sisiAlas;
    private double tinggi;

    // Konstruktor
    public LimasSegiEmpat(double sisiAlas, double tinggi) {
        this.sisiAlas = sisiAlas;
        this.tinggi = tinggi;
    }

    // Method untuk menghitung volume limas segi empat sama sisi
    public double hitungVolume() {
        return (sisiAlas * sisiAlas * tinggi) / 3;
    }

    // Method untuk menghitung luas permukaan limas segi empat sama sisi
    public double hitungLuasPermukaan() {
        return sisiAlas * sisiAlas + 4 * (sisiAlas * tinggi / 2);
    }
}