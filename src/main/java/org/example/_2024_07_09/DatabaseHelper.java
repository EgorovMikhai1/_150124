package org.example._2024_07_09;

import java.sql.*;

public class DatabaseHelper {
    private static final String URL = "jdbc:mysql://localhost:3306/library";
    private static final String USER = "root";
    private static final String PASSWORD = "123123";

    private Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return conn;
    }

    public void putAuthorByNameAndBirthday(String name, String birthdate) {
        String sql = "INSERT INTO authors (name, birthdate) VALUES (?,?)";

        try (Connection conn = this.connect();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setString(2, birthdate);

            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void getAllAuthors() {
        String sql = "SELECT author_id, name, birthdate FROM authors";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement()) {

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int author_id = rs.getInt("author_id");
                String name = rs.getString("name");
                String birthdate = rs.getString("birthdate");

                System.out.println("ID: " + author_id + ", Name: " + name + ", Birthdate: " + birthdate);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        DatabaseHelper helper = new DatabaseHelper();
        helper.getAllAuthors();
    }
}
