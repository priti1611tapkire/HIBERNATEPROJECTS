package com.dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Pdao implements Serializable {

	private Connection con;
	public Pdao()
	{
		estabcon();
	}
	private void estabcon()
	{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con =DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdata","root","root");
		
	}catch(Exception e){ }
	}
	public int reg(ArrayList a,String log,String pass,Integer nwac) throws SQLException
	{
		Integer i=0;
		try{
			
			String sql="Select * from custp where cid='"+log +"'";
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			
			if(!rs.next())
			{
				PersonInfo per=(PersonInfo)a.get(0);
				sql="insert into custp values('"+log+"','"+pass+"')";
				stmt=con.createStatement();
			
			stmt.executeUpdate(sql);
			sql="insert into cust values("+nwac+",'"+log+"')";
			stmt=con.createStatement();
			
			stmt.executeUpdate(sql);
			sql="insert into custd values('"+log+"','"+per.getcname()+"','"+per.getcadd()+"',"+per.getcmobile()+")";
			stmt=con.createStatement();
			
			stmt.executeUpdate(sql);
			sql="insert into accd values("+nwac+",0,"+per.getbcode()+")";
			stmt=con.createStatement();
			
			stmt.executeUpdate(sql);
			sql="update acc set  cac=cac+1";
			stmt=con.createStatement();
			
			stmt.executeUpdate(sql);
			i= 1;
			}
			
			
		}	catch(Exception e){
			System.out.println(e);
		}
		finally{
				if(con!=null)
				{
					con.close();
				}
		}
		return i;
		
	}
	public ArrayList<PersonInfo> retrieve(String id,String pass) throws SQLException
	{
		ArrayList<PersonInfo> a=new ArrayList<PersonInfo>();
		try{
			
			String sql="Select * from custp where cid='" +id + "' and pass='" +pass+"'";
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			String name;
			String psd;
			String cname=null,cadd=null,dadate=null,type=null;
			Integer cac,bcode;
			Long cmobile;
			Float amount,bal;
			if(rs.next()){
				name=rs.getString("cid");
				psd=rs.getString("pass");
			//	Class.forName("com.mysql.jdbc.Driver");
				con =DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdata","root","root");
				try{
					
					sql="Select * from cust where cid=" + id;
					stmt = con.createStatement();
					rs=stmt.executeQuery(sql);
					rs.next();
					name=rs.getString("cid");
					cac=rs.getInt("cac");
					try{
							sql="Select * from custd where cid="+id;
							stmt = con.createStatement();
							rs=stmt.executeQuery(sql);
							rs.next();
							cname=rs.getString("cname");
							cadd=rs.getString("cadd");
							cmobile=rs.getLong("cmobile");
							try{
									sql="Select * from accd where cac="+cac;
									stmt = con.createStatement();
									rs=stmt.executeQuery(sql);
									rs.next();
									bal=rs.getFloat("bal");
									bcode=rs.getInt("bcode");
									try{	
											sql="Select * from widep where cac="+cac;
											stmt = con.createStatement();
											rs=stmt.executeQuery(sql);
											while(rs.next()){
												dadate=rs.getString("ddate");
												type=rs.getString("type");
												amount=rs.getFloat("amount");
												PersonInfo p=new PersonInfo();
												p.setall(name,cac,cadd,bal,bcode,dadate,type,amount);
												p.setname(cname);
												p.setpass(psd);
												p.setmobile(cmobile);
												a.add(p);	
											}
									}
									catch(Exception e){
										System.out.println(e);
									}
							}
							catch(Exception e){
								System.out.println(e);
							}
					}
					catch(Exception e){
						System.out.println(e);
					}
				}
				catch(Exception e){
					System.out.println(e);
				}
				
			}
		}	catch(Exception e){
			System.out.println(e);
		}
		finally{
				if(con!=null)
				{
					con.close();
				}
		}
		return a;
	}
}


