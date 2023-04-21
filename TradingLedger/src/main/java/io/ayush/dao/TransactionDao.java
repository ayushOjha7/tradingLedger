package io.ayush.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDao {

	private String addSQL = "INSERT INTO transactions (opening_balance, quantity, rate, buy_amount, sell_amount, broker_charges, profit, trx_date) values ( ?, ? , ?, ?, ?, ?, ?, ?)";
	private String selectOBSQL = "Select opening_balance FROM transactions WHERE trx_id = '1'";

	public String addTransaction() {

		try (Connection con = DbConnect.getConnection(); Statement statement = con.createStatement();) {
			ResultSet rs = statement.executeQuery(addSQL);
			if (rs.next()) {
				return "Entry added";
			}
		} catch (SQLException e) {
			System.err.println();
		}
		return "entry failed";
	}

	public Double getOB() {

		try (Connection con = DbConnect.getConnection(); Statement statement = con.createStatement();) {
			ResultSet rs = statement.executeQuery(selectOBSQL);
			if (rs.next()) {
				return rs.getDouble("opening_balance");
			}
		} catch (SQLException e) {
			System.err.println();
		}
		return null;
	}

}
