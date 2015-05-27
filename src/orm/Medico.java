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
@Table(name="medico")
public class Medico implements Serializable {
	public Medico() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_MEDICO_HORA_MEDICA) {
			return ORM_hora_medica;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_MEDICO_PERSONA) {
			this.persona = (orm.Persona) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_MEDICO_ESPECIALIDAD) {
			this.especialidad = (orm.Especialidad) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="ORM_MEDICO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORM_MEDICO_ID_GENERATOR", strategy="identity")	
	private int id;
	
	@OneToOne(targetEntity=orm.Persona.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="persona_id", nullable=false) })	
	private orm.Persona persona;
	
	@ManyToOne(targetEntity=orm.Especialidad.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="especialidad_id", referencedColumnName="id") })	
	private orm.Especialidad especialidad;
	
	@OneToMany(mappedBy="medico", targetEntity=orm.Hora_medica.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_hora_medica = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setPersona(orm.Persona value) {
		if (this.persona != value) {
			orm.Persona lpersona = this.persona;
			this.persona = value;
			if (value != null) {
				persona.setMedico(this);
			}
			if (lpersona != null) {
				lpersona.setMedico(null);
			}
		}
	}
	
	public orm.Persona getPersona() {
		return persona;
	}
	
	public void setEspecialidad(orm.Especialidad value) {
		if (especialidad != null) {
			especialidad.medico.remove(this);
		}
		if (value != null) {
			value.medico.add(this);
		}
	}
	
	public orm.Especialidad getEspecialidad() {
		return especialidad;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Especialidad(orm.Especialidad value) {
		this.especialidad = value;
	}
	
	private orm.Especialidad getORM_Especialidad() {
		return especialidad;
	}
	
	private void setORM_Hora_medica(java.util.Set value) {
		this.ORM_hora_medica = value;
	}
	
	private java.util.Set getORM_Hora_medica() {
		return ORM_hora_medica;
	}
	
	@Transient	
	public final orm.Hora_medicaSetCollection hora_medica = new orm.Hora_medicaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_MEDICO_HORA_MEDICA, orm.ORMConstants.KEY_HORA_MEDICA_MEDICO, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
