package com.mpha.model;

import java.io.Serializable;

import com.mpha.controller.Empsal;

public class Parttime implements Empsal,Serializable{
	 private final int fp=1000 ;
     private int hours;
 private int tsal;
	public Parttime() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getFp() {
		return fp;
	}
	public int getTsal() {
		return tsal;
	}
	public void setTsal(int x) {
		this.tsal = getHours()*x;
	}
	@Override
	public void totsalary() {
		System.out.println(getTsal());
	}
	@Override
	public String toString() {
		return "Parttime [fp=" + fp + ", hours=" + hours + ", tsal=" + tsal + "]";
	}

}
