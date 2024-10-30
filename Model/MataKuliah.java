package Model;

public class MataKuliah {
    private String kodeMK;
    private int SKS;
    private String Nama;
    private int totalPresensi;

    public MataKuliah(String kodeMK, int sKS, String nama, int totalPresensi) {
        this.kodeMK = kodeMK;
        this.SKS = sKS;
        this.Nama = nama;
        this.totalPresensi = totalPresensi;
    }

    public String getKodeMK() {
        return kodeMK;
    }

    public void setKodeMK(String kodeMK) {
        this.kodeMK = kodeMK;
    }

    public int getSKS() {
        return SKS;
    }

    public void setSKS(int sKS) {
        SKS = sKS;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public int getTotalPresensi() {
        return totalPresensi;
    }

    public void setTotalPresensi(int totalPresensi) {
        this.totalPresensi = totalPresensi;
    }

    @Override
    public String toString() {
        return "MataKuliah [kodeMK=" + kodeMK + ", SKS=" + SKS + ", Nama=" + Nama + "]";
    }
}
