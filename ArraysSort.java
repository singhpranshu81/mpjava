package baba;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysSort {

	public static void main(String[] args) {
	   int[] tr= {25,36,24,59};
	   Arrays.sort(tr);
	   System.out.println(Arrays.toString(tr));
	   
	   List<String> s=new ArrayList<>();
	   s.add("jdbf");
	   s.add("bdbf");
	   s.add("cdbf");
	   s.add("adbf");
	   System.out.println(s);
	 Collections.sort(s);
	   System.out.println(s);
	   Employ e=new Employ();
	   e.setEmpname("jhbdjd");
	   e.setEmpno(11);
	   Employ e1=new Employ();
	   e1.setEmpname("hbdjd");
	   e1.setEmpno(12);
	   Employ e2=new Employ();
	   e2.setEmpname("zdjd");
	   e2.setEmpno(8);
	   List<Employ> sr=new ArrayList<>();
	   sr.add(e);
	   sr.add(e1);
	   sr.add(e2);
	   // sorting using comparable  --. implement comparable in the object class and define the unimplemented methods and use it here
//	   Collections.sort(sr);
	   System.out.println(sr);
	   //sorting using comparator
	   Collections.sort(sr,Employ.mycomp);
	   System.out.println(sr);
	}

}
