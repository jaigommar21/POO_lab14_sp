package pe.edu.tecsup.app.services;

import java.util.List;

import pe.edu.tecsup.app.dao.CategoriaDAO;
import pe.edu.tecsup.app.dao.CategoriaDAOImpl;
import pe.edu.tecsup.app.entities.Categoria;

public class CategoriaService {
	
	CategoriaDAO categoriaDAO = new CategoriaDAOImpl(); 

	public  List<Categoria> listar() throws Exception{
		return categoriaDAO.listar();
	}
	public  List<Categoria> buscarPorNombre(String nombre) throws Exception{
		return categoriaDAO.buscarPorNombre(nombre);
	}
	
	public void registrar(String nombre, String descripcion) throws Exception {
		Categoria categoria = new Categoria();
		categoria.setNombre(nombre);
		categoria.setDescripcion(descripcion);
		categoriaDAO.registrar(categoria);
	}

	public void actualizar(Integer id, String nombre, String descripcion) throws Exception {
		Categoria categoria = new Categoria();
		categoria.setId(id);
		categoria.setNombre(nombre);
		categoria.setDescripcion(descripcion);
		categoriaDAO.actualizar(categoria);
	}
	
	public void eliminar(Integer id) throws Exception{
		categoriaDAO.eliminar(id);
	}
}
