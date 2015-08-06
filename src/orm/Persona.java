/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package orm;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="persona")
public class Persona implements Serializable {
	public Persona() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_PERSONA_RESERVA) {
			return ORM_reserva;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="ORM_PERSONA_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORM_PERSONA_ID_GENERATOR", strategy="identity")	
	private int id;
	
	@Column(name="nombres", nullable=false, length=40)	
	private String nombres;
	
	@Column(name="apellidos", nullable=false, length=40)	
	private String apellidos;
	
	@Column(name="rut", nullable=false, unique=true, length=12)	
	private String rut;
	
	@Column(name="f_nac", nullable=false)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date f_nac;
	
	@Column(name="telefono", nullable=true, length=12)	
	private String telefono;
	
	@Column(name="direccion", nullable=false, length=50)	
	private String direccion;
	
	@Column(name="ciudad", nullable=false, length=30)	
	private String ciudad;
	
	@Column(name="email", nullable=true, length=40)	
	private String email;
	
	@Column(name="activo", nullable=false, length=1)	
	private byte activo;
	
	@OneToOne(mappedBy="persona", targetEntity=orm.Paciente.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	private orm.Paciente paciente;
	
	@OneToOne(mappedBy="persona", targetEntity=orm.Director.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	private orm.Director director;
	
	@OneToOne(mappedBy="persona", targetEntity=orm.Medico.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	private orm.Medico medico;
	
	@OneToMany(mappedBy="persona", targetEntity=orm.Reserva.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_reserva = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setNombres(String value) {
		this.nombres = value;
	}
	
	public String getNombres() {
		return nombres;
	}
	
	public void setApellidos(String value) {
		this.apellidos = value;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setRut(String value) {
		this.rut = value;
	}
	
	public String getRut() {
		return rut;
	}
	
	public void setF_nac(java.util.Date value) {
		this.f_nac = value;
	}
	
	public java.util.Date getF_nac() {
		return f_nac;
	}
	
	public void setTelefono(String value) {
		this.telefono = value;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setDireccion(String value) {
		this.direccion = value;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setCiudad(String value) {
		this.ciudad = value;
	}
	
	public String getCiudad() {
		return ciudad;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setActivo(byte value) {
		this.activo = value;
	}
	
	public byte getActivo() {
		return activo;
	}
	
	public void setPaciente(orm.Paciente value) {
		if (this.paciente != value) {
			orm.Paciente lpaciente = this.paciente;
			this.paciente = value;
			if (value != null) {
				paciente.setPersona(this);
			}
			if (lpaciente != null) {
				lpaciente.setPersona(null);
			}
		}
	}
	
	public orm.Paciente getPaciente() {
		return paciente;
	}
	
	public void setDirector(orm.Director value) {
		if (this.director != value) {
			orm.Director ldirector = this.director;
			this.director = value;
			if (value != null) {
				director.setPersona(this);
			}
			if (ldirector != null) {
				ldirector.setPersona(null);
			}
		}
	}
	
	public orm.Director getDirector() {
		return director;
	}
	
	public void setMedico(orm.Medico value) {
		if (this.medico != value) {
			orm.Medico lmedico = this.medico;
			this.medico = value;
			if (value != null) {
				medico.setPersona(this);
			}
			if (lmedico != null) {
				lmedico.setPersona(null);
			}
		}
	}
	
	public orm.Medico getMedico() {
		return medico;
	}
	
	private void setORM_Reserva(java.util.Set value) {
		this.ORM_reserva = value;
	}
	
	private java.util.Set getORM_Reserva() {
		return ORM_reserva;
	}
	
	@Transient	
	public final orm.ReservaSetCollection reserva = new orm.ReservaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_PERSONA_RESERVA, orm.ORMConstants.KEY_RESERVA_PERSONA, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
