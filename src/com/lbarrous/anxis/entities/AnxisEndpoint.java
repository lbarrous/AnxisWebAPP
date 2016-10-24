package com.lbarrous.anxis.entities;

import com.lbarrous.anxis.entities.PMF;
import com.google.api.server.spi.auth.common.User;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiMethod.HttpMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.response.CollectionResponse;
import com.google.api.server.spi.response.UnauthorizedException;
import com.google.appengine.api.datastore.Cursor;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.datanucleus.query.JDOCursorHelper;

import java.util.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import javax.annotation.Nullable;
import javax.inject.Named;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.jdo.annotations.Column;
import javax.jdo.annotations.Persistent;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.response.CollectionResponse;
import com.google.appengine.api.datastore.Cursor;
import com.google.appengine.datanucleus.query.JDOCursorHelper;

import java.util.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import javax.annotation.Nullable;
import javax.inject.Named;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;

@Api(name = "anxisendpoint", namespace = @ApiNamespace(ownerDomain = "example.com", ownerName = "example.com", packagePath = "com.example.entities"))
public class AnxisEndpoint {

	/**
	 * Metodos de listado de entidades insertadas en el datastore
	 * Usan HTTP GET y paginacion
	 * @return una clase CollectionResponse que contiene la lista de entidades persistidas y un cursor a la siguiente pagina
	 */
	
	
	@SuppressWarnings({ "unchecked", "unused" })
	
	/*@ApiMethod(name = "listMedicos")
	public CollectionResponse<Medico> getMedicos(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {

		PersistenceManager mgr = null;
		Cursor cursor = null;
		List<Medico> execute = null;

		try {
			mgr = getPersistenceManager();
			Query query = mgr.newQuery(Medico.class);
			if (cursorString != null && cursorString != "") {
				cursor = Cursor.fromWebSafeString(cursorString);
				HashMap<String, Object> extensionMap = new HashMap<String, Object>();
				extensionMap.put(JDOCursorHelper.CURSOR_EXTENSION, cursor);
				query.setExtensions(extensionMap);
			}

			if (limit != null) {
				query.setRange(0, limit);
			}

			execute = (List<Medico>) query.execute();
			cursor = JDOCursorHelper.getCursor(execute);
			if (cursor != null)
				cursorString = cursor.toWebSafeString();

			// Tight loop for fetching all entities from datastore and accomodate
			// for lazy fetch.
			for (Medico obj : execute)
				;
		} finally {
			mgr.close();
		}

		return CollectionResponse.<Medico> builder().setItems(execute)
				.setNextPageToken(cursorString).build();
	}
	
	
	@ApiMethod(name = "listPacientes")
	public CollectionResponse<Paciente> getPacientes(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {

		PersistenceManager mgr = null;
		Cursor cursor = null;
		List<Paciente> execute = null;

		try {
			mgr = getPersistenceManager();
			Query query = mgr.newQuery(Paciente.class);
			if (cursorString != null && cursorString != "") {
				cursor = Cursor.fromWebSafeString(cursorString);
				HashMap<String, Object> extensionMap = new HashMap<String, Object>();
				extensionMap.put(JDOCursorHelper.CURSOR_EXTENSION, cursor);
				query.setExtensions(extensionMap);
			}

			if (limit != null) {
				query.setRange(0, limit);
			}

			execute = (List<Paciente>) query.execute();
			cursor = JDOCursorHelper.getCursor(execute);
			if (cursor != null)
				cursorString = cursor.toWebSafeString();

			// Tight loop for fetching all entities from datastore and accomodate
			// for lazy fetch.
			for (Paciente obj : execute)
				;
		} finally {
			mgr.close();
		}

		return CollectionResponse.<Paciente> builder().setItems(execute)
				.setNextPageToken(cursorString).build();
	}
	
	
	@ApiMethod(name = "listUsuarios")
	public CollectionResponse<Usuario> getUsuarios(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {

		PersistenceManager mgr = null;
		Cursor cursor = null;
		List<Usuario> execute = null;

		try {
			mgr = getPersistenceManager();
			Query query = mgr.newQuery(Usuario.class);
			if (cursorString != null && cursorString != "") {
				cursor = Cursor.fromWebSafeString(cursorString);
				HashMap<String, Object> extensionMap = new HashMap<String, Object>();
				extensionMap.put(JDOCursorHelper.CURSOR_EXTENSION, cursor);
				query.setExtensions(extensionMap);
			}

			if (limit != null) {
				query.setRange(0, limit);
			}

			execute = (List<Usuario>) query.execute();
			cursor = JDOCursorHelper.getCursor(execute);
			if (cursor != null)
				cursorString = cursor.toWebSafeString();

			// Tight loop for fetching all entities from datastore and accomodate
			// for lazy fetch.
			for (Usuario obj : execute)
				;
		} finally {
			mgr.close();
		}

		return CollectionResponse.<Usuario> builder().setItems(execute)
				.setNextPageToken(cursorString).build();
	}
	
	
	@ApiMethod(name = "listEncuestas")
	public CollectionResponse<Encuesta> getEncuestas(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {

		PersistenceManager mgr = null;
		Cursor cursor = null;
		List<Encuesta> execute = null;

		try {
			mgr = getPersistenceManager();
			Query query = mgr.newQuery(Usuario.class);
			if (cursorString != null && cursorString != "") {
				cursor = Cursor.fromWebSafeString(cursorString);
				HashMap<String, Object> extensionMap = new HashMap<String, Object>();
				extensionMap.put(JDOCursorHelper.CURSOR_EXTENSION, cursor);
				query.setExtensions(extensionMap);
			}

			if (limit != null) {
				query.setRange(0, limit);
			}

			execute = (List<Encuesta>) query.execute();
			cursor = JDOCursorHelper.getCursor(execute);
			if (cursor != null)
				cursorString = cursor.toWebSafeString();

			// Tight loop for fetching all entities from datastore and accomodate
			// for lazy fetch.
			for (Encuesta obj : execute)
				;
		} finally {
			mgr.close();
		}

		return CollectionResponse.<Encuesta> builder().setItems(execute)
				.setNextPageToken(cursorString).build();
	}
	
	
	@ApiMethod(name = "listTests")
	public CollectionResponse<Test> getTests(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {

		PersistenceManager mgr = null;
		Cursor cursor = null;
		List<Test> execute = null;

		try {
			mgr = getPersistenceManager();
			Query query = mgr.newQuery(Test.class);
			if (cursorString != null && cursorString != "") {
				cursor = Cursor.fromWebSafeString(cursorString);
				HashMap<String, Object> extensionMap = new HashMap<String, Object>();
				extensionMap.put(JDOCursorHelper.CURSOR_EXTENSION, cursor);
				query.setExtensions(extensionMap);
			}

			if (limit != null) {
				query.setRange(0, limit);
			}

			execute = (List<Test>) query.execute();
			cursor = JDOCursorHelper.getCursor(execute);
			if (cursor != null)
				cursorString = cursor.toWebSafeString();

			// Tight loop for fetching all entities from datastore and accomodate
			// for lazy fetch.
			for (Test obj : execute)
				;
		} finally {
			mgr.close();
		}

		return CollectionResponse.<Test> builder().setItems(execute)
				.setNextPageToken(cursorString).build();
	}
	
	
	@ApiMethod(name = "listMensajes")
	public CollectionResponse<Mensaje> getMensajes(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {

		PersistenceManager mgr = null;
		Cursor cursor = null;
		List<Mensaje> execute = null;

		try {
			mgr = getPersistenceManager();
			Query query = mgr.newQuery(Mensaje.class);
			if (cursorString != null && cursorString != "") {
				cursor = Cursor.fromWebSafeString(cursorString);
				HashMap<String, Object> extensionMap = new HashMap<String, Object>();
				extensionMap.put(JDOCursorHelper.CURSOR_EXTENSION, cursor);
				query.setExtensions(extensionMap);
			}

			if (limit != null) {
				query.setRange(0, limit);
			}

			execute = (List<Mensaje>) query.execute();
			cursor = JDOCursorHelper.getCursor(execute);
			if (cursor != null)
				cursorString = cursor.toWebSafeString();

			// Tight loop for fetching all entities from datastore and accomodate
			// for lazy fetch.
			for (Mensaje obj : execute)
				;
		} finally {
			mgr.close();
		}

		return CollectionResponse.<Mensaje> builder().setItems(execute)
				.setNextPageToken(cursorString).build();
	}*/
	
	
	
	
	
	/**
	 * Metodos PACIENTE
	 */
	
	
	/****************************************************************************************************************/
	
	@ApiMethod(name = "registrarPaciente", scopes = {Constants.EMAIL_SCOPE, Constants.PROFILE_SCOPE},
			clientIds = {Constants.WEB_CLIENT_ID, 
				     Constants.ANDROID_CLIENT_ID, 
				     com.google.api.server.spi.Constant.API_EXPLORER_CLIENT_ID},
				     audiences = {Constants.ANDROID_AUDIENCE})
	public Paciente registrarPaciente(Paciente paciente, User user) throws UnauthorizedException {
		
		if (user == null) throw new UnauthorizedException("User is Not Valid");
		
		if(pacienteEnBD(user.getId())) throw new UnauthorizedException("Account already registered");
		
		PersistenceManager mgr = null;
		
		paciente.setEncuestas(new ArrayList<String>());
		paciente.setTestAsociados(new ArrayList<String>());
		paciente.setMensajes(new ArrayList<String>());
		paciente.setId_google(user.getId());
		
		try {
			mgr = getPersistenceManager();
			mgr.makePersistent(paciente);
			
		} finally {
			mgr.close();
		}
		
		return paciente;
		
		
	}
	
