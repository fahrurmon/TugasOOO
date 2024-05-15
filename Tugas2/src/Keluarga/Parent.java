public abstract class Parent {
    private String nama;
    private String jenisKelamin;
    private int umur;
    private double tinggiBadan;

    public Parent(String nama, String jenisKelamin, int umur, double tinggiBadan) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.umur = umur;
        this.tinggiBadan = tinggiBadan;
    }

    // Method abstract dengan nama printInfo
    public abstract void printInfo();

    public String getNama() {
        return nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public int getUmur() {
        return umur;
    }

    public double getTinggiBadan() {
        return tinggiBadan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setTinggiBadan(double tinggiBadan) {
        this.tinggiBadan = tinggiBadan;
    }
}