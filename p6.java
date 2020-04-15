//producer and consumer program correct version
class Shop{
	int product;
	boolean f = false;
	synchronized void put(int product){
		try{
			if(f == true){
				wait();
			}
			this.product = product;
			System.out.println("Producer : "+product);
			f = true;
			notify();
		}catch(InterruptedException ie){}
	}
	synchronized int get(){
		try{
			if(f == false){
				wait();
			}
			f = false;
			notify();
			
		}catch(InterruptedException ie){}
		return product;	
	}
}
class Producer extends Thread{
	Shop s;
	Producer(Shop s){
		this.s = s;
	}
	public void run(){
		int i = 1;
		try{
			while(true){
				s.put(i++);
				Thread.sleep(500);
			}
		}catch(InterruptedException ie){}
	}
}
class Consumer extends Thread{
	Shop s;
	Consumer(Shop s){
		this.s = s;
	}
	public void run(){
		try{
			while(true){
				System.out.println("Consumer : "+s.get());
				Thread.sleep(500);			
			}
		}catch(InterruptedException ie){}
	}
}
class Test{
	public static void main(String[] args) {
		Shop s = new Shop();
		Producer p = new Producer(s);
		Consumer c = new Consumer(s);
		p.start();
		c.start();
	}
}