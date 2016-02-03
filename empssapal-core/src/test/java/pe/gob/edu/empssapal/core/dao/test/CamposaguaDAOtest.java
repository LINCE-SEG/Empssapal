package pe.gob.edu.empssapal.core.dao.test;

import org.springframework.beans.factory.annotation.Autowired;

import pe.gob.edu.empssapal.core.dao.CamposaguaDAO;
import pe.gob.edu.empssapal.core.domain.Camposagua;

public class CamposaguaDAOtest extends AbstractUnitTest{

	@Autowired
	protected CamposaguaDAO camposaguaDAO;

	public void testEspecificacionList() {
		
//		System.out.println("::::: " + camposaguaDAO.listaralcantarillado());
		Camposagua as=new Camposagua();
		Long uno=  as.getId();
		System.out.println("::::: " + camposaguaDAO.findByIdTendido15(uno));
//		System.out.println("::::: " + camposaguaDAO.findByIdTendido(as.getId()));
//	System.out.println("::::::::::" + camposaguaDAO.FindIdCajamedidor(1).getNombrecajamedidor());findByIdTendido
	}
}

