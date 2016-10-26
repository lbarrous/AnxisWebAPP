package com.lbarrous.anxis.entities;

import java.util.Date;

import javax.jdo.annotations.Extension;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class RegistroMensajes {

	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    @Extension(vendorName="datanucleus", key="gae.encoded-pk", value="true")
    String id_envio;
	@Persistent
    String id_paciente;
	@Persistent
    String nombre_paciente;
	@Persistent
    String id_test;
	@Persistent
    String nombre_test;
    @Persistent
    Date fechaFinalizacion;
	
}
