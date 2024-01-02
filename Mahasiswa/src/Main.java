class Mahasiswa {

    private String nama;
    private int umur;

    public Mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getUmur() {
        return umur;
    }

    public void displayInfo() {
        System.out.println("Nama saya " + getNama() + " umur saya " + getUmur());
    }

}

class MahasiswaLama extends Mahasiswa {

    private int angkatan;

    public MahasiswaLama(String nama, int umur, int angkatan) {
        super(nama, umur);
        this.angkatan = angkatan;
    }

    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }

    public int getAngkatan() {
        return angkatan;
    }

    @Override
    public void displayInfo() {
        System.out.println("Nama saya " + getNama() + " umur saya " + getUmur() + " angkatan saya " + getAngkatan());
    }

}

class MahasiswaBaru extends Mahasiswa {

    private int nim;

    public MahasiswaBaru(String nama, int umur, int nim) {
        super(nama, umur);
        this.nim = nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public int getNim() {
        return nim;
    }

    @Override
    public void displayInfo() {
        System.out.println("Nama saya " + getNama() + " umur saya " + getUmur() + " nim saya " + getNim());
    }

}

public class Main {

    public static void main(String[] args) {

        Mahasiswa Obj1 = new Mahasiswa("Galih Anggoro Prasetya", 20);
        MahasiswaLama Obj2 = new MahasiswaLama("Prasetya Wijoyo", 25, 2014);
        MahasiswaBaru Obj3 = new MahasiswaBaru("Anggoro Putra", 19, 22205018);

        System.out.println("===== Objek Mahasiswa =====");
        Obj1.displayInfo();
        System.out.println();

        System.out.println("===== Objek Mahasiswa Lama =====");
        Obj2.displayInfo();
        System.out.println();

        System.out.println("===== Objek Mahasiswa Baru =====");
        Obj3.displayInfo();
        System.out.println();
    }

}
