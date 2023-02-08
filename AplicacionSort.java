/*
 * Integrantes: Emilio Reyes 22674 y Sara Guzman 22097
 * HDT3 
 * 
 * 
 * Esta clase sirve para poner los sorts indicados
 */


 import java.util.Arrays; 

 public class AplicacionSort<T>{ 
    Contr<T> compare = new Contr<>();

    //Constructor

    public AplicacionSort(Contr<T> compare) {
        this.compare = compare;
    }


    /**
     * GnomeSort
     * @param lista
     */
    public void GnomeSort(T[] lista){
        int i = 0; 
        while(i < lista.length){
            if(i == 0){
                i++;
            }
            if(compare.Compare(lista[i], lista[i-1]) >=0){
                i++;
            }
            else{
                T a; 
                a = lista[i];
                lista[i] = lista[i-1]; 
                lista[i-1] = a;
                i--;
            }
        }
        return;
    }

    /** 
     * Merge Sort
     * @param lista
     * @param a
     * @param b
     * @param c
     */
    public void Merge(T[] lista, int a, int b, int c){
        int num1 = b - a + 1;
        int num2 = c - b;

        Integer[] l1 = new Integer[num1];
        Integer[] l2 = new Integer[num2];

        for(int i = 0; i < num1; i++){
            l1[i] = (Integer)lista[a + i];
        }
        for(int j = 0; j < num2; j++){
            l2[j] = (Integer)lista[b + j + 1];
        }

        int check1 = 0, check2 = 0;
        int k = a;



    }

    
    /** 
     * Merge Sort
     * @param lista
     * @param a
     * @param b
     */
    public void MergeSort(T[] lista, int a, int b){
        if(a < b){
            int c = a + (b - a)/2;

            MergeSort(lista, a, c);
            MergeSort(lista, c + 1, b);

            Merge(lista, a, c, b);
        }
    }


    
    /** 
     * Radix Sort
     * @param Lista
     * @return T
     */
    private T Mayor(T[] lista){
    	T max = lista[0];
        for (int i = 1; i < lista.length; i++) {
        	if(compare.Compare(max, lista[i]) == -1){
				max = lista[i];
			}
        }
        return max;
    }
 

    
    /** 
     * sort Radix
     * @param lista
     * @param e
     */
    private void Sort(T[] lista, int e){
    	Integer[] output = new Integer[lista.length];
        int i;
        int contador[] = new int[10];
        Arrays.fill(contador, 0);
        
		for (i = 0; i < lista.length; i++) {	
			Integer value = (Integer) lista[i];
			contador[((value/e) % 10)]++;
		}
 

    }
 

    
    /** 
     * Radix Sort
     * @param lista
     */
    public void RadixSort(T[] lista){

        Integer x = (Integer) Mayor(lista);
 
        for (int exp = 1;   x / exp > 0; exp *= 10) {        	
        	Sort(lista, exp);
        }
    }
    
    
    
    /** 
     * Quick Sort
     * @param lista
     * @param a
     * @param b
     */
    public void QuickSort(T[] lista, int a, int b) {
        int x = a -1;
        int y = b;
        boolean bandera = true;
        T Temporal;
        
        if (a >= b) {
 		   return;
 	    }
 	   
 	    T elem_div = lista[b];
 	   
 	   
 	    while (bandera) {
            while(compare.Compare(lista[++x], elem_div) < 0); 
            while((compare.Compare(lista[--y], elem_div) > 0) && (x > a)); 
 		   
 		    if (x < y) {
                Temporal = lista[x];
                lista[x] = lista[y];
                lista[y] = Temporal;
 		    } else {
                bandera = false;
 		    }
 	    }

    }

 }