package ar.edu.utn.frsf.isi.died.guia.arboles;


import java.util.ArrayList;
import java.util.List;

public class ArbolBinario<E> extends Arbol<E>{
	protected Arbol<E> izquierdo;
	protected Arbol<E> derecho;
	
	public ArbolBinario(){
		this.valor=null;
		this.izquierdo=new ArbolVacio<E>();
		this.derecho=new ArbolVacio<E>();
	}
	
	public ArbolBinario(E e){
		this.valor=e;
		this.izquierdo=new ArbolVacio<E>();
		this.derecho=new ArbolVacio<E>();
	}
	
	public ArbolBinario(E e,Arbol<E> i,Arbol<E> d){
		this.valor=e;
		this.izquierdo=i;
		this.derecho=d;
	}
	
	@Override
	public List<E> preOrden() {
		List<E> lista = new ArrayList<E>();
		lista.add(this.valor);
		lista.addAll(this.izquierdo.preOrden());
		lista.addAll(this.derecho.preOrden());
		return lista;
	}
	@Override
	public List<E> inOrden() {
		List<E> lista = new ArrayList<E>();
		lista.addAll(this.izquierdo.preOrden());
		lista.add(this.valor);
		lista.addAll(this.derecho.preOrden());
		return lista;
	}
	@Override
	public List<E> posOrden() {
		List<E> lista = new ArrayList<E>();
		lista.addAll(this.izquierdo.preOrden());
		lista.addAll(this.derecho.preOrden());
		lista.add(this.valor);
		return lista;

	}
	@Override
	public boolean esVacio() {
		return false;
	}
	@Override
	public boolean contiene(E unValor) {
		return this.valor.equals(unValor) || this.izquierdo.contiene(unValor) || this.derecho.contiene(unValor); 
	}
	@Override
	public boolean equals(Arbol<E> unArbol) {
		return this.valor.equals(unArbol.valor()) || this.izquierdo.equals(unArbol.izquierdo()) || this.derecho.equals(unArbol.derecho());
	}
	@Override
	public E valor() {
		return this.valor;
	}
	
	@Override
	public Arbol<E> izquierdo() {
		return this.izquierdo;
	}
	@Override
	public Arbol<E> derecho() {
		return this.derecho;
	}

	@Override
	public void agregarDerecho(Arbol<E> a) {
		this.derecho = a;
	}

	@Override
	public void agregarIzquierdo(Arbol<E> a) {
		this.izquierdo= a;
	}
	
	@Override
	public int profundidad() {
		 return Math.max(izquierdo.profundidad(),derecho.profundidad())+1;
	}
	
	@Override
	public int cuentaHojasRec() {
		//TODO 1.a
		return 0;
	}

	@Override
	public int cuentaNodosDeNivel(int nivel) {
		//TODO 1.b
		return 0;
	}
	
	@Override
	public boolean esLleno() {
		//TODO 1.c
		return false;
	}
	
	@Override
	public boolean esCompleto() {
		//TODO 1.d
		return false;
	}

	@Override
	public Integer calcularSuma() {
		//TODO 1.e
		return 0;
	}
	

	@Override
	public Arbol<E> espejar() {
		// TODO 1.f
		return null;
	}
	
	@Override
	public List<E> camino(E v1, E v2) {
		// TODO 1.g
		return null;
	}

	@Override
	public boolean esSubArbol(Arbol<E> otroArbol) {
		// TODO 1.h
		return false;
	}

	@Override
	public List<E> recorrerPorNivel() {
		// TODO 1.i
		return null;
	}
	
	@Override
	public Integer calcularSumaDeMultiplo(int n) {
		// TODO 1.j
		return 0;
	}

	@Override
	public List<E> encontrarRamaDeSumaMaxima() {
		// TODO 1.k
		return null;
	}
	
	/*
	 * EJERCICIO 2 - a: es arbol binario de busqueda
	 */
	public boolean esArbolBinarioDeBusqueda(){
		return false;
	}
	
	/*
	 * EJERCICIO 2 - b: encuentre desde la ra�z, la rama de mayor profundidad. 
	 */
	
	public List<E> ramaMasProfunda(){
		return null;
	}
}
