package pack1;

import java.io.Serializable;

public class ProductBean implements Serializable
{
private String P_Code;
private String P_Name;
private String P_Company;
private String P_Price;
private String P_Qty;

public String getP_Code() {
	return P_Code;
}
public void setP_Code(String P_Code) {
	this.P_Code = P_Code;
}
public String getP_Name() {
	return P_Name;
}
public void setP_Name(String P_Name) {
	this.P_Name = P_Name;
}
public String getP_Company() {
	return P_Company;
}
public void setP_Company(String P_Company) {
	this.P_Company = P_Company;
}
public String getP_Price() {
	return P_Price;
}
public void setP_Price(String P_Price) {
	this.P_Price = P_Price;
}
public String getP_Qty() {
	return P_Qty;
}
public void setP_Qty(String P_Qty) {
	this.P_Qty = P_Qty;
}

  public ProductBean()
  {
	  
  }
}
