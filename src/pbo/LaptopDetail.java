/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

/**
 *
 * @author Zhar
 */
public class LaptopDetail extends Laptop {
    // constructor
    public LaptopDetail(String merk, String model) {
        super(merk, model);
    }
    
    
    public String getSeri() {
        String kodeSeri = getModel().substring(0, 1);
        // seleksi if
        if (kodeSeri.equals("f")) {
            return "Seri baru";
        }if (kodeSeri.equals("x")) {
            return "Seri lama";
        } else {
            return "Seri Lain";
        }
    }
    
    public String getWarna() {
        String kodeWarna = getModel().substring(1,2 );
        // seleksi switch
        switch (kodeWarna) {
            case "1":
                return "Hitam";
            case "2":
                 return "Biru";
            default:
                return "Warna Lain";
        }
    }
     public String getJenis() {
        String kodeJenis = getModel().substring(2,3 );
        // seleksi switch
        switch (kodeJenis) {
            case "g":
                return "Gaminng";
            case "n":
                 return "Notebook";
            default:
                return "Jenis Lain";
        }
    }
    
    
    // polymorphism overriding
    @Override
    public String displayInfo() {
        return super.displayInfo() +
               "\nSeri: " + getSeri() +
               "\nWarna: " + getWarna()+ 
                "\nJenis " + getJenis() ;
    }
}
