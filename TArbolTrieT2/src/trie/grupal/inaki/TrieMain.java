/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trie.grupal.inaki;

/**
 *
 * @author Luis Tito
 */
public class TrieMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TArbolTrie trie = new TArbolTrie();
        trie.insertar("");
        trie.insertar("banana");
        trie.insertar("arbol");
        trie.insertar("gol");
        trie.insertar("arbolado");
        trie.insertar("HOLA");
        
        String resultado = trie.imprimir();
        System.out.println(resultado);
        if (!(trie.buscar("bana"))) {
            System.out.println("No encontró");
        }
    }
}
