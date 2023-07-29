package database;

import model.StudentAccount;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class StudentAccountDAO implements DAOInterface<StudentAccount> {


    @Override
    public ArrayList<StudentAccount> selectAll() {
        ArrayList<StudentAccount> studentAccounts = new ArrayList<>();
        // SQL syntax
        String sqlSelectAll = "SELECT * FROM STUDENTACCOUNT";
        try {
            // Open connection
            Connection conn = new ConnectionUtils().openConnection();
            PreparedStatement pstm = conn.prepareStatement(sqlSelectAll);
            ResultSet resultSet = pstm.executeQuery();

            while (resultSet.next()) {
                String accountID = resultSet.getString("STUDENTACCOUNTID");
                String username = resultSet.getString("USERNAME");
                String password = resultSet.getString("STPASSWORD");
                String studentid = resultSet.getString("STUDENTID");

                StudentAccount result = new StudentAccount(accountID, username, password, studentid);
                studentAccounts.add(result);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return studentAccounts;
    }

    @Override
    public StudentAccount selectById(StudentAccount studentAccount) {
        StudentAccount result = null;
        // SQL syntax
        String sql = "SELECT * FROM STUDENTACCOUNT WHERE STUDENTACCOUNTID=?";
        try {
            // Open connection
            Connection conn = new ConnectionUtils().openConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, studentAccount.getAccountid());
            ResultSet resultSet = pstm.executeQuery();

            while (resultSet.next()) {
                String accountid = resultSet.getString("ACCOUNTID");
                String username = resultSet.getString("USERNAME");
                String password = resultSet.getString("PASSWORD");
                String studentid = resultSet.getString("STUDENTID");

                result = new StudentAccount(accountid, username,password,studentid);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int delete(StudentAccount studentAccount)  {
        // SQL syntax
        String sql = "DELETE * FROM STUDENTACCOUNT WHERE STUDENTACCOUNTID=?";
        try {
            // Open connection
            ConnectionUtils connUtil = new ConnectionUtils();
            Connection conn = connUtil.openConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, studentAccount.getAccountid());
            ResultSet resultSet = pstm.executeQuery();
            return 1;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int deleteAll() {
        String sql = "DELETE * FROM STUDENTACCOUNT";
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
    public int insert(StudentAccount studentAccount) {
        // SQL syntax
        String sql = "INSERT INTO STUDENTACCOUNT (STUDENTACCOUNTID, USERNAME, STPASSWORD , STUDENTID)" +
                "VALUES(?,?,?,?)";
        try {
            // Open connection
            Connection conn = new ConnectionUtils().openConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, studentAccount.getAccountid());
            pstm.setString(2, studentAccount.getUsername());
            pstm.setString(3, studentAccount.getPassword());
            pstm.setString(4, studentAccount.getStudentID());
            ResultSet resultSet = pstm.executeQuery();
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int insertAll(ArrayList<StudentAccount> studentAccounts) {
        // SQL syntax
        String sql = "INSERT INTO STUDENTACCOUNT (STUDENTACCOUNTID, USERNAME, STPASSWORD , STUDENTID)" +
                "VALUES(?,?,?,?)";
        try {
            // Open connection
            Connection conn = new ConnectionUtils().openConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            for (StudentAccount run : studentAccounts) {
                pstm.setString(1, run.getAccountid());
                pstm.setString(2, run.getUsername());
                pstm.setString(3, run.getPassword());
                pstm.setString(4, run.getStudentID());
                ResultSet resultSet = pstm.executeQuery();
                return 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int update(StudentAccount studentAccount) {
// SQL syntax
        String sql = "UPDATE STUDENTACCOUNT" + "SET STUDENTACCOUNTID=?, USERNAME=?, STPASSWORD=?, STUDENTID=?" +
                "WHERE STUDENTACCOUNTID=?";
        String sqlSelect = "SELECT * FROM STUDENTACCOUNT WHERE STUDENTACCOUNTID=?";

        try {
            // Open connection
            Connection conn = new ConnectionUtils().openConnection();
            PreparedStatement pstm = conn.prepareStatement(sqlSelect);
            ResultSet resultSet01 = pstm.executeQuery();
            PreparedStatement pstmUpdate = conn.prepareStatement(sql);
            if(resultSet01.getString("STUDENTACCOUNTID").equals(studentAccount.getAccountid())){
                pstmUpdate.setString(1, studentAccount.getAccountid());
                pstmUpdate.setString(2, studentAccount.getUsername());
                pstmUpdate.setString(3, studentAccount.getPassword());
                pstmUpdate.setString(4, studentAccount.getStudentID());
                ResultSet resultSet02 = pstmUpdate.executeQuery();
                return 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public boolean findUsername(String username){
        StudentAccount result = null;
        // SQL syntax
        String sql = "SELECT * FROM STUDENTACCOUNT WHERE USERNAME=?";
        try {
            // Open connection
            Connection conn = new ConnectionUtils().openConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, username);
            ResultSet resultSet = pstm.executeQuery();
            while (resultSet.next()) {
               return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<StudentAccount> studentAccounts = new ArrayList<>();
        StudentAccountDAO stdao = new StudentAccountDAO();

//        StudentAccount st = new StudentAccount("USERST009","BAONGOC","123456","ST0009");
//        stdao.insert(st);
        studentAccounts = stdao.selectAll();
        for (StudentAccount run : studentAccounts)

        {
            System.out.println(run.getAccountid());
        }
    }
}