	@ApiMethod(name = "validacionPaciente", scopes = {Constants.EMAIL_SCOPE, Constants.PROFILE_SCOPE},
			clientIds = {Constants.WEB_CLIENT_ID, 
				     Constants.ANDROID_CLIENT_ID, 
				     com.google.api.server.spi.Constant.API_EXPLORER_CLIENT_ID},
				     audiences = {Constants.ANDROID_AUDIENCE})
	public Paciente validarPaciente(@Named("id_paciente") String id_paciente, @Named("valido") int valido, User user) throws UnauthorizedException {
		
		if (user == null) throw new UnauthorizedException("User is Not Valid");
		
		if(!user.getEmail().equalsIgnoreCase("alvaro093@gmail.com")) throw new UnauthorizedException("Admin tool");
		
		PersistenceManager mgr = null;
		Paciente nuevo_registro = getPacienteByID(id_paciente);
		
		nuevo_registro.setValidado(valido);

			try {
				mgr = getPersistenceManager();
				mgr.makePersistent(nuevo_registro);
				
			} finally {
				mgr.close();
			}
			
			return nuevo_registro;
	}
	
	@ApiMethod(name = "loginPaciente", path = "loginPaciente", scopes = {Constants.EMAIL_SCOPE, Constants.PROFILE_SCOPE},
			clientIds = {Constants.WEB_CLIENT_ID, 
				     Constants.ANDROID_CLIENT_ID, 
				     com.google.api.server.spi.Constant.API_EXPLORER_CLIENT_ID},
				     audiences = {Constants.ANDROID_AUDIENCE})
	public Paciente loginPaciente(User user) throws UnauthorizedException {

		if (user == null) throw new UnauthorizedException("User is Not Valid");

		Paciente paciente_login = null;
		paciente_login = getPacienteByIDGoogle(user.getId());
		
		if(paciente_login.getValidado() == 0)
			throw new UnauthorizedException("Invalid account.");
		
		return paciente_login;
	}
	
	@ApiMethod(name = "getMedicoAsociadoPaciente", path = "getMedicoAsociadoPaciente", scopes = {Constants.EMAIL_SCOPE, Constants.PROFILE_SCOPE},
			clientIds = {Constants.WEB_CLIENT_ID, 
				     Constants.ANDROID_CLIENT_ID, 
				     com.google.api.server.spi.Constant.API_EXPLORER_CLIENT_ID},
				     audiences = {Constants.ANDROID_AUDIENCE})
	public Medico getMedicoAsociadoByIDPaciente( User user) throws UnauthorizedException {

		Paciente paciente = loginPaciente(user);
		
		//paciente = getPacienteByID(id_paciente);
		
		if(paciente.getMedicoAsociado() == null)
			return null;
		else
			return getMedicoByID(paciente.getMedicoAsociado());
	}

	
	@ApiMethod(name = "getMensajesTotalesPaciente", path = "getMensajesTotalesPaciente", scopes = {Constants.EMAIL_SCOPE, Constants.PROFILE_SCOPE},
			clientIds = {Constants.WEB_CLIENT_ID, 
				     Constants.ANDROID_CLIENT_ID, 
				     com.google.api.server.spi.Constant.API_EXPLORER_CLIENT_ID},
				     audiences = {Constants.ANDROID_AUDIENCE})
	public CollectionResponse<Mensaje> getMensajesTotalesByIDPaciente(User user) throws UnauthorizedException {

		Paciente paciente = loginPaciente(user);
		List<Mensaje> mensajes = new ArrayList<Mensaje>();
		
		PersistenceManager mgr = null;

		try {
			mgr = getPersistenceManager();
			for (String obj : paciente.getMensajes()) {
				Key k = KeyFactory.stringToKey(obj);
				Mensaje m = mgr.getObjectById(Mensaje.class, k);
				mensajes.add(m);
			}
			
		} finally {
			mgr.close();
		}
		
		return CollectionResponse.<Mensaje> builder().setItems(mensajes).build();
	}
	
	@ApiMethod(name = "getMensajesPorLeerPaciente", path = "getMensajesPorLeerPaciente", scopes = {Constants.EMAIL_SCOPE, Constants.PROFILE_SCOPE},
			clientIds = {Constants.WEB_CLIENT_ID, 
				     Constants.ANDROID_CLIENT_ID, 
				     com.google.api.server.spi.Constant.API_EXPLORER_CLIENT_ID},
				     audiences = {Constants.ANDROID_AUDIENCE})
	public CollectionResponse<Mensaje> getMensajesPorLeerByIDPaciente(User user) throws UnauthorizedException {

		Paciente paciente = loginPaciente(user);
		
		PersistenceManager pm = PMF.get().getPersistenceManager();  
	    Query query = pm.newQuery("select from "+Mensaje.class.getName()+" WHERE idPacienteReceptorMensaje == keyParam && visto == s");
	    query.declareParameters("int s, String keyParam");
	    @SuppressWarnings("unchecked")
	    
		List<Mensaje> results = (List<Mensaje>) query.execute(0, paciente.getId_paciente());

		return CollectionResponse.<Mensaje> builder().setItems(results).build();
	}
	
	@ApiMethod(name = "sendMensajeMedicoPaciente", scopes = {Constants.EMAIL_SCOPE, Constants.PROFILE_SCOPE},
			clientIds = {Constants.WEB_CLIENT_ID, 
				     Constants.ANDROID_CLIENT_ID, 
				     com.google.api.server.spi.Constant.API_EXPLORER_CLIENT_ID},
				     audiences = {Constants.ANDROID_AUDIENCE})
	public Mensaje sendMensajeMedicoByIDPaciente(Mensaje mensaje, User user) throws UnauthorizedException {

		PersistenceManager mgr = null;
		Medico medicoenvio = null;

		medicoenvio = getMedicoByID(loginPaciente(user).getMedicoAsociado());
		mensaje.setIdMedicoReceptorMensaje(medicoenvio.getId_medico());
		
		try {
			mgr = getPersistenceManager();
			
			mgr.makePersistent(mensaje);
			medicoenvio.getMensajes().add(mensaje.getId_mensaje());
			mgr.makePersistent(medicoenvio);
			
		} finally {
			mgr.close();
		}
		
		return mensaje;
	}
	
	@ApiMethod(name = "setMensajeLeidoPaciente", scopes = {Constants.EMAIL_SCOPE, Constants.PROFILE_SCOPE},
			clientIds = {Constants.WEB_CLIENT_ID, 
				     Constants.ANDROID_CLIENT_ID, 
				     com.google.api.server.spi.Constant.API_EXPLORER_CLIENT_ID},
				     audiences = {Constants.ANDROID_AUDIENCE})
	public Mensaje setMensajeLeidoByIDPaciente(@Named("id_mensaje") String id_mensaje, User user) throws UnauthorizedException {

		PersistenceManager mgr = null;
		Mensaje mensaje_leido = null;

		mensaje_leido = getMensajeByIDMensajePaciente(loginPaciente(user).getId_paciente(), id_mensaje);
		
		mensaje_leido.setVisto(1);
		
		try {
			mgr = getPersistenceManager();
			mgr.makePersistent(mensaje_leido);
			
		} finally {
			mgr.close();
		}
		
		return mensaje_leido;
	}
	
	@ApiMethod(name = "borrarMensajePaciente", scopes = {Constants.EMAIL_SCOPE, Constants.PROFILE_SCOPE},
			clientIds = {Constants.WEB_CLIENT_ID, 
				     Constants.ANDROID_CLIENT_ID, 
				     com.google.api.server.spi.Constant.API_EXPLORER_CLIENT_ID},
				     audiences = {Constants.ANDROID_AUDIENCE})
	public void borrarMensajePaciente(@Named("id_mensaje") String id_mensaje, User user) throws UnauthorizedException {

		PersistenceManager mgr = null;
		Paciente paciente = null;
		Mensaje mensaje = null;
		
		paciente = getPacienteByID(loginPaciente(user).getId_paciente());

		mensaje = getMensajeByIDMensajePaciente(loginPaciente(user).getId_paciente(), id_mensaje);
		
		paciente.getMensajes().remove(mensaje.getId_mensaje());
		
		try {
			mgr = getPersistenceManager();
			mgr.makePersistent(paciente);
			
		} finally {
			mgr.close();
		}
	}
	
	@ApiMethod(name = "getMediaEncuestasPaciente", path = "getMediaEncuestasPaciente", scopes = {Constants.EMAIL_SCOPE, Constants.PROFILE_SCOPE},
			clientIds = {Constants.WEB_CLIENT_ID, 
				     Constants.ANDROID_CLIENT_ID, 
				     com.google.api.server.spi.Constant.API_EXPLORER_CLIENT_ID},
				     audiences = {Constants.ANDROID_AUDIENCE})
	public CollectionResponse<Float> getMediaEncuestasPaciente(User user) throws UnauthorizedException {

			Paciente paciente = null;
	        float Miedo = 0;
	        float Ansiedad = 0;
	        float SensacionFisica = 0;
	        float Confianza = 0;
	        float PrevisionMejora = 0;
	        float General = 0;
	        int num_encuestas = 0;
	        List<Float> medias = new ArrayList<Float>();
		List<Paciente> pacientes = new ArrayList<Paciente>();
		
		paciente = loginPaciente(user);
		
		PersistenceManager mgr = null;

		try {
			mgr = getPersistenceManager();
				
			for(String obj2 : paciente.getEncuestas()) {
				Key k2 = KeyFactory.stringToKey(obj2);
				Encuesta e = mgr.getObjectById(Encuesta.class, k2);
				Miedo += e.getMiedo();
		        Ansiedad += e.getAnsiedad();
		        SensacionFisica += e.getSensacionFisica();
		        Confianza += e.getConfianza();
		        PrevisionMejora += e.getPrevisionMejora();
		        General += e.getGeneral();
		        num_encuestas++;
			}
			
			medias.add(Miedo/num_encuestas);
			medias.add(Ansiedad/num_encuestas);
			medias.add(SensacionFisica/num_encuestas);
			medias.add(Confianza/num_encuestas);
			medias.add(PrevisionMejora/num_encuestas);
			medias.add(General/num_encuestas);
			
		} finally {
			mgr.close();
		}
		
		return CollectionResponse.<Float> builder().setItems(medias).build();
	}
	
