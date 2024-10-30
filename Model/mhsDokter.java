package Model;

public class mhsDokter extends Mahasiswa {
    private String judulDisertasi;
    private double nilaiSidang1;
    private double nilaiSidang2;
    private double nilaiSidang3;

    public mhsDokter(String nama, String alamat, String ttl, String telepon, String NIM, String jurusan,
            String judulDisertasi, double nilaiSidang1, double nilaiSidang2, double nilaiSidang3) {
        super(nama, alamat, ttl, telepon, NIM, jurusan);
        this.judulDisertasi = judulDisertasi;
        this.nilaiSidang1 = nilaiSidang1;
        this.nilaiSidang2 = nilaiSidang2;
        this.nilaiSidang3 = nilaiSidang3;
    }

    public String getJudulDiseertasi() {
        return judulDisertasi;
    }

    public double getNilaiSidang1() {
        return nilaiSidang1;
    }

    public double getNilaiSidang2() {
        return nilaiSidang2;
    }

    public double getNilaiSidang3() {
        return nilaiSidang3;
    }

    public double avgNilai() {
        return (nilaiSidang1 + nilaiSidang2 + nilaiSidang3) / 3;
    }

    @Override
    public String toString() {
        return "Judul disertasi : " + judulDisertasi + ", Nilai sidang 1 : " + nilaiSidang1 + ", Nilai sidang 2 : "
                + nilaiSidang2 + ", Nilai sidang 3 : " + nilaiSidang3;
    }

}
