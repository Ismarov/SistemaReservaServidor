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
@Table(name="box")
public class Box implements Serializable {
	public Box() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_BOX_HORA_MEDICA) {
			return ORM_hora_medica;
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
	@GeneratedValue(generator="ORM_BOX_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORM_BOX_ID_GENERATOR", strategy="identity")	
	private int id;
	
	@Column(name="nombre", nullable=false, length=30)	
	private String nombre;
	
	@OneToMany(mappedBy="box", targetEntity=orm.Hora_medica.class)	
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
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	private void setORM_Hora_medica(java.util.Set value) {
		this.ORM_hora_medica = value;
	}
	
	private java.util.Set getORM_Hora_medica() {
		return ORM_hora_medica;
	}
	
	@Transient	
	public final orm.Hora_medicaSetCollection hora_medica = new orm.Hora_medicaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_BOX_HORA_MEDICA, orm.ORMConstants.KEY_HORA_MEDICA_BOX, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
