/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraytugas5;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class ArrayTugas5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("                 My Coffee Cafe");
        System.out.println("                 Aneka Minuman");
        System.out.println("--------------------------------------------------");
        System.out.println("                 Spesial Menu");
        System.out.println("1. Coffee Avocado");
        System.out.println("2. Choco Oreo");
        System.out.println("3. Vanila Late");
        System.out.println("4. Cappucino");
        System.out.println("5. Chocolate");
        System.out.println("--------------------------------------------------");
        System.out.print("Masukkan nama pembeli : ");
        String nama = s.nextLine();
        System.out.print("silahkan masukkan pilihan anda : ");
        
        int op = s.nextInt();
        String pilihan = "";
        
        switch (op) {
            case 1 :
                pilihan = "Coffe Avocado";
                break;
            case 2 :
                pilihan = "Choco Oreo";
                break;
            case 3 :
                pilihan = "Vanila Late";
                break;
            case 4 :
                pilihan = "Cappucino";
                break;
            case 5 :
                pilihan = "Chocolate";
                break;
            default :
                System.out.println("pilihan Anda tidak ada di menu");
                break;
        }
        System.out.println("Minuman yang anda pilih : " + pilihan);
        System.out.println("Pesanan anda akan segera diantar");
        System.out.println("Terima kasih " + nama + "Telah Berkunjung di My Coffee Cafe");
    }
}
