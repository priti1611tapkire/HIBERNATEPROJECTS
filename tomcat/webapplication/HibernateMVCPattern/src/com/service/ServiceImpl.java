package com.service;

import java.util.List;

import com.dao.DaoI;
import com.dao.DaoImpl;
import com.model.Client;

public class ServiceImpl implements ServiceI {

	DaoI d1=new DaoImpl();
	@Override
	public void insertData(Client client) {
		// TODO Auto-generated method stub
		
		System.out.println("In service layer:" +client);
		d1.insertData(client);
		
	}
	@Override
	public List<Client> getAlldata(String u, String p) {
		// TODO Auto-generated method stub
		List<Client> clist=d1.getAlldata(u,p);
		return clist;
	}
	@Override
	public Client getSingleClient(String cid) {
		// TODO Auto-generated method stub
		return d1.getSingleClient(cid);
	}
	@Override
	public List<Client> getUpdateData(Client client) {
		// TODO Auto-generated method stub
		return d1.getUpdateData(client);
	}
	@Override
	public void deleteData(String deleteid) {
		// TODO Auto-generated method stub
		
		d1.deleteData(deleteid);
		
	}
	@Override
	public List<Client> getAlldatat() {
		// TODO Auto-generated method stub
		List<Client> slist=d1.getAlldatat();
		return slist;
	}

}
