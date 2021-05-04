package lab2;

public class counter {
	int num;
	public  void increment(){
		num++;
	}
	public static void main(String args[]) throws InterruptedException {
		counter c=new counter();
		counter d=new counter();
		Thread t=new Thread(new Runnable(){
		
		public void run(){
			for(int i=0;i<=10;i++) {
				c.increment();
			}
		}
		});
		Thread t1=new Thread(new Runnable(){
			
			public void run(){
				for(int i=0;i<=10;i++) {
					d.increment();
				}
			}
			});
			t.start();
			t.join();
			System.out.println("counter="+c.num);
			t1.start();
			t1.join();
			System.out.println("counter="+c.num);
		}
		}
	
