package pe.gob.edu.empssapal.core.domain;

import java.io.Serializable;
import java.sql.Date;

public class Camposalcantarillado extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 0L;
	
	private String interesado;
	private Date fecha;
	private Double distancia;
	private Camaapoyo camaapoyo;
	private Excavacion excavacion;
	private Pruebahidraulica pruebahidrahulica;
	private Diametroalcantarillado diametroalcantarilado;
	private Eliminacionexedente eliminacionexcedente;
	private Relleno relleno;
	private Empalmered empalmered;
	private Tipopista tipopista;
	private Vereda vereda;
	
	public String getInteresado() {
		return interesado;
	}
	public void setInteresado(String interesado) {
		this.interesado = interesado;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Double getDistancia() {
		return distancia;
	}
	public void setDistancia(Double distancia) {
		this.distancia = distancia;
	}
	public Camaapoyo getCamaapoyo() {
		return camaapoyo;
	}
	public void setCamaapoyo(Camaapoyo camaapoyo) {
		this.camaapoyo = camaapoyo;
	}
	public Excavacion getExcavacion() {
		return excavacion;
	}
	public void setExcavacion(Excavacion excavacion) {
		this.excavacion = excavacion;
	}
	public Pruebahidraulica getPruebahidrahulica() {
		return pruebahidrahulica;
	}
	public void setPruebahidrahulica(Pruebahidraulica pruebahidrahulica) {
		this.pruebahidrahulica = pruebahidrahulica;
	}
	public Diametroalcantarillado getDiametroalcantarilado() {
		return diametroalcantarilado;
	}
	public void setDiametroalcantarilado(Diametroalcantarillado diametroalcantarilado) {
		this.diametroalcantarilado = diametroalcantarilado;
	}
	public Eliminacionexedente getEliminacionexcedente() {
		return eliminacionexcedente;
	}
	public void setEliminacionexcedente(Eliminacionexedente eliminacionexcedente) {
		this.eliminacionexcedente = eliminacionexcedente;
	}
	public Relleno getRelleno() {
		return relleno;
	}
	public void setRelleno(Relleno relleno) {
		this.relleno = relleno;
	}
	public Empalmered getEmpalmered() {
		return empalmered;
	}
	public void setEmpalmered(Empalmered empalmered) {
		this.empalmered = empalmered;
	}
	public Tipopista getTipopista() {
		return tipopista;
	}
	public void setTipopista(Tipopista tipopista) {
		this.tipopista = tipopista;
	}
	public Vereda getVereda() {
		return vereda;
	}
	public void setVereda(Vereda vereda) {
		this.vereda = vereda;
	}

}
