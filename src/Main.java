public class Main {
    public static void main(String[] args) {
        Mahasiswa aku= new Mahasiswa();
        Mahasiswa kamu= new Mahasiswa();

        aku.nama="Silvia Indriani";
        aku.nim="18630577 ";
        aku.ipk=3.67;
        kamu.nama="Susiani Dwi Damayanti";
        kamu.nim="20634566";
        kamu.ipk=3.80;
        aku.registrasi();
        kamu.registrasi();
    }
}
