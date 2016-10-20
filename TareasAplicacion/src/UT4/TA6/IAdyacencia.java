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
public interface IAdyacencia {
    
    /**
     * Obtiene la etiqueta de la adyacencia. La etiqueta
     * de la adyacencia es la misma que la etiqueta del
     * destino
     * 
     * @return Etiqueta de la adyacencia 
     */
    public Comparable getEtiqueta();
    
    /**
     * Obtiene el costo de la adyacencia
     * 
     * @return Costo de adyacencia
     */
    public double getCosto();
    
    /**
     * Obtiene el destino de la adyacencia
     * 
     * @return Vertice adjacente 
     */
    public TVertice getDestino();
    
}
