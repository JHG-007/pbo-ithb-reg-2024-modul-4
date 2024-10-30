package Model;

import java.util.List;

public class Karyawan extends Staff {
    private double gaji;
    private List<PresensiStaff> listPresensiStaff;

    public Karyawan(String nama, String alamat, String ttl, String telepon, String nIK, double gaji,
                    List<PresensiStaff> listPresensiStaff) {
        super(nama, alamat, ttl, telepon, nIK);
        this.gaji = gaji;
        this.listPresensiStaff = listPresensiStaff;
    }

    public double getGaji() {
        return gaji;
    }

    public List<PresensiStaff> getListPresensiStaff() {
        return listPresensiStaff;
    }

    public double gajiKaryawan() {
        int totalUnit = 0;

        for (PresensiStaff presensi : listPresensiStaff) {
            if (presensi.isHadir()) {
                totalUnit++;
            }
        }

        return (totalUnit / 22.0) * gaji;
    }

    @Override
    public String toString() {
        return super.toString() + ", Gaji: " + gaji + ", Presensi Staff: " + listPresensiStaff;
    }
}
