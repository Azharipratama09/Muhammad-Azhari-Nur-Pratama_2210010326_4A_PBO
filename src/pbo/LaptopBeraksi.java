/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

import java.util.Scanner;

/**
 *
 * @author Zhar
 */
public class LaptopBeraksi {
    public static void main(String[] args) {
        // IO sederhana
        try {
            Scanner scanner = new Scanner(System.in);
            
            // array
            LaptopDetail[] laptops = new LaptopDetail[2];
            
            for (int i = 0; i < laptops.length; i++) {
                System.out.print("Masukkan merk laptop " + (i + 1) + ": ");
                String merk = scanner.nextLine();
                System.out.print("Masukkan model laptop " + (i + 1) + ": ");
                String model = scanner.nextLine();
                
                // objek
                laptops[i] = new LaptopDetail(merk, model);
            }
            
            for (LaptopDetail laptop : laptops) {
                System.out.println("============");
                System.out.println("Data Laptop: ");
                System.out.println(laptop.displayInfo());
            }
        } catch (NumberFormatException e) {
            System.out.println("Kesalahan format nomor: " + e.getMessage());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Kesalahan format model: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Kesalahan umum: " + e.getMessage());
        }  
    }
}

