/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraytugas4;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class ArrayTugas4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("                      GRAHA MULIA PLAZA (GMP)");
        System.out.println("                      Promo Belanja Berhadiah");
        System.out.println("                  Khusus Pembelian 5 Barang Pertama");
        System.out.println("                 Dengan Harga Minimum Rp. 10.000,00");
        System.out.println("-------------------------------------------------------------------");
        System.out.print("Masukkan nama pembeli : ");
        String nama = s.nextLine();
        int[] barang = new int[5];
        int total = 0;
        for (int i =0; i < barang.length; i++) {
            System.out.print("Masukkan harga barang ke-" + (i + 1) + " : ");
            barang[i] = s.nextInt();
            total = total + barang[i];
        }
        
        System.out.println("Total harga pembelian atas nama " + nama + "adalah Rp. " + total);
        
        // cek promo
        boolean promo = false;
        for (int i = 0; i < barang.length; i++) {
            promo = barang[i] >= 10000;
        }
        if (promo == true) {
            System.out.println("Selamat...");
            System.out.println("Anda mendapat hadiah 1 buah gelas");
        } else {
            System.out.println("anda tidak mendapat promo");
        }
        
        System.out.println("-------------------------------------------------------------------");
        System.out.println("                          Terima Kasih");
        System.out.println("          Anda sudah berbelanja di Graha Mulia Plaza");
    }
}
