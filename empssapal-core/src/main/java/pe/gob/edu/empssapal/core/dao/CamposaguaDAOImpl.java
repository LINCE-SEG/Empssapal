package pe.gob.edu.empssapal.core.dao;

import java.math.BigDecimal;
import java.math.RoundingMode;
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

public class CamposaguaDAOImpl extends BaseDAOHibernate implements CamposaguaDAO {

	// @Override
	
	//Metodos herramientas
	
	public BigDecimal Limite (Double num){
		
		 String val = num+"";
	      BigDecimal big = new BigDecimal(val);
	      big = big.setScale(2, RoundingMode.HALF_UP);
	      System.out.println("Número : "+big);
		return big;
	}
	
	// find long de agua

	public Excavacion findByIdExcavacion(Long id) {
		return findFirst(Excavacion.class, "FROM Excavacion where IdEscavacion =" + id);
	}

	public Tipopista findByIdPista(Long id) {
		return findFirst(Tipopista.class, "FROM Tipopista where IdPista =" + id);
	}

	public Camaapoyo findByIdCamaapoyo(Long id) {
		return findFirst(Camaapoyo.class, "FROM Camaapoyo where IdCama =" + id);
	}

	public Tendido findByIdTendido15(Long id) {
		return findFirst(Tendido.class, "FROM Tendido  where" + " NombreTendido = " + 15 + " and " + "IdTendido =" + id);
	}

	public Cajamedidor findByIdCajamedidor15(Long id) {
		return findFirst(Cajamedidor.class,
				"FROM Cajamedidor  where" + " NombreCajamedidor = " + 15 + " and " + "IdCajaMedidor =" + id);
	}

	public Tendido findByIdTendido20(Long id) {
		return findFirst(Tendido.class, "FROM Tendido  where" + " NombreTendido = " + 20 + " and " + "IdTendido =" + id);
	}

	public Cajamedidor findByIdCajamedidor20(Long id) {
		return findFirst(Cajamedidor.class,
				"FROM Cajamedidor  where" + " NombreCajamedidor = " + 20 + " and " + "IdCajaMedidor =" + id);
	}

	public Tendido findByIdTendido25(Long id) {
		return findFirst(Tendido.class, "FROM Tendido  where" + " NombreTendido = " + 25 + " and " + "IdTendido =" + id);
	}

	public Cajamedidor findByIdCajamedidor25(Long id) {
		return findFirst(Cajamedidor.class,
				"FROM Cajamedidor  where" + " NombreCajamedidor = " + 25 + " and " + "IdCajaMedidor =" + id);
	}

	public Tendido findByIdTendido38(Long id) {
		return findFirst(Tendido.class, "FROM Tendido  where" + " NombreTendido = " + 38 + " and " + "IdTendido =" + id);
	}

	public Cajamedidor findByIdCajamedidor38(Long id) {
		return findFirst(Cajamedidor.class,
				"FROM Cajamedidor  where" + " NombreCajamedidor = " + 38 + " and " + "IdCajaMedidor =" + id);
	}

	public Tendido findByIdTendido6(Long id) {
		return findFirst(Tendido.class, "FROM Tendido  where" + " NombreTendido = " + 5 + " and " + "IdTendido =" + id);
	}

	public Cajaregistradora findByIdCajaregistradora6(Long id) {
		return findFirst(Cajaregistradora.class, "FROM Cajaregistradora  where" + " NombreCajaregistradora = " + 1 + " and "
				+ "IdCajaRegistradora =" + id);
	}

	public Tendido findByIdTendido160(Long id) {
		return findFirst(Tendido.class, "FROM Tendido  where" + " NombreTendido = " + 6 + " and " + "IdTendido =" + id);
	}

	public Cajaregistradora findByIdCajaregistradora160(Long id) {
		return findFirst(Cajaregistradora.class, "FROM Cajaregistradora  where" + " NombreCajaregistradora = " + 2 + " and "
				+ "IdCajaRegistradora =" + id);
	}

