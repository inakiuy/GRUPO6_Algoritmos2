package UT4.TA6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ernesto
 */
public interface IArista {
    
    /**
     * Obtiene la etiqueta del origen de la arista.
     * 
     * @return Origen de la arista
     */
    public Comparable getEtiquetaOrigen();
    
    /**
     * Setea la etiqueta del origen.
     * 
     * @param etiquetaOrigen Etiqueta del origen
     */
    public void setEtiquetaOrigen(Comparable etiquetaOrigen);    
    
    /**
     * Obtiene la etiqueta del destino de la arista.
     * 
     * @return Origen de la arista
     */
    public Comparable getEtiquetaDestino();
    
    /**
     * Setea la etiqueta del destino.
     * 
     * @param etiquetaDestino Etiqueta del destino
     */
    public void setEtiquetaDestino(Comparable etiquetaDestino);    
    
    /**
     * Obtiene el costo de la arista.
     * El valor del costo puede representar cualquier propiedad
     * que se desee usar como comparable. Por ejemlo, tiempo, precio
     * distancia...
     * 
     * @return Costo de la arista
     */
    public double getCosto();

    /**
     * Setea el costo de la arista.
     * 
     * @param costo Valor de la propiedad que se desea usar como costo
     */
    public void setCosto(double costo);
    
}
