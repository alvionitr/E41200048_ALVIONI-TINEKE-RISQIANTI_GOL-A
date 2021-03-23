/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihancondition2b;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class LatihanCondition2b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat variabel dan scanner
        String lampu;
        Scanner scan = new Scanner(System.in);
        
        // Mengambil Input
        System.out.print("Inputkan nama warna : ");
        lampu = scan.nextLine();
        
        switch (lampu) {
            case "merah" :
                System.out.println("Lampu merah, berhenti");
                break;
            case "kuning" :
                System.out.println("Lampu kuning, harap hati hati");
                break;
            case "hijau" :
                System.out.println("Lampu hijau, silahkan berjalan");
                break;
            default:
                System.out.println("Warna lampu salah");
        }
    }
    
}
