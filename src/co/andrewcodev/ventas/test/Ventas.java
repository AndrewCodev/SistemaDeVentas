package co.andrewcodev.ventas.test;

import co.andrewcodev.ventas.*;

public class Ventas {
	public static void main(String[] args) {
		Producto producto1 = new Producto("Camisa",50000);
		Producto producto2 = new Producto("Panatalom",100000.00);
		
		Orden orden = new Orden();
		orden.agregarProducto(producto1);
		orden.agregarProducto(producto2);
		orden.mostrarOrden();
		
		
		Orden orden2 = new Orden();
		orden2.agregarProducto(producto2);
		orden2.agregarProducto(producto2);
		orden2.agregarProducto(producto1);
		orden2.mostrarOrden();
		
	}
}
