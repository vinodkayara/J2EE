package in.ps.bankapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import in.ps.bankapp.connection.Connector;
import in.ps.bankapp.dto.Customer;

public class CustomerDAOImpl implements CustomerDAO {
	
	private Connection con;
	
	public CustomerDAOImpl() {
		this.con=Connector.getCon();
		}

	@Override
	public boolean insertCustomer(Customer c) {
		String query="INSERT INTO CUSTOMER VALUES(0,?,?,?,?,?,SYSDATE(),?";
		int i=0;
		try {
			PreparedStatement ps= con.prepareStatement(query);
			ps.setString(1, c.getFname());
			ps.setString(2, c.getLname());
			ps.setLong(3, c.getPhone());
			ps.setString(4,c.getMail() );
			ps.setInt(5,c.getPin());
			ps.setString(6,c.getStatus());
			i=ps.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		if(i>0) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean updateCustomer(Customer c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCustomer(int cid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Customer getCustomer(String mail, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Customer> getCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

}