	public Tendido findByIdTendido200(Long id) {
		return findFirst(Tendido.class, "FROM Tendido  where" + " NombreTendido = " + 7 + " and " + "IdTendido =" + id);
	}

	public Cajaregistradora findByIdCajaregistradora200(Long id) {
		return findFirst(Cajaregistradora.class, "FROM Cajaregistradora  where" + " NombreCajaregistradora = " + 3 + " and "
				+ "IdCajaRegistradora =" + id);
	}

	public Rotura findByIdRotura(Long id) {
		return findFirst(Rotura.class, "FROM Rotura where IdRotura =" + id);
	}

	public Reposicion findByIdReposicion(Long id) {
		return findFirst(Reposicion.class, "FROM Reposicion where IdReposicion =" + id);
	}

	public Relleno findByIdRelleno(Long id) {
		return findFirst(Relleno.class, "FROM Relleno where IdRelleno =" + id);
	}

	public Pruebahidraulica findByIdPruebahidraulica(Long id) {
		return findFirst(Pruebahidraulica.class, "FROM Pruebahidraulica where IdPruebaHidraulica =" + id);
	}

	public Empalmered findByIdEmpalmered(Long id) {
		return findFirst(Empalmered.class, "FROM Empalmered where IdEmpalmeRed =" + id);
	}

	public Eliminacionexedente findByIdEliminacionexedente(Long id) {
		return findFirst(Eliminacionexedente.class, "FROM Eliminacionexedente where IdEliminacion =" + id);
	}

	public Cajaregistradora findByIdCajaregistradora(Long id) {
		return findFirst(Cajaregistradora.class, "FROM Cajaregistradora where IdCajaRegistradora =" + id);
	}

	public Camposalcantarillado findbyidcamposalcantarillado(Long id) {
		return findFirst(Camposalcantarillado.class, "FROM Camposalcantarillado where IdCamposAlcantarillado=" + id);
	}


 public Camposagua findbyidcamposagua(Long id){
	 return findFirst(Camposagua.class, "FROM Camposagua where IdCampos=" + id);
 }
	
	
	
	
	
	// * SI LA BUSQUEDA ES POR ID, no entiendo porque retorna una lista?????,
	// * funciona pero no es eficiente mal programado. veo que algunos de tus
	// metodos tienen error de programacion y buenas practicas.
	/**
	 * By ocalsin
	 */
//	public List<Vereda> findByIdVereda(Long id) {
//		return find(Vereda.class, "FROM Vereda where IdVereda =" + id);
//	}

	/**
	 * by ocalsin
	 * @param id
	 * @return object Vereda
	 */
//	forma correcta. Retorna un solo objeto
	public Vereda findByIdVeredaCorrecto(Long id) {
		return findFirst(Vereda.class, "FROM Vereda where IdVereda =" + id);
	}

	
	
	
	
	// campos presupuesto alcantarillado

	public void guardandopresupuestoalcantarillado(Camposalcantarillado camposalcantarillado) {
		this.save(camposalcantarillado);
	}

	public List<Vereda> Listarveredawherealcantarillado() {
		return find(Vereda.class, "FROM Vereda where TipoServicioVere='Alcantarillado' ");
	}

	public List<Tipopista> Listartipopistaalcantarillado() {
		return find(Tipopista.class, "FROM Tipopista where Tiposerviciopista='Alcantarillado'");
	}

	public List<Empalmered> Listarempalme6alcantarillado() {
		return find(Empalmered.class,
				"FROM Empalmered where TipoServicioEmpalme='Alcantarillado' and NombreDiametro='6'");
	}

	public List<Empalmered> Listarempalme160alcantarillado() {
		return find(Empalmered.class,
				"FROM Empalmered where TipoServicioEmpalme='Alcantarillado' and NombreDiametro='160'");
	}

	public List<Empalmered> Listarempalme200alcantarillado() {
		return find(Empalmered.class,
				"FROM Empalmered where TipoServicioEmpalme='Alcantarillado' and NombreDiametro='200'");
	}

	// campos presupuesto agua

