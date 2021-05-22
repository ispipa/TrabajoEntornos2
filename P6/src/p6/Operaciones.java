/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p6;

/**
 *
 * @author Ismael Cruz Cabezas
 * @version 1.0
 * @since 17/05/2021
 * @see sumaPar tendra como parametros de entrada dos números enteros cuyo retorno será la suma total.
 * @see mayor tendra como parametros de entrada dos números enteros,el retorno será cual de los dos nñumeros es mayor que el otro y en caso de que los dos nuemros enteros sean iguales se devolvera cualquiera de los dos.
 * @see sumaVector tendra como parametro de entrada un array de int ,el retorno será la suma total de toda la longitud del array.
 */
public class Operaciones {

    public int sumarPar(int a, int b) {
 /**
 *
 * @author Ismael Cruz Cabezas
 * @version 1.0
 * @since 17/05/2021
 * @param resultado (número entero), se encargara de guarda la suma de a+b
 * @return se diferencian dos casos, el primero  sucede cuando el resultado es par en cuyo caso se devolvera el resultado,el segundo sucede cuando el resultado es impar al que se le sumara 1 y se devolvera el resultado
 */
        int resultado = a + b;
        if(resultado%2==0){
            return resultado;
        }else{
            return resultado+1;
        }
    }

    public int mayor(int a, int b) {
 /**
 *
 * @author Ismael Cruz Cabezas
 * @version 1.0
 * @since 17/05/2021
 * @param int a  número entero
 * @param int b nñumero entero
 * @return se diferencian tres casos, el primero  sucede cuando el primer parametro de entrada  es mayor que el otro en cuyo caso se devolvera el primer parametro de entrada,
 * el segundo sucede cuando el primer parametro  es menor que el segundo parametro de entrada y se devolvera el segundo parametro de entrada,
 * y el ultimo caso en el cual los dos parametros de entrada son iguales en el cual se devolvera culaquiera de los dos parametros de entrada.
 */
       if(a>b){
            return a;
        }else if (a==b){
            return a;
        }else
        {
        return b;
        }
    
    }

   
    public int sumarVector(int [] numeros) {
 /**
 *
 * @author Ismael Cruz Cabezas
 * @version 1.0
 * @since 17/05/2021
 * @param numeros se encargara de almacenar los números de tipo int.
 * @param sum número entero que vale 0, se encargara de almacenar la suma de los números almacenados en el array que son recorridos por el  bucle for.
 * @return se diferencian dos casos, el primero  sucede cuando el resultado es par en cuyo caso se devolvera el resultado,el segundo sucede cuando el resultado es impar al que se le sumara 1 y se devolvera el resultado
 */
        int sum=0;
        for (int i = 0; i < numeros.length; i++) {
            sum+=numeros[0];
        }
        return sum;
    }
    
}
