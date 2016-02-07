package pe.gob.edu.empssapal.core.domain;

import java.io.Serializable;

public class Eliminacionexedente extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 0L;
	
	private String tiposervicioeliminacion;
	private Double 	costoeliminacion;
	
	
	public String getTiposervicioeliminacion() {
		return tiposervicioeliminacion;
	}
	public void setTiposervicioeliminacion(String tiposervicioeliminacion) {
		this.tiposervicioeliminacion = tiposervicioeliminacion;
	}
	public Double getCostoeliminacion() {
		return costoeliminacion;
	}
	public void setCostoeliminacion(Double costoeliminacion) {
		this.costoeliminacion = costoeliminacion;
	}

	
	
	


}
