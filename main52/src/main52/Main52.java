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
public class Main52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dosen D =new Dosen();
        D.setNama("Rizki");
        D.setUmur(20);
        D.setNip("23432sdfd");
        D.setMataKuliah("PBO");
        System.out.println("NIP Dosen : "+D.getNip());
        D.siapaKamu();
        D.mengajarApa();
        System.out.println("");
        
        Mahasiswa M =new Mahasiswa();
        M.setNama("rizki");
        M.setUmur(19);
        M.setNim(1322143214);
        M.setKelas("PBO2");
        System.out.println("NIM Mahasiswa : "+M.getNim());
        M.siapaKamu();
        M.kelasApa();
        
    }
    
}
