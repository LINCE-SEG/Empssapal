package pe.gob.edu.empssapal.core.domain;

import java.io.Serializable;

public class Excavacion extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 0L;
	
	private String servicicioexcavacion;
	private Double precioexcavacion;
	
	
	public String getServicicioexcavacion() {
		return servicicioexcavacion;
	}
	public void setServicicioexcavacion(String servicicioexcavacion) {
		this.servicicioexcavacion = servicicioexcavacion;
	}
	public Double getPrecioexcavacion() {
		return precioexcavacion;
	}
	public void setPrecioexcavacion(Double precioexcavacion) {
		this.precioexcavacion = precioexcavacion;
	}


}
