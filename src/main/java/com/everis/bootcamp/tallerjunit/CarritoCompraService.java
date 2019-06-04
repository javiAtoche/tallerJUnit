package com.everis.bootcamp.tallerjunit;

import java.util.ArrayList;
import java.util.List;

public class CarritoCompraService {
	
	List<Articulo> articulos = new ArrayList<Articulo>();
	BaseDeDatosService bbddService = null;
	
	
	
	/**
	 * @return the bbddService
	 */
	public BaseDeDatosService getBbddService() {
		return bbddService;
	}

	/**
	 * @param bbddService the bbddService to set
	 */
	public void setBbddService(BaseDeDatosService bbddService) {
		this.bbddService = bbddService;
	}

	public void limpiarCesta(){
		articulos = new ArrayList<Articulo>();
	}
	
	public void addArticulo(Articulo a){
		articulos.add(a);
	}
	
	public int getNumArticulo(){
		return articulos.size();
	}
	
	public Double totalPrice(){
		double precioTotal = articulos.stream().  	
			     mapToDouble(Articulo::getPrecio).
			     sum();
		return precioTotal;
	}
	
	public static Double calculadorDescuento(double precio, double porcentajeDescuento){
		return precio - (precio * (porcentajeDescuento/100));
	}

	public List<Articulo> getArticulos() {
		return articulos;
	}

	public void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}
	
	
	/*
	 * Ejercicio1:
	 * Definir el comportamiento de la llamada al servicio BaseDeDatosService al buscar 
	 * el articulo con ID 1
	 */
	public Double calculaDescuentoBBDD(int id,Double descuento) {
		
		Double precioDescuento = 0d;
		
		//Recupera el articulo de la "BBDD"
		Articulo a1 = bbddService.findArticuloById(id);
		precioDescuento = CarritoCompraService.calculadorDescuento(a1.getPrecio(), descuento);
		
		return precioDescuento;
		
	}

}
