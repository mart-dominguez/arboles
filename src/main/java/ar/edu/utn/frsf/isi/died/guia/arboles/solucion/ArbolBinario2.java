/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.utn.frsf.isi.died.guia.arboles.solucion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mdominguez
 */
public class ArbolBinario2 <E> extends Arbol2<E>{
	protected Arbol2<E> izquierdo;
	protected Arbol2<E> derecho;
	
	public ArbolBinario2(){
		this.valor=null;
		this.izquierdo=new ArbolVacio2<E>();
		this.derecho=new ArbolVacio2<E>();
	}
	
	public ArbolBinario2(E e){
		this.valor=e;
		this.izquierdo=new ArbolVacio2<E>();
		this.derecho=new ArbolVacio2<E>();
	}
	
	public ArbolBinario2(E e,Arbol2<E> i,Arbol2<E> d){
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
	public E valor() {
		return this.valor;
	}
	
	@Override
	public Arbol2<E> izquierdo() {
		return this.izquierdo;
	}
	@Override
	public Arbol2<E> derecho() {
		return this.derecho;
	}

	@Override
	public void agregarDerecho(Arbol2<E> a) {
		this.derecho = a;
	}

	@Override
	public void agregarIzquierdo(Arbol2<E> a) {
		this.izquierdo= a;
	}
	
        // RESOLVER ! ! ! ! !
	@Override
	public boolean contiene(E unValor) {
		return this.valor.equals(unValor) || this.izquierdo.contiene(unValor) || this.derecho.contiene(unValor); 
	}
        
	@Override
	public boolean equals(Arbol2<E> unArbol) {
		return this.valor.equals(unArbol.valor()) && this.izquierdo.equals(unArbol.izquierdo()) && this.derecho.equals(unArbol.derecho());
	}
        
        @Override
	public int profundidad() {
		 return Math.max(izquierdo.profundidad(),derecho.profundidad())+1;
	}
	
	@Override
	public int cuentaHojasRec() {
		if(izquierdo.esVacio()&& derecho.esVacio())
			return 1;
		else
		return izquierdo.cuentaHojasRec() + derecho.cuentaHojasRec();
	}

	@Override
	public int cuentaNodosDeNivel(int nivel) {
            if(nivel==0)
                return 1;
            else
                return izquierdo.cuentaNodosDeNivel(nivel-1) + derecho.cuentaNodosDeNivel(nivel-1);
        }
	
	@Override
	public boolean esLleno() {
            if(this.izquierdo.esVacio() && this.derecho.esVacio()) return true;
            if(this.izquierdo.profundidad()!=this.derecho.profundidad()) 
                return false;
            else
                return derecho.esLleno() && izquierdo.esLleno();
	}
	
	@Override
	public boolean esCompleto() {
            if (this.izquierdo.esVacio() && this.derecho.esVacio())
                return true;
            System.out.println("izq prof: "+izquierdo.profundidad() + " == der prof: "+derecho.profundidad());
            System.out.println("izq lleno: "+izquierdo.esLleno() + " === der comp: " +derecho.esCompleto());
            if (izquierdo.profundidad() == derecho.profundidad())
                return izquierdo.esLleno()&& derecho.esCompleto();
            if (izquierdo.profundidad() == derecho.profundidad() + 1)
                return izquierdo.esCompleto() && (derecho.esLleno() || derecho.esVacio());
            return false;
        }

	@Override
	public Integer calcularSuma() {
            if(valor instanceof Number)
                return ((Integer) valor ) + this.izquierdo.calcularSuma() + this.derecho.calcularSuma();
            else 
                return 0;
	}
	

	@Override
	public Arbol2<E> espejar() {
            Arbol2<E> aux = this.izquierdo;
            this.izquierdo = this.derecho;
            this.derecho = aux;
            this.derecho.espejar();
            this.izquierdo.espejar();
            return this;
	}
	
	@Override
	public Boolean existeCamino(E v1, E v2) {
            System.out.println("CAMINO ENTRE "+v1+" y "+v2);
                if(this.izquierdo.esVacio() && this.derecho.esVacio()) return false;
		if(this.valor.equals(v1)){
                    if((!this.derecho().esVacio() && this.derecho().valor().equals(v2)) || 
                       (!this.izquierdo().esVacio() &&this.izquierdo().valor().equals(v2))) return true;
                    else return this.derecho().existeCamino(this.derecho().valor(), v2) || this.izquierdo().existeCamino(this.izquierdo().valor(), v2);
                }
                else return this.derecho.existeCamino(v1,v2) ||
                            this.izquierdo.existeCamino(v1,v2);
	}

	@Override
	public Boolean esSubArbol(Arbol2<E> otroArbol) {
            if(otroArbol.valor().equals(this.valor)  && otroArbol.izquierdo().esVacio() && otroArbol.derecho().esVacio()) return true;
		if(otroArbol.valor().equals(this.valor) 
			&& this.derecho.esSubArbol(otroArbol.derecho())
			&& this.izquierdo.esSubArbol(otroArbol.izquierdo())
		)	return true;
                else{
			return this.derecho.esSubArbol(otroArbol) || this.izquierdo.esSubArbol(otroArbol);
		}
	}

	@Override
	public List<E> recorrerPorNivel() {
		// TODO 1.i
		return null;
	}
	
	@Override
	public Integer calcularSumaDeMultiplo(int n) {
		if(((Integer) this.valor) % n == 0)
			return ((Integer) this.valor) + this.izquierdo.calcularSumaDeMultiplo(n) + this.derecho.calcularSumaDeMultiplo(n);
		return  this.izquierdo.calcularSumaDeMultiplo(n) + this.derecho.calcularSumaDeMultiplo(n);
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
