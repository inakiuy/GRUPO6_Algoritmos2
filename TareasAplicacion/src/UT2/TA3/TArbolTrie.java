package UT2.TA3;



import java.util.LinkedList;


public class TArbolTrie {

    private TNodoTrie raiz;

    public void insertar(String palabra) {
        if (raiz == null) {
            raiz = new TNodoTrie();
        }
        raiz.insertar(palabra);
    }
    
    public void imprimir() {
        if (raiz != null) {
            raiz.imprimir();
        }
    }
    
    public LinkedList<String> predecir1(String prefijo) {
        LinkedList<String> resultado = new LinkedList<>();;
        if (raiz != null){
            raiz.predecir1(prefijo, prefijo, resultado, raiz);
        }
        return resultado;
    }
   /* public LinkedList<String> predecir2(String prefijo) {
        if (prefijo != ""){
            LinkedList<String> palabras = new LinkedList<>();
            TNodoTrie nodo = raiz.dameNodo(prefijo);
            return nodo.predecir2(prefijo, palabras, nodo);
        }
        return null;
    }*/
}
