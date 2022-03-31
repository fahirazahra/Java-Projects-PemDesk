/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deretbilangan;

/**
 *
 * @author Fahira
 */
public class Ganjil {
    
    public void bilanganGanjil(int jumlahBilangan){
        
        int banyakBil = 1;
        int bil = 1;
        
        boolean angkaGanjil = true;
        System.out.println("Bilangan Ganjil");
        
        while(banyakBil <= jumlahBilangan){
            angkaGanjil = true;
            for(int i = 2;
                    i <= bil;
                    i++){
                if(bil % 2 == 0){
                    /**Jika bilangan setelah dibagi 2, menghasilkan 0,
                     * maka bilangan tersebut bukan bilangan Ganjil.
                     * Sehingga False**/
                    angkaGanjil = false;
                    break;
                }
            }
            if(angkaGanjil){
                if(banyakBil % 10 == 0){
                    System.out.print(bil);
                }
                else {
                    System.out.print(bil+" - ");
                }
                banyakBil++;
            }
            bil++;
        }
        
        System.out.println("\n");
    }
}