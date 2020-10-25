package servlet;



import dao.UserdbManager;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;

public class ConnectionServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private UserdbManager userdbManager;

    @Resource(name = "jdbc/toDoDb")
    private DataSource dataSource;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        boolean exist = userdbManager.login(email, password);
        if(exist == true){
            System.out.println("true");
        } else{
            System.out.println("false");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
    }

    @Override
    public void init() throws ServletException {
        super.init();
        userdbManager = new UserdbManager(dataSource);
    }
}
