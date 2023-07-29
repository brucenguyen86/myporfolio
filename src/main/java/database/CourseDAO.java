package database;

import model.Course;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CourseDAO implements DAOInterface<Course> {

    @Override
    public ArrayList<Course> selectAll() {
        ArrayList<Course> courses = new ArrayList<>();
        // SQL syntax
        String sqlSelectAll = "SELECT * FROM COURSE";
        try {
            // Open connection
            Connection conn = new ConnectionUtils().openConnection();
            PreparedStatement pstm = conn.prepareStatement(sqlSelectAll);
            ResultSet resultSet = pstm.executeQuery();

            while (resultSet.next()) {
                String id = resultSet.getString("courseID");
                String name = resultSet.getString("courseName");
                Course result = new Course(id, name);
                courses.add(result);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return courses;
    }

    @Override
    public Course selectById(Course course) {
        Course result = null;
        // SQL syntax
        String sql = "SELECT * FROM COURSE WHERE COURSEID=?";
        try {
            // Open connection
            Connection conn = new ConnectionUtils().openConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, course.getId());
            ResultSet resultSet = pstm.executeQuery();
            while (resultSet.next()) {
                String id = resultSet.getString("COURSEID");
                String name = resultSet.getString("COURSENAME");
                result = new Course(id, name);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }


    @Override
    public int delete(Course course)  {
        // SQL syntax
        String sql = "DELETE * FROM COURSE WHERE COURSEID=?";
        try {
            // Open connection
            Connection conn = new ConnectionUtils().openConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, course.getId());
            ResultSet resultSet = pstm.executeQuery();
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int deleteAll() {
        String sql = "DELETE * FROM COURSE";
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
    public int insert(Course course) {
        // SQL syntax
        String sql = "INSERT INTO COURSE (COURSEID, CourseNAME)" +
                "VALUES(?,?)";
        try {
            // Open connection
            Connection conn = new ConnectionUtils().openConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, course.getId());
            pstm.setString(2, course.getName());
            ResultSet resultSet = pstm.executeQuery();
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int insertAll(ArrayList<Course> Courses) {
        // SQL syntax
        String sql = "INSERT INTO Course (COURSEID, COURSENAME)" +
                "VALUES(?,?)";
        try {
            // Open connection
            Connection conn = new ConnectionUtils().openConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            for (Course run : Courses) {
                pstm.setString(1, run.getId());
                pstm.setString(2, run.getName());
                ResultSet resultSet = pstm.executeQuery();
                return 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int update(Course course) {
// SQL syntax
        String sql = "UPDATE COURSE" + "SET COURSENAME=?" +
                "WHERE COURSEID=?";
        String sqlSelect = "SELECT * FROM COURSE WHERE COURSEID=?";

        try {
            // Open connection
            Connection conn = new ConnectionUtils().openConnection();
            PreparedStatement pstm = conn.prepareStatement(sqlSelect);
            ResultSet resultSet01 = pstm.executeQuery();
            PreparedStatement pstmUpdate = conn.prepareStatement(sql);
            if(resultSet01.getString("CourseID").equals(course.getId())){
                pstmUpdate.setString(1,course.getId());
                pstmUpdate.setString(2,course.getName());
                ResultSet resultSet02 = pstmUpdate.executeQuery();
                return 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

}
