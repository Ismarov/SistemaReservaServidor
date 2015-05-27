/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateVpERormData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = orm.VpERormPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Persona lormPersona = orm.PersonaDAO.loadPersonaByQuery(null, null);
			// Update the properties of the persistent object
			orm.PersonaDAO.save(lormPersona);
			orm.Paciente lormPaciente = orm.PacienteDAO.loadPacienteByQuery(null, null);
			// Update the properties of the persistent object
			orm.PacienteDAO.save(lormPaciente);
			orm.Director lormDirector = orm.DirectorDAO.loadDirectorByQuery(null, null);
			// Update the properties of the persistent object
			orm.DirectorDAO.save(lormDirector);
			orm.Medico lormMedico = orm.MedicoDAO.loadMedicoByQuery(null, null);
			// Update the properties of the persistent object
			orm.MedicoDAO.save(lormMedico);
			orm.Especialidad lormEspecialidad = orm.EspecialidadDAO.loadEspecialidadByQuery(null, null);
			// Update the properties of the persistent object
			orm.EspecialidadDAO.save(lormEspecialidad);
			orm.Reserva lormReserva = orm.ReservaDAO.loadReservaByQuery(null, null);
			// Update the properties of the persistent object
			orm.ReservaDAO.save(lormReserva);
			orm.Hora_medica lormHora_medica = orm.Hora_medicaDAO.loadHora_medicaByQuery(null, null);
			// Update the properties of the persistent object
			orm.Hora_medicaDAO.save(lormHora_medica);
			orm.Box lormBox = orm.BoxDAO.loadBoxByQuery(null, null);
			// Update the properties of the persistent object
			orm.BoxDAO.save(lormBox);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Persona by PersonaCriteria");
		orm.PersonaCriteria lormPersonaCriteria = new orm.PersonaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormPersonaCriteria.id.eq();
		System.out.println(lormPersonaCriteria.uniquePersona());
		
		System.out.println("Retrieving Paciente by PacienteCriteria");
		orm.PacienteCriteria lormPacienteCriteria = new orm.PacienteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormPacienteCriteria.id.eq();
		System.out.println(lormPacienteCriteria.uniquePaciente());
		
		System.out.println("Retrieving Director by DirectorCriteria");
		orm.DirectorCriteria lormDirectorCriteria = new orm.DirectorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormDirectorCriteria.id.eq();
		System.out.println(lormDirectorCriteria.uniqueDirector());
		
		System.out.println("Retrieving Medico by MedicoCriteria");
		orm.MedicoCriteria lormMedicoCriteria = new orm.MedicoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormMedicoCriteria.id.eq();
		System.out.println(lormMedicoCriteria.uniqueMedico());
		
		System.out.println("Retrieving Especialidad by EspecialidadCriteria");
		orm.EspecialidadCriteria lormEspecialidadCriteria = new orm.EspecialidadCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormEspecialidadCriteria.id.eq();
		System.out.println(lormEspecialidadCriteria.uniqueEspecialidad());
		
		System.out.println("Retrieving Reserva by ReservaCriteria");
		orm.ReservaCriteria lormReservaCriteria = new orm.ReservaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormReservaCriteria.id.eq();
		System.out.println(lormReservaCriteria.uniqueReserva());
		
		System.out.println("Retrieving Hora_medica by Hora_medicaCriteria");
		orm.Hora_medicaCriteria lormHora_medicaCriteria = new orm.Hora_medicaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormHora_medicaCriteria.id.eq();
		System.out.println(lormHora_medicaCriteria.uniqueHora_medica());
		
		System.out.println("Retrieving Box by BoxCriteria");
		orm.BoxCriteria lormBoxCriteria = new orm.BoxCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormBoxCriteria.id.eq();
		System.out.println(lormBoxCriteria.uniqueBox());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateVpERormData retrieveAndUpdateVpERormData = new RetrieveAndUpdateVpERormData();
			try {
				retrieveAndUpdateVpERormData.retrieveAndUpdateTestData();
				//retrieveAndUpdateVpERormData.retrieveByCriteria();
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
