package com.lbarrous.anxis.entities;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.jdo.annotations.Column;
import javax.jdo.annotations.Extension;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Test {
        @PrimaryKey
        @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
        @Extension(vendorName="datanucleus", key="gae.encoded-pk", value="true")
        String id_test;
        @Persistent
        String Titulo;
        @Persistent
        String Descripcion;
        @Persistent
        List<String> ActividadesTest;
        @Persistent
        String MedicoCreador;
        @Persistent
        List<String> PacientesAsociados;
        @Persistent
        Date fechaFinalizacion;
        
        
		public String getTitulo() {
			return Titulo;
		}
		public void setTitulo(String titulo) {
			Titulo = titulo;
		}
		public String getMedicoCreador() {
			return MedicoCreador;
		}
		public void setMedicoCreador(String medicoCreador) {
			MedicoCreador = medicoCreador;
		}
		
		public List<String> getPacientesAsociados() {
			return PacientesAsociados;
		}
		public void setPacientesAsociados(List<String> pacientesAsociados) {
			PacientesAsociados = pacientesAsociados;
		}
		public Date getFechaFinalizacion() {
			return fechaFinalizacion;
		}
		public void setFechaFinalizacion(Date fechaFinalizacion) {
			this.fechaFinalizacion = fechaFinalizacion;
		}
		
		
		public String getId_test() {
			return id_test;
		}
		public void setId_test(String id_test) {
			this.id_test = id_test;
		}
		public String getDescripcion() {
			return Descripcion;
		}
		public void setDescripcion(String descripcion) {
			Descripcion = descripcion;
		}
		public List<String> getActividadesTest() {
			return ActividadesTest;
		}
		public void setActividadesTest(List<String> actividadesTest) {
			ActividadesTest = actividadesTest;
		}
		
        
        
        
}