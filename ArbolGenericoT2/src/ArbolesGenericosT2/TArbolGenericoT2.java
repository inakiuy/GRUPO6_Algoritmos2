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
public class TArbolGenericoT2 {

    private TNodoArbolGenericoT2 raiz;

    /**
     * @autor: Luis TITO
     * Busca unaEtiqueta en el árbol.
     * @param unaEtiqueta
     * @return 
     */
    public TNodoArbolGenericoT2 buscar(String unaEtiqueta) {
        if (unaEtiqueta != null) {            
            if (raiz == null) {
                return null;
            } else {
                return raiz.buscar(unaEtiqueta);
            }
        }
        return null;
    }

    /**
     * @autor: Luis TITO
     * @param hijo
     * @param padre
     * Inserta el Hijo al Padre, verifica que no existan duplicados. 
     * si Padre ésta es vacía “”, se indica que la nueva Unidad será la raíz del árbol
     * @return 
     */
    public Boolean insertar(String hijo, String padre) {
        Boolean resultado = false;
        if ((hijo != null) & (padre != null)) {
            if (padre == "") {
                if (raiz == null) {
                    TNodoArbolGenericoT2 nuevaRaiz = new TNodoArbolGenericoT2(hijo);
                    raiz = nuevaRaiz;
                    resultado = true;
                } else {
                    TNodoArbolGenericoT2 aux = raiz;
                    TNodoArbolGenericoT2 nuevaRaiz = new TNodoArbolGenericoT2(hijo);
                    raiz = nuevaRaiz;
                    raiz.setHijos(aux.getHijos());
                    resultado = true;
                }
            } else if (raiz == null) {
                resultado = false;
            } else {
                TNodoArbolGenericoT2 aux = raiz.buscar(padre);
                if (aux != null) {
                    resultado = aux.insertar(hijo);
                }
            }
        }
        return resultado;
    }
    
   /**
    * @autor: Luis TITO
    * realiza un recorrido preorden indexando por orden de "visita"
    * @return 
    */
    public String listarIndentado() {
        if (raiz != null) {
            String aux = ":";
            aux = aux + raiz.listarIndentado();
            String[] nuevo = aux.split(":");
            for (int i = 1; i < nuevo.length; i++) {
                System.out.println(i + " -> "+nuevo[i]);

            }
            return aux;
        }
        return null;
    }
    
    /**
     * @autor: Luis TITO
     * Realiza un recorrido preorden e imprime por nivel
     */
    public void listarIndentado2(){
        if (raiz != null) {
            int n = 0;
            raiz.listarIndentado2Nodo(n);
        }
        else{
            System.out.println("Arbol Vacío");
        }
    }
}    
