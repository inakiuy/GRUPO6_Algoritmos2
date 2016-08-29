/*
 * - Se le agrego la interfaz INodoTrie para que en caso de que se desarrolle con
 * TDA, y luego se quiera cambiar por otro, el cambio sea sencillo.
 * - Se modificó el "imprimir" para que devuelva un strig y así poder usarlo en los
 * casos de prueba como metodo comparativo.
 * - Se le agrego una etiqueta al nodo para poder identificarlo
 */
package trie.grupal.inaki;

/**
 *
 * @autor: Luis Tito
 */
public class TNodoTrie implements INodoTrie {

    /**
     * Atributos
     */
    private Comparable etiqueta;
    private final TNodoTrie[] hijos;
    private boolean esPalabra;
    private static final int CANT_CHR_ABECEDARIO = 26;

    /**
     * Constructor
     * @param etiqueta 
     */
    public TNodoTrie(Comparable etiqueta) {
        this.etiqueta = etiqueta.toString();
        this.hijos = new TNodoTrie[CANT_CHR_ABECEDARIO];
        this.esPalabra = false;
    }
    
    /**
     * Retorna el array de hijos
     * @return 
     */
    @Override
    public TNodoTrie[] getHijos(){
        return this.hijos;
    }
    
    /**
     * Retorna la etiqueta del nodo
     * @return String etiqueta 
     */
    private String getEtiqueta(){
        return this.etiqueta.toString();
    }
    
    /**
     * @autor: Luis Tito Busca de manera iterativa una palabra y en el último
     * nodo, devuvelve si es palabra.
     * @param unaPalabra
     * @return
     */
    @Override
    public boolean buscar(String unaPalabra) {
        TNodoTrie nodo = this;
        for (int c = 0; c < unaPalabra.length(); c++) {
            System.out.println("busco la letra " + unaPalabra.charAt(c));
            int indice = unaPalabra.charAt(c) - 'a';
            if (nodo.hijos[indice] == null) {
                return false;
            }
            nodo = nodo.hijos[indice]; // itera dentro del trie
        }
        return nodo.esPalabra;
    }

    /**
     * @autor: Luis Tito
     * @param unaPalabra Inserta una palabra del alfabeto ascci.
     */
    @Override
    public void insertar(String unaPalabra) {
        TNodoTrie nodo = this;
        for (int c = 0; c < unaPalabra.length(); c++) {
            int indice = unaPalabra.charAt(c) - 'a';
            if (nodo.hijos[indice] == null) {
                nodo.hijos[indice] = new TNodoTrie(unaPalabra.substring(0, c));
            }
            nodo = nodo.hijos[indice];
        }
        nodo.esPalabra = true;
    }

    /**
     * @return 
     * @autor: Luis Tito Método auxiliar para verificar trie
     */
    @Override
    public String imprimir() {
        return imprimir("", this).trim();
    }

    /**
     * @autor: Luis Tito Método auxiliar para imprimir y verificar.
     * @param s
     * @param nodo
     */
    private String imprimir(String s, TNodoTrie nodo) {
        String palabra = s;
        String resultado = "";
        if (nodo != null) {
            if (nodo.esPalabra) {
                resultado = palabra + " ";
            }
            for (int c = 0; c < CANT_CHR_ABECEDARIO; c++) {
                if (nodo.hijos[c] != null) {
                    
                    resultado += imprimir(s + (char) (c + 'a'), nodo.hijos[c]);
                }
            }
        }
        return resultado;
    }
    
    /**
     * SOLO PARA CASOS DE PRUEBA. 
     */
    
    /**
     * Metodo para insertar un hijo donde querramos. Es usado para armar un arbol a mano
     * y así probar los metodos.
     * Solo debe ser usado para los testcases.
     * @param unHijo
     * @param unIndice 
     */
    public void setHijo(TNodoTrie unHijo, int unIndice){
        this.hijos[unIndice] = unHijo;
    }
    
    /**
     * Metodo para setear a mano la propiedad de "es palabra".
     * Solo debe ser usado para los testcases.
     * @param state 
     */
    public void setEsPalabra(boolean state){
        this.esPalabra = state;
    }
}