	@ApiMethod(name = "getListaTestsPaciente", path = "getListaTestsPaciente", scopes = {Constants.EMAIL_SCOPE, Constants.PROFILE_SCOPE},
			clientIds = {Constants.WEB_CLIENT_ID, 
				     Constants.ANDROID_CLIENT_ID, 
				     com.google.api.server.spi.Constant.API_EXPLORER_CLIENT_ID},
				     audiences = {Constants.ANDROID_AUDIENCE})
	public CollectionResponse<Test> getListaTestsByIDPaciente(User user) throws UnauthorizedException {

		List<Test> testasociados = new ArrayList<Test>();

		testasociados = getTestsAsociadosByIDPaciente(loginPaciente(user).getId_paciente());

		return CollectionResponse.<Test> builder().setItems(testasociados).build();
	}
	
	@ApiMethod(name = "getListaEncuestasPaciente", path = "getListaEncuestasPaciente", scopes = {Constants.EMAIL_SCOPE, Constants.PROFILE_SCOPE},
			clientIds = {Constants.WEB_CLIENT_ID, 
				     Constants.ANDROID_CLIENT_ID, 
				     com.google.api.server.spi.Constant.API_EXPLORER_CLIENT_ID},
				     audiences = {Constants.ANDROID_AUDIENCE})
	public CollectionResponse<Encuesta> getListaEncuestasByIDPaciente(User user) throws UnauthorizedException {

		List<Encuesta> encuestas = new ArrayList<Encuesta>();

		encuestas = getEncuestasAsociadasByIDPaciente(loginPaciente(user).getId_paciente());

		return CollectionResponse.<Encuesta> builder().setItems(encuestas).build();
	}
	
	
	@ApiMethod(name = "setTestFinalizadoPaciente", scopes = {Constants.EMAIL_SCOPE, Constants.PROFILE_SCOPE},
			clientIds = {Constants.WEB_CLIENT_ID, 
				     Constants.ANDROID_CLIENT_ID, 
				     com.google.api.server.spi.Constant.API_EXPLORER_CLIENT_ID},
				     audiences = {Constants.ANDROID_AUDIENCE})
	public RegistroTest finalizarTestPaciente(@Named("id_test") String id_test, User user) throws UnauthorizedException {

		PersistenceManager mgr = null;
		List<Test> testasociados = new ArrayList<Test>();
		Test test_cambio = null;
		RegistroTest nuevo_test = new RegistroTest();

		try {
			mgr = getPersistenceManager();
			testasociados = getTestsAsociadosByIDPaciente(loginPaciente(user).getId_paciente());
			for (Test obj : testasociados) {
				if(obj.getId_test().equals(id_test)) {
					nuevo_test.setId_paciente(loginPaciente(user).getId_paciente());
					nuevo_test.setId_test(id_test);
					nuevo_test.setFechaFinalizacion(new Date());
					mgr.makePersistent(nuevo_test);
				}
			}
		} finally {
			mgr.close();
		}

		return nuevo_test;
	}
	
	@ApiMethod(name = "realizarEncuestaPaciente", path = "realizarEncuestaPaciente", scopes = {Constants.EMAIL_SCOPE, Constants.PROFILE_SCOPE},
			clientIds = {Constants.WEB_CLIENT_ID, 
				     Constants.ANDROID_CLIENT_ID, 
				     com.google.api.server.spi.Constant.API_EXPLORER_CLIENT_ID},
				     audiences = {Constants.ANDROID_AUDIENCE})
	public Encuesta realizarEncuestaPaciente(Encuesta encuesta, User user) throws UnauthorizedException {

		PersistenceManager mgr = null;
		Paciente paciente = null;
		paciente = getPacienteByID(loginPaciente(user).getId_paciente());
		encuesta.setPacienteEncuesta(paciente.getId_paciente());
		

		try {
			mgr = getPersistenceManager();
			mgr.makePersistent(encuesta);
			paciente.getEncuestas().add(encuesta.getId_encuesta());
			mgr.makePersistent(paciente);
			
		} finally {
			mgr.close();
		}

		return encuesta;
	}

	
	@ApiMethod(name = "getListaTestFinalizadosPaciente", path = "getListaTestFinalizadosPaciente", httpMethod = HttpMethod.GET, scopes = {Constants.EMAIL_SCOPE, Constants.PROFILE_SCOPE},
			clientIds = {Constants.WEB_CLIENT_ID, 
				     Constants.ANDROID_CLIENT_ID, 
				     com.google.api.server.spi.Constant.API_EXPLORER_CLIENT_ID},
				     audiences = {Constants.ANDROID_AUDIENCE})
	public CollectionResponse<Test> getListaTestsFinalizadosByIDPaciente(User user) throws UnauthorizedException {

		List<Test> testfinalizados = new ArrayList<Test>();
		PersistenceManager mgr = null;
		
		Paciente paciente = null;
		paciente = getPacienteByID(loginPaciente(user).getId_paciente());

		mgr = getPersistenceManager();
		
		try {
			Query query = mgr.newQuery("select from " + RegistroTest.class.getName()
			        + " where id_paciente == '" +paciente.getId_paciente()+"'" );
			List<RegistroTest> results = (List<RegistroTest>) query.execute();
			
			for (RegistroTest obj : results) {
				if(!testfinalizados.contains(getTestByID(obj.getId_test())))
					testfinalizados.add(getTestByID(obj.getId_test()));
			}
			
		} finally {
			mgr.close();
		}

		return CollectionResponse.<Test> builder().setItems(testfinalizados).build();
	}
	
	@ApiMethod(name = "getListaTestPorIniciarPaciente", path = "getListaTestPorIniciarPaciente", httpMethod = HttpMethod.GET, scopes = {Constants.EMAIL_SCOPE, Constants.PROFILE_SCOPE},
			clientIds = {Constants.WEB_CLIENT_ID, 
				     Constants.ANDROID_CLIENT_ID, 
				     com.google.api.server.spi.Constant.API_EXPLORER_CLIENT_ID},
				     audiences = {Constants.ANDROID_AUDIENCE})
	public CollectionResponse<Test> getListaTestsPorIniciarByIDPaciente(User user) throws UnauthorizedException {

		List<Test> testfinalizados = new ArrayList<Test>();
		List<Test> testporiniciar = new ArrayList<Test>();
		List<Test> testasociados = new ArrayList<Test>();
		PersistenceManager mgr = null;
		
		Paciente paciente = null;
		paciente = getPacienteByID(loginPaciente(user).getId_paciente());
		testasociados = getTestsAsociadosByIDPaciente(loginPaciente(user).getId_paciente());

		mgr = getPersistenceManager();
		
		try {
			Query query = mgr.newQuery("select from " + RegistroTest.class.getName()
			        + " where id_paciente == '" +paciente.getId_paciente()+"'" );
			List<RegistroTest> results = (List<RegistroTest>) query.execute();
			
			for (RegistroTest obj : results) {
				if(!testfinalizados.contains(getTestByID(obj.getId_test())))
					testfinalizados.add(getTestByID(obj.getId_test()));
			}
			
			for (Test obj : testasociados) {
				if(!testfinalizados.contains(obj))
					testporiniciar.add(obj);
			}
			
			
			
		} finally {
			mgr.close();
		}

		return CollectionResponse.<Test> builder().setItems(testporiniciar).build();
	}
	
	@ApiMethod(name = "updatePaciente", scopes = {Constants.EMAIL_SCOPE, Constants.PROFILE_SCOPE},
			clientIds = {Constants.WEB_CLIENT_ID, 
				     Constants.ANDROID_CLIENT_ID, 
				     com.google.api.server.spi.Constant.API_EXPLORER_CLIENT_ID},
				     audiences = {Constants.ANDROID_AUDIENCE})
	public Paciente updatePaciente(Paciente guardar, User user) throws UnauthorizedException {
		PersistenceManager mgr = getPersistenceManager();
		Paciente paciente = null;
		try {
			if (!containsPaciente(loginPaciente(user).getId_paciente())) {
				throw new EntityNotFoundException("Este medico no existe en nuestra base de datos");
			}
			Key k = KeyFactory.stringToKey(loginPaciente(user).getId_paciente());
			//Key k = KeyFactory.createKey(Paciente.class.getSimpleName(), id_paciente);
			paciente = mgr.getObjectById(Paciente.class, k);
			
			paciente.setApellidos(guardar.getApellidos());
			paciente.setCodigoPostal(guardar.getCodigoPostal());
			paciente.setDireccion(guardar.getDireccion());
			paciente.setLocalidad(guardar.getLocalidad());
			paciente.setNombre(guardar.getNombre());
			paciente.setProvincia(guardar.getProvincia());
			paciente.setTelefono(guardar.getTelefono());
			
			mgr.makePersistent(paciente);
		} finally {
			mgr.close();
		}
		return paciente;
	}

	private boolean containsPaciente(String id_paciente) {
		PersistenceManager mgr = getPersistenceManager();
		boolean contains = true;
		try {
			Key k = KeyFactory.stringToKey(id_paciente);
			//Key k = KeyFactory.createKey(Paciente.class.getSimpleName(), id_paciente);
			mgr.getObjectById(Paciente.class, k);
		} catch (javax.jdo.JDOObjectNotFoundException ex) {
			contains = false;
		} finally {
			mgr.close();
		}
		return contains;
	}
	
	private boolean mailPacienteRepe(Paciente paciente) {
		PersistenceManager mgr = getPersistenceManager();
		boolean repe = false;
		
		Query query = mgr.newQuery("select from " + Medico.class.getName()
		        + " where Email== '" +paciente.getEmail()+"'" );
		List<Paciente> results = (List<Paciente>) query.execute();
		
		if (!results.isEmpty()) {
			repe = true;
		}
		
		return repe;
	}
	
	private Paciente getPacienteByID(String id_paciente) {
		Paciente paciente = null;
		PersistenceManager mgr = null;
		try {
			mgr = getPersistenceManager();
			
			Key k = KeyFactory.stringToKey(id_paciente);
			//Key k = KeyFactory.createKey(Paciente.class.getSimpleName(), id_paciente);
			paciente = mgr.getObjectById(Paciente.class, k);
		} finally {
			mgr.close();
		}
		return paciente;
	}
	
