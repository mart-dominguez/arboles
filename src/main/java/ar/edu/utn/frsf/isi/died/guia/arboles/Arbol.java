package ar.edu.utn.frsf.isi.died.guia.arboles;

import java.util.List;

public abstract class Arbol<E> {


	protected E valor;

	public abstract List<E> preOrden();

	public abstract List<E> inOrden();

	public abstract List<E> posOrden();

	public abstract boolean esVacio();

	public abstract boolean contiene(E unValor);

	public abstract boolean equals(Arbol<E> unArbol);

	public abstract E valor();

	public abstract Arbol<E> izquierdo();

	public abstract Arbol<E> derecho();
	
	public abstract void agregarDerecho(Arbol<E> a);
	
	public abstract void agregarIzquierdo(Arbol<E> a);
	
	public abstract int profundidad();

	public abstract int cuentaHojasRec();

	public abstract int cuentaNodosDeNivel(int nivel);

	public abstract boolean esCompleto();

	public abstract boolean esLleno();

	public abstract Integer calcularSuma();

	public abstract Integer calcularSumaDeMultiplo(int n);
	
	public abstract boolean esSubArbol(Arbol<E> otroArbol);
	
	public abstract List<E> camino(E v1,E v2);
	
	public abstract Arbol<E> espejar();
	
	public abstract List<E> encontrarRamaDeSumaMaxima();
	
	public abstract List<E> recorrerPorNivel(); 
	
}
