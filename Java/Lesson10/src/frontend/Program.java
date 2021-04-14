package frontend;

import java.sql.SQLException;
import java.util.ArrayList;

import backend.DepartmentDao;
import entity.Department;

public class Program {
	public static void main(String[] args) {
		ArrayList<Department> d = new ArrayList<>();
		DepartmentDao a = new DepartmentDao();
//		try {
//			d.addAll(a.getDepartments());
//		} catch (ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		}
//		a.showInfo(d);
//		ArrayList<Department> d1 = new ArrayList<>();
//		try {
//			d1.addAll(a.getDepartment5());
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		a.showInfo(d1);
//		ArrayList<Department> d2 = new ArrayList<>();
//		try {
//			d2.addAll(a.getDepartmentID());
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		a.showInfo(d2);
//		try {
//			if (a.isDepartmentNameExists("giam doc") == true) {
//				System.out.println("có name thỏa mãn");
//			} else
//				System.out.println(" không có name thỏa mãn");
//		} catch (ClassNotFoundException | SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		try {
			a.updateDepartmentName(5, "Marketing");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}