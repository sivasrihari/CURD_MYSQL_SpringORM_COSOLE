package in.ineuron.dto;

import java.io.Serializable;


public class DTO implements Serializable 
{
	
	@Override
	public String toString() {
		return "DTO [sid=" + sid + ", sname=" + sname + ", saddress=" + saddress + ", sage=" + sage + "]";
	}
	private static final long serialVersionUID = 1L;

	private Integer sid;
	
	private String sname;
	private String saddress;
	private Integer sage;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public Integer getSage() {
		return sage;
	}
	public void setSage(Integer sage) {
		this.sage = sage;
	}
}
