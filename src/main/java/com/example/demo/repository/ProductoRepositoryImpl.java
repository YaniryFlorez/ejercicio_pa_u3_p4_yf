package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Producto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ProductoRepositoryImpl implements IProductoRepository{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void ingresar(Producto producto) {
		
		this.entityManager.persist(producto);
		
	}

	@Override
	public Producto buscarCodigoBarras(String codigoBarras) {
		
			return null;
	}

	
	@Override
	public void actualizar(Integer id) {
				
	}


}
