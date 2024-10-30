package Model;

public abstract class Staff extends User {
    private String NIK;

    public Staff(String nama, String alamat, String ttl, String telepon, String nIK) {
        super(nama, alamat, ttl, telepon);
        this.NIK = nIK;
    }

    public String getNIK() {
        return NIK;
    }

    @Override
    public String toString() {
        return super.toString() + ", NIK : " + NIK;
    }

}
