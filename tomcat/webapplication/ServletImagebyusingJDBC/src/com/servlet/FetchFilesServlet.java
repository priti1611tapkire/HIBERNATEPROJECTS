package com.servlet;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.User;
@WebServlet("/getfile")
public class FetchFilesServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<User> ulist=new ArrayList<>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcimagestore", "root", "root");
			String sql="select * from user";
			PreparedStatement ps=con.prepareStatement(sql);

			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				User u=new User();
				u.setId(rs.getInt(1));
				u.setName(rs.getString(2));
				u.setAddress(rs.getString(3));

				Blob blob=rs.getBlob(4);
				InputStream in=blob.getBinaryStream();


				InputStream inputStream=in;
				ByteArrayOutputStream outputStream=new ByteArrayOutputStream();
				byte[] buffer=new byte[4096];

				int byteread=-1;

				while((byteread=inputStream.read(buffer)) !=-1){
					outputStream.write(buffer,0,byteread);
				}
				byte[]  imageBytes= outputStream.toByteArray();
				String base64data=Base64.getEncoder().encodeToString(imageBytes);

				inputStream.close();
				outputStream.close();

				u.setFname(in);
				u.setFtype(rs.getString(5));
				u.setBase64image(base64data);
				ulist.add(u);
			}

			request.setAttribute("data", ulist);
			RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
			rd.forward(request, response);

		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
