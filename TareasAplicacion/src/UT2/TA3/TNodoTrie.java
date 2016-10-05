package UT2.TA3;



import java.util.LinkedList;

public class TNodoTrie {

    private static final int CANT_CHR_ABECEDARIO = 26;
    private TNodoTrie[] hijos;
    private boolean esPalabra;

    public TNodoTrie() {
        hijos = new TNodoTrie[CANT_CHR_ABECEDARIO];
        esPalabra = false;
    }

    public void insertar(String unaPalabra) {
        TNodoTrie nodo = this;
        for (int c = 0; c < unaPalabra.length(); c++) {
            int indice = unaPalabra.charAt(c) - 'a';
            if (nodo.hijos[indice] == null) {
                nodo.hijos[indice] = new TNodoTrie();
            }
            nodo = nodo.hijos[indice];
        }
        nodo.esPalabra = true;
    }

    public int buscar(String s) {
        TNodoTrie nodo = this;
        int temp = 0;
        for (int c = 0; c < s.length(); c++) {
            int indice = s.charAt(c) - 'a';
            temp++;
            if (nodo.hijos[indice] == null) {
                return -temp;
            }
            nodo = nodo.hijos[indice];
        }
        if (nodo.esPalabra) {
            return temp;
        }
        return -temp;
    }
    
    public void imprimir() {
        LinkedList<String> palabras = new LinkedList<String>();
        imprimir("", this, palabras);
        System.out.println(palabras.toString());
    }

    private void imprimir(String s, TNodoTrie nodo, LinkedList<String> palabras ) {
        String palabra = s;
        if (nodo != null) {
            if (nodo.esPalabra) {
                palabras.add(palabra);
                System.out.println(s);// punerlo a linked list
            }
            for (int c = 0; c < CANT_CHR_ABECEDARIO; c++) {
                if (nodo.hijos[c] != null) {
                    
                    imprimir(s + (char) (c + 'a'), nodo.hijos[c], palabras);
                }
            }
        }
    }
    
     public void predecir1(String s, String prefijo, LinkedList<String> palabras, TNodoTrie nodo) {
        if (s.isEmpty()){
            imprimir(prefijo, nodo, palabras);       
        }
        else {
            int indice = s.charAt(0) - 'a';
            if (nodo.hijos[indice] != null) {
                nodo.predecir1(s.substring(1), prefijo, palabras, nodo.hijos[indice]);
            }
        }
    }
}
