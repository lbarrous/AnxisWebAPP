package com.lbarrous.anxis.entities;

import java.util.List;

import javax.jdo.annotations.Extension;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Actividad {
        @PrimaryKey
        @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
        @Extension(vendorName="datanucleus", key="gae.encoded-pk", value="true")
        String id_actividad;
        @Persistent
        String Titulo;
        @Persistent
        String Descripcion;
        @Persistent
        String TestAsociado;
        @Persistent
        List<String> PreguntasActividad;
        
        
		
		public List<String> getPreguntasActividad() {
			return PreguntasActividad;
		}
		public void setPreguntasActividad(List<String> preguntasActividad) {
			PreguntasActividad = preguntasActividad;
		}
		public String getTestAsociado() {
			return TestAsociado;
		}
		public void setTestAsociado(String testAsociado) {
			TestAsociado = testAsociado;
		}
		
		public String getId_actividad() {
			return id_actividad;
		}
		public void setId_actividad(String id_actividad) {
			this.id_actividad = id_actividad;
		}
		public String getTitulo() {
			return Titulo;
		}
		public void setTitulo(String titulo) {
			Titulo = titulo;
		}
		public String getDescripcion() {
			return Descripcion;
		}
		public void setDescripcion(String descripcion) {
			Descripcion = descripcion;
		}
        
}