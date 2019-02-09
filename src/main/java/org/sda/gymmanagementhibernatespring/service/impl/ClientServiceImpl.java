package org.sda.gymmanagementhibernatespring.service.impl;

import java.util.List;

import org.sda.gymmanagementhibernatespring.dao.ClientDao;
import org.sda.gymmanagementhibernatespring.dao.entity.ClientEntity;
import org.sda.gymmanagementhibernatespring.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientServiceImpl implements ClientService {
	@Autowired
	private ClientDao clientDao;

	public void saveClient(ClientEntity clientEntity) {
		clientDao.saveClient(clientEntity);
	}

	@Transactional
	public List<ClientEntity> getAllClients() {
		return clientDao.getAllClients();
	}

	public ClientDao getClientDao() {
		return clientDao;
	}

	public void setClientDao(ClientDao clientDao) {
		this.clientDao = clientDao;
	}
	
	

}
