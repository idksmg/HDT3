/*
 * Integrantes: Emilio Reyes 22674 y Sara Guzman 22097
 * HDT3 
 * 
 * 
 * Hace todo lo relacionado con .csv
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Random;

public class Leer{
 
 public class Read{

    Random Generador = new Random();
    String NumCont = "";
    int num = 0;
    Integer[] list = new Integer[5000];
    String direccion = "datosHDT3.csv"; 


    
    /** 
     * Verifica si existe el documento, y lo lee
     * @return Integer[]
     */
    public Integer[] VerificarDoc() {
        File archivo = new File(direccion);
    
            if(archivo.exists() && archivo.isFile()){
                return LeerLaInformacion();
            }
            else{
                CrearDocumento();
                return LeerLaInformacion();
            }
    }

    /**
     * Sirve para crear un nuevo archivo csv
     */
    public void CrearDocumento(){

        for(int i = 0; i < 5000; i++){
            num = Math.abs(Generador.nextInt());
            list[i] = num;
        }    
        
        try {
            File archivo = new File (direccion);
            archivo.createNewFile();

            FileWriter myWriter = new FileWriter(direccion);
            BufferedWriter myBuffer = new BufferedWriter(myWriter);
            
            

            for (int i: list) {
                NumCont += String.valueOf(i) + "\n";
            }
            myBuffer.write(NumCont);
            myBuffer.close();

        } catch (IOException e) {
            System.out.println("No se ha podido crear el documento.");
            e.printStackTrace();
        }
       
    }

    
    /** 
     * Lee los datos del documento
     * @return Integer[]
     */
    public Integer[] LeerLaInformacion(){
        Integer[] list = new Integer[5000];
        File archivo = null;
        FileReader myReader = null;
        BufferedReader myBufferReader = null;

        try{
            archivo = new File (direccion);
            myReader = new FileReader(archivo);
            myBufferReader = new BufferedReader(myReader);

            /*
             * Almacena los números
             */
            String datos_Obtenidos_del_csv = "";

            /*
             * Añade cada fila del csv al una nueva list
             */
            for(int i = 0; (datos_Obtenidos_del_csv = myBufferReader.readLine()) != null; i ++){
                list[i] = Integer.parseInt(datos_Obtenidos_del_csv);
            }
            return list;

        }catch(Exception e){
            System.out.println("No se puede leer el documento.");
            e.printStackTrace();
        }finally{

            try{
                if(myReader != null){
                    myReader.close();
                }
            }catch(Exception e){
                System.out.println("No se puede cerrar el documento.");
                e.printStackTrace();
            }
        }


        return null;
    }

