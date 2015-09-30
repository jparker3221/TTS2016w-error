/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parker_7_datatypes;

/**
 *
 * @author jparker3221
 */
public class Parker_7_Datatypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //space for commetns
        //used to ecplain code
        //code explanation is an expectation
        //in d22
        int i =  1;
        float a = 2.5f;
        double b = 3.87;
        short c = 16;
        char d1 = ';';
        char d2 = 'y';
        char d3 = 42;
        char d4 = 145;
        String e = "elephants are cool";
        String e1 = "Amanda is the best";
        boolean f = true;
        boolean g = i % 2==0;
        // + this ass two numbers and more
        // - this subtracts two numbers and more
        // * miltiplies two numbers and more
        // / this divides two numbers and more
        // % this is modulo, it shows you the remainder of division
        /*System.out.println(i +" and integer");
        System.out.println(a +" a float");
        System.out.println(b +" a double");
        System.out.println(c +" a short");
        System.out.println(d1+" a char");
        System.out.println(d2+" a char");
        System.out.println(d3+" a char");
        System.out.println(e+ " a string");
        System.out.println(f+" a boolean");
        System.out.println(g+ " also a boolean");*/
        //for(i = -123;i <123; i++) {
            //System.out.println((char) i);
            //System.out.println(i%3==0);
            i = 7;
            a = 0;
            e = "ninja";
            System.out.println(i+a+" an integer "+ "plus a float");
            //upcast to float is automatic
            //integers turn into floats when combined with one
            i = 22;
            a = 0;
            e = "ninja";
            System.out.println(e+i+" an string "+ "plus an integer");
            //adding an int and a string concatenates the int and string as a string
            for(i=0; i <500; i++)
                //if is a conditional statement the following command will be executed
            if(i%2==0){
                System.out.println(i +" is even");
            } else {
                System.out.println(i+" is odd");
            }
        }
    }
    // % checks for remainder, i%2 == 0 checks for even or odd
//}

