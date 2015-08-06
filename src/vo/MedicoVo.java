package vo;

public class MedicoVo {
	private PersonaVo medico_personavo;
	private EspecialidadVo medico_especialidadvo;
	private int id;
	
	public MedicoVo(int id, PersonaVo medico_personavo,
			EspecialidadVo medico_especialidadvo) {
		super();
		this.id = id;
		this.medico_personavo = medico_personavo;
		this.medico_especialidadvo = medico_especialidadvo;
	}
	
	public int getId() {
		return this.id;
	}
	
	public PersonaVo getMedico_personavo() {
		return medico_personavo;
	}

	public EspecialidadVo getMedico_especialidadvo() {
		return medico_especialidadvo;
	}
	
	public static MedicoVo fromORM(orm.Medico m) {
		PersonaVo p = PersonaVo.fromORM(m.getPersona());
		EspecialidadVo e = EspecialidadVo.fromORM(m.getEspecialidad());
		MedicoVo me = new MedicoVo(m.getId(), p, e);
		return me;
	}
	
}