package pe.gob.edu.empssapal.core.dao;

import java.util.List;

import pe.gob.edu.empssapal.core.domain.Cajamedidor;
import pe.gob.edu.empssapal.core.domain.Cajaregistradora;
import pe.gob.edu.empssapal.core.domain.Camaapoyo;
import pe.gob.edu.empssapal.core.domain.Camposagua;
import pe.gob.edu.empssapal.core.domain.Camposalcantarillado;
import pe.gob.edu.empssapal.core.domain.Eliminacionexedente;
import pe.gob.edu.empssapal.core.domain.Empalmered;
import pe.gob.edu.empssapal.core.domain.Excavacion;
import pe.gob.edu.empssapal.core.domain.Pruebahidraulica;
import pe.gob.edu.empssapal.core.domain.Relleno;
import pe.gob.edu.empssapal.core.domain.Reposicion;
import pe.gob.edu.empssapal.core.domain.Rotura;
import pe.gob.edu.empssapal.core.domain.Tendido;
import pe.gob.edu.empssapal.core.domain.Tipopista;
import pe.gob.edu.empssapal.core.domain.Vereda;

public interface CamposaguaDAO {
	
	//find long de 15
		public List<Vereda> findByIdVereda(Long id);
		public List<Tipopista> findByIdPista(Long id);
		public List<Tendido> findByIdTendido15(Long id);
		public List<Cajamedidor> findByIdCajamedidor15(Long id);
		public List<Tendido> findByIdTendido20(Long id);
		public List<Cajamedidor> findByIdCajamedidor20(Long id);
		public List<Tendido> findByIdTendido25(Long id);
		public List<Cajamedidor> findByIdCajamedidor25(Long id);
		public List<Tendido> findByIdTendido38(Long id);
		public List<Cajamedidor> findByIdCajamedidor38(Long id);
		public List<Tendido> findByIdTendido6(Long id);
		public List<Cajaregistradora> findByIdCajaregistradora6(Long id);
		
		public List<Tendido> findByIdTendido160(Long id);
		public List<Cajaregistradora> findByIdCajaregistradora160(Long id);
		public List<Tendido> findByIdTendido200(Long id);
		public List<Cajaregistradora> findByIdCajaregistradora200(Long id);
		
		
		
		
		
		
		
		
		public List<Rotura> findByIdRotura(Long id);
		public List<Reposicion> findByIdReposicion(Long id);
		public List<Relleno> findByIdRelleno(Long id);
		public List<Pruebahidraulica> findByIdPruebahidraulica(Long id);
		public List<Excavacion> findByIdExcavacion(Long id);
		public List<Empalmered> findByIdEmpalmered(Long id);
		public List<Eliminacionexedente> findByIdEliminacionexedente(Long id);
		public List<Cajaregistradora> findByIdCajaregistradora(Long id);
		public List<Camaapoyo> findByIdCamaapoyo(Long id);
		public List<Camposalcantarillado> findbyidcamposalcantarillado(Long id);
		public List<Camposagua> findbyidcamposagua(int i);
		
		
	//campos presupuesto alcantarillado
		public List<Camposalcantarillado> listaralcantarillado();
	public void guardandopresupuestoalcantarillado(Camposalcantarillado camposalcantarillado);
	
	public List<Vereda> Listarveredawherealcantarillado();
	public List<Tipopista> Listartipopistaalcantarillado();
	public List<Empalmered> Listarempalme6alcantarillado();
	public List<Empalmered> Listarempalme160alcantarillado();
	public List<Empalmered> Listarempalme200alcantarillado();
	//campos presupuesto agua
	public void guardandopresupuestoagua(Camposagua campoagua);
	public List<Vereda> Listarveredawhere();
	public List<Tipopista> Listartipopista();
	public List<Empalmered> Listarempalme();
	public List<Empalmered> Listarempalme20();
	public List<Empalmered> Listarempalme25();
	public List<Empalmered> Listarempalme38();
	//Excavacion
	public List<Excavacion> excavacionlist();
	public Excavacion FindIdExcavacion(int IdEscavacion);
	public void updateexcavcacion(Excavacion excava);
	//Caja medidora
	public List<Cajamedidor> Cajamedidorlist();
	public Cajamedidor FindIdCajamedidor(int IdCajaMedidor);
	public void updateCajamedidor(Cajamedidor caja);
	//Caja registradora
	public List<Cajaregistradora> cajaregistradoralist();
	public Cajaregistradora FindIdCajaRegistradora(int IdCajaRegistradora);
	public void updateCajaregistradora(Cajaregistradora cajare);
	//Camaapoyo
	public List<Camaapoyo> Camaapoyolist();
	public Camaapoyo FindIdCamaapoyo(int IdCama);
	public void updateCamaapoyo(Camaapoyo cama);
	//Eliminacionexedente
	public List<Eliminacionexedente> Eliminacionexedentelist();
	public Eliminacionexedente FindIdEliminacionexedente(int IdEliminacion);
	public void updateEliminacionexedente(Eliminacionexedente eliminacion);
	//Empalmered
	public List<Empalmered> Empalmeredlist();
	public Empalmered FindIdEmpalmered(int IdEmpalmeRed);
	public void updateEmpalmered(Empalmered empalme);
	//Pruebahidraulica
	public List<Pruebahidraulica> PruebaHidraulicalist();
	public Pruebahidraulica FindIdPruebahidraulica(int IdPruebaHidraulica);
	public void updatePruebahidraulica(Pruebahidraulica empalme);
	//Relleno
	public List<Relleno> Rellenolist();
	public Relleno FindIdRelleno(int IdRelleno);
	public void updateRelleno(Relleno relleno);
	//Reposicion
	public List<Reposicion> Reposicionlist();
	public Reposicion FindIdReposicion(int IdReposicion);
	public void updateReposicion(Reposicion reposicion);
	//Rotura
	public List<Rotura> Roturalist();
	public Rotura FindIdRotura(int IdRotura);
	public void updateRotura(Rotura rotura);
	//Tendido
	public List<Tendido> Tendidolist();
	public Tendido FindIdTendido(int IdTendido);
	public void updateTendido(Tendido tendido);
	//Vereda
	public List<Vereda> Veredalist();
	public Vereda FindIdVereda(int IdVereda);
	public void updateVereda(Vereda vereda);
}
