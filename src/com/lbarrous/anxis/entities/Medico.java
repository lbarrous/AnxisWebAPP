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
public class Medico {
        @PrimaryKey
        @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
        @Extension(vendorName="datanucleus", key="gae.encoded-pk", value="true")
        String id_medico;
        @Persistent
        String Nick;
        @Persistent
        String Password;
        @Persistent
        String Nombre;
        @Persistent
        String Apellidos;
        @Persistent
        String Direccion;
        @Persistent
        String Provincia;
        @Persistent
        String Localidad;
        @Persistent
        String CodigoPostal;
        @Persistent
        String Email;
        @Persistent
        String Telefono;
        
        @Persistent
        List<String> Pacientes;
        @Persistent
        List<String> TestMedico;
        @Persistent
        List<String> Mensajes;
        
        
		public String getNick() {
			return Nick;
		}
		public void setNick(String nick) {
			Nick = nick;
		}
		public String getPassword() {
			return Password;
		}
		public void setPassword(String password) {
			Password = password;
		}
		
		public List<String> getMensajes() {
			return Mensajes;
		}
		public void setMensajes(List<String> mensajes) {
			Mensajes = mensajes;
		}
		
		
		public List<String> getPacientes() {
			return Pacientes;
		}
		public void setPacientes(List<String> pacientes) {
			Pacientes = pacientes;
		}
		public List<String> getTestMedico() {
			return TestMedico;
		}
		public void setTestMedico(List<String> testMedico) {
			TestMedico = testMedico;
		}
		public String getId_medico() {
			return id_medico;
		}
		public void setId_medico(String id_medico) {
			this.id_medico = id_medico;
		}
		public String getNombre() {
			return Nombre;
		}
		public void setNombre(String nombre) {
			Nombre = nombre;
		}
		public String getApellidos() {
			return Apellidos;
		}
		public void setApellidos(String apellidos) {
			Apellidos = apellidos;
		}
		public String getDireccion() {
			return Direccion;
		}
		public void setDireccion(String direccion) {
			Direccion = direccion;
		}
		public String getProvincia() {
			return Provincia;
		}
		public void setProvincia(String provincia) {
			Provincia = provincia;
		}
		public String getLocalidad() {
			return Localidad;
		}
		public void setLocalidad(String localidad) {
			Localidad = localidad;
		}
		public String getCodigoPostal() {
			return CodigoPostal;
		}
		public void setCodigoPostal(String codigoPostal) {
			CodigoPostal = codigoPostal;
		}
		public String getEmail() {
			return Email;
		}
		public void setEmail(String email) {
			Email = email;
		}
		public String getTelefono() {
			return Telefono;
		}
		public void setTelefono(String telefono) {
			Telefono = telefono;
		}
}