/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trie.grupal.inaki;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Inaki
 */
public class TArbolTrieTest {
    
    private TArbolTrie arbol0;
    private TNodoTrie raiz, nodo1, nodo2, nodo3, nodo4, nodo5;
    
    public TArbolTrieTest() {

    }

    @Before
    public void setUp() throws Exception {
        arbol0 = new TArbolTrie();
        
        //Armamos a mano una serie de nodos de acuerdo al algoritmo.
        //Se usara para hacer los tests.
        //palabras "aca", "acab" y "aco"
        raiz = new TNodoTrie("");
        nodo1 = new TNodoTrie("a");
        raiz.setHijo(nodo1, 0);
        nodo2 = new TNodoTrie("ac");
        nodo1.setHijo(nodo2, 2);
        nodo3 = new TNodoTrie("aca");
        nodo2.setHijo(nodo3, 0);
        nodo3.setEsPalabra(true);
        nodo4 = new TNodoTrie("acab");
        nodo4.setEsPalabra(true);
        nodo3.setHijo(nodo4, 1);
        nodo3.setEsPalabra(true);
        nodo5 = new TNodoTrie("aco");
        nodo2.setHijo(nodo5, 14);
        nodo5.setEsPalabra(true);
        
        arbol0.setRaiz(raiz);
    }

    /**
     * Test of insertar method, of class TArbolTrie.
     */
    @Test
    public void testInsertar() {
        System.out.println("insertar - \"cocoa\"");
        String palabra = "cocoa";
        TArbolTrie instance = arbol0;
        System.out.println(instance.imprimir());
        instance.insertar(palabra,"4,6,8");
        assertEquals("aca acab aco cocoa", instance.imprimir());
    }

    /**
     * Test of imprimir method, of class TArbolTrie.
     */
    @Test
    public void testImprimir() {
        System.out.println("imprimir");
        TArbolTrie instance = arbol0;
        assertEquals("aca acab aco", instance.imprimir());
    }

    /**
     * Test of buscar method, of class TArbolTrie.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        String unaPalabra = "aca";
        TArbolTrie instance = arbol0;
        boolean result0 = instance.buscar(unaPalabra);
        assertTrue(result0);
        
        String otraPalabra = "casa";
        boolean result1 = instance.buscar(otraPalabra);
        assertFalse(result1);
    }
    
}
