package ar.edu.utn.frsf.isi.died.guia.arboles.solucion;

import java.util.ArrayList;
import java.util.List;


public class ArbolVacio2<E> extends Arbol2<E> {

	public ArbolVacio2(){
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
	public E valor() {
		return null;
	}

	@Override
	public Arbol2<E> izquierdo() {
		return null;
	}

	@Override
	public Arbol2<E> derecho() {
		return null;
	}

	@Override
	public boolean contiene(E unValor) {
		return false;
	}

	@Override
	public boolean equals(Arbol2<E> unArbol) {
		return unArbol.esVacio();
	}

        @Override
	public int profundidad() {
		return 0;
	}

	@Override
	public void agregarDerecho(Arbol2<E> a) {	}

	@Override
	public void agregarIzquierdo(Arbol2<E> a) {	}

	@Override
	public int cuentaHojasRec() {
		return 0;
	}

	@Override
	public int cuentaNodosDeNivel(int nivel) {
		return 0;
	}

	@Override
	public boolean esCompleto() {
		return false;
	}

	@Override
	public boolean esLleno() {
		return false;
	}

	@Override
	public Integer calcularSuma() {
		return 0;
	}

	@Override
	public Integer calcularSumaDeMultiplo(int n) {
		return 0;
	}

	@Override
	public Boolean esSubArbol(Arbol2<E> otroArbol) {
		return false;
	}

	@Override
        public Boolean existeCamino(E v1, E v2) {
		return false;
	}

	@Override
	public Arbol2<E> espejar() {
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