	public void guardandopresupuestoagua(Camposagua campoagua) {
		this.save(campoagua);
	}

	public List<Vereda> Listarveredawhere() {
		return find(Vereda.class, "FROM Vereda where TipoServicioVere='Agua' ");
	}

	public List<Tipopista> Listartipopista() {
		return find(Tipopista.class, "FROM Tipopista where Tiposerviciopista='Agua'");
	}

	public List<Empalmered> Listarempalme() {
		return find(Empalmered.class, "FROM Empalmered where TipoServicioEmpalme='Agua' and NombreDiametro='15'");
	}

	public List<Empalmered> Listarempalme20() {
		return find(Empalmered.class, "FROM Empalmered where TipoServicioEmpalme='Agua' and NombreDiametro='20'");
	}

	public List<Empalmered> Listarempalme25() {
		return find(Empalmered.class, "FROM Empalmered where TipoServicioEmpalme='Agua' and NombreDiametro='25'");
	}

	public List<Empalmered> Listarempalme38() {
		return find(Empalmered.class, "FROM Empalmered where TipoServicioEmpalme='Agua' and NombreDiametro='38'");
	}

	// Excavacion where Tiposerviciopista='Agua'
	public List<Excavacion> excavacionlist() {
		return find(Excavacion.class, "FROM Excavacion");
	}

	public Excavacion FindIdExcavacion(int IdEscavacion) {
		StringBuffer queryBuffer = new StringBuffer();
		queryBuffer.append(" FROM Excavacion  WHERE IdEscavacion=" + IdEscavacion);
		return findFirst(Excavacion.class, queryBuffer.toString());
	}

	public void updateexcavcacion(Excavacion excava) {
		this.update(excava);
	}

	// Caja medidora
	public List<Cajamedidor> Cajamedidorlist() {
		return find(Cajamedidor.class, "FROM Cajamedidor");
	}

	public Cajamedidor FindIdCajamedidor(int IdCajaMedidor) {
		StringBuffer queryBuffer = new StringBuffer();
		queryBuffer.append(" FROM Cajamedidor  WHERE IdCajaMedidor=" + IdCajaMedidor);
		return findFirst(Cajamedidor.class, queryBuffer.toString());
	}

	public void updateCajamedidor(Cajamedidor caja) {
		this.update(caja);
	}

	// Caja registradora
	public List<Cajaregistradora> cajaregistradoralist() {
		return find(Cajaregistradora.class, "FROM Cajaregistradora");
	}

	public Cajaregistradora FindIdCajaRegistradora(int IdCajaRegistradora) {
		StringBuffer queryBuffer = new StringBuffer();
		queryBuffer.append(" FROM Cajaregistradora  WHERE IdCajaRegistradora=" + IdCajaRegistradora);
		return findFirst(Cajaregistradora.class, queryBuffer.toString());
	}

	public void updateCajaregistradora(Cajaregistradora cajare) {
		this.update(cajare);
	}

	// Camaapoyo
	public List<Camaapoyo> Camaapoyolist() {
		return find(Camaapoyo.class, "FROM Camaapoyo");
	}

	public Camaapoyo FindIdCamaapoyo(int IdCama) {
		StringBuffer queryBuffer = new StringBuffer();
		queryBuffer.append(" FROM Camaapoyo  WHERE IdCama=" + IdCama);
		return findFirst(Camaapoyo.class, queryBuffer.toString());
	}

	public void updateCamaapoyo(Camaapoyo cama) {
		this.update(cama);
	}

	// Eliminacionexedente
	public List<Eliminacionexedente> Eliminacionexedentelist() {
		return find(Eliminacionexedente.class, "FROM Eliminacionexedente");
	}

	public Eliminacionexedente FindIdEliminacionexedente(int IdEliminacion) {
		StringBuffer queryBuffer = new StringBuffer();
		queryBuffer.append(" FROM Eliminacionexedente  WHERE IdEliminacion=" + IdEliminacion);
		return findFirst(Eliminacionexedente.class, queryBuffer.toString());
	}

