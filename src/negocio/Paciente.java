package negocio;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.PersistenceException;

import org.orm.PersistentException;

import orm.BoxCriteria;
import orm.Hora_medicaCriteria;
import orm.ReservaCriteria;
import vo.BoxVo;
import vo.EspecialidadVo;
import vo.HoraMedicaVo;
import vo.MedicoVo;
import vo.PersonaVo;
import vo.ReservaVo;

import com.google.gson.Gson;
import com.google.gson.Gson;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
public class Paciente {
	
	public String obtenerEspecialidad(){ //Obtiene todas las especialidades.
		Gson g = new GsonBuilder().setPrettyPrinting().create();
		List<EspecialidadVo> especialidadVos =new ArrayList<EspecialidadVo>();
		try {
			orm.Especialidad[] ormEspecialidads = orm.EspecialidadDAO.listEspecialidadByQuery(null, null);
			
			for(int i=0;i<ormEspecialidads.length;i++){
				especialidadVos.add(new EspecialidadVo(ormEspecialidads[i].getId(), ormEspecialidads[i].getNombre()));	
			}
			String salida=g.toJson(especialidadVos); 		
			return salida;	
		} catch (PersistentException e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;	
		}
	}
	
	public String obtenerMedicosDeUnaEspecialidad(int IdEspecialidad){ //Obtiene todos los medicos de una especialidad.
		Gson g = new GsonBuilder().setPrettyPrinting().create();
		List<MedicoVo> medicovos =new ArrayList<MedicoVo>();
		try{
		orm.Especialidad especialidad=orm.EspecialidadDAO.loadEspecialidadByQuery("id='"+IdEspecialidad+"'", null);
		orm.Medico[] ormMedicos = orm.MedicoDAO.listMedicoByQuery("especialidad_id='"+especialidad.getId()+"'", null);
		
		for(int i=0; i<ormMedicos.length;i++){
			PersonaVo p = PersonaVo.fromORM(ormMedicos[i].getPersona());
			EspecialidadVo e = EspecialidadVo.fromORM(ormMedicos[i].getEspecialidad());
			medicovos.add( new MedicoVo(ormMedicos[i].getId(), p, e));
		}
		String salida = g.toJson(medicovos);
		return salida;
	} catch (PersistentException e) {
		// TODO: handle exception
		e.printStackTrace();
		return null;
		}
	
	}
	
	public String buscarHoraAps(int idMedico, Date fecha1, Date fecha2){ //Busca una hora APS de un medico entre fechas dadas.
		Gson g = new GsonBuilder().setPrettyPrinting().create();
		List<HoraMedicaVo> lhoras = new ArrayList<HoraMedicaVo>();
		try {
			Hora_medicaCriteria c = new Hora_medicaCriteria();
			c.f_inicio.between(new Timestamp(fecha1.getTime()), new Timestamp(fecha2.getTime()));
			c.medicoId.eq(idMedico);
			c.reserva.isEmpty();
			List<orm.Hora_medica> horas = c.list();
			for(int i=0; i<horas.size();i++){
				HoraMedicaVo hmed = HoraMedicaVo.fromORM(horas.get(i));
				lhoras.add(hmed);
			}//end for
			return g.toJson(lhoras);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
public String ReservarHoraAps (int idHoraMedicaAps, int idPaciente) { //Reserva una hora APS para un paciente
		
		Gson g = new GsonBuilder().setPrettyPrinting().create();		
		try {

			orm.Hora_medica hm = orm.Hora_medicaDAO.getHora_medicaByORMID(idHoraMedicaAps);
			orm.Paciente pa = orm.PacienteDAO.getPacienteByORMID(idPaciente);
			orm.Reserva re = null;
			ReservaVo reVo = null;
			
			if(hm != null && pa != null){
				if (hm.reserva.isEmpty()){
					re = new orm.Reserva();
					re.setPaciente(pa);
					re.setPersona(pa.getPersona());
					re.hora_medica.add(hm);
					orm.ReservaDAO.save(re);
					orm.ReservaDAO.refresh(re);
					
					reVo = ReservaVo.fromORM(re);
					return g.toJson(reVo);
				}
			}
				
		} catch (PersistentException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return null;
	}
}