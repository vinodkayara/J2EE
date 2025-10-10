package in.ps.bankapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import in.ps.bankapp.connection.Connector;
import in.ps.bankapp.dto.Account;

public class AccountDAOImpl implements AccountDAO{
	
	private Connection con;
	
	public AccountDAOImpl() {
		this.con=Connector.getCon();
	}

	@Override
	public boolean insertAccount(Account a) {
		String query="INSERT INTO ACCOUNT(0,?,?,?,?,SYSDATE(),?)";
		int i=0;
		try {
			PreparedStatement ps=con.prepareStatement(query);
			ps.setLong(1,a.getAcc_no());
			ps.setInt(2, a.getCid());
			ps.setString(3,a.getAcc_type());
			ps.setDouble(4,a.getBalance());
			ps.setString(5, a.getStatus());
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
	public boolean updateAccount(Account a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteAccount(int acc_id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Account getAccount(int acc_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Account> getAccountByCustomerId(int cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Account> getAccount() {
		// TODO Auto-generated method stub
		return null;
	}

}
