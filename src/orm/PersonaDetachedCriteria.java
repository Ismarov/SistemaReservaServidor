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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class PersonaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression nombres;
	public final StringExpression apellidos;
	public final StringExpression rut;
	public final DateExpression f_nac;
	public final StringExpression telefono;
	public final StringExpression direccion;
	public final StringExpression ciudad;
	public final StringExpression email;
	public final ByteExpression activo;
	public final IntegerExpression pacienteId;
	public final AssociationExpression paciente;
	public final IntegerExpression directorId;
	public final AssociationExpression director;
	public final IntegerExpression medicoId;
	public final AssociationExpression medico;
	public final CollectionExpression reserva;
	
	public PersonaDetachedCriteria() {
		super(orm.Persona.class, orm.PersonaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombres = new StringExpression("nombres", this.getDetachedCriteria());
		apellidos = new StringExpression("apellidos", this.getDetachedCriteria());
		rut = new StringExpression("rut", this.getDetachedCriteria());
		f_nac = new DateExpression("f_nac", this.getDetachedCriteria());
		telefono = new StringExpression("telefono", this.getDetachedCriteria());
		direccion = new StringExpression("direccion", this.getDetachedCriteria());
		ciudad = new StringExpression("ciudad", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		activo = new ByteExpression("activo", this.getDetachedCriteria());
		pacienteId = new IntegerExpression("paciente.id", this.getDetachedCriteria());
		paciente = new AssociationExpression("paciente", this.getDetachedCriteria());
		directorId = new IntegerExpression("director.id", this.getDetachedCriteria());
		director = new AssociationExpression("director", this.getDetachedCriteria());
		medicoId = new IntegerExpression("medico.id", this.getDetachedCriteria());
		medico = new AssociationExpression("medico", this.getDetachedCriteria());
		reserva = new CollectionExpression("ORM_reserva", this.getDetachedCriteria());
	}
	
	public PersonaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.PersonaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombres = new StringExpression("nombres", this.getDetachedCriteria());
		apellidos = new StringExpression("apellidos", this.getDetachedCriteria());
		rut = new StringExpression("rut", this.getDetachedCriteria());
		f_nac = new DateExpression("f_nac", this.getDetachedCriteria());
		telefono = new StringExpression("telefono", this.getDetachedCriteria());
		direccion = new StringExpression("direccion", this.getDetachedCriteria());
		ciudad = new StringExpression("ciudad", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		activo = new ByteExpression("activo", this.getDetachedCriteria());
		pacienteId = new IntegerExpression("paciente.id", this.getDetachedCriteria());
		paciente = new AssociationExpression("paciente", this.getDetachedCriteria());
		directorId = new IntegerExpression("director.id", this.getDetachedCriteria());
		director = new AssociationExpression("director", this.getDetachedCriteria());
		medicoId = new IntegerExpression("medico.id", this.getDetachedCriteria());
		medico = new AssociationExpression("medico", this.getDetachedCriteria());
		reserva = new CollectionExpression("ORM_reserva", this.getDetachedCriteria());
	}
	
	public PacienteDetachedCriteria createPacienteCriteria() {
		return new PacienteDetachedCriteria(createCriteria("paciente"));
	}
	
	public DirectorDetachedCriteria createDirectorCriteria() {
		return new DirectorDetachedCriteria(createCriteria("director"));
	}
	
	public MedicoDetachedCriteria createMedicoCriteria() {
		return new MedicoDetachedCriteria(createCriteria("medico"));
	}
	
	public ReservaDetachedCriteria createReservaCriteria() {
		return new ReservaDetachedCriteria(createCriteria("ORM_reserva"));
	}
	
	public Persona uniquePersona(PersistentSession session) {
		return (Persona) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Persona[] listPersona(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Persona[]) list.toArray(new Persona[list.size()]);
	}
}

