package org.sda.gymmanagementhibernatespring.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.sda.gymmanagementhibernatespring.dao.ClientDao;
import org.sda.gymmanagementhibernatespring.dao.entity.ClientEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ClientDaoImpl implements ClientDao {
	@Autowired
	private SessionFactory sessionFactory;

	public void saveClient(ClientEntity clientEntity) {
	}

	public List<ClientEntity> getAllClients() {
		Query<ClientEntity> query = sessionFactory.getCurrentSession().createQuery("from ClientEntity");
		
		return query.getResultList();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
