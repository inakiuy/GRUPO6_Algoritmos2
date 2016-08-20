/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArbolGenerico;

import ArbolGenericoT1.TArbolGenericoT1;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import ArbolGenericoT1.INodoArbolGenericoT1;

/**
 *
 * @author Inaki
 */
public class TArbolGenericoTest {
    
    public TArbolGenericoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of insertar method, of class TArbolGenerico.
     */
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        TArbolGenericoT1 instance = new TArbolGenericoT1();
        boolean expResult = false;
        boolean result = instance.insertar(null);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class TArbolGenerico.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        Comparable unaEtiqueta = null;
        TArbolGenericoT1 instance = new TArbolGenericoT1();
        instance.eliminar(unaEtiqueta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class TArbolGenerico.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        Comparable unaEtiqueta = null;
        TArbolGenericoT1 instance = new TArbolGenericoT1();
        INodoArbolGenericoT1 expResult = null;
        INodoArbolGenericoT1 result = instance.buscar(unaEtiqueta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inOrden method, of class TArbolGenerico.
     */
    @Test
    public void testInOrden() {
        System.out.println("inOrden");
        TArbolGenericoT1 instance = new TArbolGenericoT1();
        String expResult = "";
        String result = instance.inOrden();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of preOrden method, of class TArbolGenerico.
     */
    @Test
    public void testPreOrden() {
        System.out.println("preOrden");
        TArbolGenericoT1 instance = new TArbolGenericoT1();
        String expResult = "";
        String result = instance.preOrden();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of postOrden method, of class TArbolGenerico.
     */
    @Test
    public void testPostOrden() {
        System.out.println("postOrden");
        TArbolGenericoT1 instance = new TArbolGenericoT1();
        String expResult = "";
        String result = instance.postOrden();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of esVacio method, of class TArbolGenerico.
     */
    @Test
    public void testEsVacio() {
        System.out.println("esVacio");
        TArbolGenericoT1 instance = new TArbolGenericoT1();
        boolean expResult = false;
        boolean result = instance.esVacio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRaiz method, of class TArbolGenerico.
     */
    @Test
    public void testGetRaiz() {
        System.out.println("getRaiz");
        TArbolGenericoT1 instance = new TArbolGenericoT1();
        INodoArbolGenericoT1 expResult = null;
        INodoArbolGenericoT1 result = instance.getRaiz();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
