package vo;

public class ReservaVo {
	private int id;
	private PersonaVo personaVo;
	private PacienteVo pacienteVo;
	
	public ReservaVo(int id, PersonaVo personaVo, PacienteVo pacienteVo) {
		super();
		this.id = id;
		this.personaVo = personaVo;
		this.pacienteVo = pacienteVo;
	}
	
	public int getId() {
		return this.id;
	}

	public PersonaVo getPersonaVo() {
		return personaVo;
	}

	public PacienteVo getPacienteVo() {
		return pacienteVo;
	}
	
	
	public static ReservaVo fromORM(orm.Reserva r) {
		ReservaVo re = new ReservaVo(
				r.getId(),
				PersonaVo.fromORM(r.getPersona()),
				PacienteVo.fromORM(r.getPaciente())
				);
		return re;
	}

}
