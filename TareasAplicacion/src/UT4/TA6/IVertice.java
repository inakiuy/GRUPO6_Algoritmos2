package UT4.TA6;


import java.util.Collection;
import java.util.LinkedList;

/**
 *
 * @author Ernesto
 */
public interface IVertice {

    /**
     * Obtener etiqueta del vertice
     * 
     * @return 
     */    
    Comparable getEtiqueta();    

    /**
     * Obtener todas las adyacencias
     * 
     * @return 
     */    
    LinkedList<TAdyacencia> getAdyacentes();
    
     /**
     * Setea el vertice como vicitado o no visitado
     * 
     * @param valor True:visitado - False:No Visitado
     */
    void setVisitado(boolean valor);  
    
    /**
     * Obtiene si el vertice fue visitado o no
     * 
     * @return 
     */    
    boolean getVisitado();
    
    /**
     * Obtiene los datos almacenados en el vertice
     * 
     * @return 
     */    
    Object getDatos();    
    
    /**
     * Inserta una adyacencia que refiere al vertice de destino dado.
     * 
     * @param costo Costo de la adyacencia (distancia, tiempo, dinero)
     * @param verticeDestino Vertice al que se desea generar una adyacencia
     * @return True si la insericion es correcta
     */    
    boolean insertarAdyacencia(Double costo, TVertice verticeDestino);   
    
    /**
     * Elimina una adyacencia dado el nombre del destino que se desea
     * eliminar.
     * 
     * @param nomVerticeDestino Nombre del vertice de destino.
     * @return True si la insericion es correcta
     */    
    boolean eliminarAdyacencia(Comparable nomVerticeDestino);    
    
    /**
     * Devuelve la adyacencia al vertice de destino deseado.
     * 
     * @param verticeDestino Vertice de destino al cual refiera la adyacencia
     * @return Retorna una TAdyacencia si es encontrado o null si no existe adyacencia
     */    
    TAdyacencia buscarAdyacencia(TVertice verticeDestino);

    /**
     * Dada una etiqueta, busca dontre de la colecion de adyacencias dicha
     * adyacencia.
     * 
     * @param etiquetaDestino Etiqueta del destino de la adyacencia
     * @return Retorna una adyacencia o null si no es encontrada
     */
    TAdyacencia buscarAdyacencia(Comparable etiquetaDestino);

     /**
     * Obtiene el primer vertice de la coleccion de adyacencias.
     * 
     * @return Primer vertice de destino.
     */   
    TVertice primerAdyacente();
    
    /**
     * Una Búsqueda en profundidad (en inglés DFS o Depth First Search) es un
     * algoritmo que permite recorrer todos los nodos de un grafo o árbol
     * (teoría de grafos) de manera ordenada, pero no uniforme. Su funcionamiento
     * consiste en ir expandiendo todos y cada uno de los nodos que va localizando,
     * de forma recurrente, en un camino concreto. Cuando ya no quedan más nodos
     * que visitar en dicho camino, regresa (Backtracking), de modo que repite
     * el mismo proceso con cada uno de los hermanos del nodo ya procesado
     * 
     * Sería el análogo a una recorrida en preorden.
     * 
     * @param visitados 
     */    
    public void bpf(Collection<Comparable> visitados);

    /**
     * Obtiene todos los caminos posibles hasta el vertice dado.
     * 
     * @param etVertDest Etiqueta del vertice de destino
     * @param caminoPrevio Camino ya recorrido
     * @param todosLosCaminos Variable que acumula los caminos
     * @return 
     */    
    public TCaminos todosLosCaminos(Comparable etVertDest, TCamino caminoPrevio, TCaminos todosLosCaminos);
    
    Double obtenerCostoAdyacencia(TVertice verticeDestino);







   
   
   public boolean tieneCiclo(TCamino camino);
}
