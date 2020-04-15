//printer program and with  synchronized
class Printer{	
	synchronized static void printing(String s[]){
		try{
			for(int i=0;i<s.length;i++){
				System.out.println(s[i]);
				Thread.sleep(500);
			}
		}catch(InterruptedException i){}
	}	
}
class First extends Thread{
	String s[] = {"thiru","vishnu","vaishnav","shahul"};
	public void run(){
		Printer.printing(s);
	}
}
class Second extends Thread{
	String s[] = {"Java","Python","Pubg","C#"};
	public void run(){
		Printer.printing(s);
	}
}
class Test{
	public static void main(String[] args) {
		First f = new First();
		Second s = new Second();
		f.start();
		s.start();
	}
}
