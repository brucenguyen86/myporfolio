package porfolio;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.getWriter().append("okie roi nhe part 1");
         final String db = "database=brucenguyen-database;";
         final String ur = "user=brucenguyen-server-admin;";
         final String pw = "password=RJUGUW40DOJ6323D$;";
         final String curl = "jdbc:sqlserver://brucenguyen-server.database.windows.net;"
                + db
                + ur
                + pw
                + "encrypt=true;"
                + "trustServerCertificate=false;"
                + "loginTimeout=30;";
        //
        String sql = "INSERT INTO STUDENT (STUDENTID, STUDENTNAME, BIRTHDAY, PHONENUMBER, EMAIL, ADDRESS01)" +
                "VALUES(?,?,?,?,?,?)";
        try {
            // Open connection
            response.getWriter().append("okie roi nhe part 2");
            Connection conn = DriverManager.getConnection(curl);
            response.getWriter().append("okie roi nhe part 3");
            PreparedStatement pstm = conn.prepareStatement(sql);
            String phonenumber = request.getParameter("phonenumber");
            String email = request.getParameter("email");
            String address = request.getParameter("address");
            String firstname = request.getParameter("firstname");
            String lastname = request.getParameter("lastname");
            String birthday = request.getParameter("birthday");
            String studentId = "ST"+new Random().nextInt();
            String studentname = firstname+lastname;
            pstm.setString(1, studentId);
            pstm.setString(2, studentname);
            pstm.setString(3, birthday);
            pstm.setString(4, phonenumber);
            pstm.setString(5, email);
            pstm.setString(6, address);
            ResultSet resultSet = pstm.executeQuery();
            response.getWriter().append("okie roi nhe part 4");
        } catch (Exception e) {
            e.printStackTrace();
        }


//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        Date birthday = sdf.parse(bd);



    }

    public void destroy() {
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}