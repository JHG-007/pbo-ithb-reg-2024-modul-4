package Controller;

import Model.*;
import Enum.StatusPresensi;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SIA_Controller {

    private List<Karyawan> karyawanList;
    private List<Mahasiswa> mahasiswaList;
    private List<Dosen> dosenList;

    public SIA_Controller() {
        karyawanList = new ArrayList<>();
        mahasiswaList = new ArrayList<>();
        dosenList = new ArrayList<>();
        initializeData();
    }

    private void initializeData() {
        // Contoh data karyawan
        List<PresensiStaff> presensiKaryawan1 = new ArrayList<>();
        presensiKaryawan1.add(new PresensiStaff(StatusPresensi.HADIR, new Date(), 1, "08:00"));
        presensiKaryawan1.add(new PresensiStaff(StatusPresensi.ALPHA, new Date(), 0, "09:00"));

        Karyawan karyawan1 = new Karyawan("John", "Jl. Jalan", "11-11-2024", "123456789", "0001", 3000000,
                presensiKaryawan1);
        Karyawan karyawan2 = new Karyawan("Jane", "Jl. Kesana", "11-01-2024", "987654321", "0003", 2500000,
                presensiKaryawan1);
        karyawanList.add(karyawan1);
        karyawanList.add(karyawan2);

        // Contoh data mahasiswa
        List<MataKuliah> mkSarjana = new ArrayList<>();
        mkSarjana.add(new MataKuliah("MK001", 3, "Matematika", 90));
        mkSarjana.add(new MataKuliah("MK002", 3, "Fisika", 80));

        mhsSarjana sarjana = new mhsSarjana("Anbi", "Jakarta", "01-01-2000", "08123456789", "1123001", "Informatika",
                mkSarjana, 85, 90, 88);

        List<MataKuliah> mkMagister = new ArrayList<>();
        mkMagister.add(new MataKuliah("MK003", 3, "Data Science", 95));
        mkMagister.add(new MataKuliah("MK004", 3, "Machine Learning", 85));

        mhsMagister magister = new mhsMagister("Mary", "Bandung", "02-02-1999", "08987654321", "1118021",
                "Teknik Komputer", mkMagister, "Analisis Big Data", 88, 90, 92);

        mhsDokter doktor = new mhsDokter("Grace", "Bandung", "03-03-1998", "08234567890", "2420012", "Ilmu Komputer",
                "Sistem Cerdas", 90, 85, 92);

        mahasiswaList.add(sarjana);
        mahasiswaList.add(magister);
        mahasiswaList.add(doktor);

        // Contoh data dosen
        List<MataKuliah> mkDosen1 = new ArrayList<>();
        mkDosen1.add(new MataKuliah("MK001", 3, "Matematika", 90));
        mkDosen1.add(new MataKuliah("MK002", 3, "Fisika", 80));
        DosenTetap dosenTetap = new DosenTetap("George", "TKI II", "Bandung", "0845326127", "002", "Informatika", 21,
                mkDosen1, 18);

        List<MataKuliah> mkDosen2 = new ArrayList<>();
        mkDosen2.add(new MataKuliah("MK003", 3, "Kimia", 95));
        DosenHonorer dosenHonorer = new DosenHonorer("Tyler", "Perumahan Mutiara", "Jakarta", "0856823712", "0002",
                "Informatika", 12, mkDosen2, 10);

        dosenList.add(dosenTetap);
        dosenList.add(dosenHonorer);
    }

    public void printUserData(String nama) {
        for (Karyawan karyawan : karyawanList) {
            if (karyawan.getNama().equalsIgnoreCase(nama)) {
                JOptionPane.showMessageDialog(null, karyawan.toString());
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "User tidak ditemukan.");
    }

    public void printGajiKaryawan(String nik) {
        for (Karyawan karyawan : karyawanList) {
            if (karyawan.getNIK().equalsIgnoreCase(nik)) {
                double gaji = karyawan.gajiKaryawan();
                JOptionPane.showMessageDialog(null, "Gaji untuk Karyawan " + karyawan.getNama() + ": " + gaji);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Karyawan tidak ditemukan.");
    }

    public void printAvgNilaiMahasiswa(String nim) {
        for (Mahasiswa mahasiswa : mahasiswaList) {
            if (mahasiswa.getNIM().equalsIgnoreCase(nim)) {
                double avg = 0;
                if (mahasiswa instanceof mhsSarjana) {
                    avg = ((mhsSarjana) mahasiswa).avgNilai();
                } else if (mahasiswa instanceof mhsMagister) {
                    avg = ((mhsMagister) mahasiswa).avgNilai();
                } else if (mahasiswa instanceof mhsDokter) {
                    avg = ((mhsDokter) mahasiswa).avgNilai();
                }
                JOptionPane.showMessageDialog(null, "Nilai rata-rata untuk Mahasiswa " + mahasiswa.getNama() + ": " + avg);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Mahasiswa tidak ditemukan.");
    }

    public void printGajiDosen(String nik) {
        for (Dosen dosen : dosenList) {
            if (dosen.getNIK().equalsIgnoreCase(nik)) {
                double gaji;
                if (dosen instanceof DosenTetap) {
                    gaji = ((DosenTetap) dosen).gajiDosenTetap();
                } else {
                    gaji = ((DosenHonorer) dosen).gajiHonorer();
                }
                JOptionPane.showMessageDialog(null, "Gaji untuk Dosen " + dosen.getNama() + ": " + gaji);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Dosen tidak ditemukan.");
    }

    public void displayMenu() {
        String[] options = {
                "Data Karyawan",
                "Gaji Karyawan",
                "Gaji Dosen",
                "Nilai Mahasiswa",
                "Exit"
        };

        while (true) {
            int choice = JOptionPane.showOptionDialog(null, "Pilih opsi:", "Menu SIA",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (choice) {
                case 0:
                    String namaKaryawan = JOptionPane.showInputDialog("Masukkan nama karyawan:");
                    printUserData(namaKaryawan);
                    break;
                case 1:
                    String nikKaryawan = JOptionPane.showInputDialog("Masukkan NIK karyawan:");
                    printGajiKaryawan(nikKaryawan);
                    break;
                case 2:
                    String nikDosen = JOptionPane.showInputDialog("Masukkan NIK dosen:");
                    printGajiDosen(nikDosen);
                    break;
                case 3: // New case for checking student average
                    String nimMahasiswa = JOptionPane.showInputDialog("Masukkan NIM mahasiswa:");
                    printAvgNilaiMahasiswa(nimMahasiswa);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Keluar dari program.");
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Pilihan tidak valid.");
            }
        }
    }
}
