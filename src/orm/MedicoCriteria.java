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

public class MedicoCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression personaId;
	public final AssociationExpression persona;
	public final IntegerExpression especialidadId;
	public final AssociationExpression especialidad;
	public final CollectionExpression hora_medica;
	
	public MedicoCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		personaId = new IntegerExpression("persona.id", this);
		persona = new AssociationExpression("persona", this);
		especialidadId = new IntegerExpression("especialidad.id", this);
		especialidad = new AssociationExpression("especialidad", this);
		hora_medica = new CollectionExpression("ORM_hora_medica", this);
	}
	
	public MedicoCriteria(PersistentSession session) {
		this(session.createCriteria(Medico.class));
	}
	
	public MedicoCriteria() throws PersistentException {
		this(orm.VpERormPersistentManager.instance().getSession());
	}
	
	public PersonaCriteria createPersonaCriteria() {
		return new PersonaCriteria(createCriteria("persona"));
	}
	
	public EspecialidadCriteria createEspecialidadCriteria() {
		return new EspecialidadCriteria(createCriteria("especialidad"));
	}
	
	public Hora_medicaCriteria createHora_medicaCriteria() {
		return new Hora_medicaCriteria(createCriteria("ORM_hora_medica"));
	}
	
	public Medico uniqueMedico() {
		return (Medico) super.uniqueResult();
	}
	
	public Medico[] listMedico() {
		java.util.List list = super.list();
		return (Medico[]) list.toArray(new Medico[list.size()]);
	}
}