	private Paciente getPacienteByIDGoogle(String id_google) {
		Paciente paciente = null;
		PersistenceManager mgr = null;
		try {
			mgr = getPersistenceManager();
			Query query = mgr.newQuery("select from " + Paciente.class.getName()
			        + " where id_google == '" +id_google+"'" );
			List<Paciente> results = (List<Paciente>) query.execute();
			paciente = results.get(0);
		} finally {
			mgr.close();
		}
		return paciente;
	}
	
	private boolean pacienteEnBD(String id_google) {
		boolean ya_registrado = true;
		PersistenceManager mgr = null;
		try {
			mgr = getPersistenceManager();
			Query query = mgr.newQuery("select from " + Paciente.class.getName()
			        + " where id_google == '" +id_google+"'" );
			List<Paciente> results = (List<Paciente>) query.execute();

			if(results.isEmpty()) {
				ya_registrado = false;
			}
		} finally {
			mgr.close();
		}
		return ya_registrado;
	}
	
	private List<Test> getTestsAsociadosByIDPaciente(String id_paciente) {
		PersistenceManager mgr = null;
		Paciente paciente = null;
		List<Test> testasociados = new ArrayList<Test>();

		try {
			mgr = getPersistenceManager();
			paciente = getPacienteByID(id_paciente);
			
			for (String obj : paciente.getTestAsociados()) {
				Key k = KeyFactory.stringToKey(obj);
				Test m = mgr.getObjectById(Test.class, k);
				testasociados.add(m);
			}
		} finally {
			mgr.close();
		}
		
		return testasociados;
	}
	
	private List<Encuesta> getEncuestasAsociadasByIDPaciente(String id_paciente) {
		PersistenceManager mgr = null;
		Paciente paciente = null;
		List<Encuesta> encuestasasociadas = new ArrayList<Encuesta>();

		try {
			mgr = getPersistenceManager();
			paciente = getPacienteByID(id_paciente);
			
			for (String obj : paciente.getEncuestas()) {
				Key k = KeyFactory.stringToKey(obj);
				Encuesta m = mgr.getObjectById(Encuesta.class, k);
				encuestasasociadas.add(m);
			}
			
		} finally {
			mgr.close();
		}
		
		return encuestasasociadas;
	}
	
	private Test getTestAsociadoByIDTestPaciente(String id_paciente, String id_test) {
		Paciente paciente = null;
		Test testconcreto = null;
		
		paciente = getPacienteByID(id_paciente);
		
		for (String obj : paciente.getTestAsociados()) {
			if(obj.equals(id_test)) {
				testconcreto = getTestByID(obj);
			}
		}

		return testconcreto;
	}
	
	private Mensaje getMensajeByIDMensajePaciente(String id_paciente, String id_mensaje) {
		Paciente paciente = null;
		Mensaje mensajeconcreto = null;
		
		paciente = getPacienteByID(id_paciente);
		
		for (String obj : paciente.getMensajes()) {
			if(obj.equals(id_mensaje)) {
				mensajeconcreto = getMensajeByID(obj);
			}
		}

		return mensajeconcreto;
	}
	
	private Mensaje getMensajeByID(String id_mensaje) {
		Mensaje mensaje = null;
		PersistenceManager mgr = null;
		try {
			mgr = getPersistenceManager();
			
			Key k = KeyFactory.stringToKey(id_mensaje);
			//Key k = KeyFactory.createKey(Paciente.class.getSimpleName(), id_paciente);
			mensaje = mgr.getObjectById(Mensaje.class, k);
		} finally {
			mgr.close();
		}
		return mensaje;
	}
	
	
	/****************************************************************************************************************/
	
	
	
	/**
	 * Metodos MEDICO
	 */
	
	
	/****************************************************************************************************************/
	
	@ApiMethod(name = "registrarMedico", scopes = {Constants.EMAIL_SCOPE, Constants.PROFILE_SCOPE},
			clientIds = {Constants.WEB_CLIENT_ID, 
				     Constants.ANDROID_CLIENT_ID, 
				     com.google.api.server.spi.Constant.API_EXPLORER_CLIENT_ID},
				     audiences = {Constants.ANDROID_AUDIENCE})
	public Medico registrarMedico(Medico medico, User user) throws UnauthorizedException {
		
		if (user == null) throw new UnauthorizedException("User is Not Valid");
		
		if(medicoEnBD(user.getId())) throw new UnauthorizedException("Account already registered");
		
		PersistenceManager mgr = null;
		
		medico.setMensajes(new ArrayList<String>());
		medico.setPacientes(new ArrayList<String>());
		medico.setTestMedico(new ArrayList<String>());
		
		medico.setId_google(user.getId());
		
		try {
			mgr = getPersistenceManager();
			mgr.makePersistent(medico);
			
		} finally {
			mgr.close();
		}
		
		return medico;
	}
	
	@ApiMethod(name = "validacionMedico")
	public Medico validarMedico(@Named("id_medico") String id_medico, @Named("valido") int valido, User user) throws UnauthorizedException {
		
		if (user == null) throw new UnauthorizedException("User is Not Valid");
		
		if(!user.getEmail().equalsIgnoreCase("alvaro093@gmail.com")) throw new UnauthorizedException("Admin tool");
		
		PersistenceManager mgr = null;
		Medico nuevo_registro = getMedicoByID(id_medico);
		
		nuevo_registro.setValidado(valido);

			try {
				mgr = getPersistenceManager();
				mgr.makePersistent(nuevo_registro);
				
			} finally {
				mgr.close();
			}
			return nuevo_registro;
	}
	
	@ApiMethod(name = "loginMedico", path = "loginMedico", scopes = {Constants.EMAIL_SCOPE, Constants.PROFILE_SCOPE},
			clientIds = {Constants.WEB_CLIENT_ID, 
				     Constants.ANDROID_CLIENT_ID, 
				     com.google.api.server.spi.Constant.API_EXPLORER_CLIENT_ID},
				     audiences = {Constants.ANDROID_AUDIENCE})
	public Medico loginMedico(User user) throws UnauthorizedException {
		
		if (user == null) throw new UnauthorizedException("User is Not Valid");

		Medico medico_login = null;
		medico_login = getMedicoByIDGoogle(user.getId());
		
		if(medico_login.getValidado() == 0)
			throw new UnauthorizedException("Invalid account.");
		
		return medico_login;
	}
	
	@ApiMethod(name = "getPacientesSinMedico", path = "getPacientesSinMedico", scopes = {Constants.EMAIL_SCOPE, Constants.PROFILE_SCOPE},
			clientIds = {Constants.WEB_CLIENT_ID, 
				     Constants.ANDROID_CLIENT_ID, 
				     com.google.api.server.spi.Constant.API_EXPLORER_CLIENT_ID},
				     audiences = {Constants.ANDROID_AUDIENCE})
	public CollectionResponse<Paciente> getPacientesSinMedico(User user) throws UnauthorizedException {

		Medico medico = loginMedico(user);
		List<Paciente> pacientes_sin_medico = new ArrayList<Paciente>();
		
		PersistenceManager mgr = null;
		mgr = getPersistenceManager();

		try {
			
			Query query = mgr.newQuery("select from " + Paciente.class.getName()
			        + " where MedicoAsociado == null && validado == 1" );
			List<Paciente> results = (List<Paciente>) query.execute();
			
			
			for (Paciente obj : results) {
				pacientes_sin_medico.add(obj);
			}
			
		} finally {
			mgr.close();
		}
		
		
		return CollectionResponse.<Paciente> builder().setItems(pacientes_sin_medico).build();
	}
	
	@ApiMethod(name = "getPacientesAsociadosMedico", path = "getPacientesAsociadosMedico", scopes = {Constants.EMAIL_SCOPE, Constants.PROFILE_SCOPE},
			clientIds = {Constants.WEB_CLIENT_ID, 
				     Constants.ANDROID_CLIENT_ID, 
				     com.google.api.server.spi.Constant.API_EXPLORER_CLIENT_ID},
				     audiences = {Constants.ANDROID_AUDIENCE})
	public CollectionResponse<Paciente> getPacientesAsociadosByIDMedico(User user) throws UnauthorizedException {

		Medico medico = null;
		List<Paciente> pacientes = new ArrayList<Paciente>();
		
		medico = loginMedico(user);
		
		PersistenceManager mgr = null;

		try {
			mgr = getPersistenceManager();
			for (String obj : medico.getPacientes()) {
				Key k = KeyFactory.stringToKey(obj);
				Paciente m = mgr.getObjectById(Paciente.class, k);
				pacientes.add(m);
			}
			
		} finally {
			mgr.close();
		}
		
		return CollectionResponse.<Paciente> builder().setItems(pacientes).build();
	}
	
	@ApiMethod(name = "getMediaEncuestasPacientesMedico", path = "getMediaEncuestasPacientesMedico", scopes = {Constants.EMAIL_SCOPE, Constants.PROFILE_SCOPE},
			clientIds = {Constants.WEB_CLIENT_ID, 
				     Constants.ANDROID_CLIENT_ID, 
				     com.google.api.server.spi.Constant.API_EXPLORER_CLIENT_ID},
				     audiences = {Constants.ANDROID_AUDIENCE})
	public CollectionResponse<Float> getMediaEncuestasPacientesMedico(User user) throws UnauthorizedException {

		Medico medico = null;
		Encuesta encuesta = new Encuesta();
	        float Miedo = 0;
	        float Ansiedad = 0;
	        float SensacionFisica = 0;
	        float Confianza = 0;
	        float PrevisionMejora = 0;
	        float General = 0;
	        int num_encuestas = 0;
	        List<Float> medias = new ArrayList<Float>();
		List<Paciente> pacientes = new ArrayList<Paciente>();
		
		medico = loginMedico(user);
		
		PersistenceManager mgr = null;

		try {
			mgr = getPersistenceManager();
			if(!medico.getPacientes().isEmpty()) {
				
				for (String obj : medico.getPacientes()) {
					Key k = KeyFactory.stringToKey(obj);
					Paciente m = mgr.getObjectById(Paciente.class, k);
					
					for(String obj2 : m.getEncuestas()) {
						Key k2 = KeyFactory.stringToKey(obj2);
						Encuesta e = mgr.getObjectById(Encuesta.class, k2);
						Miedo += e.getMiedo();
				        Ansiedad += e.getAnsiedad();
				        SensacionFisica += e.getSensacionFisica();
				        Confianza += e.getConfianza();
				        PrevisionMejora += e.getPrevisionMejora();
				        General += e.getGeneral();
				        num_encuestas++;
					}
					
				}
			}
			
			medias.add(Miedo/num_encuestas);
			medias.add(Ansiedad/num_encuestas);
			medias.add(SensacionFisica/num_encuestas);
			medias.add(Confianza/num_encuestas);
			medias.add(PrevisionMejora/num_encuestas);
			medias.add(General/num_encuestas);
			
		} finally {
			mgr.close();
		}
		
		return CollectionResponse.<Float> builder().setItems(medias).build();
	}
	
