package lab2;

public class threadexam1 {
	public static class mythread extends Thread{
		
		public void run() {
			System.out.println("My thread started");
			System.out.println("thread is one part of process");
			System.out.println("Jesus will never let me down");
		}
		public static void main(String args[]) {
			mythread t1=new mythread();
			t1.start();
		}
		public void student()
		{
			int id=90;
			System.out.println(id);
			System.out.println("why it doesnot work");
			System.out.println("why it doesnot work");
		}
		
	}

}
