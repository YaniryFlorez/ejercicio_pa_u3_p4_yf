package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Producto;
import com.example.demo.service.IProductoSrvice;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@SpringBootApplication
public class EjercicioPaU3P4YfApplication implements CommandLineRunner{

	@Autowired
	private IProductoSrvice productoSrvice;
	
	public static void main(String[] args) {
		SpringApplication.run(EjercicioPaU3P4YfApplication.class, args);
	}

@Override
public void run(String... args) throws Exception {
	
	Producto pro1= new Producto();
	pro1.setCodigoBarra("p001");
	pro1.setNombre("galletas");
	pro1.setCategoria("golosina");
	pro1.setStock(10);
	pro1.setPrecio(new BigDecimal(1.50));
	
	Producto pro2= new Producto();
	pro2.setCodigoBarra("p002");
	pro2.setNombre("papas");
	pro2.setCategoria("snacks");
	pro2.setStock(30);
	pro2.setPrecio(new BigDecimal(1));
	
	this.productoSrvice.registrar(pro1);
	this.productoSrvice.registrar(pro2);
	
	

		
}

}
