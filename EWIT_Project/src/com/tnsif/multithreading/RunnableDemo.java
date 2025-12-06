package com.tnsif.multithreading;

public class RunnableDemo {

	public static void main(String[] args) {
		

		
		//Using anonymous class
		
		Runnable runnable = new Runnable() {
			@Override
			public void run() { // anonymous class
				System.out.println("Runnable with Anonymous Class");
			}
		};
		
		//Thread t = new Thread(runnable);
		//t.start();
		
		// lambda expression
				runnable = () -> { 
					System.out.println("Runnable with Lambda Expression");
				};
				
				new Thread(runnable).start();

	}

}