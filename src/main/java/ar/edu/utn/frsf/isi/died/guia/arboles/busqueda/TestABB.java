package ar.edu.utn.frsf.isi.died.guia.arboles.busqueda;

public class TestABB {

	public static void main(String[] args) {
		ArbolBusquedaBinario<Integer> abb = new ArbolBusquedaBinario<Integer>(15);
		abb.agregar(12);
		abb.agregar(22);
		abb.agregar(14);
		abb.agregar(21);
		abb.agregar(24);
		abb.agregar(21);
		abb.agregar(38);
		abb.agregar(8);
		abb.agregar(33);
		abb.agregar(9);
		
		System.out.println("recorrido inorden"+abb.inOrden());
		System.out.println("recorrido posorden"+abb.posOrden());
		System.out.println("recorrido preorden"+abb.preOrden());
		
	}
}
