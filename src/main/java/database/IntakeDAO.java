package database;

import model.Intake;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class IntakeDAO implements DAOInterface<Intake> {
    @Override
    public ArrayList<Intake> selectAll() {
        ArrayList<Intake> intakes = new ArrayList<>();
        // SQL syntax
        String sqlSelectAll = "SELECT * FROM INTAKE";
        try {
            // Open connection
            Connection conn = new ConnectionUtils().openConnection();
            PreparedStatement pstm = conn.prepareStatement(sqlSelectAll);
            ResultSet resultSet = pstm.executeQuery();

            while (resultSet.next()) {
                String id = resultSet.getString("INTAKEID");
                String name = resultSet.getString("INTAKENAME");
                String courseID = resultSet.getString("COURSEID");
                Intake result = new Intake(id, name,courseID);
                intakes.add(result);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return intakes;
    }

    @Override
    public Intake selectById(Intake intake) {
        Intake result = null;
        // SQL syntax
        String sql = "SELECT * FROM INTAKE WHERE INTAKEID=?";
        try {
            // Open connection
            Connection conn = new ConnectionUtils().openConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, intake.getId());
            ResultSet resultSet = pstm.executeQuery();
            while (resultSet.next()) {
                String id = resultSet.getString("INTAKEID");
                String name = resultSet.getString("INTAKENAME");
                String courseID = resultSet.getString("COURSEID");
                result = new Intake(id, name,courseID);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }


    @Override
    public int delete(Intake intake)  {
        // SQL syntax
        String sql = "DELETE * FROM INTAKE WHERE INTAKEID=?";
        try {
            // Open connection
            Connection conn = new ConnectionUtils().openConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, intake.getId());
            ResultSet resultSet = pstm.executeQuery();
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int deleteAll() {
        String sql = "DELETE * FROM INTAKE";
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
    public int insert(Intake intake) {
        // SQL syntax
        String sql = "INSERT INTO INTAKE (INTAKEID, INTAKENAME,COURSEID)" +
                "VALUES(?,?,?)";
        try {
            // Open connection
            Connection conn = new ConnectionUtils().openConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, intake.getId());
            pstm.setString(2, intake.getName());
            pstm.setString(3, intake.getCourseID());
            ResultSet resultSet = pstm.executeQuery();
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int insertAll(ArrayList<Intake> intakes) {
        // SQL syntax
        String sql = "INSERT INTO INTAKE (INTAKEID, INTAKENAME,COURSEID)" +
                "VALUES(?,?,?)";
        try {
            // Open connection
            Connection conn = new ConnectionUtils().openConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            for (Intake run : intakes) {
                pstm.setString(1, run.getId());
                pstm.setString(2, run.getName());
                pstm.setString(3, run.getCourseID());
                ResultSet resultSet = pstm.executeQuery();
                return 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int update(Intake intake) {
// SQL syntax
        String sql = "UPDATE Intake" + "SET INTAKENAME=?" + "SET COURSEID=?"+
                "WHERE INTAKEID=?";
        String sqlSelect = "SELECT * FROM INTAKE WHERE INTAKEID=?";

        try {
            // Open connection
            Connection conn = new ConnectionUtils().openConnection();
            PreparedStatement pstm = conn.prepareStatement(sqlSelect);
            ResultSet resultSet01 = pstm.executeQuery();
            PreparedStatement pstmUpdate = conn.prepareStatement(sql);
            if(resultSet01.getString("INTAKEID").equals(intake.getId())){
                pstmUpdate.setString(1,intake.getId());
                pstmUpdate.setString(2,intake.getName());
                pstmUpdate.setString(3,intake.getCourseID());
                ResultSet resultSet02 = pstmUpdate.executeQuery();
                return 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
