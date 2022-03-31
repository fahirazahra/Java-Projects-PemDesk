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
public class Prima {
    
    public void bilanganPrima(int jumlahBilangan){
        
        int hitungJumlah = 1;
        int bil = 2;
        
        boolean angkaPrima = true;
        System.out.println("Bilangan Prima");
        
        while(hitungJumlah <= jumlahBilangan){
            angkaPrima = true;
            for(int i = 2;
                    i <= bil/2;
                    i++){
                if(bil % i == 0){
                    /**Jika bilangan setelah dibagi 2, menghasilkan 0,
                     * maka bilangan tersebut bukan bilangan Prima.
                     * Sehingga False**/
                    angkaPrima = false;
                    break;
                }
            }
            if(angkaPrima){
                if(hitungJumlah % 10 == 0){
                    System.out.print(bil);
                }
                else {
                    System.out.print(bil+" - ");
                }
                hitungJumlah++;
            }
            bil++;
        }
        
        System.out.println("\n");
    }
}