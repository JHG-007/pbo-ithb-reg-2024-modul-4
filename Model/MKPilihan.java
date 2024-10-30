package Model;

public class MKPilihan extends MataKuliah {
    private int minMHS;

    public MKPilihan(String kodeMK, int sKS, String nama, int totalPresensi, int minMHS) {
        super(kodeMK, sKS, nama, totalPresensi);
        this.minMHS = minMHS;
    }

    public int getMinMHS() {
        return minMHS;
    }

    @Override
    public String toString() {
        return super.toString() + ", Minimal Mahasiswa : " + minMHS;
    }

}
