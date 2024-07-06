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
public class Laptop {
    // atribut enkapsulasi
    private String merk;
    private String model;
    
    // constructor
    public Laptop(String merk, String model) {
        this.merk = merk;
        this.model = model;
    }

    // mutator (setter)
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    // accessor (getter)
    public String getMerk() {
        return merk;
    }

    public String getModel() {
        return model;
    }
    
    // metode untuk menampilkan informasi
    public String displayInfo() {
        return "Merk: " + getMerk() +
               "\nModel: " + getModel();
    }
    
    // polymorphism overloading
    public String displayInfo(String spesifikasi) {
        return displayInfo() + "\nSpesifikasi: " + spesifikasi;
    }
}

