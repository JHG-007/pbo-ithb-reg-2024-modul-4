package Model;

public class Mahasiswa {
    private String NIM;
    private String nama;
    private String status;
    private String kodeMK;
    private int n1, n2, n3;
    private int totalPresensi;

    public Mahasiswa(String NIM, String nama, String status) {
        this.NIM = NIM;
        this.nama = nama;
        this.status = status;
    }

    public double hitungNilaiAkhir() {
        return (n1 + n2 + n3) / 3.0;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String nIM) {
        NIM = nIM;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public int getTotalPresensi() {
        return totalPresensi;
    }

    public void setTotalPresensi(int totalPresensi) {
        this.totalPresensi = totalPresensi;
    }
}
