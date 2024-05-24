package com.mycompany.archivo;

import java.io.*;

public class ArchivosTexto {
    
    File documento;

    //Crear archivo de texto
    public void crearArchivoDeTexto() throws IOException{
        documento = new File("documento.txt");
        

            if(documento.createNewFile()){
                System.out.println("Archivo creado");
            }else{
                System.out.println("Error al crear el archivo");
            }

    }
    
    //Creamos el metodo para escribir al archivo de texto
    
    public void escribirAlArchivoDeTexto() throws IOException{
        FileWriter escritura = new FileWriter(documento);
        escritura.write("Hola Anamaria");
        //escritura.write("\nSos muy linda"); Salto de linea
        
        escritura.close(); //Para que pueda escribir en el documento
        System.out.println("Texto añadido con exito");
    }
    
    
    //Creamos el metodo para leer un archivo de texto
    
    public void leerArchivoDeTexto() throws FileNotFoundException, IOException{
        String contenido;
        
        FileReader lector = new FileReader(documento); //Indico que archivo voy a leer 
        BufferedReader lectura = new BufferedReader(lector);//Le pasamos el archivo a leer
    
        contenido = lectura.readLine();
    }
    
    
    public void eliminarArchivoDeTexto(){
        
        if(documento.delete()){
            System.out.println("Archivo eliminado con exito");
        }else{
            System.out.println("Error al eliminar el archivo");
        }
    }
    
 
            
}
