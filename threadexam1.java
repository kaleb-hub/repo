package lab2;

public class threadexam1 {
	public static class mythread extends Thread{
		
		public void run() {
			System.out.println("My thread started");
			System.out.println("thread is one part of process");
		}
		public static void main(String args[]) {
			mythread t1=new mythread();
			t1.start();
		}
		
	}

}
