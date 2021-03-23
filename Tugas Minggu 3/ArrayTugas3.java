/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraytugas3;

/**
 *
 * @author Asus
 */
public class ArrayTugas3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] angka = {
            {5, 6, 1, 7},
            {8, 1, 2, 9},
            {5, 4, 7, 1},
            {8, 3, 7, 5}
        };
        
        for (int[] angka1 : angka) {
            System.out.print("[ ");
            for (int i = 0; i < 4; i++){
                System.out.print(angka1[i] + " ");
            }
            System.out.println("]");
        }
    }
   
}
