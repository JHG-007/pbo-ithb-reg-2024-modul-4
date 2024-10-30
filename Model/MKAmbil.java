package Model;

import java.util.List;

public class MKAmbil {
    private MataKuliah MK;
    private List<Presensi> listPresensi;
    private double n1;
    private double n2;
    private double n3;

    public MKAmbil(MataKuliah MK, List<Presensi> listPresensi, double n1, double n2, double n3) {
        this.MK = MK;
        this.listPresensi = listPresensi;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public MataKuliah getMK() {
        return MK;
    }

    public List<Presensi> getListPresensi() {
        return listPresensi;
    }

    public double getN1() {
        return n1;
    }

    public double getN2() {
        return n2;
    }

    public double getN3() {
        return n3;
    }

    @Override
    public String toString() {
        return "Mata Kuliah yang diambil" + MK + ", list presensi: " + listPresensi + ", n1=" + n1 + ", n2=" + n2
                + ", n3=" + n3;
    }

}
