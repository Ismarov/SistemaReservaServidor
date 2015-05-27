/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateVpERormData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = orm.VpERormPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Persona lormPersona = orm.PersonaDAO.createPersona();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : reserva, medico, director, paciente, activo, ciudad, direccion, f_nac, rut, apellidos, nombres
			orm.PersonaDAO.save(lormPersona);
			orm.Paciente lormPaciente = orm.PacienteDAO.createPaciente();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : reserva, persona
			orm.PacienteDAO.save(lormPaciente);
			orm.Director lormDirector = orm.DirectorDAO.createDirector();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : persona
			orm.DirectorDAO.save(lormDirector);
			orm.Medico lormMedico = orm.MedicoDAO.createMedico();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : hora_medica, persona
			orm.MedicoDAO.save(lormMedico);
			orm.Especialidad lormEspecialidad = orm.EspecialidadDAO.createEspecialidad();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : nombre
			orm.EspecialidadDAO.save(lormEspecialidad);
			orm.Reserva lormReserva = orm.ReservaDAO.createReserva();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : hora_medica, paciente, persona
			orm.ReservaDAO.save(lormReserva);
			orm.Hora_medica lormHora_medica = orm.Hora_medicaDAO.createHora_medica();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : reserva, f_fin, f_inicio, box, medico
			orm.Hora_medicaDAO.save(lormHora_medica);
			orm.Box lormBox = orm.BoxDAO.createBox();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : hora_medica, nombre
			orm.BoxDAO.save(lormBox);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateVpERormData createVpERormData = new CreateVpERormData();
			try {
				createVpERormData.createTestData();
			}
			finally {
				orm.VpERormPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
