package com.example.demo.service;

import com.example.demo.repository.modelo.Producto;

public interface IProductoSrvice {
	public void registrar(Producto producto);
	public Producto buscarCodigoBarras(String codigoBarras);
	public void actualizar(Integer id);
}