	@ApiMethod(name = "getTestsRealizadosPacientesMedico", path = "getTestsRealizadosPacientesMedico", scopes = {Constants.EMAIL_SCOPE, Constants.PROFILE_SCOPE},
			clientIds = {Constants.WEB_CLIENT_ID, 
				     Constants.ANDROID_CLIENT_ID, 
				     com.google.api.server.spi.Constant.API_EXPLORER_CLIENT_ID},
				     audiences = {Constants.ANDROID_AUDIENCE})
	public CollectionResponse<Integer> getTestsRealizadosPacientesMedico(User user) throws UnauthorizedException {

		Medico medico = null;
		Encuesta encuesta = new Encuesta();
	        int ninguna = 0;
	        int una_dos = 0;
	        int tres_cinco = 0;
	        int seis_nueve = 0;
	        int diez_o_mas = 0;
	        
	        List<Integer> porcentajes_encuestas = new ArrayList<Integer>();
		List<Paciente> pacientes = new ArrayList<Paciente>();
		
		medico = loginMedico(user);
		
		PersistenceManager mgr = null;

		try {
			mgr = getPersistenceManager();
			if(!medico.getPacientes().isEmpty()) {
				
				for (String obj : medico.getPacientes()) {
					Key k = KeyFactory.stringToKey(obj);
					Paciente m = mgr.getObjectById(Paciente.class, k);
					
					Query query = mgr.newQuery("select from " + RegistroTest.class.getName()
					        + " where id_paciente == '" +m.getId_paciente()+"'" );
					List<RegistroTest> results = (List<RegistroTest>) query.execute();
					
					if(results.size() < 1)
						ninguna += 1;
					else if(results.size() > 0 && results.size() < 3)
						una_dos += 1;
					else if(results.size() > 2 && results.size() < 6)
						tres_cinco += 1;
					else if(results.size() > 5 && results.size() < 10)
						seis_nueve += 1;
					else if(results.size() >= 10)
						diez_o_mas += 1;
					
				}
			}
			
			porcentajes_encuestas.add(ninguna);
			porcentajes_encuestas.add(una_dos);
			porcentajes_encuestas.add(tres_cinco);
			porcentajes_encuestas.add(seis_nueve);
			porcentajes_encuestas.add(diez_o_mas);
			
		} finally {
			mgr.close();
		}
		
		return CollectionResponse.<Integer> builder().setItems(porcentajes_encuestas).build();
	}

	
	@ApiMethod(name = "getMensajesTotalesMedico", path = "getMensajesTotalesMedico", scopes = {Constants.EMAIL_SCOPE, Constants.PROFILE_SCOPE},
			clientIds = {Constants.WEB_CLIENT_ID, 
				     Constants.ANDROID_CLIENT_ID, 
				     com.google.api.server.spi.Constant.API_EXPLORER_CLIENT_ID},
				     audiences = {Constants.ANDROID_AUDIENCE})
	public CollectionResponse<Mensaje> getMensajesTotalesByIDMedico(User user) throws UnauthorizedException {
		
		Medico medico = null;
		List<Mensaje> mensajes = new ArrayList<Mensaje>();
		medico = loginMedico(user);
		
		PersistenceManager mgr = null;

		try {
			mgr = getPersistenceManager();
			for (String obj : medico.getMensajes()) {
				Key k = KeyFactory.stringToKey(obj);
				Mensaje m = mgr.getObjectById(Mensaje.class, k);
				mensajes.add(m);
			}
			
		} finally {
			mgr.close();
		}
		
		return CollectionResponse.<Mensaje> builder().setItems(mensajes).build();

	}
	
	@ApiMethod(name = "getMensajesPorLeerMedico", path = "getMensajesPorLeerMedico", scopes = {Constants.EMAIL_SCOPE, Constants.PROFILE_SCOPE},
			clientIds = {Constants.WEB_CLIENT_ID, 
				     Constants.ANDROID_CLIENT_ID, 
				     com.google.api.server.spi.Constant.API_EXPLORER_CLIENT_ID},
				     audiences = {Constants.ANDROID_AUDIENCE})
	public CollectionResponse<Mensaje> getMensajesPorLeerByIDMedico(User user) throws UnauthorizedException {

		Medico medico = loginMedico(user);
		PersistenceManager pm = PMF.get().getPersistenceManager();  
	    Query query = pm.newQuery("select from "+Mensaje.class.getName()+" WHERE idMedicoReceptorMensaje == keyParam && visto == s");
	    query.declareParameters("int s, String keyParam");
	    @SuppressWarnings("unchecked")
		List<Mensaje> results = (List<Mensaje>) query.execute(0, medico.getId_medico());

		return CollectionResponse.<Mensaje> builder().setItems(results).build();
	}
	
	@ApiMethod(name = "sendMensajePacienteMedico", scopes = {Constants.EMAIL_SCOPE, Constants.PROFILE_SCOPE},
			clientIds = {Constants.WEB_CLIENT_ID, 
				     Constants.ANDROID_CLIENT_ID, 
				     com.google.api.server.spi.Constant.API_EXPLORER_CLIENT_ID},
				     audiences = {Constants.ANDROID_AUDIENCE})
	public Mensaje sendMensajePacienteByIDMedico(@Named("id_paciente") String id_paciente,
			Mensaje mensaje, User user) throws UnauthorizedException {

		PersistenceManager mgr = null;
		Paciente pacienteenvio = null;

		pacienteenvio = getPacienteConcretoByIDPacienteMedico(loginMedico(user).getId_medico(), id_paciente);
		mensaje.setIdPacienteReceptorMensaje(pacienteenvio.getId_paciente());
		
		
		try {
			mgr = getPersistenceManager();
			mgr.makePersistent(mensaje);
			pacienteenvio.getMensajes().add(mensaje.getId_mensaje());
			mgr.makePersistent(pacienteenvio);
			
		} finally {
			mgr.close();
		}
		
		return mensaje;
	}
	
	@ApiMethod(name = "setMensajeLeidoMedico", scopes = {Constants.EMAIL_SCOPE, Constants.PROFILE_SCOPE},
			clientIds = {Constants.WEB_CLIENT_ID, 
				     Constants.ANDROID_CLIENT_ID, 
				     com.google.api.server.spi.Constant.API_EXPLORER_CLIENT_ID},
				     audiences = {Constants.ANDROID_AUDIENCE})
	public Mensaje setMensajeLeidoByIDMedico(@Named("id_mensaje") String id_mensaje, User user) throws UnauthorizedException {

		PersistenceManager mgr = null;
		Mensaje mensaje_leido = null;

		mensaje_leido = getMensajeByIDMensajeMedico(loginMedico(user).getId_medico(), id_mensaje);
		
		mensaje_leido.setVisto(1);
		
		try {
			mgr = getPersistenceManager();
			mgr.makePersistent(mensaje_leido);
			
		} finally {
			mgr.close();
		}
		
		return mensaje_leido;
	}
	
	@ApiMethod(name = "borrarMensajeMedico", scopes = {Constants.EMAIL_SCOPE, Constants.PROFILE_SCOPE},
			clientIds = {Constants.WEB_CLIENT_ID, 
				     Constants.ANDROID_CLIENT_ID, 
				     com.google.api.server.spi.Constant.API_EXPLORER_CLIENT_ID},
				     audiences = {Constants.ANDROID_AUDIENCE})
	public void borrarMensajeMedico(@Named("id_mensaje") String id_mensaje, User user) throws UnauthorizedException {

		PersistenceManager mgr = null;
		Medico medico = null;
		Mensaje mensaje = null;
		
		medico = loginMedico(user);

		mensaje = getMensajeByIDMensajeMedico(loginMedico(user).getId_medico(), id_mensaje);
		
		medico.getMensajes().remove(mensaje.getId_mensaje());
		
		try {
			mgr = getPersistenceManager();
			mgr.makePersistent(medico);
			//mgr.deletePersistent(mensaje);
			
		} finally {
			mgr.close();
		}
	}
	
	@ApiMethod(name = "getPacienteConcretoMedico", scopes = {Constants.EMAIL_SCOPE, Constants.PROFILE_SCOPE},
			clientIds = {Constants.WEB_CLIENT_ID, 
				     Constants.ANDROID_CLIENT_ID, 
				     com.google.api.server.spi.Constant.API_EXPLORER_CLIENT_ID},
				     audiences = {Constants.ANDROID_AUDIENCE})
	public Paciente getPacienteConcretoMedico(@Named("id_paciente") String id_paciente, User user) throws UnauthorizedException {

		Paciente pacienteconcreto = null;
		
		pacienteconcreto = getPacienteConcretoByIDPacienteMedico(loginMedico(user).getId_medico(), id_paciente);

		return pacienteconcreto;
	}
	
