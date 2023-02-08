/*
 * Integrantes: Emilio Reyes 22674 y Sara Guzman 22097
 * HDT3 
 * 
 * 
 * Mostrar el Menu.
 */

import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        Leer leer = new Leer();
        Integer[] numeros = leer.VerificarDoc();  
        AplicacionSort aSort = new AplicacionSort(new Contr<>());
       
        String menu = "\n1. Gnome Sort. \n2. Merge Sort. \n3. Quick Sort. \n4. Radix Sort.  \n5. Bubble Sort \n6. Salir \nIndica lo que quieres realizar aquí: ";
        System.out.println("\n\t\t\t\t\t***Ordenamientos Sorts ***");
        int opcion = 1;
               
        while(opcion >= 1 && opcion < 6){
            System.out.print(menu);
            try{
                opcion = teclado.nextInt();
                teclado.nextLine();
                switch(opcion){
                    
                    /*
                     * Gnome Sort
                     */
                    case 1:{
                        System.out.println("Gnome Sort");

                        for(int i = 10; i <= 5000; i+=499){
                            Integer[] lista = new Integer[i];
            			
                            for(int j=0; j<i; j++) {
                                lista[j]=numeros[j];
                            }                           
                            aSort.GnomeSort(lista);
                            
                            for(int recorrido:lista) {
                                System.out.println(recorrido);
                            }
                            System.out.println("\nOrdenamiento con: " + i + " numeros.\n");
                            System.out.println("Presionar Enter");
                            teclado.nextLine();
                        }

                        System.out.println("Lista Ordenada");
                        break;                   
                    }

                    /*
                     * Merge Sort
                     */
                    case 2:{
                        for(int i = 10; i <= 5000; i+=499){
                            Integer[] lista = new Integer[i];
            			
                            for(int j=0; j<i; j++) {
                                lista[j]=numeros[j];
                            }                           
                            aSort.MergeSort(lista, 0, lista.length-1);
                            
                            for(int recorrido:lista) {
                                System.out.println(recorrido);
                            }
                            System.out.println("\nOrdenamiento con: " + i + " numeros.\n");
                            System.out.println("Presionar Enter");
                            teclado.nextLine();
                        }

                        System.out.println("Lista Ordenada");
                        break;    
                    }
    
                    /*
                     * Quick Sort
                     */
                    case 3:{
                        for(int i = 10; i <= 5000; i+=499){
                            Integer[] lista = new Integer[i];
            			
                            for(int j=0; j<i; j++) {
                                lista[j]=numeros[j];
                            }                           
                            aSort.QuickSort(lista, 0, lista.length-1);
                            
                            for(int recorrido:lista) {
                                System.out.println(recorrido);
                            }
                            System.out.println("\nOrdenamiento con: " + i + " numeros.\n");
                            System.out.println("Presionar Enter");
                            teclado.nextLine();
                        }

                        System.out.println("Lista Ordenada");
                        break;
                    }
    
                    /*
                     * Radix Sort
                     */

}
