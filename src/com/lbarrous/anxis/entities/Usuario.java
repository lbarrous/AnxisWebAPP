package com.lbarrous.anxis.entities;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Usuario {
        @PrimaryKey
        @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
        Key id_usuario;
        @Persistent
        String Nick;
        @Persistent
        String Password;
        @Persistent
        String SemillaPassword;
        
        
		
		public Key getId_usuario() {
			return id_usuario;
		}
		public void setId_usuario(Key id_usuario) {
			this.id_usuario = id_usuario;
		}
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
		public String getSemillaPassword() {
			return SemillaPassword;
		}
		public void setSemillaPassword(String semillaPassword) {
			SemillaPassword = semillaPassword;
		}

}