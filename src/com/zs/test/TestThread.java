package com.zs.test;

public class TestThread {

	public static void main(String[] arg){
		NewThreadTest nt1= new NewThreadTest("start");
		NewThreadTest nt2= new NewThreadTest("end");
		
	
		System.out.println("begin");
		nt1.run();
		nt2.run();
		System.out.println("over");
		
	}
}
