package com.dao;

import java.util.List;

import com.model.Client;

public interface DaoI {

	void insertData(Client client);

	List<Client> getAlldata(String u, String p);

	Client getSingleClient(String cid);

	List<Client> getUpdateData(Client client);
	
	void deleteData(String deleteid);
	public List<Client> getAlldatat();

}
