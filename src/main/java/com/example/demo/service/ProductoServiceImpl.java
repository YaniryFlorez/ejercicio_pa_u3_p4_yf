package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IProductoRepository;
import com.example.demo.repository.modelo.Producto;

@Service
public class ProductoServiceImpl implements IProductoSrvice{
	
	@Autowired
	private IProductoRepository productoRepository;
	

	@Override
	public void registrar(Producto producto) {
		this.productoRepository.ingresar(producto);
		
	}

	@Override
	public Producto buscarCodigoBarras(String codigoBarras) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(Integer id) {
		// TODO Auto-generated method stub
		
	}



}
