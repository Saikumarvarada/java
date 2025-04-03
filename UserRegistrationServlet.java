package pack1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/reg")
public class UserRegistrationServlet extends HttpServlet
{
@Override
protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
{
UserBean ub=new UserBean();
ub.setuName(req.getParameter("uName"));
ub.setuPassword(req.getParameter("uPwd"));
ub.setuFirstName(req.getParameter("uFname"));
ub.setuLastName(req.getParameter("uLname"));
ub.setuMail_Id(req.getParameter("uMid"));
ub.setuPhone(req.getParameter("uPhone"));

UserRegisterDAO ureg=new UserRegisterDAO();
int rowCount=ureg.insertUserData(ub);

if(rowCount>0)
{
	req.setAttribute("msg","User Registered Successfully");
	req.getRequestDispatcher("Register.jsp").forward(req,res);
}
else
{
	req.setAttribute("msg","User Registered Failed!!!");
	req.getRequestDispatcher("Register.jsp").forward(req,res);
}
}
}
