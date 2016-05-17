package ar.edu.utn.frsf.isi.died.guia.arboles.busqueda;

import java.util.ArrayList;
import java.util.List;

public class ArbolVacioBusqueda<E  extends Comparable<E> > extends ArbolBusqueda<E> {

	@Override
	public List<E> preOrden() {
		// TODO Auto-generated method stub
		return new ArrayList<E>();
	}

	@Override
	public List<E> inOrden() {
		// TODO Auto-generated method stub
		return new ArrayList<E>();
	}

	@Override
	public List<E> posOrden() {
		// TODO Auto-generated method stub
		return new ArrayList<E>();
	}

	@Override
	public boolean esVacio() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean contiene(E unValor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean equals(ArbolBusqueda<E> unArbol) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E valor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArbolBusqueda<E> izquierdo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArbolBusqueda<E> derecho() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void agregar(E a) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public int profundidad() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<E> nodosMayorA(E e) {
		// TODO Auto-generated method stub
		return new ArrayList<E>();
	}

	@Override
	public List<E> rango(E inferior, E superior) {
		// TODO Auto-generated method stub
		return new ArrayList<E>();
	}

	@Override
	public E mediana() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<E> descendente() {
		// TODO Auto-generated method stub
		return new ArrayList<E>();
	}

	@Override
	public int nivel(E e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existePar(Integer x, Integer y) {
		// TODO Auto-generated method stub
		return false;
	}
}
