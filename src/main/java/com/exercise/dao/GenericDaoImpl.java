package com.exercise.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.exercise.model.Client;
import com.exercise.util.HibernateUtil;

@Repository
public class GenericDaoImpl implements GenericDao {

	@Override
	public Client getClientEntity(Long id) {

		Client clnt = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.getCurrentSession();


			Transaction txn = session.beginTransaction();

			//HQL example - Get Client by id

			  Query query = session.createQuery("from Client where clntClientId = :id");
			  query.setParameter("id", id);
			  clnt = (Client) query.uniqueResult();
			  System.out.println("Client Name="+clnt.getClntFname()+" "+clnt.getClntLname()
			  );



			//HQL join examples
			/*
			 * query = session.createQuery("select e.name, a.city from Employee e " +
			 * "INNER JOIN e.address a"); List<Object[]> list = query.list(); for(Object[]
			 * arr : list){ System.out.println(Arrays.toString(arr)); }
			 */
			txn.commit();

			//closing hibernate resources
			sessionFactory.close();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception in getting Client: " + e.getMessage());
			e.printStackTrace();
		}

		return clnt;
	}
}
