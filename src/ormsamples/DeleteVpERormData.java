/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteVpERormData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = orm.VpERormPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Persona lormPersona = orm.PersonaDAO.loadPersonaByQuery(null, null);
			// Delete the persistent object
			orm.PersonaDAO.delete(lormPersona);
			orm.Paciente lormPaciente = orm.PacienteDAO.loadPacienteByQuery(null, null);
			// Delete the persistent object
			orm.PacienteDAO.delete(lormPaciente);
			orm.Director lormDirector = orm.DirectorDAO.loadDirectorByQuery(null, null);
			// Delete the persistent object
			orm.DirectorDAO.delete(lormDirector);
			orm.Medico lormMedico = orm.MedicoDAO.loadMedicoByQuery(null, null);
			// Delete the persistent object
			orm.MedicoDAO.delete(lormMedico);
			orm.Especialidad lormEspecialidad = orm.EspecialidadDAO.loadEspecialidadByQuery(null, null);
			// Delete the persistent object
			orm.EspecialidadDAO.delete(lormEspecialidad);
			orm.Reserva lormReserva = orm.ReservaDAO.loadReservaByQuery(null, null);
			// Delete the persistent object
			orm.ReservaDAO.delete(lormReserva);
			orm.Hora_medica lormHora_medica = orm.Hora_medicaDAO.loadHora_medicaByQuery(null, null);
			// Delete the persistent object
			orm.Hora_medicaDAO.delete(lormHora_medica);
			orm.Box lormBox = orm.BoxDAO.loadBoxByQuery(null, null);
			// Delete the persistent object
			orm.BoxDAO.delete(lormBox);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteVpERormData deleteVpERormData = new DeleteVpERormData();
			try {
				deleteVpERormData.deleteTestData();
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
