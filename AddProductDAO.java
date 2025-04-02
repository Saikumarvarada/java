package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddProductDAO 
{
	int rowCount=0;
int insert_Productdata(ProductBean bean)
{
	try
	{
	Connection con=DBConnect .getCon();
	PreparedStatement pstmt=con.prepareStatement("insert into Product values(?,?,?,?,?)");
	pstmt.setString(1,bean.getP_Code());
	pstmt.setString(2,bean.getP_Name());
	pstmt.setString(3,bean.getP_Company());
	pstmt.setString(4,bean.getP_Price());
	pstmt.setString(5,bean.getP_Qty());
	
	rowCount=pstmt.executeUpdate();
	}
	catch(Exception e)
	{
		e.printStackTrace();

	}
	return rowCount;
}
}
