package UT2.TA3;


import java.util.LinkedList;


public class Main {

    /**
     * @param args
     */
    public static void main(String[] args){
        TArbolTrie trie = new TArbolTrie();

        String[] palabrasclave = ManejadorArchivosGenerico.leerArchivo("./src/UT2/TA3/palabras1.txt");
        for (String p : palabrasclave) {
                trie.insertar(p);
        }
        System.out.println(trie.predecir1("de").toString());
        trie.imprimir();
    }
}
