//creating thread using extends Thread class
class First extends Thread{
     public void run(){
	    try{
		    for(int i = 1;i<=10;i++){
			    System.out.println(i);	
			    sleep(300);
		    }			
		}catch(InterruptedException ie){}
     }
}
class Second extends Thread{
	public void run(){
		try{
			for(int i = -1;i>=-10;i--){
				System.out.println(i);	
				sleep(300);
			}
			
		}catch(InterruptedException ie){}
	}
}
class Main{
	public static void main(String[] args) {
		System.out.println("Program start");
		First f = new First();
		Second s = new Second();
		f.start();
		s.start();
		try{
			s.join();
		}catch(InterruptedException ie){}
		System.out.println("Program end");
	}
}
