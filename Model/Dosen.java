package Model;

import java.util.List;

public abstract class Dosen extends Staff {
    private String departemen;
    private int jamMenagajar;
    private List<MataKuliah> mkDiajar;

    public Dosen(String nama, String alamat, String ttl, String telepon, String nIK, String departemen,
            int jamMenagajar, List<MataKuliah> mkDiajar) {
        super(nama, alamat, ttl, telepon, nIK);
        this.departemen = departemen;
        this.jamMenagajar = jamMenagajar;
        this.mkDiajar = mkDiajar;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public int getJamMenagajar() {
        return jamMenagajar;
    }

    public void setJamMenagajar(int jamMenagajar) {
        this.jamMenagajar = jamMenagajar;
    }

    public List<MataKuliah> getMkDiajar() {
        return mkDiajar;
    }

    public void setMkDiajar(List<MataKuliah> mkDiajar) {
        this.mkDiajar = mkDiajar;
    }

    @Override
    public String toString() {
        return super.toString() + ", Departemen: " + departemen + ", Mata Kuliah Diajar: " + mkDiajar.toString();
    }
}
