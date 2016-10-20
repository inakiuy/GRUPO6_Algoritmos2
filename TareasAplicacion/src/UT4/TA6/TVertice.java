package UT4.TA6;


import java.util.Collection;
import java.util.LinkedList;

public class TVertice implements IVertice{

    /******************************************************
    **  ATRIBUTOS
    ******************************************************/
    private Comparable etiqueta;
    private LinkedList<TAdyacencia> adyacentes;
    private boolean visitado;
    private Object datos;
    // FIN ATRIBUTOS **************************************

    
    
    /******************************************************
    **  CONSTRUCTORES
    ******************************************************/
    
    /**
     * Constructor de vertice 
     * 
     * @param unaEtiqueta 
     */
    public TVertice(Comparable unaEtiqueta) {
        this.etiqueta = unaEtiqueta;
        adyacentes = new LinkedList();
        visitado = false;
    }
    // FIN CONSTRUCTORES **********************************    
    
    
    
    /******************************************************
    **  GETTERS Y SETTERS
    ******************************************************/
    
    /**
     * Obtener etiqueta del vertice
     * 
     * @return 
     */
    @Override
    public Comparable getEtiqueta() {
        return etiqueta;
    }

    /**
     * Obtener todas las adyacencias
     * 
     * @return 
     */
    @Override
    public LinkedList<TAdyacencia> getAdyacentes() {
        return adyacentes;
    }

    /**
     * Setea el vertice como vicitado o no visitado
     * 
     * @param valor True:visitado - False:No Visitado
     */
    @Override
    public void setVisitado(boolean valor) {
        this.visitado = valor;
    }

    /**
     * Obtiene si el vertice fue visitado o no
     * 
     * @return 
     */
    @Override
    public boolean getVisitado() {
        return this.visitado;
    }

    /**
     * Obtiene los datos almacenados en el vertice
     * 
     * @return 
     */
    @Override
    public Object getDatos() {
        return datos; 
    }    
    // FIN GETTERS Y SETTERS ******************************    


    
    /******************************************************
    **  METODOS
    ******************************************************/    
    
    /**
     * Inserta una adyacencia que refiere al vertice de destino dado.
     * 
     * @param costo Costo de la adyacencia (distancia, tiempo, dinero)
     * @param verticeDestino Vertice al que se desea generar una adyacencia
     * @return True si la insericion es correcta
     */
    @Override
    public boolean insertarAdyacencia(Double costo, TVertice verticeDestino) {
        if (buscarAdyacencia(verticeDestino) == null) {
            TAdyacencia ady = new TAdyacencia(costo, verticeDestino);
            return adyacentes.add(ady);
        }
        return false;
    }

    /**
     * Elimina una adyacencia dado el nombre del destino que se desea
     * eliminar.
     * 
     * @param nomVerticeDestino Nombre del vertice de destino.
     * @return True si la insericion es correcta
     */
    @Override
    public boolean eliminarAdyacencia(Comparable nomVerticeDestino) {
        TAdyacencia ady = buscarAdyacencia(nomVerticeDestino);
        if (ady != null) {
            adyacentes.remove(ady);
            return true;
        }
        return false;
    }
    
    /**
     * Devuelve la adyacencia al vertice de destino deseado.
     * 
     * @param verticeDestino Vertice de destino al cual refiera la adyacencia
     * @return Retorna una TAdyacencia si es encontrado o null si no existe adyacencia
     */
    @Override
    public TAdyacencia buscarAdyacencia(TVertice verticeDestino) {
        if (verticeDestino != null) {
            return buscarAdyacencia(verticeDestino.getEtiqueta());
        }
        return null;
    }

    /**
     * Dado un vertice de destino, obtiene el costo asociado a esa adyacencia.
     * 
     * @param verticeDestino Vertice de destino objetivo
     * @return Retorna el costo de la adyacencia. Si la misma no existe, retorna
     *         el valor maximo del double
     */
    @Override
    public Double obtenerCostoAdyacencia(TVertice verticeDestino) {
        TAdyacencia ady = buscarAdyacencia(verticeDestino);
        if (ady != null) {
            return ady.getCosto();
        }
        return Double.MAX_VALUE;
    }
    
    /**
     * Dada una etiqueta, busca dontre de la colecion de adyacencias dicha
     * adyacencia.
     * 
     * @param etiquetaDestino Etiqueta del destino de la adyacencia
     * @return Retorna una adyacencia o null si no es encontrada
     */
    @Override
    public TAdyacencia buscarAdyacencia(Comparable etiquetaDestino) {
        for (TAdyacencia adyacencia : adyacentes) {
            if (adyacencia.getDestino().getEtiqueta().compareTo(etiquetaDestino) == 0) {
                return adyacencia;
            }
        }
        return null;
    } 
    
    /**
     * Obtiene el primer vertice de la coleccion de adyacencias.
     * 
     * @return Primer vertice de destino.
     */
    @Override
    public TVertice primerAdyacente() {
        if (this.adyacentes.getFirst() != null) {
            return this.adyacentes.getFirst().getDestino();
        }
        return null;
    }
    
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
    @Override
    public void bpf(Collection<Comparable> visitados) {
        setVisitado(true);
        visitados.add(this.getEtiqueta());
        for (TAdyacencia adyacente : adyacentes) {
            TVertice vertAdy = adyacente.getDestino();
            if (!vertAdy.getVisitado()) {
                vertAdy.bpf(visitados);
            }
        }
    }

    /**
     * Obtiene todos los caminos posibles hasta el vertice dado.
     * 
     * @param etVertDest Etiqueta del vertice de destino
     * @param caminoPrevio Camino ya recorrido
     * @param todosLosCaminos Variable que acumula los caminos
     * @return 
     */
    @Override
    public TCaminos todosLosCaminos(Comparable etVertDest, TCamino caminoPrevio, TCaminos todosLosCaminos) {
            this.setVisitado(true);
            for (TAdyacencia adyacencia : this.getAdyacentes()) {
                TVertice destino = adyacencia.getDestino();
                if (!destino.getVisitado()) {
                    if (destino.getEtiqueta().compareTo(etVertDest) == 0) {
                        TCamino copia = caminoPrevio.copiar();
                        copia.agregarAdyacencia(adyacencia);
                        todosLosCaminos.getCaminos().add(copia);
                    } else {
                        caminoPrevio.agregarAdyacencia(adyacencia);
                        destino.todosLosCaminos(etVertDest, caminoPrevio, todosLosCaminos);
                        caminoPrevio.eliminarAdyacencia(adyacencia);
                    }
                }
            }
            this.setVisitado(false);
            return todosLosCaminos;
        }    

    /**
     * 
     * @param camino
     * @return 
     */
    @Override
    public boolean tieneCiclo(TCamino camino) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    // FIN METODOS ****************************************

}
