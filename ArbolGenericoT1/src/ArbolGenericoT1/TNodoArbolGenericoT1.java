/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArbolGenericoT1;

import java.util.LinkedList;

/**
 *
 * @author Inaki
 */
public class TNodoArbolGenericoT1<T> implements INodoArbolGenericoT1<T>{

    /**
    * Atributes
    * *****************************************************
    */
    private final Comparable etiqueta;
    private INodoArbolGenericoT1<T> primerHijo;
    private INodoArbolGenericoT1<T> siguienteHermano;
    private INodoArbolGenericoT1<T> anteriorHermano;
    private INodoArbolGenericoT1<T> padre;
    // End Atributes ***************************************
    
    /**
    * Constructors
    * *****************************************************
    */
    /**
     * Constructor of TElementoAB
     * @param etiqueta
     */
    public TNodoArbolGenericoT1(Comparable etiqueta) {
        this.etiqueta = etiqueta;
    }
    // End Constructors ***************************************
    
    /**
    * Methods
    * ***************************************************** 
    */
    
    public void insertarDirecto(INodoArbolGenericoT1 primerHijo, INodoArbolGenericoT1 siguienteHermano){
        this.primerHijo = primerHijo;
        this.siguienteHermano = siguienteHermano;
    }
    
    @Override
    public boolean insertar(Comparable elemento, Comparable padre) {
        //Creo el nodo nuevo
        INodoArbolGenericoT1 nodoInsertar = new TNodoArbolGenericoT1(elemento);
        
        //Si el nodo no tiene padre como parametro, sustituye a la raiz.
        if (padre == "" || padre == null){
            nodoInsertar.setPrimerHijo(this);
            this.padre = nodoInsertar;
        }
        
        //Si existe el nodo padre, inserta el nodo en ese lugar en la primera posicion
        //de la cadena de hijos.
        INodoArbolGenericoT1 nodoPadre = this.buscar(padre);
        if (nodoPadre != null){
            nodoInsertar.setSiguienteHermano(nodoPadre.getPrimerHijo());
            nodoInsertar.setPadre(nodoPadre);
            nodoPadre.setPrimerHijo(nodoInsertar);
            nodoPadre.getPrimerHijo().setAnteriorHermano(nodoInsertar);
            return true;
        }
        return false;
    }

    @Override
    public boolean eliminar(Comparable unaEtiqueta) {
        INodoArbolGenericoT1 aEliminar = this.buscar(unaEtiqueta);
        if (aEliminar != null){
            if (aEliminar.unicoHijo()){
                padre.setPrimerHijo(this.primerHijo);
                return true;
            }
            INodoArbolGenericoT1 aux = aEliminar.getSiguienteHermano();
            aEliminar.getAnteriorHermano().setSiguienteHermano(aux);
            return true;            
        }
        return false;
    }

    @Override
    public INodoArbolGenericoT1<T> buscar(Comparable unaEtiqueta) {
        INodoArbolGenericoT1 aux;
        if (this.etiqueta == unaEtiqueta){
            return this;
        }
        if (this.primerHijo != null) {
            aux = this.primerHijo.buscar(unaEtiqueta);
            if (aux != null){
                return aux;
            }
        }
        aux = this.getSiguienteHermano();
        while (aux != null){
            INodoArbolGenericoT1 srch = aux.buscar(unaEtiqueta);
            if (srch != null){
                return srch;
            }
            aux = aux.getSiguienteHermano();
        }
        return null;
    }

    @Override
    public void inOrden(LinkedList<String> listInOrder) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void preOrden(LinkedList<String> listPreOrder) {
        listPreOrder.add(this.etiqueta.toString());
        if (this.primerHijo != null){
           this.primerHijo.preOrden(listPreOrder);
        }
        INodoArbolGenericoT1 aux = this;
        while (aux.getSiguienteHermano() != null){
            aux.getSiguienteHermano().preOrden(listPreOrder);
            aux = aux.getSiguienteHermano();
        }
    }

    @Override
    public void postOrden(LinkedList<String> listPostOrder) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString(){
        return this.etiqueta.toString();
    }
    
    @Override
    public boolean unicoHijo(){
        boolean resultado = false;
        if ((this.anteriorHermano == null) && (this.siguienteHermano == null)){
            resultado = true;
        }
        return resultado;
    }
    
    /**
     * Retorna el mayor orden de los nodos del arbol.
     * @param resultado
     * @return 
     */
    @Override
    public int getOrden(int resultado){
        int subresult = resultado;
        if (this.primerHijo != null){
           this.primerHijo.getOrden(subresult);
           if (subresult > resultado){
               resultado = subresult;
           }
        }
        INodoArbolGenericoT1 aux = this.getSiguienteHermano();
        while (aux != null){
            aux.getOrden(subresult);
            if (subresult > resultado){
               resultado = subresult;
            }
            aux = aux.getSiguienteHermano();
        }
        return resultado;
    }
    
    @Override
    public Comparable getEtiqueta() {
        return (etiqueta.toString());
    }

    @Override
    public INodoArbolGenericoT1<T> getPrimerHijo() {
        return primerHijo;
    }

    @Override
    public INodoArbolGenericoT1<T> getSiguienteHermano() {
        return siguienteHermano;
    }

    @Override
    public INodoArbolGenericoT1<T> getPadre(){
        return padre;
    }
    
    @Override
    public void setPrimerHijo(INodoArbolGenericoT1<T> elemento) {
        this.primerHijo = elemento;
    }

    @Override
    public void setSiguienteHermano(INodoArbolGenericoT1<T> elemento) {
        this.siguienteHermano = elemento;
    }
    
    @Override
    public void setPadre(INodoArbolGenericoT1<T> elemento) {
        this.padre = elemento;
    }

    /**
     * @return the anteriorHermano
     */
    @Override
    public INodoArbolGenericoT1<T> getAnteriorHermano() {
        return anteriorHermano;
    }

    /**
     * @param anteriorHermano the anteriorHermano to set
     */
    @Override
    public void setAnteriorHermano(INodoArbolGenericoT1<T> anteriorHermano) {
        this.anteriorHermano = anteriorHermano;
    }
}
