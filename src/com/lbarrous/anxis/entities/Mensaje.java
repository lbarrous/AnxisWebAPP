package com.lbarrous.anxis.entities;

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
public class Mensaje {
        @PrimaryKey
        @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
        @Extension(vendorName="datanucleus", key="gae.encoded-pk", value="true")
        String id_mensaje;
        @Persistent
        @Column(defaultValue="0")
        int visto;
        @Persistent
        String idMedicoReceptorMensaje;
        @Persistent
        String idPacienteReceptorMensaje;
        
        
        
		public String getIdMedicoReceptorMensaje() {
			return idMedicoReceptorMensaje;
		}
		public void setIdMedicoReceptorMensaje(String idMedicoReceptorMensaje) {
			this.idMedicoReceptorMensaje = idMedicoReceptorMensaje;
		}
		public String getIdPacienteReceptorMensaje() {
			return idPacienteReceptorMensaje;
		}
		public void setIdPacienteReceptorMensaje(String idPacienteReceptorMensaje) {
			this.idPacienteReceptorMensaje = idPacienteReceptorMensaje;
		}
		public int getVisto() {
			return visto;
		}
		public void setVisto(int visto) {
			this.visto = visto;
		}
		
		
		public String getId_mensaje() {
			return id_mensaje;
		}
		public void setId_mensaje(String id_mensaje) {
			this.id_mensaje = id_mensaje;
		}
		public String getTitulo() {
			return Titulo;
		}
		public void setTitulo(String titulo) {
			Titulo = titulo;
		}
		public String getMensaje() {
			return Mensaje;
		}
		public void setMensaje(String mensaje) {
			Mensaje = mensaje;
		}
		@Persistent
        String Titulo;
        @Persistent
        String Mensaje;
        
}