package com.tienda.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="proovedores")
public class Proovedores {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer codigo_producto;
	private String ivacompra;
	private String nitproovedor;
	private String nombre_producto;
	private String precio_compra;
	private String precio_venta;
	
	
	public Proovedores() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Proovedores(Integer codigo_producto, String ivacompra, String nitproovedor, String nombre_producto,
			String precio_compra, String precio_venta) {
		super();
		this.codigo_producto = codigo_producto;
		this.ivacompra = ivacompra;
		this.nitproovedor = nitproovedor;
		this.nombre_producto = nombre_producto;
		this.precio_compra = precio_compra;
		this.precio_venta = precio_venta;
	}
	public Integer getCodigo_producto() {
		return codigo_producto;
	}
	public void setCodigo_producto(Integer codigo_producto) {
		this.codigo_producto = codigo_producto;
	}
	public String getIvacompra() {
		return ivacompra;
	}
	public void setIvacompra(String ivacompra) {
		this.ivacompra = ivacompra;
	}
	public String getNitproovedor() {
		return nitproovedor;
	}
	public void setNitproovedor(String nitproovedor) {
		this.nitproovedor = nitproovedor;
	}
	public String getNombre_producto() {
		return nombre_producto;
	}
	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}
	public String getPrecio_compra() {
		return precio_compra;
	}
	public void setPrecio_compra(String precio_compra) {
		this.precio_compra = precio_compra;
	}
	public String getPrecio_venta() {
		return precio_venta;
	}
	public void setPrecio_venta(String precio_venta) {
		this.precio_venta = precio_venta;
	}
	
	

}
