/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p6;

/**
 *
 * @author ispip
 */
public class Operaciones {

    public int sumarPar(int a, int b) {
        int resultado = a + b;
        if(resultado%2==0){
            return resultado+1;
        }else{
            return resultado;
        }
    }

    public int mayor(int a, int b) {
        if(a>b){
            return a;
        }else{
            return a;
        }
    }

   
    public int sumarVector(int [] numeros) {
        int sum=0;
        for (int i = 0; i < numeros.length; i++) {
            sum+=numeros[0];
        }
        return sum;
    }
    
}
