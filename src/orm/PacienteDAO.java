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

public class PacienteDAO {
	public static Paciente loadPacienteByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.VpERormPersistentManager.instance().getSession();
			return loadPacienteByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paciente getPacienteByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.VpERormPersistentManager.instance().getSession();
			return getPacienteByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paciente loadPacienteByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.VpERormPersistentManager.instance().getSession();
			return loadPacienteByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paciente getPacienteByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.VpERormPersistentManager.instance().getSession();
			return getPacienteByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paciente loadPacienteByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Paciente) session.load(orm.Paciente.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paciente getPacienteByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Paciente) session.get(orm.Paciente.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paciente loadPacienteByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Paciente) session.load(orm.Paciente.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paciente getPacienteByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Paciente) session.get(orm.Paciente.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPaciente(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.VpERormPersistentManager.instance().getSession();
			return queryPaciente(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPaciente(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.VpERormPersistentManager.instance().getSession();
			return queryPaciente(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paciente[] listPacienteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.VpERormPersistentManager.instance().getSession();
			return listPacienteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paciente[] listPacienteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.VpERormPersistentManager.instance().getSession();
			return listPacienteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPaciente(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Paciente as Paciente");
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
	
	public static List queryPaciente(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Paciente as Paciente");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Paciente", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paciente[] listPacienteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPaciente(session, condition, orderBy);
			return (Paciente[]) list.toArray(new Paciente[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paciente[] listPacienteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPaciente(session, condition, orderBy, lockMode);
			return (Paciente[]) list.toArray(new Paciente[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paciente loadPacienteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.VpERormPersistentManager.instance().getSession();
			return loadPacienteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paciente loadPacienteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.VpERormPersistentManager.instance().getSession();
			return loadPacienteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paciente loadPacienteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Paciente[] pacientes = listPacienteByQuery(session, condition, orderBy);
		if (pacientes != null && pacientes.length > 0)
			return pacientes[0];
		else
			return null;
	}
	
	public static Paciente loadPacienteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Paciente[] pacientes = listPacienteByQuery(session, condition, orderBy, lockMode);
		if (pacientes != null && pacientes.length > 0)
			return pacientes[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePacienteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.VpERormPersistentManager.instance().getSession();
			return iteratePacienteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePacienteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.VpERormPersistentManager.instance().getSession();
			return iteratePacienteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePacienteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Paciente as Paciente");
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
	
	public static java.util.Iterator iteratePacienteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Paciente as Paciente");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Paciente", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paciente createPaciente() {
		return new orm.Paciente();
	}
	
	public static boolean save(orm.Paciente paciente) throws PersistentException {
		try {
			orm.VpERormPersistentManager.instance().saveObject(paciente);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Paciente paciente) throws PersistentException {
		try {
			orm.VpERormPersistentManager.instance().deleteObject(paciente);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Paciente paciente)throws PersistentException {
		try {
			if(paciente.getPersona() != null) {
				paciente.getPersona().setPaciente(null);
			}
			
			orm.Reserva[] lReservas = paciente.reserva.toArray();
			for(int i = 0; i < lReservas.length; i++) {
				lReservas[i].setPaciente(null);
			}
			return delete(paciente);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Paciente paciente, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(paciente.getPersona() != null) {
				paciente.getPersona().setPaciente(null);
			}
			
			orm.Reserva[] lReservas = paciente.reserva.toArray();
			for(int i = 0; i < lReservas.length; i++) {
				lReservas[i].setPaciente(null);
			}
			try {
				session.delete(paciente);
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
	
	public static boolean refresh(orm.Paciente paciente) throws PersistentException {
		try {
			orm.VpERormPersistentManager.instance().getSession().refresh(paciente);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Paciente paciente) throws PersistentException {
		try {
			orm.VpERormPersistentManager.instance().getSession().evict(paciente);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paciente loadPacienteByCriteria(PacienteCriteria pacienteCriteria) {
		Paciente[] pacientes = listPacienteByCriteria(pacienteCriteria);
		if(pacientes == null || pacientes.length == 0) {
			return null;
		}
		return pacientes[0];
	}
	
	public static Paciente[] listPacienteByCriteria(PacienteCriteria pacienteCriteria) {
		return pacienteCriteria.listPaciente();
	}
}
