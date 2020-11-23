package EvolentH.EvolentH.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import EvolentH.EvolentH.Models.Employee;
import EvolentH.EvolentH.config.ApplicationLogger;
import EvolentH.EvolentH.config.HibernateUtil;
import EvolentH.EvolentH.dao.EmployeeDao;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public int addUser(Employee emp) {
		Transaction transaction = null;
		int status = 0;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			status = (int) session.save(emp);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			ApplicationLogger.debug(e.getStackTrace());
		}
		return status;
	}

	@Override
	public int editEmployee(Employee emp) {
		Transaction transaction = null;
		int status = 1;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			session.update(emp);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			ApplicationLogger.debug(e.getStackTrace());
		}
		return status;
	}

	@Override
	public int deleteEmployee(int id) {
		int status = 0;
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			status = session.createQuery("update  Employee set status='false' where id=:id").setParameter("id", id).executeUpdate();
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			ApplicationLogger.debug(e.getStackTrace());
		}
		return status;
	}

	@Override
	public List<Employee> getUser() {

        Transaction transaction = null;
      
        List < Employee > employees = null ;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
        	  transaction = session.beginTransaction();
            employees = session.createQuery("from Employee", Employee.class).list();
            employees.forEach(s -> System.out.println(s.getFirstName()));
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return employees;
	}

	@Override
	public int activateEmployee(int id) {
		int status = 0;
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			status = session.createQuery("update  Employee set status='true' where id=:id").setParameter("id", id).executeUpdate();
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			ApplicationLogger.debug(e.getStackTrace());
		}
		return status;
	}

}
