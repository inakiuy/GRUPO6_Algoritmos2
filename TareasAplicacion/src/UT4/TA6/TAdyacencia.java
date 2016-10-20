package UT4.TA6;


public class TAdyacencia implements IAdyacencia {
   
    /******************************************************
    **  ATRIBUTOS
    ******************************************************/
    private Comparable etiqueta;
    private double costo;
    private TVertice destino;
    // FIN ATRIBUTOS **************************************
    
    /******************************************************
    **  CONSTRUCTORES
    ******************************************************/
    
    /**
     * Constructor de una adyacencia. El costo representa
     * cualquier propiedad que se dese usar para como
     * comparativo. Puede ser una distancia, un precio,
     * tiempo, etc...
     * 
     * @param costo Valor que puede estar asociado al tiempo, precio, distancia...
     * @param destino Vertice destino
     */
    public TAdyacencia(double costo, TVertice destino) {
        this.etiqueta = destino.getEtiqueta();
        this.costo = costo;
        this.destino = destino;
    }
    // FIN CONSTRUCTORES **********************************
    
    /******************************************************
    **  GETTERS Y SETTERS
    ******************************************************/
    
    /**
     * Obtiene la etiqueta de la adyacencia. La etiqueta
     * de la adyacencia es la misma que la etiqueta del
     * destino
     * 
     * @return Etiqueta de la adyacencia 
     */
    @Override
    public Comparable getEtiqueta() {
        return etiqueta;
    }
    
    /**
     * Obtiene el costo de la adyacencia
     * 
     * @return Costo de adyacencia
     */
    @Override
    public double getCosto() {
        return costo;
    }

    /**
     * Obtiene el destino de la adyacencia
     * 
     * @return Vertice adjacente 
     */
    @Override
    public TVertice getDestino() {
        return destino;
    }
    // FIN GETTERS Y SETTERS ******************************

}
