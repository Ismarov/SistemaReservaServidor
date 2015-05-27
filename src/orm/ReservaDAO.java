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

public class ReservaDAO {
	public static Reserva loadReservaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.VpERormPersistentManager.instance().getSession();
			return loadReservaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reserva getReservaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.VpERormPersistentManager.instance().getSession();
			return getReservaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reserva loadReservaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.VpERormPersistentManager.instance().getSession();
			return loadReservaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reserva getReservaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.VpERormPersistentManager.instance().getSession();
			return getReservaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reserva loadReservaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Reserva) session.load(orm.Reserva.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reserva getReservaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Reserva) session.get(orm.Reserva.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reserva loadReservaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Reserva) session.load(orm.Reserva.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reserva getReservaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Reserva) session.get(orm.Reserva.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryReserva(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.VpERormPersistentManager.instance().getSession();
			return queryReserva(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryReserva(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.VpERormPersistentManager.instance().getSession();
			return queryReserva(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reserva[] listReservaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.VpERormPersistentManager.instance().getSession();
			return listReservaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reserva[] listReservaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.VpERormPersistentManager.instance().getSession();
			return listReservaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryReserva(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Reserva as Reserva");
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
	
	public static List queryReserva(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Reserva as Reserva");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Reserva", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reserva[] listReservaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryReserva(session, condition, orderBy);
			return (Reserva[]) list.toArray(new Reserva[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reserva[] listReservaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryReserva(session, condition, orderBy, lockMode);
			return (Reserva[]) list.toArray(new Reserva[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reserva loadReservaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.VpERormPersistentManager.instance().getSession();
			return loadReservaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reserva loadReservaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.VpERormPersistentManager.instance().getSession();
			return loadReservaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reserva loadReservaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Reserva[] reservas = listReservaByQuery(session, condition, orderBy);
		if (reservas != null && reservas.length > 0)
			return reservas[0];
		else
			return null;
	}
	
	public static Reserva loadReservaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Reserva[] reservas = listReservaByQuery(session, condition, orderBy, lockMode);
		if (reservas != null && reservas.length > 0)
			return reservas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateReservaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.VpERormPersistentManager.instance().getSession();
			return iterateReservaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateReservaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.VpERormPersistentManager.instance().getSession();
			return iterateReservaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateReservaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Reserva as Reserva");
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
	
	public static java.util.Iterator iterateReservaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Reserva as Reserva");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Reserva", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reserva createReserva() {
		return new orm.Reserva();
	}
	
	public static boolean save(orm.Reserva reserva) throws PersistentException {
		try {
			orm.VpERormPersistentManager.instance().saveObject(reserva);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Reserva reserva) throws PersistentException {
		try {
			orm.VpERormPersistentManager.instance().deleteObject(reserva);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Reserva reserva)throws PersistentException {
		try {
			if(reserva.getPersona() != null) {
				reserva.getPersona().reserva.remove(reserva);
			}
			
			if(reserva.getPaciente() != null) {
				reserva.getPaciente().reserva.remove(reserva);
			}
			
			orm.Hora_medica[] lHora_medicas = reserva.hora_medica.toArray();
			for(int i = 0; i < lHora_medicas.length; i++) {
				lHora_medicas[i].reserva.remove(reserva);
			}
			return delete(reserva);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Reserva reserva, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(reserva.getPersona() != null) {
				reserva.getPersona().reserva.remove(reserva);
			}
			
			if(reserva.getPaciente() != null) {
				reserva.getPaciente().reserva.remove(reserva);
			}
			
			orm.Hora_medica[] lHora_medicas = reserva.hora_medica.toArray();
			for(int i = 0; i < lHora_medicas.length; i++) {
				lHora_medicas[i].reserva.remove(reserva);
			}
			try {
				session.delete(reserva);
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
	
	public static boolean refresh(orm.Reserva reserva) throws PersistentException {
		try {
			orm.VpERormPersistentManager.instance().getSession().refresh(reserva);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Reserva reserva) throws PersistentException {
		try {
			orm.VpERormPersistentManager.instance().getSession().evict(reserva);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reserva loadReservaByCriteria(ReservaCriteria reservaCriteria) {
		Reserva[] reservas = listReservaByCriteria(reservaCriteria);
		if(reservas == null || reservas.length == 0) {
			return null;
		}
		return reservas[0];
	}
	
	public static Reserva[] listReservaByCriteria(ReservaCriteria reservaCriteria) {
		return reservaCriteria.listReserva();
	}
}
