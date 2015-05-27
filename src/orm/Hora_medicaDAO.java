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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class Hora_medicaDAO {
	public static Hora_medica loadHora_medicaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.VpERormPersistentManager.instance().getSession();
			return loadHora_medicaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hora_medica getHora_medicaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.VpERormPersistentManager.instance().getSession();
			return getHora_medicaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hora_medica loadHora_medicaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.VpERormPersistentManager.instance().getSession();
			return loadHora_medicaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hora_medica getHora_medicaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.VpERormPersistentManager.instance().getSession();
			return getHora_medicaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hora_medica loadHora_medicaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Hora_medica) session.load(orm.Hora_medica.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hora_medica getHora_medicaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Hora_medica) session.get(orm.Hora_medica.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hora_medica loadHora_medicaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Hora_medica) session.load(orm.Hora_medica.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hora_medica getHora_medicaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Hora_medica) session.get(orm.Hora_medica.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHora_medica(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.VpERormPersistentManager.instance().getSession();
			return queryHora_medica(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHora_medica(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.VpERormPersistentManager.instance().getSession();
			return queryHora_medica(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hora_medica[] listHora_medicaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.VpERormPersistentManager.instance().getSession();
			return listHora_medicaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hora_medica[] listHora_medicaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.VpERormPersistentManager.instance().getSession();
			return listHora_medicaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHora_medica(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Hora_medica as Hora_medica");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHora_medica(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Hora_medica as Hora_medica");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Hora_medica", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hora_medica[] listHora_medicaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryHora_medica(session, condition, orderBy);
			return (Hora_medica[]) list.toArray(new Hora_medica[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hora_medica[] listHora_medicaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryHora_medica(session, condition, orderBy, lockMode);
			return (Hora_medica[]) list.toArray(new Hora_medica[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hora_medica loadHora_medicaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.VpERormPersistentManager.instance().getSession();
			return loadHora_medicaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hora_medica loadHora_medicaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.VpERormPersistentManager.instance().getSession();
			return loadHora_medicaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hora_medica loadHora_medicaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Hora_medica[] hora_medicas = listHora_medicaByQuery(session, condition, orderBy);
		if (hora_medicas != null && hora_medicas.length > 0)
			return hora_medicas[0];
		else
			return null;
	}
	
	public static Hora_medica loadHora_medicaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Hora_medica[] hora_medicas = listHora_medicaByQuery(session, condition, orderBy, lockMode);
		if (hora_medicas != null && hora_medicas.length > 0)
			return hora_medicas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateHora_medicaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.VpERormPersistentManager.instance().getSession();
			return iterateHora_medicaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHora_medicaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.VpERormPersistentManager.instance().getSession();
			return iterateHora_medicaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHora_medicaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Hora_medica as Hora_medica");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHora_medicaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Hora_medica as Hora_medica");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Hora_medica", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hora_medica createHora_medica() {
		return new orm.Hora_medica();
	}
	
	public static boolean save(orm.Hora_medica hora_medica) throws PersistentException {
		try {
			orm.VpERormPersistentManager.instance().saveObject(hora_medica);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Hora_medica hora_medica) throws PersistentException {
		try {
			orm.VpERormPersistentManager.instance().deleteObject(hora_medica);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Hora_medica hora_medica)throws PersistentException {
		try {
			if(hora_medica.getMedico() != null) {
				hora_medica.getMedico().hora_medica.remove(hora_medica);
			}
			
			if(hora_medica.getBox() != null) {
				hora_medica.getBox().hora_medica.remove(hora_medica);
			}
			
			orm.Reserva[] lReservas = hora_medica.reserva.toArray();
			for(int i = 0; i < lReservas.length; i++) {
				lReservas[i].hora_medica.remove(hora_medica);
			}
			return delete(hora_medica);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Hora_medica hora_medica, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(hora_medica.getMedico() != null) {
				hora_medica.getMedico().hora_medica.remove(hora_medica);
			}
			
			if(hora_medica.getBox() != null) {
				hora_medica.getBox().hora_medica.remove(hora_medica);
			}
			
			orm.Reserva[] lReservas = hora_medica.reserva.toArray();
			for(int i = 0; i < lReservas.length; i++) {
				lReservas[i].hora_medica.remove(hora_medica);
			}
			try {
				session.delete(hora_medica);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(orm.Hora_medica hora_medica) throws PersistentException {
		try {
			orm.VpERormPersistentManager.instance().getSession().refresh(hora_medica);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Hora_medica hora_medica) throws PersistentException {
		try {
			orm.VpERormPersistentManager.instance().getSession().evict(hora_medica);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Hora_medica loadHora_medicaByCriteria(Hora_medicaCriteria hora_medicaCriteria) {
		Hora_medica[] hora_medicas = listHora_medicaByCriteria(hora_medicaCriteria);
		if(hora_medicas == null || hora_medicas.length == 0) {
			return null;
		}
		return hora_medicas[0];
	}
	
	public static Hora_medica[] listHora_medicaByCriteria(Hora_medicaCriteria hora_medicaCriteria) {
		return hora_medicaCriteria.listHora_medica();
	}
}
