package sia.app.mahasiswa.application;

import sia.app.mahasiswa.data.mahasiswa;

public class mahasiswaApp {
    
    public static void main(String[] args) {
        mahasiswa mhs = new mahasiswa("41820110039","Farhan","Laki-laki" , "087888831981");

        System.out.println(mhs.nim);
        System.out.println(mhs.nama);
        System.out.println(mhs.phoneNumber);
    }
}
