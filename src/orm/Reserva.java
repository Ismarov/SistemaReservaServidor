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
@Table(name="reserva")
public class Reserva implements Serializable {
	public Reserva() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_RESERVA_HORA_MEDICA) {
			return ORM_hora_medica;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_RESERVA_PERSONA) {
			this.persona = (orm.Persona) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_RESERVA_PACIENTE) {
			this.paciente = (orm.Paciente) owner;
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
	@GeneratedValue(generator="ORM_RESERVA_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORM_RESERVA_ID_GENERATOR", strategy="identity")	
	private int id;
	
	@ManyToOne(targetEntity=orm.Persona.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="persona_id", referencedColumnName="id", nullable=false) })	
	private orm.Persona persona;
	
	@ManyToOne(targetEntity=orm.Paciente.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="paciente_id", referencedColumnName="id", nullable=false) })	
	private orm.Paciente paciente;
	
	@ManyToMany(mappedBy="ORM_reserva", targetEntity=orm.Hora_medica.class)	
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
		if (persona != null) {
			persona.reserva.remove(this);
		}
		if (value != null) {
			value.reserva.add(this);
		}
	}
	
	public orm.Persona getPersona() {
		return persona;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Persona(orm.Persona value) {
		this.persona = value;
	}
	
	private orm.Persona getORM_Persona() {
		return persona;
	}
	
	public void setPaciente(orm.Paciente value) {
		if (paciente != null) {
			paciente.reserva.remove(this);
		}
		if (value != null) {
			value.reserva.add(this);
		}
	}
	
	public orm.Paciente getPaciente() {
		return paciente;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Paciente(orm.Paciente value) {
		this.paciente = value;
	}
	
	private orm.Paciente getORM_Paciente() {
		return paciente;
	}
	
	private void setORM_Hora_medica(java.util.Set value) {
		this.ORM_hora_medica = value;
	}
	
	private java.util.Set getORM_Hora_medica() {
		return ORM_hora_medica;
	}
	
	@Transient	
	public final orm.Hora_medicaSetCollection hora_medica = new orm.Hora_medicaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_RESERVA_HORA_MEDICA, orm.ORMConstants.KEY_HORA_MEDICA_RESERVA, orm.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
