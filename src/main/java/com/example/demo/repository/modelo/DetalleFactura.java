package com.example.demo.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;

@Entity
@Transactional
@Table(name="detalle_factura",schema="public")
public class DetalleFactura {
	@Id
	@GeneratedValue(generator = "seq_dfac", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_dfac", sequenceName = "seq_dfac", allocationSize = 1)
	@Column(name="defac_id")
	private Integer id;
	@Column(name="defac_cantidad")
	private Integer cantidad;
	@Column(name="defac_precio_unidad")
	private Integer precioUnidad;
	@Column(name="defac_subtotal")
	private BigDecimal subtotal;

   @ManyToOne
   @JoinColumn(name="defac_id_producto")
   private Producto producto;
   
   @ManyToOne
   @JoinColumn(name="defac_id_factura")
   private Factura factura;

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public Integer getCantidad() {
	return cantidad;
}

public void setCantidad(Integer cantidad) {
	this.cantidad = cantidad;
}

public Integer getPrecioUnidad() {
	return precioUnidad;
}

public void setPrecioUnidad(Integer precioUnidad) {
	this.precioUnidad = precioUnidad;
}

public BigDecimal getSubtotal() {
	return subtotal;
}

public void setSubtotal(BigDecimal subtotal) {
	this.subtotal = subtotal;
}


public Producto getProducto() {
	return producto;
}

public void setProducto(Producto producto) {
	this.producto = producto;
}

public Factura getFactura() {
	return factura;
}

public void setFactura(Factura factura) {
	this.factura = factura;
}

@Override
public String toString() {
	return "DetalleFactura [id=" + id + ", cantidad=" + cantidad + ", precioUnidad=" + precioUnidad + ", subtotal="
			+ subtotal + ", producto=" + producto + ", factura=" + factura + "]";
}

   
   
}


