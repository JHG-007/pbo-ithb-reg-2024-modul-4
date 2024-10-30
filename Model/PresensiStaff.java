package Model;

import java.util.Date;

import Enum.StatusPresensi;

public class PresensiStaff extends Presensi {
    private String jam;

    public PresensiStaff(StatusPresensi statusPresensi, Date tanggal, int status, String jam) {
        super(statusPresensi, tanggal, status);
        this.jam = jam;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public boolean isHadir(){
        return getStatusPresensi().isHadir();
    }
    @Override
    public String toString() {
        return super.toString() + ", Jam : " + jam;
    }
}