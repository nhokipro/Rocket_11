package com.vti.academy.DemoJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String url = "jdbc:mysql://localhost:3306/test1?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String username = "root";
		String password = "0aibietca";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url, username, password);
		System.out.println("Connection Success!");

		String sql = "SELECT * FROM position " + "ORDER BY PositionID;";

		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);

		while (resultSet.next()) {
			System.out.print(resultSet.getInt("PositionID") + " ");
			System.out.println(resultSet.getString("PositionName"));

		}
		String sql1 = "UPDATE position "
				+ "SET PositionName = ? "
				+ "WHERE PositionID = ?";
		
		PreparedStatement preparedStatement = connection.prepareStatement(sql1);
		
		String positionName = "Dev";
		short positionId = 2;
		
		preparedStatement.setString(1, positionName);
		preparedStatement.setShort(2, positionId);
		
		int effectedRecordAmount = preparedStatement.executeUpdate();
		
		System.out.println(effectedRecordAmount);
		
		String sql2 = "DELETE "
				+ "FROM position "
				+ "WHERE PositionID = ?";
		PreparedStatement preparedStatement1 = connection.prepareStatement(sql2);
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhập id muốn xóa: ");
		Short positionID1 = scanner.nextShort();
		
		preparedStatement1.setShort(1, positionId);
		
		int effectedRecordAmount1 = preparedStatement1.executeUpdate();
		System.out.println(effectedRecordAmount1);
		
		
//		String sql = "INSERT INTO `group`  ( GroupID, GroupName, CreatorID, CreateDate) "
//				+ "VALUES (?, ?, ?, ?)";
//		PreparedStatement preparedStatement = connection.prepareStatement(sql);
//		
//		short groupId = 20;
//		String groupName = "java_sensior";
//		short creatorID = 5;
//		Date CreateDate = new Date(2000-11-30);
//		
//		preparedStatement.setShort(1, groupId);
//		preparedStatement.setString(2, groupName);
//		preparedStatement.setShort(3, creatorID);
//		preparedStatement.setDate(4, CreateDate);
//		
//		int effectRecordAmount = preparedStatement.executeUpdate();
//		
//		System.out.println("effectRecordAmount = " + effectRecordAmount);
	}

}
