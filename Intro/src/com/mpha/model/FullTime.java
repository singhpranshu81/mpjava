package com.mpha.model;

import java.io.Serializable;

import com.mpha.controller.Empsal;

public class FullTime implements Empsal,Serializable {
	 private int basic;
     private double hra;
     private double pf;
     private double gross;
     private double net;
     private int tsal;
	public FullTime() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getBasic() {
		return basic;
	}
	public void setBasic(int basic) {
		this.basic = basic;
	}
	public double getHra() {
		return hra;
	}
	public void setHra() {
		this.hra = basic*0.1;
	}
	public double getPf() {
		return pf;
	}
	public void setPf() {
		this.pf =basic*0.05;
	}
	public double getGross() {
		return gross;
	}
	public void setGross() {
		this.gross = getBasic()+getHra()+getPf();
	}
	public double getNet() {
		return net;
	}
	public void setNet() {
		this.net = getGross()-getPf();
	}
	public double totalSalary() {
		return getNet();
	}
	@Override
	public void totsalary() {
		System.out.println(getNet());
	}
	@Override
	public String toString() {
		return "FullTime [basic=" + basic + ", hra=" + hra + ", pf=" + pf + ", gross=" + gross + ", net=" + net
				+ ", tsal=" + tsal + "]";
	}
     
}
