package pack1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ps")
public class AddProductServlet extends HttpServlet
{
	@Override
protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
	ProductBean bean=new ProductBean();
	
	bean.setP_Code(req.getParameter("PCode"));
	bean.setP_Name(req.getParameter("PName"));
	bean.setP_Company(req.getParameter("PCompany"));
	bean.setP_Price(req.getParameter("PPrice"));
	bean.setP_Qty(req.getParameter("PQty"));
	
	AddProductDAO AddProductDAOobj=new AddProductDAO();
	int rowCount=AddProductDAOobj.insert_Productdata(bean);
	if(rowCount>0)
	{
		req.setAttribute("msg","Data inserted into the database successfully!!!");
		RequestDispatcher rd=req.getRequestDispatcher("AddProduct.jsp");
		rd.forward(req, res);
	}
	else
	{
	throw new ServletException("Check the code correctly");	
	}
}
}
