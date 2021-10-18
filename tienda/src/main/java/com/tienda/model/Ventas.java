package com.tienda.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ventas")
public class Ventas {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer codigo_venta;
	private Integer cedula_cliente;
	private Integer cedula_usuario;
	private String ivaventa;
	private String total_venta;
	private String velor_venta;
	
	
	
	public Ventas() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ventas(Integer codigo_venta, Integer cedula_cliente, Integer cedula_usuario, String ivaventa,
			String total_venta, String velor_venta) {
		super();
		this.codigo_venta = codigo_venta;
		this.cedula_cliente = cedula_cliente;
		this.cedula_usuario = cedula_usuario;
		this.ivaventa = ivaventa;
		this.total_venta = total_venta;
		this.velor_venta = velor_venta;
	}
	public Integer getCodigo_venta() {
		return codigo_venta;
	}
	public void setCodigo_venta(Integer codigo_venta) {
		this.codigo_venta = codigo_venta;
	}
	public Integer getCedula_cliente() {
		return cedula_cliente;
	}
	public void setCedula_cliente(Integer cedula_cliente) {
		this.cedula_cliente = cedula_cliente;
	}
	public Integer getCedula_usuario() {
		return cedula_usuario;
	}
	public void setCedula_usuario(Integer cedula_usuario) {
		this.cedula_usuario = cedula_usuario;
	}
	public String getIvaventa() {
		return ivaventa;
	}
	public void setIvaventa(String ivaventa) {
		this.ivaventa = ivaventa;
	}
	public String getTotal_venta() {
		return total_venta;
	}
	public void setTotal_venta(String total_venta) {
		this.total_venta = total_venta;
	}
	public String getVelor_venta() {
		return velor_venta;
	}
	public void setVelor_venta(String velor_venta) {
		this.velor_venta = velor_venta;
	}
	
	
}
