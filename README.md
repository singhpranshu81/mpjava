# mpjava
-- INHERITANCE --
package com.mphasis;

class Emp{
	
	int eid=101;
	String ename="David";
	Emp(){
		this(100);
		System.out.println("Hello employee");   // we can't call one constructor within another constructer ,this only works great with constructers compared to functions.
	}
	Emp(int a){
		this(2.5f,4);                // this method or super method should be called at first line in constructor otherwise error
	 	System.out.println("integer0 "+a);
	}
	Emp(float a,int b){
		System.out.println("float and int" + a +b);
	}
	Emp(int n,String name){
		this.eid=n;
		this.ename=name;
	}
	public String getdetails() {
		return eid + " " + ename;
	}
}
class Manager extends Emp{
	
	String deptname="IT";
	Manager(){
		 super(111,"hfhgh");/// this is automatically called whether written explicitly or not , so we generally don't write --> used for invoking base class
		System.out.println("Hello mngr");
	}
	public String getdetails() {
	//	return eid + " " + ename+" "+deptname;
		return super.getdetails()+" "+deptname; // super keyword is used for invoking base class overridden methods
	}
}
public class Inhrtance {

	public static void main(String[] args) {
		Emp e= new Emp();
//		String empdata=e.getdetails();
//		System.out.println(empdata);
         Manager mg= new Manager();
         System.out.println(mg.getdetails());
	}

}
