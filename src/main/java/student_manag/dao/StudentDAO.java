package student_manag.dao;

import java.sql.*;
import java.util.ArrayList;
import student_manag.Student;

public class StudentDAO {
    private static final String DB_URL = "jdbc:sqlite:studentmanagement.db";

    public StudentDAO() {
        createTableIfNotExists();
    }

    private void createTableIfNotExists() {
        String sql = "CREATE TABLE IF NOT EXISTS students (" +
                "id TEXT PRIMARY KEY," +
                "pin INTEGER," +
                "name TEXT," +
                "email TEXT," +
                "contact INTEGER," +
                "address TEXT)";
        try (Connection conn = DriverManager.getConnection(DB_URL);
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void saveStudent(Student student) {
        String sql = "INSERT OR REPLACE INTO students(id, pin, name, email, contact, address) VALUES(?, ?, ?, ?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(DB_URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, student.getId());
            pstmt.setInt(2, student.getPin());
            pstmt.setString(3, student.getName());
            pstmt.setString(4, student.getEmail());
            pstmt.setLong(5, student.getContact());
            pstmt.setString(6, student.getAddress());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void printAllStudents() {
        String sql = "SELECT * FROM students";
        try (Connection conn = DriverManager.getConnection(DB_URL);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println();
                System.out.println("Id : " + rs.getString("id"));
                System.out.println("Name : " + rs.getString("name"));
                System.out.println("Email : " + rs.getString("email"));
                System.out.println("Contact : " + rs.getLong("contact"));
                System.out.println("Address : " + rs.getString("address"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}