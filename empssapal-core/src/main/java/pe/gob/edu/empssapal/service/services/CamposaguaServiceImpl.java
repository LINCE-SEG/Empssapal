package pe.gob.edu.empssapal.service.services;

import java.math.BigDecimal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.gob.edu.empssapal.core.dao.CamposaguaDAO;
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



@Service("empssapalService")
public class CamposaguaServiceImpl {

	@Autowired
	private CamposaguaDAO camposaguaDAO;
	
	
	//Metodos herramientas
	
		public BigDecimal Limite (Double num){
			return this.camposaguaDAO.Limite(num);
		}
	
	
	
	// metodo NUEVO
	/**
	 * By ocalsin
	 * @param id
	 * @return
	 */
	public Vereda findByIdVeredaCorrecto(Long id){
		return camposaguaDAO.findByIdVeredaCorrecto(id);
	}	
	
	
	
	//find long de 15
//		public Vereda findByIdVereda(Long id){
//			return camposaguaDAO.findByIdVereda(id);
//		}
		public Tipopista findByIdPista(Long id){
			return camposaguaDAO.findByIdPista(id);
		}
		public Tendido findByIdTendido15(Long id) {
			return camposaguaDAO.findByIdTendido15(id);
		}
		public Cajamedidor findByIdCajamedidor15(Long id) {
			return camposaguaDAO.findByIdCajamedidor15(id);
		}
		
		public Tendido findByIdTendido20(Long id) {
			return camposaguaDAO.findByIdTendido20(id);
		}
		public Cajamedidor findByIdCajamedidor20(Long id) {
			return camposaguaDAO.findByIdCajamedidor20(id);
		}
		public Tendido findByIdTendido25(Long id) {
			return camposaguaDAO.findByIdTendido25(id);
		}
		public Cajamedidor findByIdCajamedidor25(Long id) {
			return camposaguaDAO.findByIdCajamedidor25(id);
		}
		public Tendido findByIdTendido38(Long id) {
			return camposaguaDAO.findByIdTendido38(id);
		}
		public Cajamedidor findByIdCajamedidor38(Long id) {
			return camposaguaDAO.findByIdCajamedidor38(id);
		}

		
		
		public Tendido findByIdTendido6(Long id) {
			return camposaguaDAO.findByIdTendido6(id);
		}
		public Cajaregistradora findByIdCajaregistradora6(Long id) {
			return camposaguaDAO.findByIdCajaregistradora6(id);
		}
		
		public Tendido findByIdTendido160(Long id) {
			return camposaguaDAO.findByIdTendido160(id);
		}
		public Cajaregistradora findByIdCajaregistradora160(Long id) {
			return camposaguaDAO.findByIdCajaregistradora160(id);
		}
		public Tendido findByIdTendido200(Long id) {
			return camposaguaDAO.findByIdTendido200(id);
		}
		public Cajaregistradora findByIdCajaregistradora200(Long id) {
			return camposaguaDAO.findByIdCajaregistradora200(id);
		}
		
		
		
		
		
		public Rotura findByIdRotura(Long id){
			return camposaguaDAO.findByIdRotura(id);
		}
		public Reposicion findByIdReposicion(Long id) {
			return camposaguaDAO.findByIdReposicion(id);
		}
		
		public Relleno findByIdRelleno(Long id) {
			return camposaguaDAO.findByIdRelleno(id);
		}
		public Pruebahidraulica findByIdPruebahidraulica(Long id){
			return camposaguaDAO.findByIdPruebahidraulica(id);
		}
		public Excavacion findByIdExcavacion(Long id) {
			return camposaguaDAO.findByIdExcavacion(id);
		}
		public Empalmered findByIdEmpalmered(Long id) {
			return camposaguaDAO.findByIdEmpalmered(id);
		}
		public Eliminacionexedente findByIdEliminacionexedente(Long id) {
			return camposaguaDAO.findByIdEliminacionexedente(id);
		}
		public Cajaregistradora findByIdCajaregistradora(Long id) {
			return camposaguaDAO.findByIdCajaregistradora(id);
		}
		public Camaapoyo findByIdCamaapoyo(Long id) {
			return camposaguaDAO.findByIdCamaapoyo(id);
		}
			
		public Camposalcantarillado findbyidcamposalcantarillado(Long id){
			return camposaguaDAO.findbyidcamposalcantarillado(id);
		}
		public Camposagua findbyidcamposagua(Long id){
			return camposaguaDAO.findbyidcamposagua(id);
		}	
			
	//campos presupuesto alcantarillado
	
		public void guardandopresupuestoalcantarillado(Camposalcantarillado camposalcantarillado){
			this.camposaguaDAO.guardandopresupuestoalcantarillado(camposalcantarillado);
		}
		
		public List<Vereda> Listarveredawherealcantarillado(){
			return camposaguaDAO.Listarveredawhere();
		}
		public List<Tipopista> Listartipopistaalcantarillado(){
			return camposaguaDAO.Listartipopistaalcantarillado();
		}
		public List<Empalmered> Listarempalme6alcantarillado(){
			return camposaguaDAO.Listarempalme6alcantarillado();
		}
		public List<Empalmered> Listarempalme160alcantarillado(){
			return camposaguaDAO.Listarempalme160alcantarillado();
		}
		public List<Empalmered> Listarempalme200alcantarillado(){
			return camposaguaDAO.Listarempalme200alcantarillado();
		}
	
		
	//campos agua
	
