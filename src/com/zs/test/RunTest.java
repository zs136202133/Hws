package com.zs.test;

public class RunTest implements Runnable {

	@Override
	public void run() {

		for(int i=0;i<10;i++){
			System.out.println(i);
		}
	}
	

	public static void main(String[] args) {
          
		RunTest runtest1 = new RunTest();
		RunTest runtest2 = new RunTest();
		System.out.println("start");
		runtest1.run();
		runtest2.run();
		System.out.println("end");
	}

}
