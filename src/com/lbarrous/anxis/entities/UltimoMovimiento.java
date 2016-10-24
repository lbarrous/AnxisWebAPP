package com.lbarrous.anxis.entities;

import java.util.Date;

import javax.jdo.annotations.Extension;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

public final class UltimoMovimiento {

	private String nombre_Paciente;
	private String nombre_test;
	
	public String getNombre_Paciente() {
		return nombre_Paciente;
	}
	public void setNombre_Paciente(String nombre_Paciente) {
		this.nombre_Paciente = nombre_Paciente;
	}
	public String getNombre_test() {
		return nombre_test;
	}
	public void setNombre_test(String nombre_test) {
		this.nombre_test = nombre_test;
	}
	
	
    
}
