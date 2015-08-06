package negocio;

import java.util.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;





import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.orm.PersistentException;

import orm.BoxCriteria;
import orm.EspecialidadCriteria;
import orm.Hora_medicaCriteria;
import orm.MedicoCriteria;
import orm.PacienteCriteria;
import orm.ReservaCriteria;
import vo.BoxVo;
import vo.EspecialidadVo;
import vo.MedicoVo;
import vo.PacienteVo;
import vo.PersonaVo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Director {
	final class PacReservas implements Comparable<PacReservas>{ //Clase agregada utilitaria para representar el gson.
		private int reservas;									//del metodo obtenerPacientesMasAtendidos()
		private PacienteVo paciente;
		
		public PacReservas(int reservas, PacienteVo paciente){
			this.reservas = reservas;
			this.paciente = paciente;
		}
		
		public PacienteVo getPaciente(){ return this.paciente; }
		public int getReservas(){ return this.reservas; }
		
		public int compareTo(PacReservas other){
			// retornar < 0 si este es menor que other
			// 0 si igual o > 0 si mayor que otro.
			return this.reservas - other.reservas;
		}
		
	}
	final class MedReservas implements Comparable<MedReservas>{ //Clase agregada utilitaria para representar el gson
		private int reservas;									//del metodo obtenerMedicosMasSolicitados()
		private MedicoVo medico;
		
		public MedReservas(int reservas, MedicoVo medico){
			this.reservas = reservas;
			this.medico = medico;
		}
		
		public MedicoVo getMedico(){ return this.medico; }
		public int getReservas(){ return this.reservas; }
		
		public int compareTo(MedReservas other){
			// retornar < 0 si este es menor que other
			// 0 si igual o > 0 i mayor que otro.
			return this.reservas - other.reservas;
		}
		
	}
	
	public String obtenerBoxs(){ //Obtiene lista de todos los box.
		Gson g = new GsonBuilder().setPrettyPrinting().create();
		List<BoxVo> boxVOs= new ArrayList<BoxVo>();
		
		try {
			orm.Box[] boxs=orm.BoxDAO.listBoxByQuery(null, null);

			for(int i=0; i<boxs.length;i++){
				boxVOs.add(new BoxVo(boxs[i].getId(), boxs[i].getNombre()));
			}
			String salida=g.toJson(boxVOs);
			return salida;
			
		} catch (PersistentException e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		
	}

	public String obtenerMedicos(){	//Obtiene lista de medicos.	
		Gson g = new GsonBuilder().setPrettyPrinting().create();
		List<MedicoVo>medicoVOs=new ArrayList<MedicoVo>();		
		try {
			orm.Medico[] medicos=orm.MedicoDAO.listMedicoByQuery(null, null);

			for(int i=0; i<medicos.length;i++){
				PersonaVo per = new PersonaVo().fromORM(medicos[i].getPersona());
				EspecialidadVo esp = EspecialidadVo.fromORM(medicos[i].getEspecialidad());
				medicoVOs.add(new MedicoVo(medicos[i].getId(), per, esp));
			}
			String salida=g.toJson(medicoVOs);
			return salida;
			
		} catch (PersistentException e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		
	}
	
	public int obtenerPorcentajeOcupacionBox(int boxId, Date f1, Date f2){ //Obtiene porcentaje de ocupacion de un box
		try{																//entre determinadas fechas
			ReservaCriteria c = new ReservaCriteria();
			Hora_medicaCriteria hm = c.createHora_medicaCriteria(); //horas medicas asociadas a la reserva
			hm.f_inicio.between(new Timestamp(f1.getTime()), new Timestamp(f2.getTime())); //filtradas entre las fechas
			BoxCriteria b = hm.createBoxCriteria(); 
			b.id.eq(boxId); //asociadas al id el box
			
			Hora_medicaCriteria hm2 = new Hora_medicaCriteria();
			hm2.f_inicio.between(new Timestamp(f1.getTime()), new Timestamp(f2.getTime())); //todas las horas medicas asociadas al box
			BoxCriteria b2 = hm2.createBoxCriteria();
			b2.id.eq(boxId); 
			
			int reservas = c.list().size(); //Numero de reservas para el box.
			int hmb = hm2.list().size(); //Numero de horas asignadas al box.
			
			if(hmb == 0){
				return 0;
			}else{
				return (int)(reservas*100)/hmb; //Calcula el porcentaje de uso 
			}
		} catch (PersistentException e){
			e.printStackTrace();	
		}
		return -1;
	}
	
	public int obtenerPorcentajeOcupacionMedico(int medicoId, Date f1, Date f2){ //obtiene el porcentaje de ocupacion de un medico
		try{																		//entre determinadas fechas
			ReservaCriteria c = new ReservaCriteria();
			Hora_medicaCriteria hm = c.createHora_medicaCriteria(); //horas médicas asociadas a la reserva
			hm.f_inicio.between(new Timestamp(f1.getTime()), new Timestamp(f2.getTime())); //filtradas entre las fechas
			MedicoCriteria mc = hm.createMedicoCriteria(); 
			mc.id.eq(medicoId); //asociadas al id del médico
			
			Hora_medicaCriteria hm2 = new Hora_medicaCriteria();
			hm2.f_inicio.between(new Timestamp(f1.getTime()), new Timestamp(f2.getTime())); //todas las horas medicas asociadas al médico
			MedicoCriteria mc2 = hm2.createMedicoCriteria();
			mc2.id.eq(medicoId); 
			
			int reservas = c.list().size(); //Numero de reservas para el médico.
			int hmm = hm2.list().size(); //Numero de horas asignadas al médico.
			
			if(hmm == 0){
				return 0;
			}else{
				return (int)(reservas*100)/hmm; //Calcula el porcentaje de uso 
			}
		} catch (PersistentException e){
			e.printStackTrace();	
		}
		return -1;
	}
	
	public String obtenerPacientesMasAtendidos(Date t1, Date t2) { //obtiene lista de pacientes mas atendidos ordenados de mayor a menor atencion
		//Gson g = new Gson();
		Gson g = new GsonBuilder().setPrettyPrinting().create();
		
		try {
			//Traer pacientes que han reservado ordenados por id.
			PacienteCriteria pc = new PacienteCriteria();
			ReservaCriteria rc = pc.createReservaCriteria();
			Hora_medicaCriteria hmc = rc.createHora_medicaCriteria();
			hmc.f_inicio.between(new Timestamp(t1.getTime()), new Timestamp(t2.getTime()));
			pc.addOrder(Order.asc("id"));
			
			@SuppressWarnings("unchecked")
			List<orm.Paciente> pacientes = pc.list();
			List<PacReservas> lPacRes = new ArrayList<PacReservas>();
			
			
			// Cuenta de la cantidad de reservas de cada paciente y las asocia a este.
			int count = 0;
			int current_id = 0;
			
			if( pacientes.size() > 0 ){ 										// Si existen pacientes con reservas. 
				
				current_id = pacientes.get(0).getId(); 							// El id actual es el del primer paciente;
				for(int i=0; i<pacientes.size(); i++){
					
					if(pacientes.get(i).getId() != current_id || i == pacientes.size()-1 ){	// Sigue contando a menos que el id cambie.
						if( i == pacientes.size()-1 ){							// Si añadimos el ultimo paciente debemos incrementar
							count++;											// en 1+ la cuenta.
						}
						PacienteVo pa = PacienteVo.fromORM(pacientes.get(i-1)); // Crea Un objeto PacReservas para convertirlo a JSON luego.
						lPacRes.add(new PacReservas(count, pa));
						count = 1;												// Reseteo el contador a  para el id siguiente.
						current_id = pacientes.get(i).getId();
					}
					else{
						count++;
					}
				}// fin for
			}	
			// Ordenar por cantidad de reservas
			Collections.sort(lPacRes);		//Ordena de menor a mayor
			Collections.reverse(lPacRes);  // invertir orden de mayor a menor
			
			return g.toJson(lPacRes);
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	public String obtenerMedicosMasSolicitados(Date t1, Date t2) { //obtiene medicos mas solictados ordenados de mayor a menor reservas.
		//Gson g = new Gson();
		Gson g = new GsonBuilder().setPrettyPrinting().create();
		
		try {
			//Traer medicos que han reservado ordenados por id.
			MedicoCriteria mc = new MedicoCriteria();
			Hora_medicaCriteria hmc = mc.createHora_medicaCriteria();
			hmc.f_inicio.between(new Timestamp(t1.getTime()), new Timestamp(t2.getTime()));
			ReservaCriteria rc = hmc.createReservaCriteria();
			rc.hora_medica.isNotEmpty();;
			mc.addOrder(Order.asc("id"));
			
			@SuppressWarnings("unchecked")
			List<orm.Medico> medicos = mc.list();
			List<MedReservas> lMedRes = new ArrayList<MedReservas>();
			
			
			// Cuenta de la cantidad de reservas de cada paciente y las asocia a este.
			int count = 0;
			int current_id = 0;
			
			if( medicos.size() > 0 ){ 										// Si existen medicos con reservas. 
				
				current_id = medicos.get(0).getId(); 							// El id actual es el del primer medico;
				for(int i=0; i<medicos.size(); i++){
					
					if(medicos.get(i).getId() != current_id || i == medicos.size()-1 ){	// Sigo contando a menos que el id cambie.
						if( i == medicos.size()-1 ){							// Si añadimos el ultimo medico debemos incrementar
							count++;											// en 1+ la cuenta.
						}
						MedicoVo med = MedicoVo.fromORM(medicos.get(i-1)); // Creo Un objeto MedReservas para convertirlo a JSON luego.
						int porcentaje = (int) (count * 100)/medicos.size();
						lMedRes.add(new MedReservas(porcentaje, med));
						count = 1;												// Reseteo el contador a  para el id siguiente.
						current_id = medicos.get(i).getId();
					}
					else{
						count++;
					}
				}// fin for
			}
			// Ordenar por cantidad de reservas
			Collections.sort(lMedRes);		//Ordena de menor a mayor
			Collections.reverse(lMedRes);  // invertir orden de mayor a menor
			
			return g.toJson(lMedRes);
			
		} catch (PersistentException e) {
			e.printStackTrace();
		}		
		return null;
	}
}