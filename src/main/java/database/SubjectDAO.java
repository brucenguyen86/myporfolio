package database;

import model.Subject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class SubjectDAO implements DAOInterface<Subject> {
    @Override
    public ArrayList<Subject> selectAll() {
        ArrayList<Subject> subjects = new ArrayList<>();
        // SQL syntax
        String sqlSelectAll = "SELECT * FROM SUBJECT";
        try {
            // Open connection
            Connection conn = new ConnectionUtils().openConnection();
            PreparedStatement pstm = conn.prepareStatement(sqlSelectAll);
            ResultSet resultSet = pstm.executeQuery();

            while (resultSet.next()) {
                String id = resultSet.getString("SUBJECTID");
                String name = resultSet.getString("SUBJECTNAMEE");
                Subject result = new Subject(id, name);
                subjects.add(result);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return subjects;
    }

    @Override
    public Subject selectById(Subject subject) {
        Subject result = null;
        // SQL syntax
        String sql = "SELECT * FROM SUBJECT WHERE SUBJECTID=?";
        try {
            // Open connection
            Connection conn = new ConnectionUtils().openConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, subject.getId());
            ResultSet resultSet = pstm.executeQuery();
            while (resultSet.next()) {
                String id = resultSet.getString("SUBJECTID");
                String name = resultSet.getString("SUBJECTNAME");
                result = new Subject(id, name);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }


    @Override
    public int delete(Subject subject)  {
        // SQL syntax
        String sql = "DELETE * FROM SUBJECT WHERE SUBJECTID=?";
        try {
            // Open connection
            Connection conn = new ConnectionUtils().openConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, subject.getId());
            ResultSet resultSet = pstm.executeQuery();
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int deleteAll() {
        String sql = "DELETE * FROM SUBJECT";
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
    public int insert(Subject subject) {
        // SQL syntax
        String sql = "INSERT INTO SUBJECT (SUBJECTID, SUBJECTNAME)" +
                "VALUES(?,?)";
        try {
            // Open connection
            Connection conn = new ConnectionUtils().openConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, subject.getId());
            pstm.setString(2, subject.getName());
            ResultSet resultSet = pstm.executeQuery();
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int insertAll(ArrayList<Subject> subjects) {
        // SQL syntax
        String sql = "INSERT INTO SUBJECT (SUBJECTID, SUBJECTNAME)" +
                "VALUES(?,?)";
        try {
            // Open connection
            Connection conn = new ConnectionUtils().openConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            for (Subject run : subjects) {
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
    public int update(Subject subject) {
// SQL syntax
        String sql = "UPDATE SUBJECT" + "SET SUBJECTNAME=?" +
                "WHERE SUBJECTID=?";
        String sqlSelect = "SELECT * FROM SUBJECT WHERE SUBJECTID=?";

        try {
            // Open connection
            Connection conn = new ConnectionUtils().openConnection();
            PreparedStatement pstm = conn.prepareStatement(sqlSelect);
            ResultSet resultSet01 = pstm.executeQuery();
            PreparedStatement pstmUpdate = conn.prepareStatement(sql);
            if(resultSet01.getString("SUBJECTID").equals(subject.getId())){
                pstmUpdate.setString(1,subject.getId());
                pstmUpdate.setString(2,subject.getName());
                ResultSet resultSet02 = pstmUpdate.executeQuery();
                return 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

}
