package pe.gob.edu.empssapal.core.domain;

import java.io.Serializable;

public class Empalmered extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 0L;
	
	private String nombrediametro;
	private String tipoempalme;
	private String tiposervicioempalme;
	private Double precioempalme;
	
	
	
	public String getNombrediametro() {
		return nombrediametro;
	}
	public void setNombrediametro(String nombrediametro) {
		this.nombrediametro = nombrediametro;
	}
	public String getTipoempalme() {
		return tipoempalme;
	}
	public void setTipoempalme(String tipoempalme) {
		this.tipoempalme = tipoempalme;
	}
	public String getTiposervicioempalme() {
		return tiposervicioempalme;
	}
	public void setTiposervicioempalme(String tiposervicioempalme) {
		this.tiposervicioempalme = tiposervicioempalme;
	}
	public Double getPrecioempalme() {
		return precioempalme;
	}
	public void setPrecioempalme(Double precioempalme) {
		this.precioempalme = precioempalme;
	}
	

}
