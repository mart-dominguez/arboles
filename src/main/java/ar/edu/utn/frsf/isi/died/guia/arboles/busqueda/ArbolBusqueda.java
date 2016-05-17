package ar.edu.utn.frsf.isi.died.guia.arboles.busqueda;

import java.util.List;

public abstract class ArbolBusqueda<E extends Comparable<E>> {


	protected E valor;

	public abstract List<E> preOrden();

	public abstract List<E> inOrden();

	public abstract List<E> posOrden();

	public abstract boolean esVacio();

	public abstract boolean contiene(E unValor);

	public abstract boolean equals(ArbolBusqueda<E> unArbol);

	public abstract E valor();

	public abstract ArbolBusqueda<E> izquierdo();

	public abstract ArbolBusqueda<E> derecho();
	
	public abstract void agregar(E a);
	
	public abstract int profundidad();

	// ejercicio 3 a) nodos cuyo campo clave sea mayor que un valor dado.
	public abstract List<E> nodosMayorA(E e);
	
	// ejercicio 3 b) nodos cuyo campo clave sea mayor que un valor dado.
	public abstract List<E> rango(E inferior,E superior);
	
	// ejercicio 6 a)	Retornar la clave del nodo del �rbol que contiene la mediana (clave que tiene tantas claves menores que ella como claves mayores que ella). No utilice ninguna estructura de datos auxiliar.
	public abstract E mediana();
	
	// ejercicio 6  b)	Dise�ar un m�todo que liste los nodos del �rbol ordenados descendentemente.
	public abstract List<E> descendente();
	
	// ejercicio 6  c)	Dise�ar un m�todo que retorne un entero �int nivel(Comparable x)� que determina en qu� nivel se encuentra un elemento.
	public abstract int nivel(E e);
	
	// ejercicio 6 d)	Dise�ar un m�todo �boolean existe(Integer x,Integer y)� que retorna �true� si en el �rbol existen dos elementos:
	//  el elemento �x� existe en el �rbol y  el elemento �x^y� existe en el �rbol.
	public abstract boolean existePar(Integer x,Integer y);

}
