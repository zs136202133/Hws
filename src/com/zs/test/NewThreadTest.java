package com.zs.test;

public class NewThreadTest extends Thread {
		
		private String name;
		
		public NewThreadTest(String name){
			try {
				super.wait(100000000l);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.name = name;
		} 
		
		public void run(){
			for(int i=0;i<=1;i++){
				System.out.println(name+i);
			}
			
		}
		
		@Override
		protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
		}
}
