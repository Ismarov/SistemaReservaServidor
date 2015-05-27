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

public class Hora_medicaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression medicoId;
	public final AssociationExpression medico;
	public final IntegerExpression boxId;
	public final AssociationExpression box;
	public final TimestampExpression f_inicio;
	public final TimestampExpression f_fin;
	public final CollectionExpression reserva;
	
	public Hora_medicaDetachedCriteria() {
		super(orm.Hora_medica.class, orm.Hora_medicaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		medicoId = new IntegerExpression("medico.id", this.getDetachedCriteria());
		medico = new AssociationExpression("medico", this.getDetachedCriteria());
		boxId = new IntegerExpression("box.id", this.getDetachedCriteria());
		box = new AssociationExpression("box", this.getDetachedCriteria());
		f_inicio = new TimestampExpression("f_inicio", this.getDetachedCriteria());
		f_fin = new TimestampExpression("f_fin", this.getDetachedCriteria());
		reserva = new CollectionExpression("ORM_reserva", this.getDetachedCriteria());
	}
	
	public Hora_medicaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Hora_medicaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		medicoId = new IntegerExpression("medico.id", this.getDetachedCriteria());
		medico = new AssociationExpression("medico", this.getDetachedCriteria());
		boxId = new IntegerExpression("box.id", this.getDetachedCriteria());
		box = new AssociationExpression("box", this.getDetachedCriteria());
		f_inicio = new TimestampExpression("f_inicio", this.getDetachedCriteria());
		f_fin = new TimestampExpression("f_fin", this.getDetachedCriteria());
		reserva = new CollectionExpression("ORM_reserva", this.getDetachedCriteria());
	}
	
	public MedicoDetachedCriteria createMedicoCriteria() {
		return new MedicoDetachedCriteria(createCriteria("medico"));
	}
	
	public BoxDetachedCriteria createBoxCriteria() {
		return new BoxDetachedCriteria(createCriteria("box"));
	}
	
	public ReservaDetachedCriteria createReservaCriteria() {
		return new ReservaDetachedCriteria(createCriteria("ORM_reserva"));
	}
	
	public Hora_medica uniqueHora_medica(PersistentSession session) {
		return (Hora_medica) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Hora_medica[] listHora_medica(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Hora_medica[]) list.toArray(new Hora_medica[list.size()]);
	}
}

