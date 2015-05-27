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
@Table(name="especialidad")
public class Especialidad implements Serializable {
	public Especialidad() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_ESPECIALIDAD_MEDICO) {
			return ORM_medico;
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
	@GeneratedValue(generator="ORM_ESPECIALIDAD_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORM_ESPECIALIDAD_ID_GENERATOR", strategy="identity")	
	private int id;
	
	@Column(name="nombre", nullable=false, length=30)	
	private String nombre;
	
	@OneToMany(mappedBy="especialidad", targetEntity=orm.Medico.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_medico = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	private void setORM_Medico(java.util.Set value) {
		this.ORM_medico = value;
	}
	
	private java.util.Set getORM_Medico() {
		return ORM_medico;
	}
	
	@Transient	
	public final orm.MedicoSetCollection medico = new orm.MedicoSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_ESPECIALIDAD_MEDICO, orm.ORMConstants.KEY_MEDICO_ESPECIALIDAD, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
