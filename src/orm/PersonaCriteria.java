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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class PersonaCriteria extends AbstractORMCriteria {
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
	
	public PersonaCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		nombres = new StringExpression("nombres", this);
		apellidos = new StringExpression("apellidos", this);
		rut = new StringExpression("rut", this);
		f_nac = new DateExpression("f_nac", this);
		telefono = new StringExpression("telefono", this);
		direccion = new StringExpression("direccion", this);
		ciudad = new StringExpression("ciudad", this);
		email = new StringExpression("email", this);
		activo = new ByteExpression("activo", this);
		pacienteId = new IntegerExpression("paciente.id", this);
		paciente = new AssociationExpression("paciente", this);
		directorId = new IntegerExpression("director.id", this);
		director = new AssociationExpression("director", this);
		medicoId = new IntegerExpression("medico.id", this);
		medico = new AssociationExpression("medico", this);
		reserva = new CollectionExpression("ORM_reserva", this);
	}
	
	public PersonaCriteria(PersistentSession session) {
		this(session.createCriteria(Persona.class));
	}
	
	public PersonaCriteria() throws PersistentException {
		this(orm.VpERormPersistentManager.instance().getSession());
	}
	
	public PacienteCriteria createPacienteCriteria() {
		return new PacienteCriteria(createCriteria("paciente"));
	}
	
	public DirectorCriteria createDirectorCriteria() {
		return new DirectorCriteria(createCriteria("director"));
	}
	
	public MedicoCriteria createMedicoCriteria() {
		return new MedicoCriteria(createCriteria("medico"));
	}
	
	public ReservaCriteria createReservaCriteria() {
		return new ReservaCriteria(createCriteria("ORM_reserva"));
	}
	
	public Persona uniquePersona() {
		return (Persona) super.uniqueResult();
	}
	
	public Persona[] listPersona() {
		java.util.List list = super.list();
		return (Persona[]) list.toArray(new Persona[list.size()]);
	}
}

