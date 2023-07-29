package controller;

import database.StudentAccountDAO;
import database.StudentDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Student;
import model.StudentAccount;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;
import java.sql.Connection;

@WebServlet(name = "register", value = "/register")
public class register extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DataSource dataSource = null;

        try{
            Context initContext= null;
            initContext = new InitialContext();
            Context envContext = (Context) initContext.lookup("java:comp/env");
            dataSource = (DataSource) envContext.lookup("jdbc/brucenguyen");
        }catch (NamingException e){
            e.printStackTrace();
        }
        response.getWriter().append("Step 1");

        //Step 1 : Set up the Printerwirter
        PrintWriter out = response.getWriter();
        response.setContentType("text/plain");

        // Step 2: Get a connection to the database
        Connection myConn = null;
        PreparedStatement preStmt = null;
        ResultSet myRs = null;
        response.getWriter().append("Step 2");
        try{
//            myConn = dataSource.getConnection();
            if(dataSource!=null){
                response.getWriter().append("okie cho connet");
            }
            response.getWriter().append("ko okie cho nay");
            //Step 3 : Create a SQL Statement
            String sql = "select * from student";
            preStmt = myConn.prepareStatement(sql);
            //Step 4 : Execute SQL Query 
            myRs = preStmt.executeQuery();
            while(myRs.next()){
                String email = myRs.getString("email");
                out.println(email);
                response.getWriter().append("Step 3");
            }
            
        }catch (Exception e){
            e.printStackTrace();
        }
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        String re_password = request.getParameter("re_password");
//        String birthday = request.getParameter("birthday");
////        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
////        Date birthday = sdf.parse(bd);
//        String phonenumber = request.getParameter("phonenumber");
//        String email = request.getParameter("email");
//        String address = request.getParameter("address");
//        String firstname = request.getParameter("firstname");
//        String lastname = request.getParameter("lastname");
////        request.setAttribute("firstname",firstname);
////        request.setAttribute("lastname",lastname);
////        request.setAttribute("birthday",birthday);
////        request.setAttribute("phonenumber",phonenumber);
////        request.setAttribute("email",email);
////        request.setAttribute("address",address);
//        String studentId = "ST"+new Random().nextInt();
//           String studentname = firstname+lastname;
////
//        String url="";
//        String error="";
//        StudentAccountDAO stAccountDAO = new StudentAccountDAO();
//        StudentDAO studentDAO = new StudentDAO();
//        if(stAccountDAO.findUsername(username)){
//            error ="Username has already existed";
//            url="/mystudies.jsp";
//        }
//        if(!password.equals(re_password)){
//            error="Your passwords don't match";
//        }
//        if(error.length()>0){
//        }else {
//            Student student = new Student(studentId,studentname,birthday,phonenumber,email,address);
//            ArrayList<Student> students= new ArrayList<>();
//            students = studentDAO.selectAll();
//            for(Student run : students){
//                response.getWriter().print("1");
//            }
//
//            int check =0;
//            check = studentDAO.insert(student);
//            response.getWriter().append("CHeck : = ");
//            response.getWriter().print(check);
//            String accountId = "user"+new Random().nextInt();
//            StudentAccount studentAccount = new StudentAccount(accountId,username,password,studentId);
//            stAccountDAO.insert(studentAccount);
//            response.getWriter().print(studentAccount.toString());
//
//            url="/success.jsp";
//        }
////        RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
////        rd.forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
