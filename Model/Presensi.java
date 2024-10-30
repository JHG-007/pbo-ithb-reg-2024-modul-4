package Model;

import java.util.Date;
import Enum.StatusPresensi;

public class Presensi {
    private StatusPresensi statusPresensi;
    private Date tanggal;
    private int status;

    public Presensi(StatusPresensi statusPresensi, Date tanggal, int status) {
        this.statusPresensi = statusPresensi;
        this.tanggal = tanggal;
        this.status = status;
    }

    public StatusPresensi getStatusPresensi() {
        return statusPresensi;
    }

    public void setStatusPresensi(StatusPresensi statusPresensi) {
        this.statusPresensi = statusPresensi;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Presensi tanggal" + tanggal + ",  " + status;
    }
}
