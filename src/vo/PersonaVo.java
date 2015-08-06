package vo;

import java.util.Date;

public class PersonaVo {
	private int id;
	private String nombres;
	private String apellidos;
	private String rut;
	private Date f_nac;
	private String telefono;
	private String direccion;
	private String ciudad;
	private String email;
	private int activo;
	
	public PersonaVo(){	
	}
	public PersonaVo(int id, String nombres, String apellidos, String rut,
			Date f_nac, String telefono, String direccion, String ciudad,
			String email, int activo) {
		super();
		this.id = id;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.rut = rut;
		this.f_nac = f_nac;
		this.telefono = telefono;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.email = email;
		this.activo = activo;
	}
	
	public int  getId() {
		return this.id;
	}
	
	public String getNombres() {
		return nombres;
	}
 
	public String getApellidos() {
		return apellidos;
	}
 
	public String getRut() {
		return rut;
	}
 
	public Date getF_nac() {
		return f_nac;
	}
 
	public String getTelefono() {
		return telefono;
	}
 
	public String getDireccion() {
		return direccion;
	}
 
	public String getCiudad() {
		return ciudad;
	}
 
	public String getEmail() {
		return email;
	}
 
	public int getActivo() {
		return activo;
	}
	
	public static PersonaVo fromORM(orm.Persona p){
		//
		PersonaVo pe = new PersonaVo(
				p.getId(),
				p.getNombres(),
				p.getApellidos(),
				p.getRut(),
				p.getF_nac(),
				p.getTelefono(),
				p.getDireccion(),
				p.getCiudad(),
				p.getEmail(),
				p.getActivo());
		return pe;
	}
	
}
