package database;

import model.Class;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ClassDAO implements DAOInterface<Class> {

    @Override
    public ArrayList<Class> selectAll() {
        ArrayList<Class> clazzs = new ArrayList<>();
        // SQL syntax
        String sqlSelectAll = "SELECT * FROM CLASS";
        try {
            // Open connection
            Connection conn = new ConnectionUtils().openConnection();
            PreparedStatement pstm = conn.prepareStatement(sqlSelectAll);
            ResultSet resultSet = pstm.executeQuery();

            while (resultSet.next()) {
                String id = resultSet.getString("CLASSID");
                String name = resultSet.getString("CLASSNAME");
                String ClassID = resultSet.getString("INTAKEID");
                String intakeID = resultSet.getString("INTAKEID");
                Class result = new Class(id, name,intakeID);
                clazzs.add(result);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return clazzs;
    }

    @Override
    public Class selectById(Class clazz) {
        Class result = null;
        // SQL syntax
        String sql = "SELECT * FROM CLASS WHERE CLASSID=?";
        try {
            // Open connection
            Connection conn = new ConnectionUtils().openConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, clazz.getId());
            ResultSet resultSet = pstm.executeQuery();
            while (resultSet.next()) {
                String id = resultSet.getString("CLASSID");
                String name = resultSet.getString("CLASSNAME");
                String intakeID = resultSet.getString("INTAKEID");
                result = new Class(id, name,intakeID);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }


    @Override
    public int delete(Class clazz)  {
        // SQL syntax
        String sql = "DELETE * FROM CLASS WHERE CLASSID=?";
        try {
            // Open connection
            Connection conn = new ConnectionUtils().openConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, clazz.getId());
            ResultSet resultSet = pstm.executeQuery();
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int deleteAll() {
        String sql = "DELETE * FROM CLASS";
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
    public int insert(Class clazz) {
        // SQL syntax
        String sql = "INSERT INTO CLASS (CLASSID, CLASSNAME,INTAKEID)" +
                "VALUES(?,?,?)";
        try {
            // Open connection
            Connection conn = new ConnectionUtils().openConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, clazz.getId());
            pstm.setString(2, clazz.getName());
            pstm.setString(3, clazz.getIntakeID());
            ResultSet resultSet = pstm.executeQuery();
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int insertAll(ArrayList<Class> clazzs) {
        // SQL syntax
        String sql = "INSERT INTO CLASS (CLASSID, CLASSNAME,INTAKEID)" +
                "VALUES(?,?,?)";
        try {
            // Open connection
            Connection conn = new ConnectionUtils().openConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            for (Class run : clazzs) {
                pstm.setString(1, run.getId());
                pstm.setString(2, run.getName());
                pstm.setString(3, run.getIntakeID());
                ResultSet resultSet = pstm.executeQuery();
                return 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int update(Class clazz) {
// SQL syntax
        String sql = "UPDATE CLASS" + "SET CLASSNAME=?" + "SET INTAKEID=?"+
                "WHERE CLASSID=?";
        String sqlSelect = "SELECT * FROM CLASS WHERE CLASSID=?";

        try {
            // Open connection
            Connection conn = new ConnectionUtils().openConnection();
            PreparedStatement pstm = conn.prepareStatement(sqlSelect);
            ResultSet resultSet01 = pstm.executeQuery();
            PreparedStatement pstmUpdate = conn.prepareStatement(sql);
            if(resultSet01.getString("CLASSID").equals(clazz.getId())){
                pstmUpdate.setString(1,clazz.getId());
                pstmUpdate.setString(2,clazz.getName());
                pstmUpdate.setString(3,clazz.getIntakeID());
                ResultSet resultSet02 = pstmUpdate.executeQuery();
                return 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
