package pertemuan3;

class Bola {
    private double jariJari;

    // Konstruktor
    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    // Method untuk menghitung volume bola
    public double hitungVolume() {
        return (4.0 / 3.0) * Math.PI * jariJari * jariJari * jariJari;
    }

    // Method untuk menghitung luas permukaan bola
    public double hitungLuasPermukaan() {
        return 4 * Math.PI * jariJari * jariJari;
    }
}
