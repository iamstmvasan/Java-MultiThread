//creating thread using implements Runnable Interface
class First implements Runnable{
	Thread t;
	First(){	
		t = new Thread(this);
		t.start();
	}
	public void run(){
		for(int i=0;i<=10;i++){
			System.out.println(i);
			try{
				t.sleep(300);
			}catch(InterruptedException ie){}
		}
	}
}
class Second implements Runnable{
	Thread t;
	Second(){
		t = new Thread(this);
		t.start();
	}
	public void run(){
		for(int i=0;i>=-10;i--){
			System.out.println(i);
			try{
				t.sleep(300);
			}catch(InterruptedException ie){}
		}
	}
}
class Main{
	public static void main(String arg[]){
		//creating anonymous class , Because we dont need this object reference for further usage
		//if you create like this (First f = new First();) there is nothing wrong in it
		new First();
		new Second();
	}
}
