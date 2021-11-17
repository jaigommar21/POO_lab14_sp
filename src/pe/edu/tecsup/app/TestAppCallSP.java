package pe.edu.tecsup.app;

import java.util.List;

import pe.edu.tecsup.app.entities.Categoria;
import pe.edu.tecsup.app.services.CategoriaService;

public class TestAppCallSP { 

	public static void main(String[] args) {

		try {
		
			CategoriaService categoriaService = new CategoriaService();
			
			int nroProds = categoriaService.obtenerNroProductosPorCategoria(1);
			
			System.out.println(nroProds);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
