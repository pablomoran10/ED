/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author redes-Pablo
 */

 
/** @version version 1.0 /* 
* @since desde el 20 de enero de 2022
* //@see no tenemos varias clases
*/

public class Calculadora {
    private int num1;
    private int num2;
    
    /**
     * 
     * @param a recibe el primer parametro
     * @param b  recibe ell segundo parametro
     */
    public Calculadora(int a, int b){
        /**
         * @param recibe a
         * @param recibe b
         */
        num1=a;
        num2=b;
    }
    
    /**
    * @return devuelve el resultado de A mas B
    */
    public int suma(){
        int result=num1+num2;
        return result;
    }
    
    public int resta(){
        int result;
        if (resta2())   result = num1-num2;
        else            result = num2-num1;
        return result;
    }
        
    public boolean resta2(){
        if (num1 > num2)    return true;
        else                return false;
    }
    
    public int multiplica(){
        int result=num1*num2;
        return result;
    }
    
    public int divide(){
        int result=num1/num2;
        return result;
    }
    /**
     * 
     * @return devuelve el resultado de la division
     */
    public Integer divide2(){
        if(num2==0) return null;
        int result=num1/num2;
        return result;
    }
        /**
        * @throws no me va
        */
    
        /**
         * 
         * @deprecated puede ser que este desactualizado 
         */
         
     public int divide0(){
        if(num2==0)     
            throw new java.lang.ArithmeticException("División por 0");
        else{
            int result=num1/num2;
            return result;
        }
    }
     
    /**
     * @param args the command line arguments
     */
    /*
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora calcu = new Calculadora(20, 10);
        System.out.println(calcu.suma());
    }
    */
}
