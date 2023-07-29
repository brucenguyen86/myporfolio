package database;

import model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class StudentDAO implements DAOInterface<Student> {

    @Override
    public ArrayList<Student> selectAll() {
        ArrayList<Student> students = new ArrayList<>();
        // SQL syntax
        String sqlSelectAll = "SELECT * FROM STUDENT";
        ResultSet resultSet = null;
        try {
            // Open connection
            Connection conn = new ConnectionUtils().openConnection();
            PreparedStatement pstm = conn.prepareStatement(sqlSelectAll);
            resultSet = pstm.executeQuery();

            while (resultSet.next()) {
                String id = resultSet.getString("STUDENTID");
                String name = resultSet.getString("STUDENTNAME");
                String birthday = resultSet.getString("BIRTHDAY");
                String phoneNumber = resultSet.getString("PHONENUMBER");
                String email = resultSet.getString("EMAIL");
                String address = resultSet.getString("ADDRESS01");
                Student result = new Student(id, name, birthday, phoneNumber, email, address);
                students.add(result);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }

    @Override
    public Student selectById(Student student) {
        Student result = null;
        // SQL syntax
        String sql = "SELECT * FROM STUDENT WHERE STUDENTID=?";
        try {
            // Open connection
            Connection conn = new ConnectionUtils().openConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, student.getId());
            ResultSet resultSet = pstm.executeQuery();

            while (resultSet.next()) {
                String id = resultSet.getString("STUDENTID");
                String name = resultSet.getString("STUDENTNAME");
                String birthday = resultSet.getString("BIRTHDAY");
                String phoneNumber = resultSet.getString("PHONENUMBER");
                String email = resultSet.getString("EMAIL");
                String address = resultSet.getString("ADDRESS01");
                result = new Student(id, name, birthday, phoneNumber, email, address);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int delete(Student student) {
        // SQL syntax
        String sql = "DELETE * FROM STUDENT WHERE STUDENTID=?";
        String sql01 = "DELETE * FROM STUDENTACCOUNT WHERE STUDENTID=?";
        try {
            // Open connection
            ConnectionUtils connUtil = new ConnectionUtils();
            Connection conn = connUtil.openConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            PreparedStatement pstm01 = conn.prepareStatement(sql01);
            pstm01.setString(1, student.getId());
            ResultSet resultSet01 = pstm01.executeQuery();
            pstm.setString(1, student.getId());
            ResultSet resultSet = pstm.executeQuery();
            return 1;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int deleteAll() {
        String sql = "DELETE * FROM STUDENT";
        String sql01 = "DELETE * FROM STUDENTACCOUNT";
        try {
            // Open connection
            ConnectionUtils connUtil = new ConnectionUtils();
            Connection conn = connUtil.openConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            PreparedStatement pstm01 = conn.prepareStatement(sql01);
            ResultSet resultSet01 = pstm01.executeQuery();
            ResultSet resultSet = pstm.executeQuery();
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int insert(Student student) {
        // SQL syntax
        String sql = "INSERT INTO STUDENT (STUDENTID, STUDENTNAME, BIRTHDAY, PHONENUMBER, EMAIL, ADDRESS01)" +
                "VALUES(?,?,?,?,?,?)";
        try {
            // Open connection
            Connection conn = new ConnectionUtils().openConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, student.getId());
            pstm.setString(2, student.getName());
            pstm.setString(3, student.getBirthday());
            pstm.setString(4, student.getPhonenumber());
            pstm.setString(5, student.getEmail());
            pstm.setString(6, student.getAddress());
            ResultSet resultSet = pstm.executeQuery();
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int insertAll(ArrayList<Student> students) {
        // SQL syntax
        String sql = "INSERT INTO STUDENT (STUDENTID, STUDENTNAME, BIRTHDAY, PHONENUMBER, EMAIL, ADDRESS01)" +
                "VALUES(?,?,?,?,?,?)";
        try {
            // Open connection
            Connection conn = new ConnectionUtils().openConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            for (Student run : students) {
                pstm.setString(1, run.getId());
                pstm.setString(2, run.getName());
                pstm.setString(3, run.getBirthday());
                pstm.setString(4, run.getPhonenumber());
                pstm.setString(5, run.getEmail());
                pstm.setString(6, run.getAddress());
                ResultSet resultSet = pstm.executeQuery();
                return 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int update(Student student) {
// SQL syntax
        String sql = "UPDATE STUDENT" + "SET STUDENTNAME=?,BIRTHDAY=?, PHONENUMBER=?, EMAIL=?, ADDRESS=?" +
                "WHERE STUDENTID=?";
        String sqlSelect = "SELECT * FROM STUDENT WHERE STUDENTID=?";

        try {
            // Open connection
            Connection conn = new ConnectionUtils().openConnection();
            PreparedStatement pstm = conn.prepareStatement(sqlSelect);
            ResultSet resultSet01 = pstm.executeQuery();
            PreparedStatement pstmUpdate = conn.prepareStatement(sql);
            if (resultSet01.getString("STUDENTID").equals(student.getId())) {
                pstmUpdate.setString(1, student.getId());
                pstmUpdate.setString(2, student.getName());
                pstmUpdate.setString(3, student.getBirthday());
                pstmUpdate.setString(4, student.getPhonenumber());
                pstmUpdate.setString(5, student.getEmail());
                pstmUpdate.setString(6, student.getAddress());
                ResultSet resultSet02 = pstmUpdate.executeQuery();
                return 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        StudentDAO stdao = new StudentDAO();

//        Student st = new Student("ST0009","NGUYEN BAO BOI","19/12/2014","0827839393","BAOBOI@GMAIL.COM","O VOI BO");
//        stdao.insert(st);
        students = stdao.selectAll();
        for (Student run : students) {
            run.display();
        }
    }

}