	@ApiMethod(name = "getUltimosMovimientosTestPaciente", path = "getUltimosMovimientosTestPaciente", scopes = {Constants.EMAIL_SCOPE, Constants.PROFILE_SCOPE},
			clientIds = {Constants.WEB_CLIENT_ID, 
				     Constants.ANDROID_CLIENT_ID, 
				     com.google.api.server.spi.Constant.API_EXPLORER_CLIENT_ID},
				     audiences = {Constants.ANDROID_AUDIENCE})
	public CollectionResponse<UltimoMovimiento> getUltimosMovimientosTestPaciente(User user) throws UnauthorizedException {

		List<Encuesta> encuestas = new ArrayList<Encuesta>();
		Medico medico = loginMedico(user);
		ArrayList<String> id_pacientes = new ArrayList<String>();
		ArrayList<UltimoMovimiento> movimientos = new ArrayList<UltimoMovimiento>();
		
		for(String obj : medico.getPacientes()) {
			id_pacientes.add(obj);
		}
		
		PersistenceManager mgr = null;
		mgr = getPersistenceManager();

		Query q = mgr.newQuery("select from "+RegistroTest.class.getName()+" where :p1.contains(id_paciente) order by id_registro desc");
		q.setRange(0, 5);
		List<RegistroTest> results = (List<RegistroTest>) q.execute(id_pacientes);
		
		for(RegistroTest obj : results) {
			UltimoMovimiento m = new UltimoMovimiento();
			m.setNombre_Paciente(getPacienteByID(obj.getId_paciente()).getNombre()+" "+getPacienteByID(obj.getId_paciente()).getApellidos());
			m.setNombre_test(getTestByID(obj.getId_test()).getTitulo());
			movimientos.add(m);
		}

		return CollectionResponse.<UltimoMovimiento> builder().setItems(movimientos).build();
	}
	
	@ApiMethod(name = "addPacienteMedico", scopes = {Constants.EMAIL_SCOPE, Constants.PROFILE_SCOPE},
			clientIds = {Constants.WEB_CLIENT_ID, 
				     Constants.ANDROID_CLIENT_ID, 
				     com.google.api.server.spi.Constant.API_EXPLORER_CLIENT_ID},
				     audiences = {Constants.ANDROID_AUDIENCE})
	public Paciente addPacienteMedico(Paciente paciente, User user) throws UnauthorizedException {

		PersistenceManager mgr = null;
		Medico medico = null;
		
		medico = loginMedico(user);
		
		paciente.setEncuestas(new ArrayList<String>());
		paciente.setTestAsociados(new ArrayList<String>());
		paciente.setMedicoAsociado(medico.getId_medico());
		paciente.setMensajes(new ArrayList<String>());
		
		try {
			mgr = getPersistenceManager();
			mgr.makePersistent(paciente);
			medico.getPacientes().add(paciente.getId_paciente());
			mgr.makePersistent(medico);
			
		} finally {
			mgr.close();
		}
		
		return paciente;
		
	}
	
	@ApiMethod(name = "addPacienteByIDMedico", path = "addPacienteByIDMedico", scopes = {Constants.EMAIL_SCOPE, Constants.PROFILE_SCOPE},
			clientIds = {Constants.WEB_CLIENT_ID, 
				     Constants.ANDROID_CLIENT_ID, 
				     com.google.api.server.spi.Constant.API_EXPLORER_CLIENT_ID},
				     audiences = {Constants.ANDROID_AUDIENCE})
	public Paciente addPacienteByIDMedico(@Named("id_paciente") String id_paciente, User user) throws UnauthorizedException {

		PersistenceManager mgr = null;
		Medico medico = null;
		
		medico = loginMedico(user);
		
		Paciente paciente = getPacienteByID(id_paciente);
		
		paciente.setEncuestas(new ArrayList<String>());
		paciente.setTestAsociados(new ArrayList<String>());
		paciente.setMedicoAsociado(medico.getId_medico());
		paciente.setMensajes(new ArrayList<String>());
		
		try {
			mgr = getPersistenceManager();
			mgr.makePersistent(paciente);
			medico.getPacientes().add(paciente.getId_paciente());
			mgr.makePersistent(medico);
			
		} finally {
			mgr.close();
		}
		
		return paciente;
		
	}
	
	@ApiMethod(name = "borrarPacienteMedico", scopes = {Constants.EMAIL_SCOPE, Constants.PROFILE_SCOPE},
			clientIds = {Constants.WEB_CLIENT_ID, 
				     Constants.ANDROID_CLIENT_ID, 
				     com.google.api.server.spi.Constant.API_EXPLORER_CLIENT_ID},
				     audiences = {Constants.ANDROID_AUDIENCE})
	public void borrarPacienteMedico(@Named("id_paciente") String id_paciente, User user) throws UnauthorizedException {

		PersistenceManager mgr = null;
		Medico medico = null;
		Paciente pacienteborrar = null;
		
		medico = loginMedico(user);
		pacienteborrar = getPacienteConcretoByIDPacienteMedico(loginMedico(user).getId_medico(), id_paciente);
		
		medico.getPacientes().remove(pacienteborrar.getId_paciente());
		
		try {
			mgr = getPersistenceManager();
			mgr.makePersistent(medico);
			//mgr.deletePersistent(pacienteborrar);
			
		} finally {
			mgr.close();
		}
		
	}
	
	@ApiMethod(name = "getListaTestsCreadosMedico", path = "getListaTestsCreadosMedico", scopes = {Constants.EMAIL_SCOPE, Constants.PROFILE_SCOPE},
			clientIds = {Constants.WEB_CLIENT_ID, 
				     Constants.ANDROID_CLIENT_ID, 
				     com.google.api.server.spi.Constant.API_EXPLORER_CLIENT_ID},
				     audiences = {Constants.ANDROID_AUDIENCE})
	public CollectionResponse<Test> getListaTestsCreadosByIDMedico(User user) throws UnauthorizedException {

		List<Test> testcreados = new ArrayList<Test>();

		testcreados = getTestsCreadosByIDMedico(loginMedico(user).getId_medico());

		return CollectionResponse.<Test> builder().setItems(testcreados).build();
	}
	
	@ApiMethod(name = "crearTestMedico", scopes = {Constants.EMAIL_SCOPE, Constants.PROFILE_SCOPE},
			clientIds = {Constants.WEB_CLIENT_ID, 
				     Constants.ANDROID_CLIENT_ID, 
				     com.google.api.server.spi.Constant.API_EXPLORER_CLIENT_ID},
				     audiences = {Constants.ANDROID_AUDIENCE})
	public Test crearTestMedico(Test test, User user) throws UnauthorizedException {

		PersistenceManager mgr = null;
		Medico medico = null;
		Test t = test;
		
		
		medico = loginMedico(user);
		
		t.setActividadesTest(new ArrayList<String>());
		t.setPacientesAsociados(new ArrayList<String>());
		t.setMedicoCreador(medico.getId_medico());
		//t = registrarTest(test);
		//medico.getTestMedico().add(t.getId_test());
		
		try {
			mgr = getPersistenceManager();
			
			mgr.makePersistent(t);
			medico.getTestMedico().add(t.getId_test());
			mgr.makePersistent(medico);
			
		} finally {
			mgr.close();
		}
		

		return test;
	}
	
	@ApiMethod(name = "borrarTestMedico", scopes = {Constants.EMAIL_SCOPE, Constants.PROFILE_SCOPE},
			clientIds = {Constants.WEB_CLIENT_ID, 
				     Constants.ANDROID_CLIENT_ID, 
				     com.google.api.server.spi.Constant.API_EXPLORER_CLIENT_ID},
				     audiences = {Constants.ANDROID_AUDIENCE})
	public void borrarTestMedico(@Named("id_test") String id_test, User user) throws UnauthorizedException {

		PersistenceManager mgr = null;
		Medico medico = null;
		Test testborrar = null;
		
		medico = loginMedico(user);
		testborrar = getTestConcretoByIDTestMedico(loginMedico(user).getId_medico(),id_test);
		
		medico.getTestMedico().remove(testborrar.getId_test());
		
		try {
			mgr = getPersistenceManager();
			mgr.makePersistent(medico);
			//mgr.deletePersistent(testborrar);
			
		} finally {
			mgr.close();
		}
		
	}
	
	@ApiMethod(name = "proporcionarTestAPacienteMedico", scopes = {Constants.EMAIL_SCOPE, Constants.PROFILE_SCOPE},
			clientIds = {Constants.WEB_CLIENT_ID, 
				     Constants.ANDROID_CLIENT_ID, 
				     com.google.api.server.spi.Constant.API_EXPLORER_CLIENT_ID},
				     audiences = {Constants.ANDROID_AUDIENCE})
	public Paciente proporcionarNuevoTestAPacienteMedico(@Named("id_paciente") String id_paciente,
			Test test, User user) throws UnauthorizedException {

		PersistenceManager mgr = null;
		Paciente pacienteconcreto = null;
		
		pacienteconcreto = getPacienteConcretoByIDPacienteMedico(loginMedico(user).getId_medico(), id_paciente);
		
		test.setActividadesTest(new ArrayList<String>());
		test.setPacientesAsociados(new ArrayList<String>());
		test.setMedicoCreador(loginMedico(user).getId_medico());
		
		try {
			mgr = getPersistenceManager();
			mgr.makePersistent(test);
			pacienteconcreto.getTestAsociados().add(test.getId_test());
			mgr.makePersistent(pacienteconcreto);
			
		} finally {
			mgr.close();
		}

		return pacienteconcreto;
	}
	
	@ApiMethod(name = "proporcionarTestCreadoAPacienteMedico",  path = "proporcionarTestCreadoAPacienteMedico", scopes = {Constants.EMAIL_SCOPE, Constants.PROFILE_SCOPE},
			clientIds = {Constants.WEB_CLIENT_ID, 
				     Constants.ANDROID_CLIENT_ID, 
				     com.google.api.server.spi.Constant.API_EXPLORER_CLIENT_ID},
				     audiences = {Constants.ANDROID_AUDIENCE})
	public Paciente proporcionarTestCreadoAPacienteMedico(@Named("id_paciente") String id_paciente,
			@Named("id_test") String id_test, User user) throws UnauthorizedException {

		PersistenceManager mgr = null;
		Paciente pacienteconcreto = null;
		Test test_add = null;
		
		pacienteconcreto = getPacienteConcretoByIDPacienteMedico(loginMedico(user).getId_medico(), id_paciente);
		
		test_add = getTestConcretoByIDTestMedico(loginMedico(user).getId_medico(), id_test);
		
		
		try {
			mgr = getPersistenceManager();
			pacienteconcreto.getTestAsociados().add(test_add.getId_test());
			mgr.makePersistent(pacienteconcreto);
			
		} finally {
			mgr.close();
		}

		return pacienteconcreto;
	}
	
