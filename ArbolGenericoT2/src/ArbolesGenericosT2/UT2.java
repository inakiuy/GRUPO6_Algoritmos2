/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArbolesGenericosT2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis Emilio
 */
public class UT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     TArbolGenericoT2 ag = new TArbolGenericoT2();
        // RECTORIA es raiz
        ag.insertar("RECTORIA", "");
        // SEGUNDO NIVEL : Hijos de RECTORIA
        ag.insertar("VICERRECTORÍA DEL MEDIO UNIVERSITARIO", "RECTORIA");  
        ag.insertar("VICERRECTORÍA ACADÉMICA", "RECTORIA");  
        ag.insertar("VICERRECTORÍA ADMINISTRATIVA", "RECTORIA");  
        
        // TERCER NIVEL: 
        //              Hijos de VICERRECTORÍA ACADÉMICA
         ag.insertar("FACULTAD DE CIENCIAS EMPRESARIALES", "VICERRECTORÍA ACADÉMICA");
         ag.insertar("FACULTAD DE CIENCIAS HUMANAS", "VICERRECTORÍA ACADÉMICA");
         ag.insertar("FACULTAD DE INGENIERÍA Y TECNOLOGÍAS", "VICERRECTORÍA ACADÉMICA");
         ag.insertar("FACULTAD DE PSICOLOGÍA", "VICERRECTORÍA ACADÉMICA");
        
         //CUARTO NIVEL:
         //             Hijos de FACULTAD DE INGENIERÍA Y TECNOLOGÍAS
         ag.insertar("DEPARTAMENTO DE INFORMÁTICA Y CIENCIAS DE LA COMPUTACIÓN", "FACULTAD DE INGENIERÍA Y TECNOLOGÍAS");
          ag.insertar("DEPARTAMENTO DE INGENIERÍA ELÉCTRICA", "FACULTAD DE INGENIERÍA Y TECNOLOGÍAS");
           ag.insertar("DEPARTAMENTO DE MATEMÁTICAS", "FACULTAD DE INGENIERÍA Y TECNOLOGÍAS");
        
        ag.listarIndentado();
        System.out.println("------ Version 2 -----------");
        ag.listarIndentado2();
        
        
        
        
        
    }
    
}
