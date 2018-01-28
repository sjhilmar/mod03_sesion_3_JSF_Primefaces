package com.tecsup.jsf.bean;

import java.util.Collection;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.tecsup.excepcion.DAOExcepcion;
import com.tecsup.modelo.Categoria;
import com.tecsup.modelo.Producto;
import com.tecsup.negocio.GestionCategorias;
import com.tecsup.negocio.GestionProductos;

@ManagedBean(name = "categoriaBean")
@RequestScoped
public class CategoriaBean {

	private int idCategoria;
	private String nombre;
	private String descripcion;
	private Collection<Categoria> categorias;
	private Collection<Producto> productos;

	public CategoriaBean() {
		GestionCategorias negocio = new GestionCategorias();
		try {
			categorias = negocio.listar();
			System.out.println("Total de categorías: " + categorias.size());
			
		} catch (DAOExcepcion e) {
			e.printStackTrace();
		}
	}

	public void cargarProductos(int idCategoria) {
		System.out.println("Dentro de cargarProductos()");
		GestionProductos negocio = new GestionProductos();
		try {
			productos = negocio.listarPorCategoria(idCategoria);
			System.out.println("Total de productos: " + productos.size());
		} catch (DAOExcepcion e) {
			e.printStackTrace();
		}
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Collection<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(Collection<Categoria> categorias) {
		this.categorias = categorias;
	}

	public Collection<Producto> getProductos() {
		return productos;
	}

	public void setProductos(Collection<Producto> productos) {
		this.productos = productos;
	}

}
