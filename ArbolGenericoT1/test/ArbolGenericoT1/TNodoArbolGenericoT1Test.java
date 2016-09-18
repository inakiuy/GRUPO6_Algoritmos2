/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArbolGenericoT1;

import java.util.Arrays;
import java.util.LinkedList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Inaki
 */
public class TNodoArbolGenericoT1Test {
    
    public TNodoArbolGenericoT1Test() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of insertarDirecto method, of class TNodoArbolGenericoT1.
     */
    @Test
    public void testInsertar_Comparable_Comparable() {
        System.out.println("insertar");
        INodoArbolGenericoT1 raiz = new TNodoArbolGenericoT1("00");
        raiz.insertar("11", "00");
        raiz.insertar("10", "00");
        raiz.insertar("20", "10");

        LinkedList<String> listPreOrder = new LinkedList<>();
        LinkedList<String> expected = new LinkedList<>();
        String[] etiquetas = {"00","10","20","11"};
        expected.addAll(Arrays.asList(etiquetas));
        INodoArbolGenericoT1 instance = raiz;
        instance.preOrden(listPreOrder);
        assertEquals(expected.toString(), listPreOrder.toString());
    }

    /**
     * Test of eliminar method, of class TNodoArbolGenericoT1.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        INodoArbolGenericoT1 raiz = new TNodoArbolGenericoT1("00");
        raiz.insertar("11", "00");
        raiz.insertar("10", "00");
        raiz.insertar("20", "10");
        
        Comparable unaEtiqueta = null;
        TNodoArbolGenericoT1 instance = null;
        INodoArbolGenericoT1 expResult = null;
    }

    /**
     * Test of buscar method, of class TNodoArbolGenericoT1.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        //Creo nodos basicos
        TNodoArbolGenericoT1 raiz00 = new TNodoArbolGenericoT1("00");
        TNodoArbolGenericoT1 nodo10 = new TNodoArbolGenericoT1("10");
        TNodoArbolGenericoT1 nodo11 = new TNodoArbolGenericoT1("11");
        INodoArbolGenericoT1 nodo20 = new TNodoArbolGenericoT1("20");
        
        //Los encadeno con la funcion insertarDirecto de bajo nivel
        raiz00.insertarDirecto(nodo10, null);
        nodo10.insertarDirecto(nodo20, nodo11);
        
        //Busquedas satisfactorias
        String[] busquedasSatisfactorias = {"00","10","11", "20"};
        boolean result = true;
        for (String etiqueta:busquedasSatisfactorias){
            INodoArbolGenericoT1 busqueda = raiz00.buscar(etiqueta);
            if (busqueda == null){
                result = false;
            }
        }
        assertTrue(result);
        
        result = true;
        //Busquedas insatisfacotias
        String[] busquedasInsatisfactorias = {"01", "13", "0", "21", "33"};
        for (String etiqueta:busquedasInsatisfactorias){
            INodoArbolGenericoT1 busqueda = raiz00.buscar(etiqueta);
            if (busqueda != null){
                result = false;
            }
        }
        //Finalmente veo si el resultado esperado es TRUE
        assertTrue(result);
    }

    /**
     * Test of inOrden method, of class TNodoArbolGenericoT1.
     */
    @Test
    public void testInOrden() {
        System.out.println("inOrden");
        LinkedList<String> listInOrder = new LinkedList<>();
        TNodoArbolGenericoT1 instance = null;
        instance.inOrden(listInOrder);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of preOrden method, of class TNodoArbolGenericoT1.
     */
    @Test
    public void testPreOrden() {
        System.out.println("preOrden");
        //Creo nodos basicos
        TNodoArbolGenericoT1 raiz00 = new TNodoArbolGenericoT1("00");
        TNodoArbolGenericoT1 nodo10 = new TNodoArbolGenericoT1("10");
        TNodoArbolGenericoT1 nodo11 = new TNodoArbolGenericoT1("11");
        INodoArbolGenericoT1 nodo20 = new TNodoArbolGenericoT1("20");
        
        //Los encadeno con la funcion insertarDirecto de bajo nivel
        raiz00.insertarDirecto(nodo10, null);
        nodo10.insertarDirecto(nodo20, nodo11);
        
        //Si el resultado de aplicarle preOrden a lo insertado, conincide con el
        //preOrden del arbol testigo, se da por bueno.
        LinkedList<String> listPreOrder = new LinkedList<>();
        LinkedList<String> expected = new LinkedList<>();
        String[] etiquetas = {"00","10","20","11"};
        for (String aux:etiquetas){
            expected.add(aux);
        }
        TNodoArbolGenericoT1 instance = raiz00;
        instance.preOrden(listPreOrder);
        assertEquals(expected.toString(), listPreOrder.toString());
    }

    /**
     * Test of postOrden method, of class TNodoArbolGenericoT1.
     */
    @Test
    public void testPostOrden() {
        System.out.println("postOrden");
        LinkedList<String> listPostOrder = new LinkedList<>();
        TNodoArbolGenericoT1 instance = null;
        instance.postOrden(listPostOrder);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    /**
     * Test of toString method, of class TNodoArbolGenericoT1.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        TNodoArbolGenericoT1 instance = new TNodoArbolGenericoT1("nodo");
        String expResult = "nodo";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of unicoHijo method, of class TNodoArbolGenericoT1.
     */
    @Test
    public void testUnicoHijo() {
        System.out.println("unicoHijo");
        TNodoArbolGenericoT1 hermanoAnterior = new TNodoArbolGenericoT1("hermanoAnterior");
        TNodoArbolGenericoT1 hermanoSiguiente = new TNodoArbolGenericoT1("hermanoAnterior");
        TNodoArbolGenericoT1 instance = new TNodoArbolGenericoT1("unicoHijo");
        boolean result = instance.unicoHijo();
        assertTrue(result);
        
        instance.setAnteriorHermano(hermanoAnterior);
        result = instance.unicoHijo();
        assertFalse(result);
        
        instance.setSiguienteHermano(hermanoSiguiente);
        result = instance.unicoHijo();
        assertFalse(result);
    }










}
