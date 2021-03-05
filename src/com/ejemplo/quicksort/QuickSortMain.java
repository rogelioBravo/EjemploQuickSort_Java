package com.ejemplo.quicksort;
/**
 * Ejemplo de metodo de ordenamiento QuickSort.
 * 
 * @author rogelioBravo.
 *
 */

import com.ejemplo.quicksort.service.QuickSortService;

public class QuickSortMain {
	
	/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        /**
         * Arreglo de numeros a ordenar.
         */
        int numeros [] = {0,3,5,7,9,10,2,4,6,8,0,100,102,1000,18};
        
        /**
         * LLamada al metodo de Ordenamiento.
         */
        QuickSortService.Quicksort(numeros, 0, numeros.length -1);
        
       /**
        * Metodo para imprimir el arreglo ordenado.
        */
        QuickSortService.ImprimirVector(numeros);
    }
}