	public void updateEliminacionexedente(Eliminacionexedente eliminacion) {
		this.update(eliminacion);
	}

	// Empalmered
	public List<Empalmered> Empalmeredlist() {
		return find(Empalmered.class, "FROM Empalmered");
	}

	public Empalmered FindIdEmpalmered(int IdEmpalmeRed) {
		StringBuffer queryBuffer = new StringBuffer();
		queryBuffer.append(" FROM Empalmered  WHERE IdEmpalmeRed=" + IdEmpalmeRed);
		return findFirst(Empalmered.class, queryBuffer.toString());
	}

	public void updateEmpalmered(Empalmered empalme) {
		this.update(empalme);
	}

	// Pruebahidraulica
	public List<Pruebahidraulica> PruebaHidraulicalist() {
		return find(Pruebahidraulica.class, "FROM Pruebahidraulica");
	}

	public Pruebahidraulica FindIdPruebahidraulica(int IdPruebaHidraulica) {
		StringBuffer queryBuffer = new StringBuffer();
		queryBuffer.append(" FROM Pruebahidraulica  WHERE IdPruebaHidraulica=" + IdPruebaHidraulica);
		return findFirst(Pruebahidraulica.class, queryBuffer.toString());
	}

	public void updatePruebahidraulica(Pruebahidraulica empalme) {
		this.update(empalme);
	}

	// Relleno
	public List<Relleno> Rellenolist() {
		return find(Relleno.class, "FROM Relleno");
	}

	public Relleno FindIdRelleno(int IdRelleno) {
		StringBuffer queryBuffer = new StringBuffer();
		queryBuffer.append(" FROM Relleno  WHERE IdRelleno=" + IdRelleno);
		return findFirst(Relleno.class, queryBuffer.toString());
	}

	public void updateRelleno(Relleno relleno) {
		this.update(relleno);
	}

	// Reposicion
	public List<Reposicion> Reposicionlist() {
		return find(Reposicion.class, "FROM Reposicion");
	}

	public Reposicion FindIdReposicion(int IdReposicion) {
		StringBuffer queryBuffer = new StringBuffer();
		queryBuffer.append(" FROM Reposicion  WHERE IdReposicion=" + IdReposicion);
		return findFirst(Reposicion.class, queryBuffer.toString());
	}

	public void updateReposicion(Reposicion reposicion) {
		this.update(reposicion);
	}

	// Rotura
	public List<Rotura> Roturalist() {
		return find(Rotura.class, "FROM Rotura");
	}

	public Rotura FindIdRotura(int IdRotura) {
		StringBuffer queryBuffer = new StringBuffer();
		queryBuffer.append(" FROM Rotura  WHERE IdRotura=" + IdRotura);
		return findFirst(Rotura.class, queryBuffer.toString());
	}

	public void updateRotura(Rotura rotura) {
		this.update(rotura);

	}

	// Tendido
	public List<Tendido> Tendidolist() {
		return find(Tendido.class, "FROM Tendido");
	}

	public Tendido FindIdTendido(int IdTendido) {
		StringBuffer queryBuffer = new StringBuffer();
		queryBuffer.append(" FROM Tendido  WHERE IdTendido=" + IdTendido);
		return findFirst(Tendido.class, queryBuffer.toString());
	}

	public void updateTendido(Tendido tendido) {
		this.update(tendido);
	}

	// Vereda
	public List<Vereda> Veredalist() {
		return find(Vereda.class, "FROM Vereda");
	}

	public Vereda FindIdVereda(int IdVereda) {
		StringBuffer queryBuffer = new StringBuffer();
		queryBuffer.append(" FROM Vereda  WHERE IdVereda=" + IdVereda);
		return findFirst(Vereda.class, queryBuffer.toString());
	}

	public void updateVereda(Vereda vereda) {
		this.update(vereda);
	}

	// pruebas
	public List<Camposalcantarillado> listaralcantarillado() {
		return find(Camposalcantarillado.class, "from Camposalcantarillado");
	}

}