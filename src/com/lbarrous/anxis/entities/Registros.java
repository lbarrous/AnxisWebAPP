package com.lbarrous.anxis.entities;

import javax.jdo.annotations.Extension;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

public class Registros {
	
	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    @Extension(vendorName="datanucleus", key="gae.encoded-pk", value="true")
    String id_registro;
    @Persistent
    String email_validado;
	public String getId_registro() {
		return id_registro;
	}
	public void setId_registro(String id_registro) {
		this.id_registro = id_registro;
	}
	public String getEmail_validado() {
		return email_validado;
	}
	public void setEmail_validado(String email_validado) {
		this.email_validado = email_validado;
	}
    
    
}
