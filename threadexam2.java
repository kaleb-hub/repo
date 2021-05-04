package lab2;

public class threadexam2 {
	public static class mythread implements Runnable{
		public void run() {
		System.out.println("thread example of runnabe interface");
			
		}
		public static void main(String args[]) {
			Thread t=new Thread(new mythread()) ;
				t.start();
			}
		}
		}