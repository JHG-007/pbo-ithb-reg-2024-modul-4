package Model;

import java.util.List;

public class mhsSarjana extends Mahasiswa {
    private List<MataKuliah> mkDiambil;
    private double n1, n2, n3;

    public mhsSarjana(String nama, String alamat, String ttl, String telepon, String NIM, String jurusan,
            List<MataKuliah> mkDiambil, double n1, double n2, double n3) {
        super(nama, alamat, ttl, telepon, NIM, jurusan);
        this.mkDiambil = mkDiambil;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public List<MataKuliah> getmkDiambil() {
        return mkDiambil;
    }

    public List<MataKuliah> getMkDiambil() {
        return mkDiambil;
    }

    public void setMkDiambil(List<MataKuliah> mkDiambil) {
        this.mkDiambil = mkDiambil;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }

    public double avgNilai() {
        return (n1 + n2 + n3) / 3;
    }

    @Override
    public String toString() {
        return super.toString() + ", Mata kuliah yang diambil: " + mkDiambil.toString();
    }
}