	@ApiMethod(name = "quitarTestAPacienteMedico", scopes = {Constants.EMAIL_SCOPE, Constants.PROFILE_SCOPE},
			clientIds = {Constants.WEB_CLIENT_ID, 
				     Constants.ANDROID_CLIENT_ID, 
				     com.google.api.server.spi.Constant.API_EXPLORER_CLIENT_ID},
				     audiences = {Constants.ANDROID_AUDIENCE})
	public void quitarTestAPacienteMedico(@Named("id_paciente") String id_paciente,
			@Named("id_test") String id_test, User user) throws UnauthorizedException {

		PersistenceManager mgr = null;
		Paciente pacienteconcreto = null;
		
		pacienteconcreto = getPacienteConcretoByIDPacienteMedico(loginMedico(user).getId_medico(), id_paciente);
		
		pacienteconcreto.getTestAsociados().remove(getTestAsociadoByIDTestPaciente(id_paciente, id_test).getId_test());
		
		try {
			mgr = getPersistenceManager();
			mgr.makePersistent(pacienteconcreto);
			
		} finally {
			mgr.close();
		}
	}
	
	@ApiMethod(name = "updateMedico", scopes = {Constants.EMAIL_SCOPE, Constants.PROFILE_SCOPE},
			clientIds = {Constants.WEB_CLIENT_ID, 
				     Constants.ANDROID_CLIENT_ID, 
				     com.google.api.server.spi.Constant.API_EXPLORER_CLIENT_ID},
				     audiences = {Constants.ANDROID_AUDIENCE})
	public Medico updateMedico(Medico guardar, User user) throws UnauthorizedException {
		PersistenceManager mgr = getPersistenceManager();
		Medico medico = null;
		try {
			if (!containsMedico(loginMedico(user).getId_medico())) {
				throw new EntityNotFoundException("Este medico no existe en nuestra base de datos");
			}
			Key k = KeyFactory.stringToKey(loginMedico(user).getId_medico());
			//Key k = KeyFactory.createKey(Paciente.class.getSimpleName(), id_paciente);
			medico = mgr.getObjectById(Medico.class, k);
			
			medico.setApellidos(guardar.getApellidos());
			medico.setCodigoPostal(guardar.getCodigoPostal());
			medico.setDireccion(guardar.getDireccion());
			medico.setLocalidad(guardar.getLocalidad());
			medico.setNombre(guardar.getNombre());
			medico.setProvincia(guardar.getProvincia());
			medico.setTelefono(guardar.getTelefono());
			
			mgr.makePersistent(medico);
		} finally {
			mgr.close();
		}
		return medico;
	}
	
	/*private boolean registroValido(String email) throws UnauthorizedException {
		PersistenceManager mgr = getPersistenceManager();
		boolean valido = false;
		Query query = mgr.newQuery("select from " + Registros.class.getName()
		        + " where email_validado == '" +email+"'" );
		List<Registros> results = (List<Registros>) query.execute();
		
		if (!results.isEmpty()) {
			valido = true;
		}
		else {
			throw new UnauthorizedException("Invalid register");
		}
		
		return valido;
	}*/
	
	private boolean registroValido(String id_google) throws UnauthorizedException {
	PersistenceManager mgr = getPersistenceManager();
	boolean valido = false;
	Query query = mgr.newQuery("select from " + Medico.class.getName()
	        + " where id_google == '" +id_google+"'" );
	List<Medico> results = (List<Medico>) query.execute();
	
	if (!results.isEmpty()) {
		if(results.get(0).getValidado() == 1) {
			valido = true;
		}
		else {
			throw new UnauthorizedException("Invalid register");
		}
	}
	
	return valido;
	}

	private boolean containsMedico(String id_medico) {
		PersistenceManager mgr = getPersistenceManager();
		boolean contains = true;
		try {
			Key k = KeyFactory.stringToKey(id_medico);
			//Key k = KeyFactory.createKey(Paciente.class.getSimpleName(), id_paciente);
			mgr.getObjectById(Medico.class, k);
		} catch (javax.jdo.JDOObjectNotFoundException ex) {
			contains = false;
		} finally {
			mgr.close();
		}
		return contains;
	}
	
	private boolean mailMedicoRepe(Medico medico) {
		PersistenceManager mgr = getPersistenceManager();
		boolean repe = false;
		
		Query query = mgr.newQuery("select from " + Medico.class.getName()
		        + " where Email== '" +medico.getEmail()+"'" );
		List<Medico> results = (List<Medico>) query.execute();
		
		if (!results.isEmpty()) {
			repe = true;
		}
		
		return repe;
	}
	
	private Medico getMedicoByID(String id_medico) {
		Medico medico = null;
		PersistenceManager mgr = null;
		try {
			mgr = getPersistenceManager();
			
			Key k = KeyFactory.stringToKey(id_medico);
			//Key k = KeyFactory.createKey(Paciente.class.getSimpleName(), id_paciente);
			medico = mgr.getObjectById(Medico.class, k);
		} finally {
			mgr.close();
		}
		return medico;
	}
	
	private Medico getMedicoByIDGoogle(String id_google) {
		Medico medico = null;
		PersistenceManager mgr = null;
		try {
			mgr = getPersistenceManager();
			Query query = mgr.newQuery("select from " + Medico.class.getName()
			        + " where id_google == '" +id_google+"'" );
			List<Medico> results = (List<Medico>) query.execute();
			medico = results.get(0);
		} finally {
			mgr.close();
		}
		return medico;
	}
	
	private boolean medicoEnBD(String id_google) {
		boolean ya_registrado = true;
		PersistenceManager mgr = null;
		try {
			mgr = getPersistenceManager();
			Query query = mgr.newQuery("select from " + Medico.class.getName()
			        + " where id_google == '" +id_google+"'" );
			List<Medico> results = (List<Medico>) query.execute();

			if(results.isEmpty()) {
				ya_registrado = false;
			}
		} finally {
			mgr.close();
		}
		return ya_registrado;
	}
	
	private List<Test> getTestsCreadosByIDMedico(String id_medico) {
		PersistenceManager mgr = null;
		Medico medico = null;
		List<Test> testcreados = new ArrayList<Test>();

		try {
			mgr = getPersistenceManager();
			medico = getMedicoByID(id_medico);
			
			for (String obj : medico.getTestMedico()) {
				testcreados.add(getTestByID(obj));
			}
		} finally {
			mgr.close();
		}
		
		return testcreados;
	}
	
	private Paciente getPacienteConcretoByIDPacienteMedico(String id_medico, String id_paciente) {
		Medico medico = null;
		Paciente pacienteconcreto = null;
		
		medico = getMedicoByID(id_medico);
		
		for (String obj : medico.getPacientes()) {
			if(obj.equals(id_paciente)) {
				pacienteconcreto = getPacienteByID(obj);
			}
		}

		return pacienteconcreto;
	}
	
	private Test getTestConcretoByIDTestMedico(String id_medico, String id_test) {
		Medico medico = null;
		Test testconcreto = null;
		
		medico = getMedicoByID(id_medico);
		
		for (String obj : medico.getTestMedico()) {
			if(obj.equals(id_test)) {
				testconcreto = getTestByID(obj);
			}
		}

		return testconcreto;
	}
	
	private Mensaje getMensajeByIDMensajeMedico(String id_medico, String id_mensaje) {
		Medico medico = null;
		Mensaje mensajeconcreto = null;
		
		medico = getMedicoByID(id_medico);
		
		for (String obj : medico.getMensajes()) {
			if(obj.equals(id_mensaje)) {
				mensajeconcreto = getMensajeByID(obj);
			}
		}

		return mensajeconcreto;
	}
	
	/****************************************************************************************************************/
	
	
	
	/**
	 * Metodos Test
	 */
	
	
	/****************************************************************************************************************/
	
	@ApiMethod(name = "getListaActividadesTest", scopes = {Constants.EMAIL_SCOPE, Constants.PROFILE_SCOPE},
			clientIds = {Constants.WEB_CLIENT_ID, 
				     Constants.ANDROID_CLIENT_ID, 
				     com.google.api.server.spi.Constant.API_EXPLORER_CLIENT_ID},
				     audiences = {Constants.ANDROID_AUDIENCE})
	public CollectionResponse<Actividad> getListaActividadesTest(@Named("id_test") String id_test, User user) throws UnauthorizedException {

		List<Actividad> actividadesasociadas = new ArrayList<Actividad>();

		actividadesasociadas = getActividadesAsociadasByIDTest(id_test);

		return CollectionResponse.<Actividad> builder().setItems(actividadesasociadas).build();
	}
	
	
	@ApiMethod(name = "getListaPreguntasActividad", scopes = {Constants.EMAIL_SCOPE, Constants.PROFILE_SCOPE},
			clientIds = {Constants.WEB_CLIENT_ID, 
				     Constants.ANDROID_CLIENT_ID, 
				     com.google.api.server.spi.Constant.API_EXPLORER_CLIENT_ID},
				     audiences = {Constants.ANDROID_AUDIENCE})
	public CollectionResponse<Pregunta> getListaPreguntasActividad(@Named("id_actividad") String id_actividad, User user) throws UnauthorizedException {

		List<Pregunta> preguntasasociadas = new ArrayList<Pregunta>();

		preguntasasociadas = getPreguntasAsociadasByIDActividad(id_actividad);

		return CollectionResponse.<Pregunta> builder().setItems(preguntasasociadas).build();
	}
	
