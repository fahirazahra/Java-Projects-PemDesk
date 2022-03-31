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
public class Genap {
    
    public void bilanganGenap(int jumlahBilangan){
        
        int banyakBil = 1;
        int bil = 1;
        
        boolean angkaGenap = true;
        System.out.println("Bilangan Genap");
        
        while(banyakBil <= jumlahBilangan){
            angkaGenap = true;
            for(int i = 1;
                    i <= bil;
                    i++){
                if(bil % 2 == 1){
                    /**Jika bilangan setelah dibagi 2, menghasilkan 1,
                     * maka bilangan tersebut bukan bilangan Genap.
                     * Sehingga False**/
                    angkaGenap = false;
                    break;
                }
            }
            if(angkaGenap){
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