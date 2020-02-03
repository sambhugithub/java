class MyThread implements Runnable {
	
	Thread thrd;
	int time;
	MyThread(String name, int t)
	{
		thrd = new Thread(this,name);
		time = t * 100;
		thrd.start();
	}
	
	public void run() {
		System.out.println(thrd.getName() + " starting..");
		try {
			for (int count =0;count< (60/(time/100));count++) {
				Thread.sleep(time);
				System.out.println(thrd.getName());
			}
		}
		catch(InterruptedException exc) {
			System.out.println(thrd.getName() + " interrupted");
		}
		System.out.println(thrd.getName() + " terminating");
		
	}
		
}


class AJPL2p {
	public static void main(String args[]) {
		//System.out.println("Main Thread starting..");
		MyThread mt1 = new MyThread("Good Morning",1);
		MyThread mt2 = new MyThread("Hello",2);
		MyThread mt3 = new MyThread("Welcome",3);
		
		try {
			
			mt1.thrd.join();
			System.out.println("Good Morning #1 joined");
			
			mt2.thrd.join();
			System.out.println("Hello #2 joined");
			
			mt3.thrd.join();
			System.out.println("Welcome #3 joined");
			
		}
		catch (InterruptedException exc) {
			
			System.out.println("Main Thread interrupted");
		}
		System.out.println("Main Tread ending...");
	}
   
}