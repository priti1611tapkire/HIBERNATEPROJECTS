package com.service;

import java.util.List;

import com.model.Client;

public interface ServiceI {

	public void insertData(Client client);

	public List<Client> getAlldata(String u, String p);

	public Client getSingleClient(String selectid);

	public List<Client> getUpdateData(Client c); 
	
	void deleteData(String id);
	
	public List<Client> getAlldatat();

}
