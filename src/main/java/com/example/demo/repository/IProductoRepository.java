package com.example.demo.repository;

import com.example.demo.repository.modelo.Producto;

public interface IProductoRepository {
	
public void ingresar(Producto producto);
public Producto buscarCodigoBarras(String codigoBarras);
public void actualizar(Integer id);


}
