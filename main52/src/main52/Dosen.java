/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main52;

/**
 *
 * @author LENOVO
 */
public class Dosen extends Manusia {
    private String nip,MataKuliah;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMataKuliah() {
        return MataKuliah;
    }

    public void setMataKuliah(String MataKuliah) {
        this.MataKuliah = MataKuliah;
    }
    
    public void mengajarApa(){
        System.out.println("Saya "+nama+" Umur "+umur+" Tahun Sedang Mengajar Matakuliah "+MataKuliah);
    }

    @Override
    public void siapaKamu() {
        System.out.println("Saya Dosen");
    }
    
    
    
}
