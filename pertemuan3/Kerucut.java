package pertemuan3;
class Kerucut {
    private double jariJari;
    private double sisiMiring;

    // Konstruktor
    public Kerucut(double jariJari, double sisiMiring) {
        this.jariJari = jariJari;
        this.sisiMiring = sisiMiring;
    }

    // Method untuk menghitung volume kerucut
    public double hitungVolume() {
        return Math.PI * jariJari * jariJari * sisiMiring / 3;
    }

    // Method untuk menghitung luas permukaan kerucut
    public double hitungLuasPermukaan() {
        return Math.PI * jariJari * (jariJari + sisiMiring);
    }
}