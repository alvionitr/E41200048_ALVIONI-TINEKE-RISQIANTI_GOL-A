/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanarray2a;

/**
 *
 * @author Asus
 */
public class LatihanArray2a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] angka = {5, 10, 17, 20, 1};
        String[] text = {"Saya", "Sedang", "Belajar", "OOP", "Java"};
        
        for (int i=0; i<angka.length; i++){
            System.out.println(angka[i]);
        }
        
        for (int j=0; j<text.length; j++){
            System.out.print(text[j]);
            System.out.print(" ");
        }
    }
    
}
