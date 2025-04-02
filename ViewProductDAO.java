package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ViewProductDAO 
{
public ArrayList<ProductBean>al=new ArrayList<ProductBean>();

ArrayList<ProductBean>reteriveData()
{
	  try
	  {
		  Connection con=DBConnect.getCon();
		  PreparedStatement pstmt=con.prepareStatement("select*from employee");
		  ResultSet rs=pstmt.executeQuery();
		  
		  while(rs.next())
		  {
			  ProductBean bean=new ProductBean();
			  bean.setP_Code(rs.getString(1));
			  bean.setP_Name(rs.getString(2));
			  bean.setP_Company(rs.getString(3));
			  bean.setP_Price(rs.getString(4));
			  bean.setP_Qty(rs.getString(5));
			  al.add(bean);
		  }
	  }
	  catch(SQLException e)
	  {
		  e.printStackTrace();
	  }
	  return al;
  }
}
