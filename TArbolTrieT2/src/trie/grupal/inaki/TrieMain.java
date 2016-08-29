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
        trie.insertar("","0");
        trie.insertar("banana","4");
        trie.insertar("arbol","4");
        trie.insertar("gol","6,8");
        trie.insertar("arbolado","6,10,14");
        trie.insertar("HOLA","5,7,13");
        
        String resultado = trie.imprimir();
        System.out.println(resultado);
        if (!(trie.buscar("bana"))) {
            System.out.println("No encontró");
        }
    }
}
