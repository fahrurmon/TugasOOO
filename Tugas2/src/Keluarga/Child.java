class Child extends Parent {
    Child(String nama, String jenisKelamin, int umur, double tinggiBadan) {
        // Memanggil konstruktor kelas Parent
        super(nama, jenisKelamin, umur, tinggiBadan);
    }

    // Implementasi method abstract dari kelas Parent
    @Override
    public void printInfo() {
        System.out.println("Nama: " + getNama());
        System.out.println("Jenis Kelamin: " + getJenisKelamin());
        System.out.println("Umur: " + getUmur());
        System.out.println("Tinggi Badan: " + getTinggiBadan());
    }

    public void cekStatusAnak() {
        if (getUmur() < 18) {
            System.out.println("Anak masih dibawah umur!");
        } else {
            System.out.println("Anak sudah dewasa!");
        }
    }
}