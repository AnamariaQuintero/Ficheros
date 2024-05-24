package com.mycompany.archivo;

import java.io.File;
import java.io.IOException;

public class Archivo {

    public static void main(String[] args) throws IOException {
        
      
        ArchivosTexto archivoTexto = new ArchivosTexto();
        archivoTexto.crearArchivoDeTexto();
        //archivoTexto.eliminarArchivoDeTexto();
        archivoTexto.escribirAlArchivoDeTexto();
        archivoTexto.leerArchivoDeTexto();
    }
}
