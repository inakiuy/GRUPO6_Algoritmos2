package UT4.TA6;


public class TArista implements IArista {

    /******************************************************
    **  ATRIBUTOS
    ******************************************************/
    protected Comparable etiquetaOrigen;
    protected Comparable etiquetaDestino;
    protected double costo;
    // FIN ATRIBUTOS **************************************
    
    /******************************************************
    **  CONSTRUCTORES
    ******************************************************/
    
    /**
     * Una arista representa la union entre dos vertices.
     * Conceptualmente es igual a la adyacencia pero la
     * diferencia se encuentra en que la adyacencia es una
     * representacion enfocada desde el vertice y la arista
     * es un objeto discreto.
     * 
     * @param etiquetaOrigen Etiqueta del vertice de origen
     * @param etiquetaDestino Etiqueta del vertice de destino
     * @param costo Costo de la arista que puede representar tiempo, precio, distancia...
     */
    public TArista(Comparable etiquetaOrigen, Comparable etiquetaDestino, double costo) {
        this.etiquetaOrigen = etiquetaOrigen;
        this.etiquetaDestino = etiquetaDestino;
        this.costo = costo;
    }
    // FIN CONSTRUCTORES **********************************
    
    /******************************************************
    **  GETTERS Y SETTERS
    ******************************************************/
    
    /**
     * Obtiene la etiqueta del origen de la arista.
     * 
     * @return Origen de la arista
     */
    @Override
    public Comparable getEtiquetaOrigen() {
        return etiquetaOrigen;
    }

    /**
     * Setea la etiqueta del origen.
     * 
     * @param etiquetaOrigen Etiqueta del origen
     */
    @Override
    public void setEtiquetaOrigen(Comparable etiquetaOrigen) {
        this.etiquetaOrigen = etiquetaOrigen;
    }

    /**
     * Obtiene la etiqueta del destino de la arista.
     * 
     * @return Origen de la arista
     */
    @Override
    public Comparable getEtiquetaDestino() {
        return etiquetaDestino;
    }
    
    /**
     * Setea la etiqueta del destino.
     * 
     * @param etiquetaDestino Etiqueta del destino
     */
    @Override
    public void setEtiquetaDestino(Comparable etiquetaDestino) {
        this.etiquetaDestino = etiquetaDestino;
    }

    /**
     * Obtiene el costo de la arista.
     * El valor del costo puede representar cualquier propiedad
     * que se desee usar como comparable. Por ejemlo, tiempo, precio
     * distancia...
     * 
     * @return Costo de la arista
     */
    @Override
    public double getCosto() {
        return costo;
    }

    /**
     * Setea el costo de la arista.
     * 
     * @param costo Valor de la propiedad que se desea usar como costo
     */    
    @Override
    public void setCosto(double costo) {
        this.costo = costo;
    }
    // FIN GETTERS Y SETTERS ******************************
    
}
