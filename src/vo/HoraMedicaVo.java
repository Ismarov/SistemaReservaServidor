package vo;

import java.util.Date;

public class HoraMedicaVo {
	private int id;
	private MedicoVo medicovo;
	private BoxVo boxvo;
	private Date finicio;
	private Date ffin;
	
	public HoraMedicaVo(int id, MedicoVo medicovo, BoxVo boxvo, Date f_inicio, Date f_fin) {
		super();
		this.id = id;
		this.medicovo = medicovo;
		this.boxvo = boxvo;
		this.finicio = f_inicio;
		this.ffin = ffin;
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

	public Date getFinicio() {
		return finicio;
	}

	public Date getFfin() {
		return ffin;
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
