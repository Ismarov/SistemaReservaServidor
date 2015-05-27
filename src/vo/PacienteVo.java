package vo;

public class PacienteVo {
	private int id;
	private PersonaVo paciente_personavo;

	public PacienteVo(int id, PersonaVo paciente_personavo) {
		super();
		this.id = id;
		this.paciente_personavo = paciente_personavo;
	}
	
	public int getId() {
		return this.id;
	}
	
	public PersonaVo getPersonavo() {
		return paciente_personavo;
	}

	public static PacienteVo fromORM(orm.Paciente paciente){
		PersonaVo pe = PersonaVo.fromORM(paciente.getPersona());
		PacienteVo pa = new PacienteVo(paciente.getId(), pe);
		return pa;
	}
}
