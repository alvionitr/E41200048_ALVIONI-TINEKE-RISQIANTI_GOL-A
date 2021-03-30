/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasperulanganfor;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class TugasPerulanganFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Batas Nilai Awal : ");
        int NilaiAwal = in.nextInt();
        System.out.print("Masukkan Batas Nilai Akhir : ");
        int NilaiAkhir = in.nextInt();

    for (int i = NilaiAwal; i <= NilaiAkhir; i += 2) {
            System.out.print(i + " ");
    }  
}
