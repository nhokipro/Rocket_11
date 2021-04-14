package backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import entity.Department;

public class DepartmentDao {
	public static final String url = "jdbc:mysql://localhost:3306/test1?autoReconnect=true&useSSL=false&characterEncoding=latin1";
	public static final String username = "root";
	public static final String password = "0aibietca";

	private static Connection connectDB() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url, username, password);
		return connection;
	}

	public Collection<Department> getDepartments() throws ClassNotFoundException, SQLException {
		ArrayList<Department> d = new ArrayList<>();
		Connection cnn = connectDB();
		String sql = "SELECT * FROM test1.department " + "ORDER BY DepartmentID";
		PreparedStatement ps = cnn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			Department department = new Department(id, name);
			d.add(department);
		}
		return d;
	}

	public Collection<Department> getDepartment5() throws ClassNotFoundException, SQLException, Exception {
		ArrayList<Department> d = new ArrayList<>();
		Connection cnn = connectDB();
		String sql = "SELECT * FROM test1.department " + "Where DepartmentID = 5";
		PreparedStatement ps = cnn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			Department department = new Department(id, name);
			d.add(department);
		}
		int count = 0;
		for (int i = 0; i < d.size(); i++) {
			if (d.get(i).getId() == 5) {
				count++;
			}
		}
		if (count == 0) {
			String msg = "không có id = 5";
			throw new Exception(msg);
		}
		return d;
	}
	public Collection<Department> getDepartmentID() throws ClassNotFoundException, SQLException, Exception {
		ArrayList<Department> d = new ArrayList<>();
		Connection cnn = connectDB();
		System.out.print("nhập id muốn lấy ra: ");
		ScannerUtils s = new ScannerUtils();
		int a = s.inputInt("lỗi");
		String sql = "SELECT * FROM test1.department "
				+ "Where DepartmentID = ?";
		PreparedStatement ps = cnn.prepareStatement(sql);
		int departmentid = a;
		ps.setInt(1, departmentid);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			Department department = new Department(id, name);
			d.add(department);
		}
		int count = 0;
		for (int i = 0; i < d.size(); i++) {
			if (d.get(i).getId() == a) {
				count++;
			}
		}
		if (count == 0) {
			String msg = "không có id thỏa mãn";
			throw new Exception(msg);
		}
		return d;
	}
	public void showInfo(ArrayList<Department> d) {
		for (Department department : d) {
			System.out.print(department.getId() + " ");
			System.out.println(department.getName());
		}
	}
	public boolean isDepartmentNameExists(String name) throws SQLException, ClassNotFoundException {
		ArrayList<Department> d = new ArrayList<>();
		Connection cnn = connectDB();
		String sql = "SELECT * FROM test1.department "
				+ "Where DepartmentName = ?";
		PreparedStatement ps = cnn.prepareStatement(sql);
		ps.setString(1, name);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			int id = rs.getInt(1);
			String departmentName = rs.getString(2);
			Department department = new Department(id, departmentName);
			d.add(department);
		}
		int count = 0;
		for (int i = 0; i < d.size(); i++) {
			if (d.get(i).getName().equals(name)) {
				count++;
			}
		}
		if (count == 0) {
			return false;	
		}else return true;
	}
	public void createDepartment (String name) throws ClassNotFoundException, SQLException {
		if(isDepartmentNameExists(name) == false) {
			Connection cnn = connectDB();
			Statement statement = cnn.createStatement();
			String sql = "INSERT INTO department (DepartmentID , DepartmentName) "
					+ "VALUES (? , ?)";
			int effectRecordAmount = statement.executeUpdate(sql);
			System.out.println(effectRecordAmount);
		} else System.out.println("đã tồn tại name");
	}
	public boolean isDepartmentIDExists(int id) throws SQLException, ClassNotFoundException {
		ArrayList<Department> d = new ArrayList<>();
		Connection cnn = connectDB();
		String sql = "SELECT * FROM test1.department "
				+ "Where DepartmentID = ?";
		PreparedStatement ps = cnn.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			int departmentid = rs.getInt(1);
			String departmentName = rs.getString(2);
			Department department = new Department(id, departmentName);
			d.add(department);
		}
		int count = 0;
		for (int i = 0; i < d.size(); i++) {
			if (d.get(i).getId() == id) {
				count++;
			}
		}
		if (count == 0) {
			return false;	
		}else return true;
	}
	public void updateDepartmentName(int id, String newName) throws ClassNotFoundException, SQLException {
		if(isDepartmentIDExists(id) == true) {
			if(isDepartmentNameExists(newName) == false) {
				String sql ="UPDATE department "
						+ "SET DepartmentName = ? "
						+ "WHERE DepartmentID = ?";
				Connection cnn = connectDB();
				PreparedStatement ps = cnn.prepareStatement(sql);
				ps.setString(1, newName);
				ps.setInt(2, id);
				int a = ps.executeUpdate();
				System.out.println(a);
			} else System.out.println("tồn tại name");
		}else System.out.println("không tồn tại id");
	}

}
