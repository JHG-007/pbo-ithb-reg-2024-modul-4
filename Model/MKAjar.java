package Model;

import java.util.List;

public class MKAjar {
    private MataKuliah MK;
    private List<PresensiStaff> listPresensiStaff;

    public MKAjar(MataKuliah MK, List<PresensiStaff> listPresensiStaff) {
        this.MK = MK;
        this.listPresensiStaff = listPresensiStaff;
    }

    public MataKuliah getMK() {
        return MK;
    }

    public List<PresensiStaff> getListPresensiStaff() {
        return listPresensiStaff;
    }

    @Override
    public String toString() {
        return "Mata Kuliah yang diajar" + MK + ", listPresensi staff: " + listPresensiStaff;
    }

}
