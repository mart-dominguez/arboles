package ar.edu.utn.frsf.isi.died.guia.arboles.solucion;

import java.util.List;

public abstract class Arbol2<E> {


	protected E valor;

	public abstract List<E> preOrden();

	public abstract List<E> inOrden();

	public abstract List<E> posOrden();

	public abstract boolean esVacio();

	public abstract boolean contiene(E unValor);

	public abstract boolean equals(Arbol2<E> unArbol);

	public abstract E valor();

	public abstract Arbol2<E> izquierdo();

	public abstract Arbol2<E> derecho();
	
	public abstract void agregarDerecho(Arbol2<E> a);
	
	public abstract void agregarIzquierdo(Arbol2<E> a);
	
	public abstract int profundidad();

	public abstract int cuentaHojasRec();

	public abstract int cuentaNodosDeNivel(int nivel);

	public abstract boolean esCompleto();

	public abstract boolean esLleno();

	public abstract Integer calcularSuma();

	public abstract Integer calcularSumaDeMultiplo(int n);
	
	public abstract Boolean esSubArbol(Arbol2<E> otroArbol);
	
	public abstract Boolean existeCamino(E v1, E v2);
        
	public abstract Arbol2<E> espejar();
	
	public abstract List<E> encontrarRamaDeSumaMaxima();
	
	public abstract List<E> recorrerPorNivel(); 
	
}
