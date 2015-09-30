/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime_printing;

/**
 *
 * @author jparker3221
 */
public class Parker_7_Prime_Printing {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        for(int i=0;i<100;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
          
    }
    /* a method is a baby program
    an action you want to repeat frequently*/
 }
 
    static boolean isPrime (int somenumber){
      int d = 0;
        for(int i = 2;i<somenumber;i++){
           if(somenumber%i==0){
               d = d+1;
              
           }
        }
     return (d==0);
     
    
}
}

