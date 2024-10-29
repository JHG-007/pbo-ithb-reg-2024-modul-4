package Model;

public class Dosen {
    private String NIK;
    private String nama;
    private String status;
    private int salary;
    private int honorPerSKS;
    private int totalJamMengajar;

    public Dosen(String NIK, String nama, String status, int salary) {
        this.NIK = NIK;
        this.nama = nama;
        this.status = status;
        this.salary = salary;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String nIK) {
        NIK = nIK;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getHonorPerSKS() {
        return honorPerSKS;
    }

    public void setHonorPerSKS(int honorPerSKS) {
        this.honorPerSKS = honorPerSKS;
    }

    public int getTotalJamMengajar() {
        return totalJamMengajar;
    }

    public void setTotalJamMengajar(int totalJamMengajar) {
        this.totalJamMengajar = totalJamMengajar;
    }
    
}
