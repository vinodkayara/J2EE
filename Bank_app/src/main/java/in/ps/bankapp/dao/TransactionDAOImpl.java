package in.ps.bankapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import in.ps.bankapp.connection.Connector;
import in.ps.bankapp.dto.Transaction;

public class TransactionDAOImpl implements TransactionDAO{
	
	private Connection con;
	
	public TransactionDAOImpl() {
		this.con=Connector.getCon();
	}
	

	@Override
	public boolean insertTransaction(Transaction t) {
		String query="INSERT INTO TRANSACTION VALUES(0,?,?,?,?,?,?,SYSDATE()";
		int i=0;
		try {
			PreparedStatement ps=con.prepareStatement(query);
			ps.setLong(1,t.getTransaction_id());
			ps.setLong(2, t.getSender_acc());
			ps.setLong(3, t.getReciever_acc());
			ps.setDouble(4, t.getAmount());
			ps.setString(5, t.getTran_type());
			ps.setDouble(6, t.getBalance());
			ps.setString(7, t.getDate());
			i=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(i>0) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean updateTransaction(Transaction t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteTransaction(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Transaction getTransaction(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Transaction> getTransactionByCustomerAccno(long acc_no) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Transaction> getTransaction() {
		// TODO Auto-generated method stub
		return null;
	}

}
