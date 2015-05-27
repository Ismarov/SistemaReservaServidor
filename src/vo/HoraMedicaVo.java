package vo;

import java.util.Date;

public class HoraMedicaVo {
	private int id;
	private MedicoVo medicovo;
	private BoxVo boxvo;
	private Date f_inicio;
	private Date f_fin;
	
	public HoraMedicaVo(int id, MedicoVo medicovo, BoxVo boxvo, Date f_inicio, Date f_fin) {
		super();
		this.id = id;
		this.medicovo = medicovo;
		this.boxvo = boxvo;
	}
	
	public int getId(){
		return this.id;
	}
	
	public MedicoVo getMedicoVo() {
		return medicovo;
	}

	public BoxVo getBoxVo() {
		return boxvo;
	}

	public Date getF_inicio() {
		return f_inicio;
	}

	public Date getF_fin() {
		return f_fin;
	}
	
	public static HoraMedicaVo fromORM(orm.Hora_medica h){
		HoraMedicaVo hm = new HoraMedicaVo(
				h.getId(),
				MedicoVo.fromORM(h.getMedico()),
				BoxVo.fromORM(h.getBox()),
				new Date(h.getF_inicio().getTime()),
				new Date(h.getF_fin().getTime())
				);
		return hm;
	}
	
}
