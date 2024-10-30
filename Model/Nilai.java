package Model;

public class Nilai {
    private String NIM;
    private String kodeMK;
    private int n1;
    private int n2;
    private int n3;

    public Nilai(String nIM, String kodeMK, int n1, int n2, int n3) {
        NIM = nIM;
        this.kodeMK = kodeMK;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String nIM) {
        NIM = nIM;
    }

    public String getKodeMK() {
        return kodeMK;
    }

    public void setKodeMK(String kodeMK) {
        this.kodeMK = kodeMK;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    public double hitungNilaiAkhir() {
        return (n1 + n2 + n3) / 3;
    }
}
