package entity;
import java.io.Serializable;
public class SoLuongDaBan implements Serializable  {
    private static final long serialVersionUID = 1L;

	  private int productID;
	  private int soLuongDaBan;
	public int getProductID() {
		return productID;
	}
	public SoLuongDaBan(int productID, int soLuongDaBan) {
	
		this.productID = productID;
		this.soLuongDaBan = soLuongDaBan;
	}
	public SoLuongDaBan() {
		
	}
	@Override
	public String toString() {
		return "SoLuongDaBan [productID=" + productID + ", soLuongDaBan=" + soLuongDaBan + "]";
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public int getSoLuongDaBan() {
		return soLuongDaBan;
	}
	public void setSoLuongDaBan(int soLuongDaBan) {
		this.soLuongDaBan = soLuongDaBan;
	}
}
