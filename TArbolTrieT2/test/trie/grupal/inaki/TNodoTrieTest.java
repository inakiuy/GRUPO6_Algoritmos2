package trie.grupal.inaki;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Inaki
 */
public class TNodoTrieTest {
    
    private TNodoTrie raiz, nodo1, nodo2, nodo3, nodo4, nodo5;
    
    public TNodoTrieTest() {
    }

    @Before
    public void setUp() throws Exception {
        
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
    }
    
    /**
     * Test of imprimir method, of class TNodoTrie.
     */
    @Test
    public void testImprimir() {
        System.out.println("imprimir");
        TNodoTrie instance = raiz;
        String resultado = instance.imprimir();
        assertEquals("aca acab aco", resultado);
    }
    
    /**
     * Test of buscar method, of class TNodoTrie.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        String unaPalabra = "aca";
        boolean result0 = raiz.buscar(unaPalabra);
        assertTrue(result0);
        
        String otraPalabra = "casa";
        boolean result1 = raiz.buscar(otraPalabra);
        assertFalse(result1);
    }

    /**
     * Test of insertar method, of class TNodoTrie.
     */
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        String unaPalabra = "andorra";
        TNodoTrie instance = raiz;
        instance.insertar(unaPalabra);
        assertEquals("aca acab aco andorra", raiz.imprimir());
    }
}
