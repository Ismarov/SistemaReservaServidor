package negocio;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.orm.PersistentException;

import orm.Hora_medicaCriteria;
import vo.HoraMedicaVo;
import vo.ReservaVo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Medico {
	public String buscarSuDisponibilidadHora(int idMedico, Date f1, Date f2){ //Busca disponibilidad de un medico entre fechas entregadas.
		Gson g = new GsonBuilder().setPrettyPrinting().create();
		List<HoraMedicaVo> lhoras = new ArrayList<HoraMedicaVo>();
		try {
			Hora_medicaCriteria c = new Hora_medicaCriteria();
			c.medicoId.eq(idMedico);
			c.f_inicio.between(new Timestamp(f1.getTime()), new Timestamp(f2.getTime()));
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
	
	public String ReservarHoraMedicaControl(int idHoraControl[], int idPaciente) { //Reserva una hora medica para un paciente.

		Gson g = new GsonBuilder().setPrettyPrinting().create();
		List<orm.Hora_medica> horas = new ArrayList<orm.Hora_medica>();
		try {

			orm.Paciente pa = orm.PacienteDAO.getPacienteByORMID(idPaciente);
			orm.Reserva re = null;
			ReservaVo reVo = null;

			for (int i = 0; i < idHoraControl.length; i++) {

				orm.Hora_medica hm = orm.Hora_medicaDAO
						.getHora_medicaByORMID(idHoraControl[i]);
				if (hm == null || hm.reserva.size() != 0)
					return null;
				horas.add(hm);

			}

			if (pa != null) {

				re = new orm.Reserva();
				re.setPaciente(pa);
				re.setPersona(pa.getPersona());
				for (int i = 0; i < horas.size(); i++) {
					re.hora_medica.add(horas.get(i));
				}
				orm.ReservaDAO.save(re);
				orm.ReservaDAO.refresh(re);
				reVo = ReservaVo.fromORM(re);
				return g.toJson(reVo);

			}

		} catch (PersistentException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return null;
	}
}