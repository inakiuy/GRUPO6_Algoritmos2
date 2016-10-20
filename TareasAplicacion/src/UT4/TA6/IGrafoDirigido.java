package UT4.TA6;


import java.util.Collection;
import java.util.Map;

public interface IGrafoDirigido {

    /**
     * Obtiene un map de vertices
     * 
     * @return map de vertices
     */
    public Map<Comparable, TVertice> getVertices();
    
    /**
     * Obtiene un array ordenado con las etiquetas de los vertices
     * 
     * @return Array de etiquetas de vertices ordenadas
     */
    public Object[] getEtiquetasOrdenado();
    
    /**
     * Matodo encargado de insertar una arista en el grafo (con un cierto
     * costo), dado su vertice origen y destino.- Para que la arista sea valida,
     * se deben cumplir los siguientes casos: 1) Las etiquetas pasadas por
     * parametros son v�lidas.- 2) Los vertices (origen y destino) existen
     * dentro del grafo.- 3) No es posible ingresar una arista ya existente
     * (miso origen y mismo destino, aunque el costo sea diferente).- 4) El
     * costo debe ser mayor que 0.
     *
     * @param arista
     * @return True si se pudo insertar la adyacencia, false en caso contrario
     */
    public boolean insertarArista(TArista arista);
    
    /**
     * Metodo encargado de eliminar una arista dada por un origen y destino. En
     * caso de no existir la adyacencia, retorna falso. En caso de que las
     * etiquetas sean invalidas, retorna falso.
     *
     * @param nomVerticeOrigen
     * @param nomVerticeDestino
     * @return 
     */
    public boolean eliminarArista(Comparable nomVerticeOrigen, Comparable nomVerticeDestino);
    
    
       /**
     * Metodo encargado de verificar la existencia de una arista. Las etiquetas
     * pasadas por par�metro deben ser v�lidas.
     *
     * @param etiquetaOrigen
     * @param etiquetaDestino
     * @return True si existe la adyacencia, false en caso contrario
     */
    public boolean existeArista(Comparable etiquetaOrigen, Comparable etiquetaDestino);
    
    /**
     * Metodo encargado de insertar un vertice en el grafo.
     *
     * No pueden ingresarse vertices con la misma etiqueta. La etiqueta
     * especificada como parametro debe ser valida.
     *
     * @param unaEtiqueta Etiqueta del vertice a ingresar.
     * @return True si se pudo insertar el vertice, false en caso contrario
     */
    public boolean insertarVertice(Comparable unaEtiqueta);
    
    /**
     * Metodo encargado de insertar un vertice en el grafo.
     * 
     * No se pueden insertar vertices con la misma etiqueta.
     * 
     * @param vertice Vertice a insertar
     * @return True si la insercion se realizo correctamente
     */
    public boolean insertarVertice(TVertice vertice);
    
    /**
     * Metodo encargado de eliminar un vertice en el grafo. En caso de no
     * existir el vertice, retorna falso. En caso de que la etiqueta sea
     * invalida, retorna false.
     *
     * @param nombreVertice
     * @return 
     */
    public boolean eliminarVertice(Comparable nombreVertice);
    
    /**
     * Metodo encargado de verificar la existencia de un vertice dentro del
     * grafo.-
     *
     * La etiqueta especificada como par�metro debe ser v�lida.
     *
     * @param unaEtiqueta Etiqueta del v�rtice a buscar.-
     * @return True si existe el vertice con la etiqueta indicada, false en caso
     * contrario
     */
    public boolean existeVertice(Comparable unaEtiqueta);
    
    /**
     * Se define como la máxima de todas las longitudes mínimas de los caminos
     * entre cada uno de los otros nodos y el nodo v.
     * 
     * @param etiquetaVertice
     * @return 
     */
    public Double obtenerExcentricidad(Comparable etiquetaVertice);
    
    /**
     * El centro del grafo es un vértice de mínima exentricidad.
     * 
     * @return Etiqueta del centro del grafo
     */
    public Comparable centroDelGrafo();
    
    /**
     * Funcion para setear 'visitado' en false para todos los vertices.
     * 
     */
    public void desvisitarVertices();
    
    /**
     * BPF del grafo a partir de un vertice, para todos los vertices
     * 
     * @param vertice
     * @return 
     */
    public Collection<Comparable> bpf(TVertice vertice);
    
    
    /**
     * BPF del grafo a partir del vertice con etiquetaOrigen, para todos los vertices
     * 
     * @param etiquetaOrigen
     * @return 
     */
    public Collection<Comparable> bpf(Comparable etiquetaOrigen);
    
    /**
     * BPF del grafo, a partir del primer vértice, para todos los vertices
     * 
     * @return 
     */
    public Collection<Comparable> bpf();
    
    /**
     * Busca todos los caminos posibles entre etiquetaOrigen y etiquetaDestino.
     * 
     * @param etiquetaOrigen
     * @param etiquetaDestino
     * @return Un array con las claves de los vertices que componen el mejor
     * camino, en caso de que exista
     */
    public TCaminos todosLosCaminos(Comparable etiquetaOrigen, Comparable etiquetaDestino);    
    
    
    public boolean tieneCiclo(TCamino camino);

    public boolean tieneCiclo(Comparable etiquetaOrigen);

    public boolean tieneCiclo();

}
