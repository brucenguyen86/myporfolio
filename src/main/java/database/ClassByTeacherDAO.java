package database;

import model.ClassByTeacher;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ClassByTeacherDAO implements DAOInterface<ClassByTeacher> {
    @Override
    public ArrayList<ClassByTeacher> selectAll() {
        ArrayList<ClassByTeacher> classByTeachers = new ArrayList<>();
        // SQL syntax
        String sqlSelectAll = "SELECT * FROM CLASSBYTEACHER";
        try {
            // Open connection
            Connection conn = new ConnectionUtils().openConnection();
            PreparedStatement pstm = conn.prepareStatement(sqlSelectAll);
            ResultSet resultSet = pstm.executeQuery();

            while (resultSet.next()) {
                String classbyteacherid = resultSet.getString("CLASSBYTEACHERID");
                String teacherid = resultSet.getString("TEACHERID");
                String classid = resultSet.getString("CLASSID");
                ClassByTeacher result = new ClassByTeacher(classbyteacherid, teacherid,classid);
                classByTeachers.add(result);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return classByTeachers;
    }

    @Override
    public ClassByTeacher selectById(ClassByTeacher classByTeacher) {
        ClassByTeacher result = null;
        // SQL syntax
        String sql = "SELECT * FROM CLASSBYTEACHER WHERE CLASSBYTEACHERID=?";
        try {
            // Open connection
            Connection conn = new ConnectionUtils().openConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, classByTeacher.getClassByTeacherID());
            ResultSet resultSet = pstm.executeQuery();
            while (resultSet.next()) {
                String classbyteacherid = resultSet.getString("CLASSBYTEACHERID");
                String teacherid = resultSet.getString("TEACHERID");
                String classid = resultSet.getString("CLASSID");
                result = new ClassByTeacher(classbyteacherid, teacherid,classid);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }


    @Override
    public int delete(ClassByTeacher classByTeacher)  {
        // SQL syntax
        String sql = "DELETE * FROM CLASSBYTEACHER WHERE CLASSBYTEACHERID=?";
        try {
            // Open connection
            Connection conn = new ConnectionUtils().openConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, classByTeacher.getClassByTeacherID());
            ResultSet resultSet = pstm.executeQuery();
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int deleteAll() {
        String sql = "DELETE * FROM CLASSBYTEACHER";
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
    public int insert(ClassByTeacher classByTeacher) {
        // SQL syntax
        String sql = "INSERT INTO CLASSBYTEACHER (CLASSBYTEACHERID, TEACHERID,CLASSID)" +
                "VALUES(?,?,?)";
        try {
            // Open connection
            Connection conn = new ConnectionUtils().openConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, classByTeacher.getClassByTeacherID());
            pstm.setString(2, classByTeacher.getTeacherID());
            pstm.setString(3, classByTeacher.getClassID());

            ResultSet resultSet = pstm.executeQuery();
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int insertAll(ArrayList<ClassByTeacher> classByTeachers) {
        // SQL syntax
        String sql = "INSERT INTO CLASSBYTEACHER (CLASSBYTEACHERID, TEACHERID,CLASSID)" +
                "VALUES(?,?,?)";
        try {
            // Open connection
            Connection conn = new ConnectionUtils().openConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            for (ClassByTeacher run : classByTeachers) {
                pstm.setString(1, run.getClassByTeacherID());
                pstm.setString(2, run.getTeacherID());
                pstm.setString(3, run.getClassID());
                ResultSet resultSet = pstm.executeQuery();
                return 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int update(ClassByTeacher classByTeacher) {
// SQL syntax
        String sql = "UPDATE CLASSBYTEACHER" + "SET CLASSBYTEACHERID=?" +"SET TEACHERID=?"+"SET CLASSID=?"+
                "WHERE CLASSBYTEACHERID=?";
        String sqlSelect = "SELECT * FROM CLASSBYTEACHER WHERE CLASSBYTEACHERID=?";

        try {
            // Open connection
            Connection conn = new ConnectionUtils().openConnection();
            PreparedStatement pstm = conn.prepareStatement(sqlSelect);
            ResultSet resultSet01 = pstm.executeQuery();
            PreparedStatement pstmUpdate = conn.prepareStatement(sql);
            if(resultSet01.getString("CLASSBYTEACHERID").equals(classByTeacher.getClassByTeacherID())){
                pstmUpdate.setString(1, classByTeacher.getClassByTeacherID());
                pstmUpdate.setString(2, classByTeacher.getTeacherID());
                pstmUpdate.setString(3, classByTeacher.getClassID());
                ResultSet resultSet02 = pstmUpdate.executeQuery();
                return 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

}
