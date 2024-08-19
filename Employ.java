package baba;

import java.io.Serializable;
import java.util.Comparator;

public class Employ implements Serializable,Comparable<Employ>{
	 private int empno;
	 private String empname;
	public Employ() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", empname=" + empname + "]";
	}
	@Override
	public int compareTo(Employ e) {
		// TODO Auto-generated method stub
		return this.empno-e.empno;
	}
	public static Comparator<Employ> mycomp= new Comparator<Employ>() {
	

		public int compare(Employ o1, Employ o2) {
			// TODO Auto-generated method stub
			return o1.getEmpno()-o2.getEmpno();
		}
	};
	 
}
