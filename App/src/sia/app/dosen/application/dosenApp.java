package sia.app.dosen.application;

import sia.app.dosen.data.dosen;

public class dosenApp {
    public static void main(String[] args) {
        dosen dosen_ = new dosen();
        dosen_.nama = "Budi";
        dosen_.gender = "Laki-laki"; 
        dosen_.setUmur(30);
        
        System.out.println(dosen_.nama);
        System.out.println(dosen_.gender);
        System.out.println(dosen_.getUmur());
    }
}
