package UT4.TA6;


import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class TGrafoDirigido implements IGrafoDirigido {

    /******************************************************
    **  ATRIBUTOS
    ******************************************************/
    private Map<Comparable, TVertice> vertices; //lista de vertices del grafo.-
    // FIN ATRIBUTOS **************************************
    
    
    /******************************************************
    **  CONSTRUCTORES
    ******************************************************/
    
    /**
     * El grafo se puede representar como un conjunto de vertices y un conjunto
     * de aristas. El constructor insterta primero todos los vertices y luego
     * los relaciona usando la colleccion de aristas.
     * 
     * @param vertices Coleccion de vertices
     * @param aristas Coleccion de aristas
     */
    public TGrafoDirigido(Collection<TVertice> vertices, Collection<TArista> aristas) {
        this.vertices = new HashMap<>();
        for (TVertice vertice : vertices) {
            insertarVertice(vertice);
        }
        for (TArista arista : aristas) {
            insertarArista(arista);
        }
    }
    // FIN CONSTRUCTORES **********************************
    
    
    /******************************************************
    **  GETTERS Y SETTERS
    ******************************************************/
    
    /**
     * Obtiene un map de vertices
     * 
     * @return map de vertices
     */
    @Override
    public Map<Comparable, TVertice> getVertices() {
        return vertices;
    }    
    
    /**
     * Obtiene un array ordenado con las etiquetas de los vertices
     * 
     * @return Array de etiquetas de vertices ordenadas
     */
    @Override
    public Object[] getEtiquetasOrdenado() {
        TreeMap<Comparable, TVertice> mapOrdenado = new TreeMap<>(this.getVertices());
        return mapOrdenado.keySet().toArray();
    }    
    // FIN GETTERS Y SETTERS ******************************
    
    
    /******************************************************
    **  METODOS
    ******************************************************/
    
    /**
     * Matodo encargado de insertar una arista en el grafo (con un cierto
     * costo), dado su vertice origen y destino.- Para que la arista sea valida,
     * se deben cumplir los siguientes casos: 1) Las etiquetas pasadas por
     * parametros son v�lidas.- 2) Los vertices (origen y destino) existen
     * dentro del grafo.- 3) No es posible ingresar una arista ya existente
     * (miso origen y mismo destino, aunque el costo sea diferente).- 4) El
     * costo debe ser mayor que 0.
     *
     * @return True si se pudo insertar la adyacencia, false en caso contrario
     */
    @Override
    public boolean insertarArista(TArista arista) {
        if ((arista.getEtiquetaOrigen() != null) && (arista.getEtiquetaDestino() != null)) {
            TVertice vertOrigen = buscarVertice(arista.getEtiquetaOrigen());
            TVertice vertDestino = buscarVertice(arista.getEtiquetaDestino());
            if ((vertOrigen != null) && (vertDestino != null)) {
                return vertOrigen.insertarAdyacencia(arista.getCosto(), vertDestino);
            }
        }
        return false;
    }
    
    /**
     * Metodo encargado de eliminar una arista dada por un origen y destino. En
     * caso de no existir la adyacencia, retorna falso. En caso de que las
     * etiquetas sean invalidas, retorna falso.
     *
     */
    @Override
    public boolean eliminarArista(Comparable nomVerticeOrigen, Comparable nomVerticeDestino) {
        if ((nomVerticeOrigen != null) && (nomVerticeDestino != null)) {
            TVertice vertOrigen = buscarVertice(nomVerticeOrigen);
            if (vertOrigen != null) {
                return vertOrigen.eliminarAdyacencia(nomVerticeDestino);
            }
        }
        return false;
    }
    
    /**
     * Metodo encargado de verificar la existencia de una arista. Las etiquetas
     * pasadas por par�metro deben ser v�lidas.
     *
     * @return True si existe la adyacencia, false en caso contrario
     */
    @Override
    public boolean existeArista(Comparable etiquetaOrigen, Comparable etiquetaDestino) {
        TVertice vertOrigen = buscarVertice(etiquetaOrigen);
        TVertice vertDestino = buscarVertice(etiquetaDestino);
        if ((vertOrigen != null) && (vertDestino != null)) {
            return vertOrigen.buscarAdyacencia(vertDestino) != null;
        }
        return false;
    }
    
    /**
     * Metodo encargado de insertar un vertice en el grafo.
     *
     * No pueden ingresarse vertices con la misma etiqueta. La etiqueta
     * especificada como parametro debe ser valida.
     *
     * @param unaEtiqueta Etiqueta del vertice a ingresar.
     * @return True si se pudo insertar el vertice, false en caso contrario
     */
    @Override
    public boolean insertarVertice(Comparable unaEtiqueta) {
        if ((unaEtiqueta != null) && (!existeVertice(unaEtiqueta))) {
            TVertice vert = new TVertice(unaEtiqueta);
            getVertices().put(unaEtiqueta, vert);
            return getVertices().containsKey(unaEtiqueta);
        }
        return false;
    }

    /**
     * Metodo encargado de insertar un vertice en el grafo.
     * 
     * No se pueden insertar vertices con la misma etiqueta.
     * 
     * @param vertice Vertice a insertar
     * @return True si la insercion se realizo correctamente
     */
    @Override
    public boolean insertarVertice(TVertice vertice) {
        Comparable unaEtiqueta = vertice.getEtiqueta();
        if ((unaEtiqueta != null) && (!existeVertice(unaEtiqueta))) {
            getVertices().put(unaEtiqueta, vertice);
            return getVertices().containsKey(unaEtiqueta);
        }
        return false;
    }
    
    /**
     * Metodo encargado de eliminar un vertice en el grafo. En caso de no
     * existir el v�rtice, retorna falso. En caso de que la etiqueta sea
     * invalida, retorna false.
     *
     */
    @Override
    public boolean eliminarVertice(Comparable nombreVertice) {
        if (nombreVertice != null) {
            getVertices().remove(nombreVertice);
            return getVertices().containsKey(nombreVertice);
        }
        return false;
    }    

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
    @Override
    public boolean existeVertice(Comparable unaEtiqueta) {
        return getVertices().get(unaEtiqueta) != null;
    }

    /**
     * Metodo encargado de verificar buscar un vertice dentro del grafo.-
     *
     * La etiqueta especificada como parametro debe ser valida.
     *
     * @param unaEtiqueta Etiqueta del v�rtice a buscar.-
     * @return El vertice encontrado. En caso de no existir, retorna nulo.
     */
    private TVertice buscarVertice(Comparable unaEtiqueta) {
        return getVertices().get(unaEtiqueta);
    }    

    /**
     * El algoritmo de Floyd genera la matriz de costos
     * 
     * @return Matriz de costos
     */
    public Double[][] floyd() {
        Double[][] matrizCostos = UtilGrafos.obtenerMatrizCostos(getVertices());
        for (int k = 0; k < matrizCostos.length; k++) {
            for (int i = 0; i < matrizCostos.length; i++) {
                for (int j = 0; j < matrizCostos.length; j++) {
                    if ((i != k) && (k != j) && (i != j)) {
                        double costoIK = matrizCostos[i][k];
                        double costoKJ = matrizCostos[k][j];
                        double costoIJ = matrizCostos[i][j];
                        if (!((costoIK == Double.MAX_VALUE) || (costoKJ == Double.MAX_VALUE))) {
                            matrizCostos[i][j] = Math.min(costoIJ, (costoIK + costoKJ));
                        }
                    }
                }
            }
        }
        return matrizCostos;
    }

    /**
     * Genera la matriz de warshall
     * 
     * @return 
     */
    public boolean[][] warshall() {
        Double[][] matrizCostos = UtilGrafos.obtenerMatrizCostos(getVertices());
        boolean[][] matrizWarshall = new boolean[matrizCostos.length][matrizCostos.length];
        for (int i = 0; i < matrizCostos.length; i++) {
            for (int j = 0; j < matrizCostos.length; j++) {
                matrizWarshall[i][j] = false;

                if (i != j && matrizCostos[i][j] != Integer.MAX_VALUE) {
                    matrizWarshall[i][j] = true;
                }
            }
        }
        for (int k = 0; k < matrizWarshall.length; k++) {
            for (int i = 0; i < matrizWarshall.length; i++) {
                for (int j = 0; j < matrizWarshall.length; j++) {
                    if ((i != k) && (k != j) && (i != j)) {
                        if (!matrizWarshall[i][j]) {
                            matrizWarshall[i][j] = matrizWarshall[i][k] && matrizWarshall[k][j];
                        }
                    }
                }
            }
        }
        return matrizWarshall;
    }

    /**
     * Se define como la máxima de todas las longitudes mínimas de los caminos
     * entre cada uno de los otros nodos y el nodo v.
     * 
     * @param etiquetaVertice
     * @return 
     */
    @Override
    public Double obtenerExcentricidad(Comparable etiquetaVertice) {
        Double resultado = 0d;
        Double matrizCaminosMinimos[][] = floyd();
        TVertice origen = getVertices().get(etiquetaVertice);
        //para conocer el indice en la matriz del vertice seleccionado como origen
        int indiceOrigen = 0;
        for (Comparable auxiliarContar : getVertices().keySet()) {
            if (auxiliarContar == origen.getEtiqueta()) {
                break;
            }
            indiceOrigen++;
        }

        for (int x = 0; x < matrizCaminosMinimos.length; x++) {
            Double camino = matrizCaminosMinimos[x][indiceOrigen];
            if (camino == null) {
                camino = Double.MAX_VALUE;
            }
            if (x != indiceOrigen && resultado.compareTo(camino) < 0) {
                resultado = camino;
            }
        }
        return resultado;
    }

    /**
     * El centro del grafo es un vértice de mínima exentricidad.
     * 
     * @return Etiqueta del centro del grafo
     */
    @Override
    public Comparable centroDelGrafo() {
        Double menorExcentricidad = Double.MAX_VALUE;
        Comparable etiquetaMenorEx = null;
        for (Comparable etiqueta : getVertices().keySet()) {
            Double excentricidadVert = obtenerExcentricidad(etiqueta);
            if (menorExcentricidad.compareTo(excentricidadVert) > 0) {
                menorExcentricidad = excentricidadVert;
                etiquetaMenorEx = etiqueta;
            }
        }
        return etiquetaMenorEx;
    }    

    /**
     * Funcion para setear 'visitado' en false para todos los vertices.
     * 
     */
    @Override
    public void desvisitarVertices() {
        for (TVertice vertice : this.vertices.values()) {
            vertice.setVisitado(false);
        }
    }
    
    /**
     * BPF del grafo a partir de un vertice, para todos los vertices
     * 
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
     * @param vertice
     * @return 
     */
    @Override
    public Collection<Comparable> bpf(TVertice vertice) {
        Collection<Comparable> listaBpf = new LinkedList<>();
        if (vertice != null) {
            vertice.bpf(listaBpf);
        }
        return listaBpf;
    }

    /**
     * BPF del grafo a partir del vertice con etiquetaOrigen, para todos los vertices
     * 
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
     * @param etiquetaOrigen
     * @return 
     */
    @Override
    public Collection<Comparable> bpf(Comparable etiquetaOrigen) {
        Collection<Comparable> listaBpf = new LinkedList<>();
        TVertice origen = vertices.get(etiquetaOrigen);
        if (origen != null) {
            origen.bpf(listaBpf);
        }
        return listaBpf;
    }

    /**
     * BPF del grafo a partir del vertice con etiquetaOrigen, para todos los vertices
     * 
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
     * @return 
     */
    @Override
    public Collection<Comparable> bpf() {
        Collection<Comparable> listaBpf = new LinkedList<>();
        if (vertices.isEmpty()) {
            System.out.println("El grafo está vacio");
        } else {
            for (TVertice vertV : vertices.values()) {
                if (!vertV.getVisitado()) {
                    vertV.bpf(listaBpf);
                }
            }
        }
        return listaBpf;
    }

    /**
     * Busca todos los caminos posibles entre etiquetaOrigen y etiquetaDestino.
     * 
     * @param etiquetaOrigen
     * @param etiquetaDestino
     * @return Un array con las claves de los vertices que componen el mejor
     * camino, en caso de que exista
     */
    @Override
    public TCaminos todosLosCaminos(Comparable etiquetaOrigen, Comparable etiquetaDestino) {
        TCaminos todosLosCaminos = new TCaminos();
        TVertice v = buscarVertice(etiquetaOrigen);
        if (v != null) {
            TCamino caminoPrevio = new TCamino(v);
            v.todosLosCaminos(etiquetaDestino, caminoPrevio, todosLosCaminos);
            return todosLosCaminos;
        }
        return null;
    }   

    /**
     * 
     * 
     * @param camino
     * @return 
     */
    @Override
    public boolean tieneCiclo(TCamino camino) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * 
     * 
     * @param etiquetaOrigen
     * @return 
     */
    @Override
    public boolean tieneCiclo(Comparable etiquetaOrigen) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * 
     * 
     * @return 
     */
    @Override
    public boolean tieneCiclo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    // FIN METODOS ****************************************
    
}
