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
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import javax.annotation.Nullable;
import javax.inject.Named;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;

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
	
	@ApiMethod(name = "listMedicos")
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
	}
	
	
	
	
	
	/**
	 * Metodos PACIENTE
	 */
	
	
	/****************************************************************************************************************/
	
	@ApiMethod(name = "registrarPaciente")
	public Paciente registrarPaciente(Paciente paciente) {
		
		if(!mailPacienteRepe(paciente)) {
			PersistenceManager mgr = null;
			
			paciente.setEncuestas(new ArrayList<String>());
			paciente.setTestAsociados(new ArrayList<String>());
			paciente.setMensajes(new ArrayList<String>());
			
			try {
				mgr = getPersistenceManager();
				mgr.makePersistent(paciente);
				
			} finally {
				mgr.close();
			}
			
			return paciente;
		}
		
		else {
			return null;
		}
		
	}
	
	@ApiMethod(name = "loginPaciente", path = "loginPaciente")
	public Paciente loginPaciente(@Named("email") String email, @Named("password") String password) {

		Paciente paciente_login = null;
		
		if(pacienteEnBD(email, password) != null)
			paciente_login = pacienteEnBD(email, password);
		
		return paciente_login;
	}
	
	@ApiMethod(name = "getMedicoAsociadoPaciente", path = "getMedicoAsociadoPaciente")
	public Medico getMedicoAsociadoByIDPaciente(@Named("id_paciente") String id_paciente,
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {

		Paciente paciente = null;
		
		paciente = getPacienteByID(id_paciente);

		return getMedicoByID(paciente.getMedicoAsociado());
	}
	
	@ApiMethod(name = "getMensajesTotalesPaciente", path = "getMensajesTotalesPaciente")
	public CollectionResponse<Mensaje> getMensajesTotalesByIDPaciente(@Named("id_paciente") String id_paciente) {

		Paciente paciente = null;
		List<Mensaje> mensajes = new ArrayList<Mensaje>();
		paciente = getPacienteByID(id_paciente);
		
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
	
	@ApiMethod(name = "getMensajesPorLeerPaciente", path = "getMensajesPorLeerPaciente")
	public CollectionResponse<Mensaje> getMensajesPorLeerByIDPaciente(@Named("id_paciente") String id_paciente) {

		Paciente paciente = null;
		
		paciente = getPacienteByID(id_paciente);
		
		PersistenceManager pm = PMF.get().getPersistenceManager();  
	    Query query = pm.newQuery("select from "+Mensaje.class.getName()+" WHERE idPacienteReceptorMensaje == keyParam && visto == s");
	    query.declareParameters("int s, String keyParam");
	    @SuppressWarnings("unchecked")
	    
		List<Mensaje> results = (List<Mensaje>) query.execute(0, paciente.getId_paciente());

		return CollectionResponse.<Mensaje> builder().setItems(results).build();
	}
	
	@ApiMethod(name = "sendMensajeMedicoPaciente")
	public Mensaje sendMensajeMedicoByIDPaciente(@Named("id_paciente") String id_paciente,
			Mensaje mensaje) {

		PersistenceManager mgr = null;
		Medico medicoenvio = null;

		medicoenvio = getMedicoByID(getPacienteByID(id_paciente).getMedicoAsociado());
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
	
	@ApiMethod(name = "setMensajeLeidoPaciente")
	public Mensaje setMensajeLeidoByIDPaciente(@Named("id_paciente") String id_paciente,
			@Named("id_mensaje") String id_mensaje) {

		PersistenceManager mgr = null;
		Mensaje mensaje_leido = null;

		mensaje_leido = getMensajeByIDMensajePaciente(id_paciente, id_mensaje);
		
		mensaje_leido.setVisto(1);
		
		try {
			mgr = getPersistenceManager();
			mgr.makePersistent(mensaje_leido);
			
		} finally {
			mgr.close();
		}
		
		return mensaje_leido;
	}
	
	@ApiMethod(name = "borrarMensajePaciente")
	public void borrarMensajePaciente(@Named("id_paciente") String id_paciente,
			@Named("id_mensaje") String id_mensaje) {

		PersistenceManager mgr = null;
		Paciente paciente = null;
		Mensaje mensaje = null;
		
		paciente = getPacienteByID(id_paciente);

		mensaje = getMensajeByIDMensajePaciente(id_paciente, id_mensaje);
		
		paciente.getMensajes().remove(mensaje.getId_mensaje());
		
		try {
			mgr = getPersistenceManager();
			mgr.makePersistent(paciente);
			//mgr.deletePersistent(mensaje);
			
		} finally {
			mgr.close();
		}
	}
	
	@ApiMethod(name = "getListaTestsPaciente", path = "getListaTestsPaciente")
	public CollectionResponse<Test> getListaTestsByIDPaciente(@Named("id_paciente") String id_paciente) {

		List<Test> testasociados = new ArrayList<Test>();

		testasociados = getTestsAsociadosByIDPaciente(id_paciente);

		return CollectionResponse.<Test> builder().setItems(testasociados).build();
	}
	
	@ApiMethod(name = "getListaEncuestasPaciente", path = "getListaEncuestasPaciente")
	public CollectionResponse<Encuesta> getListaEncuestasByIDPaciente(@Named("id_paciente") String id_paciente) {

		List<Encuesta> encuestas = new ArrayList<Encuesta>();

		encuestas = getEncuestasAsociadasByIDPaciente(id_paciente);

		return CollectionResponse.<Encuesta> builder().setItems(encuestas).build();
	}
	
	@ApiMethod(name = "setTestFinalizadoPaciente")
	public Test finalizarTestPaciente(@Named("id_paciente") String id_paciente,
			@Named("id_test") String id_test) {

		PersistenceManager mgr = null;
		List<Test> testasociados = new ArrayList<Test>();
		Test test_cambio = null;

		try {
			mgr = getPersistenceManager();
			testasociados = getTestsAsociadosByIDPaciente(id_paciente);
			for (Test obj : testasociados) {
				if(obj.getId_test().equals(id_test)) {
					obj.setFinalizado(1);
					obj.setFechaFinalizacion(new Date());
					mgr.makePersistent(obj);
					test_cambio = obj;
				}
			}
		} finally {
			mgr.close();
		}

		return test_cambio;
	}
	
	@ApiMethod(name = "realizarEncuestaPaciente", path = "realizarEncuestaPaciente")
	public Encuesta realizarEncuestaPaciente(@Named("id_paciente") String id_paciente,
			Encuesta encuesta) {

		PersistenceManager mgr = null;
		Paciente paciente = null;
		paciente = getPacienteByID(id_paciente);
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

	
	@ApiMethod(name = "getListaTestFinalizadosPaciente", path = "getListaTestFinalizadosPaciente", httpMethod = HttpMethod.GET)
	public CollectionResponse<Test> getListaTestsFinalizadosByIDPaciente(@Named("id_paciente_test") String id_paciente_test) {

		List<Test> testasociados = new ArrayList<Test>();
		List<Test> testfinalizados = new ArrayList<Test>();

		testasociados = getTestsAsociadosByIDPaciente(id_paciente_test);
		
		for (Test obj : testasociados) {
			if(obj.getFinalizado() == 1) {
				testfinalizados.add(obj);
			}
		}

		return CollectionResponse.<Test> builder().setItems(testfinalizados).build();
	}
	
	@ApiMethod(name = "getListaTestPorIniciarPaciente", path = "getListaTestPorIniciarPaciente", httpMethod = HttpMethod.GET)
	public CollectionResponse<Test> getListaTestsPorIniciarByIDPaciente(@Named("id_paciente") String id_paciente) {

		List<Test> testasociados = new ArrayList<Test>();
		List<Test> testporfinalizar = new ArrayList<Test>();

		testasociados = getTestsAsociadosByIDPaciente(id_paciente);
		
		for (Test obj : testasociados) {
			if(obj.getFinalizado() == 0) {
				testporfinalizar.add(obj);
			}
		}

		return CollectionResponse.<Test> builder().setItems(testporfinalizar).build();
	}
	
	@ApiMethod(name = "updatePaciente")
	public Paciente updatePaciente(@Named("id_paciente") String id_paciente) {
		PersistenceManager mgr = getPersistenceManager();
		Paciente paciente = null;
		try {
			if (!containsPaciente(id_paciente)) {
				throw new EntityNotFoundException("Este medico no existe en nuestra base de datos");
			}
			Key k = KeyFactory.stringToKey(id_paciente);
			//Key k = KeyFactory.createKey(Paciente.class.getSimpleName(), id_paciente);
			paciente = mgr.getObjectById(Paciente.class, k);
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
	
	private Paciente pacienteEnBD(String email, String pass) {
		PersistenceManager mgr = null;
		Paciente paciente_login = null;
		
		try {
			mgr = getPersistenceManager();
			Query query = mgr.newQuery("select from " + Paciente.class.getName()
			        + " where Email== '" +email+
			        "' &&  Password=='"+pass+"'" );
			List<Paciente> results = (List<Paciente>) query.execute();
			if (!results.isEmpty()) {
				paciente_login = results.get(0);
			}
		} finally {
			mgr.close();
		}
		return paciente_login;
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
		
		 registroValido(user.getEmail());
		
		if(!mailMedicoRepe(medico)) {
			PersistenceManager mgr = null;
			
			medico.setMensajes(new ArrayList<String>());
			medico.setPacientes(new ArrayList<String>());
			medico.setTestMedico(new ArrayList<String>());
			
			try {
				mgr = getPersistenceManager();
				mgr.makePersistent(user);
				mgr.makePersistent(medico);
				
			} finally {
				mgr.close();
			}
			
			return medico;
		}

		else {
			return null;
		}
	}
	
	@ApiMethod(name = "altaEmailMedico")
	public Registros altaEmailMedico(@Named("email") String email) {
		
		PersistenceManager mgr = null;
		Registros nuevo_registro = new Registros();
		
		nuevo_registro.setEmail_validado(email);

			try {
				mgr = getPersistenceManager();
				mgr.makePersistent(nuevo_registro);
				
			} finally {
				mgr.close();
			}
			
			return nuevo_registro;
	}
	
	@ApiMethod(name = "loginMedico", path = "loginMedico")
	public Medico loginMedico(@Named("email") String email, @Named("password") String password) {

		Medico medico_login = null;
		
		if(medicoEnBD(email, password) != null)
			medico_login = medicoEnBD(email, password);
		
		return medico_login;
	}
	
	@ApiMethod(name = "getPacientesAsociadosMedico", path = "getPacientesAsociadosMedico")
	public CollectionResponse<Paciente> getPacientesAsociadosByIDMedico(@Named("id_medico") String id_medico) {

		Medico medico = null;
		List<Paciente> pacientes = new ArrayList<Paciente>();
		
		medico = getMedicoByID(id_medico);
		
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
	
	@ApiMethod(name = "getMensajesTotalesMedico", path = "getMensajesTotalesMedico")
	public CollectionResponse<Mensaje> getMensajesTotalesByIDMedico(@Named("id_medico") String id_medico) {
		
		Medico medico = null;
		List<Mensaje> mensajes = new ArrayList<Mensaje>();
		medico = getMedicoByID(id_medico);
		
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
	
	@ApiMethod(name = "getMensajesPorLeerMedico", path = "getMensajesPorLeerMedico")
	public CollectionResponse<Mensaje> getMensajesPorLeerByIDMedico(@Named("id_medico") String id_medico) {

		Medico medico = getMedicoByID(id_medico);
		PersistenceManager pm = PMF.get().getPersistenceManager();  
	    Query query = pm.newQuery("select from "+Mensaje.class.getName()+" WHERE idMedicoReceptorMensaje == keyParam && visto == s");
	    query.declareParameters("int s, String keyParam");
	    @SuppressWarnings("unchecked")
		List<Mensaje> results = (List<Mensaje>) query.execute(0, medico.getId_medico());

		return CollectionResponse.<Mensaje> builder().setItems(results).build();
	}
	
	@ApiMethod(name = "sendMensajePacienteMedico")
	public Mensaje sendMensajePacienteByIDMedico(@Named("id_medico") String id_medico,
			@Named("id_paciente") String id_paciente,
			Mensaje mensaje) {

		PersistenceManager mgr = null;
		Paciente pacienteenvio = null;

		pacienteenvio = getPacienteConcretoByIDPacienteMedico(id_medico, id_paciente);
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
	
	@ApiMethod(name = "setMensajeLeidoMedico")
	public Mensaje setMensajeLeidoByIDMedico(@Named("id_medico") String id_medico,
			@Named("id_mensaje") String id_mensaje) {

		PersistenceManager mgr = null;
		Mensaje mensaje_leido = null;

		mensaje_leido = getMensajeByIDMensajeMedico(id_medico, id_mensaje);
		
		mensaje_leido.setVisto(1);
		
		try {
			mgr = getPersistenceManager();
			mgr.makePersistent(mensaje_leido);
			
		} finally {
			mgr.close();
		}
		
		return mensaje_leido;
	}
	
	@ApiMethod(name = "borrarMensajeMedico")
	public void borrarMensajeMedico(@Named("id_medico") String id_medico,
			@Named("id_mensaje") String id_mensaje) {

		PersistenceManager mgr = null;
		Medico medico = null;
		Mensaje mensaje = null;
		
		medico = getMedicoByID(id_medico);

		mensaje = getMensajeByIDMensajeMedico(id_medico, id_mensaje);
		
		medico.getMensajes().remove(mensaje.getId_mensaje());
		
		try {
			mgr = getPersistenceManager();
			mgr.makePersistent(medico);
			//mgr.deletePersistent(mensaje);
			
		} finally {
			mgr.close();
		}
	}
	
	@ApiMethod(name = "getPacienteConcretoMedico")
	public Paciente getPacienteConcretoMedico(@Named("id_medico") String id_medico,
			@Named("id_paciente") String id_paciente) {

		Paciente pacienteconcreto = null;
		
		pacienteconcreto = getPacienteConcretoByIDPacienteMedico(id_medico, id_paciente);

		return pacienteconcreto;
	}
	
	@ApiMethod(name = "addPacienteMedico")
	public Paciente addPacienteMedico(@Named("id_medico") String id_medico,
			Paciente paciente) {

		PersistenceManager mgr = null;
		Medico medico = null;
		
		medico = getMedicoByID(id_medico);
		
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
	
	@ApiMethod(name = "addPacienteByIDMedico", path = "addPacienteByIDMedico")
	public Paciente addPacienteByIDMedico(@Named("id_medico") String id_medico,
			@Named("id_paciente") String id_paciente) {

		PersistenceManager mgr = null;
		Medico medico = null;
		
		medico = getMedicoByID(id_medico);
		
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
	
	@ApiMethod(name = "borrarPacienteMedico")
	public void borrarPacienteMedico(@Named("id_medico") String id_medico,
			@Named("id_paciente") String id_paciente) {

		PersistenceManager mgr = null;
		Medico medico = null;
		Paciente pacienteborrar = null;
		
		medico = getMedicoByID(id_medico);
		pacienteborrar = getPacienteConcretoByIDPacienteMedico(id_medico, id_paciente);
		
		medico.getPacientes().remove(pacienteborrar.getId_paciente());
		
		try {
			mgr = getPersistenceManager();
			mgr.makePersistent(medico);
			//mgr.deletePersistent(pacienteborrar);
			
		} finally {
			mgr.close();
		}
		
	}
	
	@ApiMethod(name = "getListaTestsCreadosMedico", path = "getListaTestsCreadosMedico")
	public CollectionResponse<Test> getListaTestsCreadosByIDMedico(@Named("id_medico") String id_medico) {

		List<Test> testcreados = new ArrayList<Test>();

		testcreados = getTestsCreadosByIDMedico(id_medico);

		return CollectionResponse.<Test> builder().setItems(testcreados).build();
	}
	
	@ApiMethod(name = "crearTestMedico")
	public Test crearTestMedico(@Named("id_medico") String id_medico,
			Test test) {

		PersistenceManager mgr = null;
		Medico medico = null;
		Test t = test;
		
		
		medico = getMedicoByID(id_medico);
		
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
	
	@ApiMethod(name = "borrarTestMedico")
	public void borrarTestMedico(@Named("id_medico") String id_medico,
			@Named("id_test") String id_test) {

		PersistenceManager mgr = null;
		Medico medico = null;
		Test testborrar = null;
		
		medico = getMedicoByID(id_medico);
		testborrar = getTestConcretoByIDTestMedico(id_medico,id_test);
		
		medico.getTestMedico().remove(testborrar.getId_test());
		
		try {
			mgr = getPersistenceManager();
			mgr.makePersistent(medico);
			//mgr.deletePersistent(testborrar);
			
		} finally {
			mgr.close();
		}
		
	}
	
	@ApiMethod(name = "proporcionarTestAPacienteMedico")
	public Paciente proporcionarNuevoTestAPacienteMedico(@Named("id_medico") String id_medico,
			@Named("id_paciente") String id_paciente,
			Test test) {

		PersistenceManager mgr = null;
		Paciente pacienteconcreto = null;
		
		pacienteconcreto = getPacienteConcretoByIDPacienteMedico(id_medico, id_paciente);
		
		test.setActividadesTest(new ArrayList<String>());
		test.setPacientesAsociados(new ArrayList<String>());
		test.setMedicoCreador(getMedicoByID(id_medico).getId_medico());
		
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
	
	@ApiMethod(name = "proporcionarTestCreadoAPacienteMedico",  path = "proporcionarTestCreadoAPacienteMedico")
	public Paciente proporcionarTestCreadoAPacienteMedico(@Named("id_medico") String id_medico,
			@Named("id_paciente") String id_paciente,
			@Named("id_test") String id_test) {

		PersistenceManager mgr = null;
		Paciente pacienteconcreto = null;
		Test test_add = null;
		
		pacienteconcreto = getPacienteConcretoByIDPacienteMedico(id_medico, id_paciente);
		
		test_add = getTestConcretoByIDTestMedico(id_medico, id_test);
		
		
		try {
			mgr = getPersistenceManager();
			pacienteconcreto.getTestAsociados().add(test_add.getId_test());
			mgr.makePersistent(pacienteconcreto);
			
		} finally {
			mgr.close();
		}

		return pacienteconcreto;
	}
	
	@ApiMethod(name = "quitarTestAPacienteMedico")
	public void quitarTestAPacienteMedico(@Named("id_medico") String id_medico,
			@Named("id_paciente") String id_paciente,
			@Named("id_test") String id_test) {

		PersistenceManager mgr = null;
		Paciente pacienteconcreto = null;
		
		pacienteconcreto = getPacienteConcretoByIDPacienteMedico(id_medico, id_paciente);
		
		pacienteconcreto.getTestAsociados().remove(getTestAsociadoByIDTestPaciente(id_paciente, id_test).getId_test());
		
		try {
			mgr = getPersistenceManager();
			mgr.makePersistent(pacienteconcreto);
			
		} finally {
			mgr.close();
		}
	}
	
	@ApiMethod(name = "updateMedico")
	public Medico updateMedico(@Named("id_medico") String id_medico) {
		PersistenceManager mgr = getPersistenceManager();
		Medico medico = null;
		try {
			if (!containsMedico(id_medico)) {
				throw new EntityNotFoundException("Este medico no existe en nuestra base de datos");
			}
			Key k = KeyFactory.stringToKey(id_medico);
			//Key k = KeyFactory.createKey(Paciente.class.getSimpleName(), id_paciente);
			medico = mgr.getObjectById(Medico.class, k);
			mgr.makePersistent(medico);
		} finally {
			mgr.close();
		}
		return medico;
	}
	
	private boolean registroValido(String email) throws UnauthorizedException {
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
	
	private Medico medicoEnBD(String email, String pass) {
		PersistenceManager mgr = null;
		Medico medico_login = null;
		
		try {
			mgr = getPersistenceManager();
			
			Query query = mgr.newQuery("select from " + Medico.class.getName()
			        + " where Email== '" +email+
			        "' &&  Password=='"+pass+"'" );
			List<Medico> results = (List<Medico>) query.execute();
			
			if (!results.isEmpty()) {
				medico_login = results.get(0);
			}
		} finally {
			mgr.close();
		}
		return medico_login;
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
	
	@ApiMethod(name = "getListaActividadesTest")
	public CollectionResponse<Actividad> getListaActividadesTest(@Named("id_test") String id_test) {

		List<Actividad> actividadesasociadas = new ArrayList<Actividad>();

		actividadesasociadas = getActividadesAsociadasByIDTest(id_test);

		return CollectionResponse.<Actividad> builder().setItems(actividadesasociadas).build();
	}
	
	@ApiMethod(name = "getActividadConcretaTest")
	public Actividad getActividadConcretaTest(@Named("id_test") String id_test,
			@Named("id_actividad") String id_actividad) {

		Actividad actividadconcreta = null;
		
		actividadconcreta = getActividadConcretaByIDActividadTest(id_test, id_actividad);

		return actividadconcreta;
	}
	
	@ApiMethod(name = "addActividadTest")
	public Actividad addActividadTest(@Named("id_test") String id_test,
			Actividad actividad) {

		PersistenceManager mgr = null;
		Test test = null;
		
		test = getTestByID(id_test);
		actividad.setTestAsociado(test.getId_test());
		
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
	
	@ApiMethod(name = "removeActividadTest")
	public void removeActividadTest(@Named("id_test") String id_test,
			@Named("id_actividad") String id_actividad) {

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

