package com.lbarrous.anxis.entities;

import java.util.Date;

import javax.jdo.annotations.Extension;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Pregunta {

	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    @Extension(vendorName="datanucleus", key="gae.encoded-pk", value="true")
    String id_pregunta;
	@Persistent
    String texto_pregunta;
	@Persistent
    String ActividadAsociada;
	
	
	
	public String getActividadAsociada() {
		return ActividadAsociada;
	}
	public void setActividadAsociada(String actividadAsociada) {
		ActividadAsociada = actividadAsociada;
	}
	public String getId_pregunta() {
		return id_pregunta;
	}
	public void setId_pregunta(String id_pregunta) {
		this.id_pregunta = id_pregunta;
	}
	public String getTexto_pregunta() {
		return texto_pregunta;
	}
	public void setTexto_pregunta(String texto_pregunta) {
		this.texto_pregunta = texto_pregunta;
	}
	
	
    
}
