package com.lbarrous.anxis.entities;

import java.util.Date;

import javax.jdo.annotations.Extension;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Encuesta {
        @PrimaryKey
        @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
        @Extension(vendorName="datanucleus", key="gae.encoded-pk", value="true")
        String id_encuesta;
        @Persistent
        int Miedo;
        @Persistent
        int Ansiedad;
		@Persistent
        int SensacionFisica;
        @Persistent
        int Confianza;
        @Persistent
        int PrevisionMejora;
        @Persistent
        int General;
        @Persistent
        String PacienteEncuesta;
        @Persistent
        Date Fecha;
        
        
        
		public String getPacienteEncuesta() {
			return PacienteEncuesta;
		}
		public void setPacienteEncuesta(String pacienteEncuesta) {
			PacienteEncuesta = pacienteEncuesta;
		}
		public Date getFecha() {
			return Fecha;
		}
		public void setFecha(Date fecha) {
			Fecha = fecha;
		}
		
		
		public String getId_encuesta() {
			return id_encuesta;
		}
		public void setId_encuesta(String id_encuesta) {
			this.id_encuesta = id_encuesta;
		}
		public int getMiedo() {
			return Miedo;
		}
		public void setMiedo(int miedo) {
			Miedo = miedo;
		}
		public int getAnsiedad() {
			return Ansiedad;
		}
		public void setAnsiedad(int ansiedad) {
			Ansiedad = ansiedad;
		}
		public int getSensacionFisica() {
			return SensacionFisica;
		}
		public void setSensacionFisica(int sensacionFisica) {
			SensacionFisica = sensacionFisica;
		}
		public int getConfianza() {
			return Confianza;
		}
		public void setConfianza(int confianza) {
			Confianza = confianza;
		}
		public int getPrevisionMejora() {
			return PrevisionMejora;
		}
		public void setPrevisionMejora(int previsionMejora) {
			PrevisionMejora = previsionMejora;
		}
		public int getGeneral() {
			return General;
		}
		public void setGeneral(int general) {
			General = general;
		}
        
}