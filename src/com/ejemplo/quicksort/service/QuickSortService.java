package com.ejemplo.quicksort.service;

/**
 * Metodo ejemplo QuickSort.
 * @author rogelioBravo.
 *
 */
public class QuickSortService {

	/**
	 * Metodo que implementa el ordenamiento quickSort.
	 * 
	 * @param numeros Arreglo de numeros.
	 * @param izquierdo Apuntador 1.
	 * @param derecho Apuntador 2.
	 */
	public static void Quicksort(final int numeros[], final int izquierdo, final int derecho)
    {
            int pivote = numeros[izquierdo];
            int i = izquierdo; 
            int j = derecho; 
            int aux;
           
            while(i<j)
            {
               while (numeros[i] <= pivote && i < j) 
                  i++;

               while (numeros[j] > pivote) 
                  j--;   

               if (i<j) 
               {                                     
                   aux = numeros[i];                  
                   numeros[i]= numeros[j];
                   numeros[j]=aux;
               }
            }

             numeros[izquierdo] = numeros[j]; 
             numeros[j] = pivote;

             if (izquierdo < j-1)
                Quicksort(numeros, izquierdo, j-1);

             if (j+1 < derecho)
                Quicksort(numeros, j+1, derecho);
      }
    
	/**
	 * Imprime el Arreglo aplicado el metodo QuickSort.
	 * 
	 * @param arreglo .
	 */
    public static void ImprimirVector(int arreglo[])
    {
        for(int i = 0; i < arreglo.length; i++)
        {
            System.out.println(arreglo[i]);
        }
    }
}
