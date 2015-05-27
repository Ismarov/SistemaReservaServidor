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

public class ReservaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression personaId;
	public final AssociationExpression persona;
	public final IntegerExpression pacienteId;
	public final AssociationExpression paciente;
	public final CollectionExpression hora_medica;
	
	public ReservaDetachedCriteria() {
		super(orm.Reserva.class, orm.ReservaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		personaId = new IntegerExpression("persona.id", this.getDetachedCriteria());
		persona = new AssociationExpression("persona", this.getDetachedCriteria());
		pacienteId = new IntegerExpression("paciente.id", this.getDetachedCriteria());
		paciente = new AssociationExpression("paciente", this.getDetachedCriteria());
		hora_medica = new CollectionExpression("ORM_hora_medica", this.getDetachedCriteria());
	}
	
	public ReservaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.ReservaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		personaId = new IntegerExpression("persona.id", this.getDetachedCriteria());
		persona = new AssociationExpression("persona", this.getDetachedCriteria());
		pacienteId = new IntegerExpression("paciente.id", this.getDetachedCriteria());
		paciente = new AssociationExpression("paciente", this.getDetachedCriteria());
		hora_medica = new CollectionExpression("ORM_hora_medica", this.getDetachedCriteria());
	}
	
	public PersonaDetachedCriteria createPersonaCriteria() {
		return new PersonaDetachedCriteria(createCriteria("persona"));
	}
	
	public PacienteDetachedCriteria createPacienteCriteria() {
		return new PacienteDetachedCriteria(createCriteria("paciente"));
	}
	
	public Hora_medicaDetachedCriteria createHora_medicaCriteria() {
		return new Hora_medicaDetachedCriteria(createCriteria("ORM_hora_medica"));
	}
	
	public Reserva uniqueReserva(PersistentSession session) {
		return (Reserva) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Reserva[] listReserva(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Reserva[]) list.toArray(new Reserva[list.size()]);
	}
}