	@ApiMethod(name = "getRespuestasPregunta", scopes = {Constants.EMAIL_SCOPE, Constants.PROFILE_SCOPE},
			clientIds = {Constants.WEB_CLIENT_ID, 
				     Constants.ANDROID_CLIENT_ID, 
				     com.google.api.server.spi.Constant.API_EXPLORER_CLIENT_ID},
				     audiences = {Constants.ANDROID_AUDIENCE})
	public CollectionResponse<Respuesta> getRespuestasPregunta(@Named("id_pregunta") String id_pregunta, User user) throws UnauthorizedException {

		List<Respuesta> respuestas_pregunta = new ArrayList<Respuesta>();
		Pregunta pregunta = null;
		PersistenceManager mgr = null;
		
		Paciente paciente = loginPaciente(user);

		pregunta = getPreguntaByID(id_pregunta);
		
		try {
			mgr = getPersistenceManager();

			Query query = mgr.newQuery("select from " + Respuesta.class.getName()
			        + " where id_pregunta == '" +id_pregunta+"' && id_paciente == '"+paciente.getId_paciente()+"'" );
			List<Respuesta> results = (List<Respuesta>) query.execute();
			
			for (Respuesta obj :results) {
				respuestas_pregunta.add(obj);
			}
			
		} finally {
			mgr.close();
		}

		return CollectionResponse.<Respuesta> builder().setItems(respuestas_pregunta).build();
	}
	
	
	@ApiMethod(name = "getActividadConcretaTest", scopes = {Constants.EMAIL_SCOPE, Constants.PROFILE_SCOPE},
			clientIds = {Constants.WEB_CLIENT_ID, 
				     Constants.ANDROID_CLIENT_ID, 
				     com.google.api.server.spi.Constant.API_EXPLORER_CLIENT_ID},
				     audiences = {Constants.ANDROID_AUDIENCE})
	public Actividad getActividadConcretaTest(@Named("id_test") String id_test,
			@Named("id_actividad") String id_actividad, User user) throws UnauthorizedException {

		Actividad actividadconcreta = null;
		
		actividadconcreta = getActividadConcretaByIDActividadTest(id_test, id_actividad);

		return actividadconcreta;
	}
	
	@ApiMethod(name = "addActividadTest", scopes = {Constants.EMAIL_SCOPE, Constants.PROFILE_SCOPE},
			clientIds = {Constants.WEB_CLIENT_ID, 
				     Constants.ANDROID_CLIENT_ID, 
				     com.google.api.server.spi.Constant.API_EXPLORER_CLIENT_ID},
				     audiences = {Constants.ANDROID_AUDIENCE})
	public Actividad addActividadTest(@Named("id_test") String id_test,
			Actividad actividad, User user) throws UnauthorizedException {

		PersistenceManager mgr = null;
		Test test = null;
		
		test = getTestByID(id_test);
		actividad.setTestAsociado(test.getId_test());
		actividad.setPreguntasActividad(new ArrayList<String>());
		
		try {
			mgr = getPersistenceManager();
			mgr.makePersistent(actividad);
			test.getActividadesTest().add(actividad.getId_actividad());
			mgr.makePersistent(test);
		} finally {
			mgr.close();
		}
		
		return actividad;
	}
	
	@ApiMethod(name = "addPreguntaActividad", scopes = {Constants.EMAIL_SCOPE, Constants.PROFILE_SCOPE},
			clientIds = {Constants.WEB_CLIENT_ID, 
				     Constants.ANDROID_CLIENT_ID, 
				     com.google.api.server.spi.Constant.API_EXPLORER_CLIENT_ID},
				     audiences = {Constants.ANDROID_AUDIENCE})
	public Pregunta addPreguntaActividad(@Named("id_actividad") String id_actividad,
			Pregunta pregunta, User user) throws UnauthorizedException {

		PersistenceManager mgr = null;
		Actividad actividad = null;
		
		actividad = getActividadByID(id_actividad);
		pregunta.setActividadAsociada(actividad.getId_actividad());
		
		try {
			mgr = getPersistenceManager();
			mgr.makePersistent(pregunta);
			actividad.getPreguntasActividad().add(pregunta.getId_pregunta());
			mgr.makePersistent(actividad);
		} finally {
			mgr.close();
		}
		
		return pregunta;
	}
	
	@ApiMethod(name = "responderPregunta", scopes = {Constants.EMAIL_SCOPE, Constants.PROFILE_SCOPE},
			clientIds = {Constants.WEB_CLIENT_ID, 
				     Constants.ANDROID_CLIENT_ID, 
				     com.google.api.server.spi.Constant.API_EXPLORER_CLIENT_ID},
				     audiences = {Constants.ANDROID_AUDIENCE})
	public Respuesta responderPregunta(@Named("id_pregunta") String id_pregunta,
			@Named("respuesta") String respuesta, User user) throws UnauthorizedException {

		PersistenceManager mgr = null;
		Respuesta respuesta_guardar = new Respuesta();
		
		Paciente paciente = getPacienteByID(loginPaciente(user).getId_paciente());
		
		respuesta_guardar.setId_paciente(paciente.getId_paciente());
		respuesta_guardar.setId_pregunta(id_pregunta);
		respuesta_guardar.setRespuesta(respuesta);
		
		try {
			mgr = getPersistenceManager();
			mgr.makePersistent(respuesta_guardar);
		} finally {
			mgr.close();
		}
		
		return respuesta_guardar;
	}
	
	@ApiMethod(name = "removeActividadTest")
	public void removeActividadTest(@Named("id_test") String id_test,
			@Named("id_actividad") String id_actividad, User user) throws UnauthorizedException {

		PersistenceManager mgr = null;
		Test test = null;
		Actividad actividad_borrar = null;
		
		test = getTestByID(id_test);
		actividad_borrar = getActividadConcretaByIDActividadTest(id_test, id_actividad);
		
		test.getActividadesTest().remove(actividad_borrar.getId_actividad());
		
		try {
			mgr = getPersistenceManager();
			mgr.makePersistent(test);
			//mgr.deletePersistent(actividad_borrar);
		} finally {
			mgr.close();
		}
	}
	
	private Test getTestByID(String id_test) {
		Test test = null;
		PersistenceManager mgr = null;
		try {
			mgr = getPersistenceManager();
			
			Key k = KeyFactory.stringToKey(id_test);
			//Key k = KeyFactory.createKey(Paciente.class.getSimpleName(), id_paciente);
			test = mgr.getObjectById(Test.class, k);
			
		} finally {
			mgr.close();
		}
		return test;
	}
	
	private Test registrarTest(Test test) {

		PersistenceManager mgr = null;
		Test test_guardar = test;
		
		try {
			mgr = getPersistenceManager();
			mgr.makePersistent(test_guardar);
			
		} finally {
			mgr.close();
		}
		
		return test_guardar;
	}
	
	private List<Actividad> getActividadesAsociadasByIDTest(String id_test) {
		PersistenceManager mgr = null;
		Test test = null;
		List<Actividad> actividadesasociadas = new ArrayList<Actividad>();

		try {
			mgr = getPersistenceManager();
			test = getTestByID(id_test);
			
			for (String obj : test.getActividadesTest()) {
				Key k = KeyFactory.stringToKey(obj);
				Actividad m = mgr.getObjectById(Actividad.class, k);
				actividadesasociadas.add(m);
			}
		} finally {
			mgr.close();
		}
		
		return actividadesasociadas;
	}
	
	private List<Pregunta> getPreguntasAsociadasByIDActividad(String id_actividad) {
		PersistenceManager mgr = null;
		Actividad actividad = null;
		List<Pregunta> preguntasasociadas = new ArrayList<Pregunta>();

		try {
			mgr = getPersistenceManager();
			actividad = getActividadByID(id_actividad);
			
			for (String obj : actividad.getPreguntasActividad()) {
				Key k = KeyFactory.stringToKey(obj);
				Pregunta m = mgr.getObjectById(Pregunta.class, k);
				preguntasasociadas.add(m);
			}
		} finally {
			mgr.close();
		}
		
		return preguntasasociadas;
	}
	
	private Actividad getActividadConcretaByIDActividadTest(String id_test, String id_actividad) {
		Test test = null;
		Actividad actividadconcreta = null;
		
		test = getTestByID(id_test);
		
		for (String obj : test.getActividadesTest()) {
			if(obj.equals(id_actividad)) {
				actividadconcreta = getActividadByID(obj);
			}
		}

		return actividadconcreta;
	}
	
	
	/****************************************************************************************************************/
	
	
	/**
	 * Metodos Actividad
	 */
	
	
	/****************************************************************************************************************/
	
	private Actividad getActividadByID(String id_actividad) {
		Actividad actividad = null;
		PersistenceManager mgr = null;
		try {
			mgr = getPersistenceManager();
			
			Key k = KeyFactory.stringToKey(id_actividad);
			//Key k = KeyFactory.createKey(Paciente.class.getSimpleName(), id_paciente);
			actividad = mgr.getObjectById(Actividad.class, k);
		} finally {
			mgr.close();
		}
		return actividad;
	}
	
	private Pregunta getPreguntaByID(String id_pregunta) {
		Pregunta pregunta = null;
		PersistenceManager mgr = null;
		try {
			mgr = getPersistenceManager();
			
			Key k = KeyFactory.stringToKey(id_pregunta);
			//Key k = KeyFactory.createKey(Paciente.class.getSimpleName(), id_paciente);
			pregunta = mgr.getObjectById(Pregunta.class, k);
		} finally {
			mgr.close();
		}
		return pregunta;
	}
	
	
	/****************************************************************************************************************/
	
	
	private boolean containsPaciente(Paciente paciente) {
		PersistenceManager mgr = getPersistenceManager();
		boolean contains = true;
		try {
			mgr.getObjectById(Medico.class, paciente.getId_paciente());
		} catch (javax.jdo.JDOObjectNotFoundException ex) {
			contains = false;
		} finally {
			mgr.close();
		}
		return contains;
	}
	
	private boolean containsTest(Test test) {
		PersistenceManager mgr = getPersistenceManager();
		boolean contains = true;
		try {
			mgr.getObjectById(Medico.class, test.getId_test());
		} catch (javax.jdo.JDOObjectNotFoundException ex) {
			contains = false;
		} finally {
			mgr.close();
		}
		return contains;
	}
	

	private static PersistenceManager getPersistenceManager() {
		return PMF.get().getPersistenceManager();
	}

}

