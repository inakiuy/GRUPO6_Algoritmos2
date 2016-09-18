/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArbolGenericoT1;

/**
 *
 * @author Inaki
 * @param <T>
 */
public interface IArbolGenericoT1 <T>{
    
    /**
     * Inserta un elemento en el arbol. En caso de ya existir un elemento con la
     * clave indicada en "unElemento", retorna falso.
     *
     * @param etiqueta
     * @param padre
     * @return Exito de la operaci�n
     */
    public boolean insertar(Comparable etiqueta, Comparable padre);
    
    /**
    * Elimina un elemento dada una etiqueta.
    * @param unaEtiqueta 
    */
    public void eliminar(Comparable unaEtiqueta);    

    /**
     * Busca un elemento dentro del �rbol.
     *
     *
     * @param unaEtiqueta Etiqueta identificadora del elemento a buscar.
     * .
     * @return Elemento encontrado. En caso de no encontrarlo, retorna nulo.
     */
    public INodoArbolGenericoT1<T> buscar(Comparable unaEtiqueta);
    
    /**
     * Imprime en InOrden los elementos del �rbol, separados por guiones.
     *
     * @return String conteniendo el preorden separado por guiones.
     */
    public String inOrden();
    
    /**
     * Imprime en PreOrden los elementos del �rbol, separados por guiones.
     *
     * @return String conteniendo el preorden separado por guiones.
     */
    public String preOrden();

    /**
     * Imprime en PostOrden los elementos del �rbol, separados por guiones.
     *
     * @return String conteniendo el preorden separado por guiones.
     */
    public String postOrden();
    
    /**
     * Retorna si el arbol esta vacio
     * @return 
     */
    public boolean esVacio();
    
    /**
     * Obtiene el dato almacenado en el nodo
     * @return 
     */
    public INodoArbolGenericoT1<T> getRaiz();
    
    /**
     * Retorna el orden del arbol generico.
     * @return 
     */
    public int getOrden();
}
