package org.sda.gymmanagementhibernatespring.controller;

import java.util.List;

import org.sda.gymmanagementhibernatespring.dao.entity.ClientEntity;
import org.sda.gymmanagementhibernatespring.service.ClientService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppController {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("database.xml");
		ClientService clientService = applicationContext.getBean(ClientService.class);
		
		List<ClientEntity> clients = clientService.getAllClients();
		for(ClientEntity client : clients) {
			System.out.println(client.getFirstName() + " " + client.getLastName());
		}
	}
}
