/*
 * Integrantes: Emilio Reyes 22674 y Sara Guzman 22097
 * HDT3 
 * 
 * 
 * 
 */

import java.beans.Transient;

public class AplicationSortTest {
    @Test
    void mergeSort() {
        AplicacionSort sorts = new AplicacionSort(new EnterosComparar());

        Integer[] array = new Integer[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        sorts.mergeSort(array,0,array.length-1);

        assertEquals(1, array[0]);
        assertEquals(2, array[1]);
        assertEquals(3, array[2]);

    }

    @Test
    void gnomeSort() {
        AplicacionSort sorts = new  AplicacionSort(new EnterosComparar());

        Integer[] array = new Integer[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        sorts.gnomeSort(array);

        assertEquals(1, array[0]);
        assertEquals(2, array[1]);
        assertEquals(3, array[2]);

    }

    @Test
    void bubbleSort() {
        AplicacionSort  sorts = new  AplicacionSort(new EnterosComparar());

        Integer[] array = new Integer[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        sorts.bubbleSort(array);

        assertEquals(1, array[0]);
        assertEquals(2, array[1]);
        assertEquals(3, array[2]);

    }


    @Test
    void radixSort() {
        AplicacionSort sorts= new AplicacionSort(new EnterosComparar());

        Integer[] array = new Integer[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        sorts.radixSort(array);

        assertEquals(1, array[0]);
        assertEquals(2, array[1]);
        assertEquals(3, array[2]);
    }


    @Test
    void quickSort() {
        AplicacionSort sorts = new AplicacionSort(new EnterosComparar());

        Integer[] array = new Integer[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        sorts.quickSort(array,0,array.length-1);

        assertEquals(1, array[0]);
        assertEquals(2, array[1]);
        assertEquals(3, array[2]);
    }
    
}
