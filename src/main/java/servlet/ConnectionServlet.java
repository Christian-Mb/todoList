package servlet;


import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;
import java.io.IOException;
import dao.UserdbManager;

public class ConnectionServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private UserdbManager UserdbManager;

    @Resource(name = "jdbc/toDoDb")
    private DataSource dataSource;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        boolean exist = false;
        try{
            exist = UserdbManager.login(email, password);
        } catch (Exception e){
            request.setAttribute("connectStatus", "Erreur de connection avec la base de donnée");
            this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
        }
        if(exist == true){
            System.out.println("true");
            HttpSession session = request.getSession();
            session.setAttribute("email", email);
            request.setAttribute("connectStatus", "Connection réussi");
            this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/todolist_menu.jsp").forward(request, response);
        } else{
            System.out.println("false");
            request.setAttribute("connectStatus", "Mot de passe ou email incorrect");
            this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
    }

    @Override
    public void init() throws ServletException {
        super.init();
        UserdbManager = new UserdbManager(dataSource);
    }
}
