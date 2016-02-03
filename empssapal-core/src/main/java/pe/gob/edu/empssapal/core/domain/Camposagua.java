package pe.gob.edu.empssapal.core.domain;

import java.io.Serializable;
import java.sql.Date;

public class Camposagua extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 0L;

	
	private String interesado;
	private Date fecha;
	private String fechas;

	private Double distancia;
	private Vereda vereda;
	private Tipopista pista;
	private Diametroagua diametroagua;
	private Empalmered empalmered;
	private Eliminacionexedente eliminacionexedente;
	private Relleno relleno;
	private Camaapoyo camaapoyo;
	private Pruebahidraulica pruebahidraulica;
	private Excavacion excavacion;
	
	public String getFechas() {
		return fechas;
	}
	public void setFechas(String fechas) {
		this.fechas = fechas;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public String getInteresado() {
		return interesado;
	}
	public void setInteresado(String interesado) {
		this.interesado = interesado;
	}

	public Double getDistancia() {
		return distancia;
	}
	public void setDistancia(Double distancia) {
		this.distancia = distancia;
	}
	public Vereda getVereda() {
		return vereda;
	}
	public void setVereda(Vereda vereda) {
		this.vereda = vereda;
	}
	public Tipopista getPista() {
		return pista;
	}
	public void setPista(Tipopista pista) {
		this.pista = pista;
	}
	public Diametroagua getDiametroagua() {
		return diametroagua;
	}
	public void setDiametroagua(Diametroagua diametroagua) {
		this.diametroagua = diametroagua;
	}
	public Empalmered getEmpalmered() {
		return empalmered;
	}
	public void setEmpalmered(Empalmered empalmered) {
		this.empalmered = empalmered;
	}
	public Eliminacionexedente getEliminacionexedente() {
		return eliminacionexedente;
	}
	public void setEliminacionexedente(Eliminacionexedente eliminacionexedente) {
		this.eliminacionexedente = eliminacionexedente;
	}
	public Relleno getRelleno() {
		return relleno;
	}
	public void setRelleno(Relleno relleno) {
		this.relleno = relleno;
	}
	public Camaapoyo getCamaapoyo() {
		return camaapoyo;
	}
	public void setCamaapoyo(Camaapoyo camaapoyo) {
		this.camaapoyo = camaapoyo;
	}
	public Pruebahidraulica getPruebahidraulica() {
		return pruebahidraulica;
	}
	public void setPruebahidraulica(Pruebahidraulica pruebahidraulica) {
		this.pruebahidraulica = pruebahidraulica;
	}
	public Excavacion getExcavacion() {
		return excavacion;
	}
	public void setExcavacion(Excavacion excavacion) {
		this.excavacion = excavacion;
	}
	
}
