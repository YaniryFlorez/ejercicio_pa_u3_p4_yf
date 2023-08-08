package com.example.demo.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;

@Entity
@Transactional
@Table(name="factura")
public class Factura {
	@Id
	@GeneratedValue(generator = "seq_fac", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_fac", sequenceName = "seq_fac", allocationSize = 1)
	@Column(name="fac_id")
	private Integer id;
	@Column(name="fac_fecha")
	private LocalDate fecha;
	@Column(name="fac_ced_cliente")
	private String nombre;
	@Column(name="fac_total_factura")
	private BigDecimal totalFactura;
	
	@OneToMany(mappedBy = "factura", fetch =FetchType.LAZY )
	private List<DetalleFactura> detalleFacturas;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getTotalFactura() {
		return totalFactura;
	}

	public void setTotalFactura(BigDecimal totalFactura) {
		this.totalFactura = totalFactura;
	}

	public List<DetalleFactura> getDetalleFacturas() {
		return detalleFacturas;
	}

	public void setDetalleFacturas(List<DetalleFactura> detalleFacturas) {
		this.detalleFacturas = detalleFacturas;
	}

	@Override
	public String toString() {
		return "Factura [id=" + id + ", fecha=" + fecha + ", nombre=" + nombre + ", totalFactura=" + totalFactura
				+ ", detalleFacturas=" + detalleFacturas + "]";
	}

	
	
	
	
}
