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
public class TNodoArbolGenericoT2 {

    private String etiqueta;
    private List<TNodoArbolGenericoT2> hijos;

    public TNodoArbolGenericoT2(String etiqueta) {
        this.etiqueta = etiqueta;
        hijos = new ArrayList();
    }

    public TNodoArbolGenericoT2() {
        hijos = new ArrayList();
    }

     /**
     * @autor: Luis TITO
     * Busca unaEtiqueta en el sub árbol.
     * @param unaEtiqueta
     * @return 
     */
    public TNodoArbolGenericoT2 buscar(String unaEtiqueta) {
        if (unaEtiqueta != null) {
            TNodoArbolGenericoT2 aDevolver = null;
            if (this.getEtiqueta().equals(unaEtiqueta)) {
                aDevolver = this;
            } else if (!(hijos.isEmpty())) {
                TNodoArbolGenericoT2 primerHijo;
                for (int i = 0; i < hijos.size(); i++) {
                    primerHijo = getHijos().get(i);
                    if (primerHijo != null) {
                        aDevolver = primerHijo.buscar(unaEtiqueta);
                        if (aDevolver != null) {
                            return aDevolver;
                        }
                    }
                }
            }
            return aDevolver;
        }
        return null; // etiqueta Nula
    }

     /**
     * @autor: Luis TITO
     * @param hijo
     * Una vez ubicado el padre, inserta el Hijo, verifica que no existan duplicados.      * 
     * @return 
     */
    public Boolean insertar(String hijo) {
        if ((hijo != null)) {
            TNodoArbolGenericoT2 nuevoHijo = new TNodoArbolGenericoT2(hijo);
            if ((existeHijo(hijo))) {
                return false;
            } else {
                getHijos().add(nuevoHijo);
                return true;
            }
        }
        System.out.println("EL padre no existe");
        return false;
    }

    /**
     * @return the etiqueta
     */
    public String getEtiqueta() {
        return etiqueta;
    }

    /**
     * @param etiqueta the etiqueta to set
     */
    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    /**
     * @autor: Luis TITO
     * Método auxiliar para imprimir las etiquetas de los hijos, si tiene.
     */
    private void imprimeHijos() {
        String aux = " - ";
        if (hijos.isEmpty()) {
            aux = "No tiene hijos";
        } else {
            for (int i = 0; i < getHijos().size(); i++) {
                aux = aux + (getHijos().get(i).getEtiqueta().toString());
            }
        }
        System.out.println(aux);
    }

    private TNodoArbolGenericoT2 getPrimerHijo(){
        return this.hijos.get(0);
    }
    /**
     * @return the hijos
     */
    public List<TNodoArbolGenericoT2> getHijos() {
        return hijos;
    }

    /**
     * @param hijos the hijos to set
     */
    public void setHijos(List<TNodoArbolGenericoT2> hijos) {
        this.hijos = hijos;
    }

    /**
     * @autor: Luis TITO
     * Método auxiliar para saber si existe un hijo con la misma etiqueta, evita
     * repetidos
     *
     * @param nombre
     * @return
     */
    private Boolean existeHijo(String nombre) {
        Boolean variable = false;
        if (hijos != null) {
            for (int i = 0; i < getHijos().size(); i++) {
                if (hijos.get(i).getEtiqueta().equals(nombre)) {
                    variable = true;
                }
            }
        }
        return variable;
    }
    
    /**
     * @autor: Luis TITO
     * realiza un recorrido preorden concatenando las etiquetas
     * @return 
     */
   public String listarIndentado(){
       String aux = this.etiqueta;
       if (hijos.isEmpty()){
           return aux;          
       }
       else{
           for (int i = 0; i<hijos.size(); i++){
               aux = aux +":"+ hijos.get(i).listarIndentado();
           }
       }       
       return aux;
   }
   
   /**
     * @autor: Luis TITO
     * Realiza un recorrido preorden e imprime por nivel
     */
   public void listarIndentado2Nodo(int n){
       System.out.println(n+" <- "+ this.etiqueta);
       n ++;
       if (hijos.isEmpty()){
           System.out.println("FIN");
       }
       else{
           for ( int i = 0; i < hijos.size(); i++){
                hijos.get(i).listarIndentado2Nodo(n);
           }
       }
   }

}
