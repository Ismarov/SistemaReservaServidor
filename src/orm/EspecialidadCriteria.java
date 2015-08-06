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

public class EspecialidadCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression nombre;
	public final CollectionExpression medico;
	
	public EspecialidadCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		nombre = new StringExpression("nombre", this);
		medico = new CollectionExpression("ORM_medico", this);
	}
	
	public EspecialidadCriteria(PersistentSession session) {
		this(session.createCriteria(Especialidad.class));
	}
	
	public EspecialidadCriteria() throws PersistentException {
		this(orm.VpERormPersistentManager.instance().getSession());
	}
	
	public MedicoCriteria createMedicoCriteria() {
		return new MedicoCriteria(createCriteria("ORM_medico"));
	}
	
	public Especialidad uniqueEspecialidad() {
		return (Especialidad) super.uniqueResult();
	}
	
	public Especialidad[] listEspecialidad() {
		java.util.List list = super.list();
		return (Especialidad[]) list.toArray(new Especialidad[list.size()]);
	}
}

