/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasdowhile;

/**
 *
 * @author Asus
 */
public class TugasDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("          Do__While");
        System.out.println("Bilangan Kelipatan 2 (1-100)");
        System.out.println("=================================");
    int i = 1;
        do {
            System.out.print(i + " ");
            i = i * 2 ;
        } while (i < 100 );
    }
    
}
