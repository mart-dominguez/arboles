package ar.edu.utn.frsf.isi.died.guia.arboles.test;

import ar.edu.utn.frsf.isi.died.guia.arboles.ArbolBinario;
import ar.edu.utn.frsf.isi.died.guia.arboles.ArbolVacio;

public class TestEjercicio01 {

	public static void main(String[] args) {
		ArbolVacio<Integer> vacioInt = new ArbolVacio<Integer>();
		ArbolVacio<String> vacioStr = new ArbolVacio<String>();
		
		ArbolBinario<Integer> ab2ii = new ArbolBinario<Integer>(12);
		ArbolBinario<Integer> ab2id = new ArbolBinario<Integer>(5);
		ArbolBinario<Integer> ab1i = new ArbolBinario<Integer>(7,ab2ii,ab2id);

		ArbolBinario<Integer> ab2di = new ArbolBinario<Integer>(9);
		ArbolBinario<Integer> ab1d = new ArbolBinario<Integer>(4,ab2di,vacioInt);
		
		ArbolBinario<Integer> ab0 = new ArbolBinario<Integer>(3,ab1i,ab1d);
		System.out.println("Profundidad: "+ab0.profundidad());
		System.out.println("PreOrden: "+ab0.preOrden());
		System.out.println("PosOrden: "+ab0.posOrden());
		System.out.println("InOrden: "+ab0.inOrden());	
		System.out.println("Cuenta hojas de recorrido: "+ab0.cuentaHojasRec());	
		System.out.println("Es Lleno?: "+ab0.esLleno());	
		System.out.println("Es Completo?: "+ab0.esCompleto());	
		System.out.println("Suma?: "+ab0.calcularSuma());	
		System.out.println("Camino?: "+ab0.camino(3, 12));	
		System.out.println("Rama de sum maxima?: "+ab0.encontrarRamaDeSumaMaxima());
		System.out.println("Espejar: "+ab0.espejar());
		System.out.println("Verificar espejado: "+ab0.preOrden());
		System.out.println("Es Subarbol?: "+ab0.esSubArbol(ab1d));
		

		ArbolBinario<String> arb3 = new ArbolBinario<String>("C");
		
		ArbolBinario<String> arb2ni = new ArbolBinario<String>("S",arb3,vacioStr);
		ArbolBinario<String> arb2nd = new ArbolBinario<String>("N");
		ArbolBinario<String> arb2 = new ArbolBinario<String>("F",arb2ni,arb2nd);
		
		ArbolBinario<String>  arb1ni = new ArbolBinario<String>("X");
		ArbolBinario<String>  arb1nd = new ArbolBinario<String>("P");
		ArbolBinario<String> 	arb1 = new ArbolBinario<String>("M",arb1ni,arb1nd);
		
		ArbolBinario<String> arb0 = new ArbolBinario<String>("D",arb2,arb1);
		System.out.println("Profundidad: "+arb0.profundidad());
		System.out.println("PreOrden: "+arb0.preOrden());
		System.out.println("PosOrden: "+arb0.posOrden());
		System.out.println("InOrden: "+arb0.inOrden());	
		System.out.println("Cuenta hojas de recorrido: "+arb0.cuentaHojasRec());	
		System.out.println("Es Lleno?: "+arb0.esLleno());	
		System.out.println("Es Completo?: "+arb0.esCompleto());	
		System.out.println("Camino?: "+arb0.camino("P", "N"));
		System.out.println("Espejar: "+arb0.espejar());
		System.out.println("Verificar espejado: "+arb0.preOrden());
		System.out.println("Es Subarbol?: "+arb0.esSubArbol(arb2nd));

	}

}
