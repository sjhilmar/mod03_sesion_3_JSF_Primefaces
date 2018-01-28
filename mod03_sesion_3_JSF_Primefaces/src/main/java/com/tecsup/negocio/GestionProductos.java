package com.tecsup.negocio;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

import com.tecsup.excepcion.DAOExcepcion;
import com.tecsup.modelo.Producto;

public class GestionProductos {
	
	static HashMap<Integer, Collection<Producto>> 
		productosXcategorias = new HashMap<Integer, Collection<Producto>>(); 
	
	static {
		productosXcategorias.put(new Integer(1), 
					Arrays.asList(new Producto(10,"Smartphone","Smartphone","phone",1500),
								  new Producto(11,"Tablet","Tablet","tablet",1600)));
		productosXcategorias.put(new Integer(2), 
				Arrays.asList(new Producto(20,"La Casa Verde","La Casa Verde","verde",2500),
							  new Producto(21,"El Capitan Grant","El Capitan Grant","capitan",1500)));
		productosXcategorias.put(new Integer(3), 
				Arrays.asList(new Producto(30,"Futbol","Futbol","futbol",250),
							  new Producto(31,"Voley","Voley","voley",300)));
	
	}
	
	public Collection<Producto> listarPorCategoria(int idCategoria) throws DAOExcepcion {
		// TODO Auto-generated method stub
		return productosXcategorias.get(idCategoria);
	}

	
}
