package tries.ucu;

import tries.ucu.TNodoTrie;

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
}
