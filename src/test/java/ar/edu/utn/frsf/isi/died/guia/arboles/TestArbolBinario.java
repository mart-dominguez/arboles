/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.utn.frsf.isi.died.guia.arboles;

import ar.edu.utn.frsf.isi.died.guia.arboles.solucion.Arbol2;
import ar.edu.utn.frsf.isi.died.guia.arboles.solucion.ArbolBinario2;
import ar.edu.utn.frsf.isi.died.guia.arboles.solucion.ArbolVacio2;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mdominguez
 */
public class TestArbolBinario {

    private Arbol2 unArbol; 
    private Arbol2 otroArbol; 
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        System.out.println("ANTES DE CADA TEST se recrea el arbol");
        unArbol = new ArbolBinario2<Integer>(51);
        Arbol2<Integer> arbolIzq = new ArbolBinario2<Integer>(38,new ArbolBinario2<Integer>(12),new ArbolBinario2<Integer>(46));
        Arbol2<Integer> arbolDer = new ArbolBinario2<Integer>(93,new ArbolBinario2<Integer>(78),new ArbolVacio2<Integer>());
        unArbol.agregarIzquierdo(arbolIzq);
        unArbol.agregarDerecho(arbolDer);
        // creo otro arbol
        otroArbol= new ArbolBinario2<Integer>(51);
        Arbol2<Integer> otroArbolIzq = new ArbolBinario2<Integer>(38,new ArbolBinario2<Integer>(12),new ArbolBinario2<Integer>(46));
        Arbol2<Integer> otroArbolDer = new ArbolBinario2<Integer>(93,new ArbolBinario2<Integer>(78),new ArbolVacio2<Integer>());
        otroArbol.agregarIzquierdo(otroArbolIzq);
        otroArbol.agregarDerecho(otroArbolDer);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testIguales() {       
        assertTrue(this.unArbol.equals(otroArbol));
        otroArbol.derecho().agregarDerecho(new ArbolBinario2(550));
        assertFalse(this.unArbol.equals(otroArbol));
    }


    @Test
    public void testContiene() {        
        assertTrue(this.unArbol.contiene(38));
        assertFalse(this.unArbol.contiene(25));
    }

    @Test
    public void testProfundidad() {
        assertEquals(3,this.unArbol.profundidad());
        this.unArbol.izquierdo().derecho().agregarDerecho(new ArbolBinario2(49));
        assertEquals(4,this.unArbol.profundidad());
    }

    @Test
    public void testNodoDeNivel() {
        assertEquals(1,this.unArbol.cuentaNodosDeNivel(0));
        assertEquals(2,this.unArbol.cuentaNodosDeNivel(1));
        assertEquals(3,this.unArbol.cuentaNodosDeNivel(2));
        this.unArbol.derecho().agregarDerecho(new ArbolBinario2(99));
        assertEquals(4,this.unArbol.cuentaNodosDeNivel(2));
        assertEquals(0,this.unArbol.cuentaNodosDeNivel(3));
        this.unArbol.izquierdo().derecho().agregarDerecho(new ArbolBinario2(49));
        assertEquals(1,this.unArbol.cuentaNodosDeNivel(3));
        
    }
    
    @Test
    public void testCuentaHojas() {
        assertEquals(3,this.unArbol.cuentaHojasRec());
        this.unArbol.derecho().agregarDerecho(new ArbolBinario2(99));
        assertEquals(4,this.unArbol.cuentaHojasRec());       
    }
    
    
    @Test
    public void testEsLleno() {
        assertFalse(this.unArbol.esLleno());
        this.unArbol.derecho().agregarDerecho(new ArbolBinario2(99));
        assertTrue(this.unArbol.esLleno());

    }

    @Test
    public void testEsCompleto() {
        System.out.println(this.unArbol.inOrden());
        assertTrue(this.unArbol.esCompleto());
    }
    
    @Test
    public void testExisteCamino(){
        assertTrue(this.unArbol.existeCamino(51, 38));
        assertTrue(this.unArbol.existeCamino(51, 12));
        assertTrue(this.unArbol.existeCamino(51, 46));
        assertTrue(this.unArbol.existeCamino(51, 93));
        assertTrue(this.unArbol.existeCamino(51, 78));
        assertTrue(this.unArbol.existeCamino(38, 46));
        assertFalse(this.unArbol.existeCamino(39, 93));
        assertFalse(this.unArbol.existeCamino(12, 51));
        assertFalse(this.unArbol.existeCamino(66, 88));
    }


}
