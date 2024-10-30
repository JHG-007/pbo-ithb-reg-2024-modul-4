package Model;

import java.util.List;

public class DosenTetap extends Dosen {
    private double gaji;

    public DosenTetap(String nama, String alamat, String ttl, String telepon, String nIK, String departemen,
            int jamMenagajar, List<MataKuliah> mkDiajar, double gaji) {
        super(nama, alamat, ttl, telepon, nIK, departemen, jamMenagajar, mkDiajar);
        this.gaji = gaji;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double gajiDosenTetap(){
        return gaji + (getJamMenagajar()*25000);
    }

    @Override
    public String toString() {
        return super.toString() + " , Gaji : " + gaji;
    }

}
