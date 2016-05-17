package ar.edu.utn.frsf.isi.died.guia.arboles.busqueda;


import java.util.ArrayList;
import java.util.List;
import ar.edu.utn.frsf.isi.died.guia.arboles.Arbol;

public class ArbolBusquedaBinario<E extends Comparable<E>> extends ArbolBusqueda<E> {

	protected ArbolBusqueda<E> izquierdo;
	protected ArbolBusqueda<E> derecho;
	protected int frecuencia = 0;
	
	// no se puede crear un �rbol de busqueda si no se pasa un valor.
	private ArbolBusquedaBinario(){
		this.izquierdo=new ArbolVacioBusqueda<E>();
		this.derecho=new ArbolVacioBusqueda<E>();
	}
	
	public ArbolBusquedaBinario(E e){
		this();
		this.valor=e;
	}
	
	@Override
	public E valor() {
		return this.valor;
	}

	@Override
	public ArbolBusqueda<E> izquierdo() {
		return this.izquierdo;
	}

	@Override
	public ArbolBusqueda<E> derecho() {
		return this.derecho;

	}

	@Override
	public void agregar(E a) {
		System.out.println("insertar "+a+" en arbol que contiene "+this.valor);
		//si es un valor repetido no lo agrego pero aumento la frecuencia
		if(a.equals(this.valor)) {
			this.frecuencia++;
			return;
		}
			
		// verifico si inserto a la izquierda xq soy mayor
		if(this.valor.compareTo(a)>0){
			System.out.println("inserto a izquierda de "+this.valor);
				if(this.izquierdo().esVacio()) { 
					this.izquierdo=new ArbolBusquedaBinario<E>(a);
				}else{
					this.izquierdo.agregar(a);
				}					
		}else{ // inserto a la derecha				
			System.out.println("inserto a DERECHA de "+this.valor);
			if(this.derecho().esVacio()) { 
				this.derecho=new ArbolBusquedaBinario<E>(a);;
			}else{
				this.derecho.agregar(a);
			}					
		}
	}

	@Override
	public int profundidad() {
		 return Math.max(izquierdo.profundidad(),derecho.profundidad())+1;
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
		lista.addAll(this.izquierdo.inOrden());
		lista.add(this.valor);
		lista.addAll(this.derecho.inOrden());
		return lista;
	}

	@Override
	public List<E> posOrden() {
		List<E> lista = new ArrayList<E>();
		lista.addAll(this.izquierdo.posOrden());
		lista.addAll(this.derecho.posOrden());
		lista.add(this.valor);
		return lista;
	}

	@Override
	public boolean esVacio() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contiene(E unValor) {
		return this.valor.equals(unValor) || this.izquierdo.contiene(unValor) || this.derecho.contiene(unValor); 
	}

	@Override
	public boolean equals(ArbolBusqueda<E> unArbol) {
		return this.valor.equals(unArbol.valor()) || this.izquierdo.equals(unArbol.izquierdo()) || this.derecho.equals(unArbol.derecho());
	}

	@Override
	public List<E> nodosMayorA(E e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<E> rango(E inferior, E superior) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E mediana() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<E> descendente() {
		// TODO Auto-generated method stub
		return null;
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