	public void Guardarpresupuestoagua(Camposagua camposagua) {
		this.camposaguaDAO.guardandopresupuestoagua(camposagua);// ojo
	}
    public List<Vereda> findidveredabyidvereda(){
    	return camposaguaDAO.Listarveredawhere();
    }
    public List<Tipopista> findListartipopistaagua(){
    	return camposaguaDAO.Listartipopista();
    }
    public List<Empalmered> Listarempalme(){
    	return camposaguaDAO.Listarempalme();
    }
    public List<Empalmered> Listarempalme20(){
    	return camposaguaDAO.Listarempalme20();
    }
    public List<Empalmered> Listarempalme25(){
    	return camposaguaDAO.Listarempalme25();
    }
    public List<Empalmered> Listarempalme38(){
    	return camposaguaDAO.Listarempalme38();
    }
	//excavacion
	public List<Excavacion> listarexcavacion(){
		return camposaguaDAO.excavacionlist();
	}
	public Excavacion FindIdExcavacion(int IdEscavacion){
		return camposaguaDAO.FindIdExcavacion(IdEscavacion);
	}
	public void UpdateExcavacion(Excavacion excava){
		this.camposaguaDAO.updateexcavcacion(excava);
	}
	//Caja medidora
		public List<Cajamedidor> ListCajamedidorlist(){
			return camposaguaDAO.Cajamedidorlist();
		}
		public Cajamedidor FindIdCajamedidor(int IdCajaMedidor){
			return camposaguaDAO.FindIdCajamedidor(IdCajaMedidor);
		}
		public void updateCajamedidor(Cajamedidor caja){
			this.camposaguaDAO.updateCajamedidor(caja);
		}	

		//Caja registradora
		public List<Cajaregistradora> Cajaregistradoralist(){
			return camposaguaDAO.cajaregistradoralist();
		}
		public Cajaregistradora FindIdCajaRegistradora(int IdCajaRegistradora){
			return camposaguaDAO.FindIdCajaRegistradora(IdCajaRegistradora);
		}
		public void updateCajaregistradora(Cajaregistradora cajare){
			this.camposaguaDAO.updateCajaregistradora(cajare);
		}
		
		//Camaapoyo
		public List<Camaapoyo> Camaapoyolist(){
			return camposaguaDAO.Camaapoyolist();
		}
		public Camaapoyo FindIdCamaapoyo(int IdCama){
			return camposaguaDAO.FindIdCamaapoyo(IdCama);
		}
		public void updatecamaapoyo(Camaapoyo cama){
			this.camposaguaDAO.updateCamaapoyo(cama);
		}
		//Eliminacionexedente
			public List<Eliminacionexedente> Eliminacionexedentelist(){
				return camposaguaDAO.Eliminacionexedentelist();
			}
			public Eliminacionexedente FindIdEliminacionexedente(int IdEliminacion){
				return camposaguaDAO.FindIdEliminacionexedente(IdEliminacion);
			}
			public void updateEliminacionexedente(Eliminacionexedente eliminacion){
				this.camposaguaDAO.updateEliminacionexedente(eliminacion);
			}
		
			//Empalmered
			public List<Empalmered> Empalmeredlist(){
				return camposaguaDAO.Empalmeredlist();
			}
			public Empalmered FindIdEmpalmered(int IdEmpalmeRed){
				return camposaguaDAO.FindIdEmpalmered(IdEmpalmeRed);
			}
			public void updateEmpalmered(Empalmered empalme){
				this.camposaguaDAO.updateEmpalmered(empalme);;
			}
			
			//Pruebahidraulica
					public List<Pruebahidraulica> PruebaHidraulicalist(){
						return camposaguaDAO.PruebaHidraulicalist();
					}
					public Pruebahidraulica FindIdPruebahidraulica(int IdPruebaHidraulica){
						return camposaguaDAO.FindIdPruebahidraulica(IdPruebaHidraulica);
					}
					public void updatePruebahidraulica(Pruebahidraulica empalme){
						this.camposaguaDAO.updatePruebahidraulica(empalme);;
					}
					//Relleno
					public List<Relleno> Rellenolist(){
						return camposaguaDAO.Rellenolist();
					}
					public Relleno FindIdRelleno(int IdRelleno){
						return camposaguaDAO.FindIdRelleno(IdRelleno);
					}
					public void updateRelleno(Relleno relleno){
						this.camposaguaDAO.updateRelleno(relleno);
					}
					//Reposicion
					public List<Reposicion> Reposicionlist(){
						return camposaguaDAO.Reposicionlist();
					}
					public Reposicion FindIdReposicion(int IdReposicion){
						return camposaguaDAO.FindIdReposicion(IdReposicion);
					}
					public void updateReposicion(Reposicion reposicion){
						this.camposaguaDAO.updateReposicion(reposicion);
					}
//					Rotura
					public List<Rotura> Roturalist(){
						return camposaguaDAO.Roturalist();
					}
					public Rotura FindIdRotura(int IdRotura){
						return camposaguaDAO.FindIdRotura(IdRotura);
					}
					public void updateRotura(Rotura rotura){
						this.camposaguaDAO.updateRotura(rotura);
					}

//					Tendido
					public List<Tendido> Tendidolist(){
						return camposaguaDAO.Tendidolist();
					}
					public Tendido FindIdTendido(int IdTendido){
						return camposaguaDAO.FindIdTendido(IdTendido);
					}
					public void updateTendido(Tendido tendido){
						this.camposaguaDAO.updateTendido(tendido);
					}

//					vereda
					public List<Vereda> Veredalist(){
						return camposaguaDAO.Veredalist();
					}
					public Vereda FindIdVereda(int IdVereda){
						return camposaguaDAO.FindIdVereda(IdVereda);
					}
					public void updateVereda(Vereda vereda){
						this.camposaguaDAO.updateVereda(vereda);;
					}

	

}
