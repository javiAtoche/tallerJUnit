/**
 * 
 */
package com.everis.bootcamp.tallerjunit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.mockito.Mockito;

//import static org.junit.Assert.*;
//import static org.mockito.Mockito.*;
/**
 * @author Javi Atoche
 *
 */
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class CarritoCompraServiceTest {

	CarritoCompraService service;
	
	BaseDeDatosService mock;
	
	//MOCK
	@Before
	public void setUp() {
		System.out.println("Inicializamos el servicio");
		service = new CarritoCompraService();
		mock = Mockito.mock(BaseDeDatosService.class);
		service.setBbddService(mock);
	}
	
	//MOCK
	
	
	
//	@BeforeClass
//	public void setUp() {
//		System.out.println("Inicializamos el servicio 1 vez");
//		service = new CarritoCompraService();
//	}
	
//	@Before
//	public void setUp() {
//		System.out.println("Inicializamos el servicio");
//		service = new CarritoCompraService();
//	}
	
//	@Test
//	public void primerTest() {
//		System.out.println("Primer Test");
//	}
//	
//	@Test
//	public void testAddArticulo() {
//		System.out.println("Probando addArticulo");
//		assertTrue(service.getArticulos().isEmpty());
//		service.addArticulo(new Articulo("Articulo 1",10d));
//		assertFalse(service.getArticulos().isEmpty());
//	}
	
//	@Test
//	public void testLimpiarCesta() {
//		System.out.println("Probando limpiarCestaCompra");
//		assertTrue(service.getArticulos().isEmpty());
//		service.addArticulo(new Articulo("Articulo 2", 12d));
//		assertFalse(service.getArticulos().isEmpty());
//		service.limpiarCesta();
//		assertTrue(service.getArticulos().isEmpty());
//	}
//	
//	@Test
//	public void testTotalPrice() {
//		System.out.println("Probando totalPrice");
//		assertTrue(service.getArticulos().isEmpty());
//		Articulo a1 = new Articulo("Articulo 1", 5.0);
//		assertTrue(a1.getPrecio().equals(5.0));
//		Articulo a2 = new Articulo("Articulo 2", 7.0);
//		assertEquals(a2.getPrecio(), new Double(7));
//		service.addArticulo(a1);
//		service.addArticulo(a2);
//		assertFalse(service.getArticulos().isEmpty());
//		assertEquals(service.totalPrice(),new Double(12));
//	}
	
	
//	public static Double calculadorDescuento(double precio, double porcentajeDescuento){
//	return precio - (precio * (porcentajeDescuento/100));
//}
//	@Test
//	public void testCalculadorDescuento() {
//		System.out.println("Probando calculadoraDescuento");
//		Double descuentResult = CarritoCompraService.calculadorDescuento(100d, 50d);
//		assertEquals(descuentResult,new Double(50d));
//	}
	

	// Crear 3 métodos que:
	/*
	 * 1. Anyadir articulos a la cesta
	 * 2. Comprobar el precio total de la compra
	 * 3. limpiar cesta de la compra
	 * */
	
	@Test
	public void testAddArticuloBeforeClass() {
		System.out.println("Probando addArticulo");
		assertTrue(service.getArticulos().isEmpty());
		Articulo a1 = new Articulo("Articulo 1",7d);
		Articulo a2 = new Articulo("Articulo 1",5d);
		service.addArticulo(a1);
		service.addArticulo(a2);
		assertFalse(service.getArticulos().isEmpty());
	}
	
	@Test
	public void testTotalPriceBeforeClass() {
		System.out.println("Probando totalPrice");
		assertFalse(service.getArticulos().isEmpty());
		assertEquals(service.totalPrice(),new Double(12));
	}
	
	@Test
	public void testLimpiarCestaBeforeClass() {
		System.out.println("Probando limpiarCestaCompra");
		assertFalse(service.getArticulos().isEmpty());
		service.limpiarCesta();
		assertTrue(service.getArticulos().isEmpty());
	}
	
	

}
