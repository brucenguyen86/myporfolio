package database;

import model.Teacher;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class TeacherDAO implements DAOInterface<Teacher> {


    public TeacherDAO()  {
    }

    @Override
    public ArrayList<Teacher> selectAll() {
        ArrayList<Teacher> teachers = new ArrayList<>();
        // SQL syntax
        String sqlSelectAll = "SELECT * FROM TEACHER";
        try {
            // Open connection
            Connection conn = new ConnectionUtils().openConnection();
            PreparedStatement pstm = conn.prepareStatement(sqlSelectAll);
            ResultSet resultSet = pstm.executeQuery();

            while (resultSet.next()) {
                String id = resultSet.getString("teacherID");
                String name = resultSet.getString("teacherName");
                String birthday = resultSet.getString("teacherBirthday");
                String phoneNumber = resultSet.getString("teacherPhoneNumber");
                String email = resultSet.getString("teacherEmail");
                String address = resultSet.getString("teacherAddress");
                Teacher result = new Teacher(id, name, birthday, phoneNumber, email, address);
                teachers.add(result);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return teachers;
    }

    @Override
    public Teacher selectById(Teacher teacher) {
        Teacher result = null;
        // SQL syntax
        String sql = "SELECT * FROM TEACHER WHERE TEACHERID=?";
        try {
            // Open connection
            Connection conn = new ConnectionUtils().openConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, teacher.getId());
            ResultSet resultSet = pstm.executeQuery();

            while (resultSet.next()) {
                String id = resultSet.getString("teacherID");
                String name = resultSet.getString("teacherName");
                String birthday = resultSet.getString("teacherBirthday");
                String phoneNumber = resultSet.getString("teacherPhoneNumber");
                String email = resultSet.getString("teacherEmail");
                String address = resultSet.getString("teacherAddress");
                result = new Teacher(id, name, birthday, phoneNumber, email, address);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int delete(Teacher teacher)  {
        // SQL syntax
        String sql = "DELETE * FROM TEACHER WHERE TEACHERID=?";
        try {
            // Open connection
            ConnectionUtils connUtil = new ConnectionUtils();
            Connection conn = connUtil.openConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, teacher.getId());
            ResultSet resultSet = pstm.executeQuery();
            return 1;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int deleteAll() {
        String sql = "DELETE * FROM TEACHER";
        try {
            // Open connection
            Connection conn = new ConnectionUtils().openConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet resultSet = pstm.executeQuery();
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int insert(Teacher teacher) {
        // SQL syntax
        String sql = "INSERT INTO TEACHER (TEACHERID, TEACHERNAME, TEACHERBIRTHDAY, TEACHERPHONENUMBER, TEACHEREMAIL, TEACHERADDRESS)" +
                "VALUES(?,?,?,?,?,?)";
        try {
            // Open connection
            Connection conn = new ConnectionUtils().openConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, teacher.getId());
            pstm.setString(2, teacher.getName());
            pstm.setString(3, teacher.getBirthday());
            pstm.setString(4, teacher.getPhonenumber());
            pstm.setString(5, teacher.getEmail());
            pstm.setString(6, teacher.getAddress());
            ResultSet resultSet = pstm.executeQuery();
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int insertAll(ArrayList<Teacher> teachers) {
        // SQL syntax
        String sql = "INSERT INTO TEACHER (TEACHERID, TEACHERNAME, TEACHERBIRTHDAY, TEACHERPHONENUMBER, TEACHEREMAIL, TEACHERADDRESS)" +
                "VALUES(?,?,?,?,?,?)";
        try {
            // Open connection
            Connection conn = new ConnectionUtils().openConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            for (Teacher run : teachers) {
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
    public int update(Teacher teacher) {
// SQL syntax
        String sql = "UPDATE TEACHER" + "SET TEACHERNAME=?, TEACHERBIRTHDAY=?, TEACHERPHONENUMBER=?, TEACHEREMAIL=?, TEACHERADDRESS=?" +
                "WHERE TEACHERID=?";
        String sqlSelect = "SELECT * FROM TEACHER WHERE TEACHERID=?";

        try {
            // Open connection
            Connection conn = new ConnectionUtils().openConnection();
            PreparedStatement pstm = conn.prepareStatement(sqlSelect);
            ResultSet resultSet01 = pstm.executeQuery();
            PreparedStatement pstmUPDATE = conn.prepareStatement(sql);
            if(resultSet01.getString("TEACHERID").equals(teacher.getId())){
                pstmUPDATE.setString(1,teacher.getId());
                pstmUPDATE.setString(2,teacher.getName());
                pstmUPDATE.setString(3,teacher.getBirthday());
                pstmUPDATE.setString(4,teacher.getPhonenumber());
                pstmUPDATE.setString(5,teacher.getEmail());
                pstmUPDATE.setString(6,teacher.getAddress());
                ResultSet resultSet02 = pstmUPDATE.executeQuery();
                return 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

}



