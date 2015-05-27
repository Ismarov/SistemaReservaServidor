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

public class BoxDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression nombre;
	public final CollectionExpression hora_medica;
	
	public BoxDetachedCriteria() {
		super(orm.Box.class, orm.BoxCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		hora_medica = new CollectionExpression("ORM_hora_medica", this.getDetachedCriteria());
	}
	
	public BoxDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.BoxCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		hora_medica = new CollectionExpression("ORM_hora_medica", this.getDetachedCriteria());
	}
	
	public Hora_medicaDetachedCriteria createHora_medicaCriteria() {
		return new Hora_medicaDetachedCriteria(createCriteria("ORM_hora_medica"));
	}
	
	public Box uniqueBox(PersistentSession session) {
		return (Box) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Box[] listBox(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Box[]) list.toArray(new Box[list.size()]);
	}
}

