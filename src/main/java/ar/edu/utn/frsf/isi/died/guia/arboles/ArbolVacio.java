package ar.edu.utn.frsf.isi.died.guia.arboles;

import java.util.ArrayList;
import java.util.List;


public class ArbolVacio<E> extends Arbol<E> {

	public ArbolVacio(){
		this.valor=null;
	}
	
	@Override
	public List<E> preOrden() {
		return new ArrayList<E>();
	}

	@Override
	public List<E> inOrden() {
		return new ArrayList<E>();
	}

	@Override
	public List<E> posOrden() {
		return new ArrayList<E>();
	}

	@Override
	public boolean esVacio() {
		return true;
	}

	@Override
	public boolean contiene(E unValor) {
		return false;
	}

	@Override
	public boolean equals(Arbol<E> unArbol) {
		return unArbol.esVacio();
	}

	@Override
	public E valor() {
		return null;
	}

	@Override
	public Arbol<E> izquierdo() {
		return null;
	}

	@Override
	public Arbol<E> derecho() {
		return null;
	}

	@Override
	public int profundidad() {
		return 0;
	}

	@Override
	public void agregarDerecho(Arbol<E> a) {	}

	@Override
	public void agregarIzquierdo(Arbol<E> a) {	}

	@Override
	public int cuentaHojasRec() {
		// TODO 11
		return 0;
	}

	@Override
	public int cuentaNodosDeNivel(int nivel) {
		// TODO 12
		return 0;
	}

	@Override
	public boolean esCompleto() {
		// TODO 13
		return false;
	}

	@Override
	public boolean esLleno() {
		// TODO 14
		return false;
	}

	@Override
	public Integer calcularSuma() {
		// TODO 15
		return 0;
	}

	@Override
	public Integer calcularSumaDeMultiplo(int n) {
		// TODO 16
		return 0;
	}

	@Override
	public boolean esSubArbol(Arbol<E> otroArbol) {
		// TODO 17
		return false;
	}

	@Override
	public List<E> camino(E v1, E v2) {
		// TODO 18
		return new ArrayList<E>();
	}

	@Override
	public Arbol<E> espejar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<E> encontrarRamaDeSumaMaxima() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<E> recorrerPorNivel() {
		// TODO Auto-generated method stub
		return null;
	}
	



}
