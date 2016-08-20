/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArbolGenericoT1;

/**
 *
 * @author Inaki
 */
public class TNodoArbolGenericoT1<T> implements INodoArbolGenericoT1<T>{

    /**
    * Atributes
    * *****************************************************
    */
    private Comparable etiqueta;
    private INodoArbolGenericoT1<T> primerHijo;
    private INodoArbolGenericoT1<T> siguienteHermano;
    private INodoArbolGenericoT1<T> padre;
    private T datos;
    // End Atributes ***************************************
    
    /**
    * Constructors
    * *****************************************************
    */
    /**
     * Constructor of TElementoAB
     * @param unaEtiqueta
     * @param unosDatos
     */
    public TNodoArbolGenericoT1(Comparable unaEtiqueta, T unosDatos) {
        etiqueta = unaEtiqueta;
        datos = unosDatos;
    }
    // End Constructors ***************************************
    
    /**
    * Methods
    * ***************************************************** 
    */
    
    
    @Override
    public boolean insertar(INodoArbolGenericoT1<T> elemento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public INodoArbolGenericoT1<T> eliminar(Comparable unaEtiqueta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public INodoArbolGenericoT1<T> buscar(Comparable unaEtiqueta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void inOrden(String listInOrder) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void preOrden(String listPreOrder) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void postOrden(String listPostOrder) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T getDato() {
        return datos;
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
}
