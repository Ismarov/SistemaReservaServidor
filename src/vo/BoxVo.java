package vo;

public class BoxVo {
	private int id;
	private String nombre;

	public BoxVo(int id, String nombre) {
		super();
		this.nombre = nombre;
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}
	
	public int getId() {
		return id;
	}
	
	public static BoxVo fromORM(orm.Box b){
		BoxVo bo = new BoxVo(b.getId(), b.getNombre());
		return bo;
	}
}
