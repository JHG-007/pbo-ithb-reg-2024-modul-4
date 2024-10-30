package Model;

import java.util.List;

public class DosenHonorer extends Dosen {
    private double honorPerSKS;

    public DosenHonorer(String nama, String alamat, String ttl, String telepon, String nIK, String departemen,
            int jamMenagajar, List<MataKuliah> mkDiajar, double honorPerSKS) {
        super(nama, alamat, ttl, telepon, nIK, departemen, jamMenagajar, mkDiajar);
        this.honorPerSKS = honorPerSKS;
    }

    public double getHonorPerSKS() {
        return honorPerSKS;
    }

    public void setHonorPerSKS(double honorPerSKS) {
        this.honorPerSKS = honorPerSKS;
    }

    public double gajiHonorer(){
        return getJamMenagajar() *  honorPerSKS;
    }

    @Override
    public String toString() {
        return super.toString() + " , Honor per SKS : " + honorPerSKS;
    }
}
