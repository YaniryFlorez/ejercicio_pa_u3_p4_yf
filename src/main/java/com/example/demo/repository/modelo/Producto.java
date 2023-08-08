package com.example.demo.repository.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;

@Entity
@Transactional
@Table(name="producto")
public class Producto {
	
	@Id
	@GeneratedValue(generator = "seq_prot", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_prot", sequenceName = "seq_prot", allocationSize = 1)
	@Column(name="pro_id")
	private Integer id;
	@Column(name="pro_codigo_barras")
	private String codigoBarra;
	@Column(name="pro_nombre")
	private String nombre;
	@Column(name="pro_categoria")
	private String categoria;
	@Column(name="pro_stock")
	private Integer stock;
	@Column(name="pro_precio")
	private BigDecimal precio;
	
	@OneToOne(mappedBy = "producto" , fetch =FetchType.LAZY)
	private DetalleFactura detalleFactura;
	
	//GET Y SET

	public String getCodigoBarra() {
		return codigoBarra;
	}

	public void setCodigoBarra(String codigoBarra) {
		this.codigoBarra = codigoBarra;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public DetalleFactura getDetalleFactura() {
		return detalleFactura;
	}

	public void setDetalleFactura(DetalleFactura detalleFactura) {
		this.detalleFactura = detalleFactura;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", codigoBarra=" + codigoBarra + ", nombre=" + nombre + ", categoria=" + categoria
				+ ", stock=" + stock + ", precio=" + precio + ", detalleFactura=" + detalleFactura + "]";
	}


	
	
}
