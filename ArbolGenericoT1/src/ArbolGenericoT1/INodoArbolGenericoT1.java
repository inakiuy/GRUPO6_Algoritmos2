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
 * @param <T>
 */
public interface INodoArbolGenericoT1<T> {
    /**
     * Inserta un elemento dentro del arbol.
     *
     * @param elemento Elemento a insertar.
     * @param padre
     * @return Exito de la operacion.
     */
    public boolean insertar(Comparable elemento, Comparable padre);
    
    /**
     * Elimina un elemento dada una etiqueta.
     * @param unaEtiqueta
     * @return 
     */
    public boolean eliminar(Comparable unaEtiqueta);
    
     /**
     * Busca un elemento dentro del arbol con la etiqueta indicada.
     *
     * @param unaEtiqueta del nodo a buscar
     * @return Elemento encontrado. En caso de no encontrarlo, retorna nulo.
     */
    public INodoArbolGenericoT1<T> buscar(Comparable unaEtiqueta);

    /**
     * Imprime en inorden el arbol separado por guiones.
     *
     * @param listInOrder
     */
    public void inOrden(LinkedList<String> listInOrder);
        
    /**
     * Imprime en preorden el arbol separado por guiones.
     *
     * @param listPreOrder
     */
    public void preOrden(LinkedList<String> listPreOrder);

    /**
     * Imprime en postorden el arbol separado por guiones.
     *
     * @param listPostOrder
     */
    public void postOrden(LinkedList<String> listPostOrder);

    /**
     * 
     * @return 
     */
    public boolean unicoHijo();
    
    /**
     * Retorna el mayor orden de los nodos
     * @return 
     */
    public int getOrden(int resultado);
    /**
     * Obtiene el valor de la etiqueta del nodo.
     *
     * @return Etiqueta del nodo.
     */
    public Comparable getEtiqueta();

    /**
     * Obtiene el hijo izquierdo del nodo.
     *
     * @return Hijo Izquierdo del nodo.
     */
    public INodoArbolGenericoT1<T> getPrimerHijo();

    /**
     * Obtiene el primer del nodo.
     *
     * @return Primer hijo del nodo.
     */
    public INodoArbolGenericoT1<T> getSiguienteHermano();
    
    /**
     * Obtiene el padre del nodo actual
     * @return 
     */
    public INodoArbolGenericoT1<T> getPadre();
    
    /**
     * Obtiene el hermano anterior
     * @return 
     */
    public INodoArbolGenericoT1<T> getAnteriorHermano();
            
    /**
     * Asigna el hijo izquierdo del nodo.
     *
     * @param elemento
     */
    public void setPrimerHijo(INodoArbolGenericoT1<T> elemento);

    /**
     * Asigna el hijo derecho del nodo.
     *
     * @param elemento
     */
    public void setSiguienteHermano(INodoArbolGenericoT1<T> elemento);
    
    /**
     * Setea el padre del nodo actual
     * @param elemento 
     */
    public void setPadre(INodoArbolGenericoT1<T> elemento);
    
    /**
     * setea el hermano anterior
     * @param anteriorHermano 
     */
    public void setAnteriorHermano(INodoArbolGenericoT1<T> anteriorHermano);
}
