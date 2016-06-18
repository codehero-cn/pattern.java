package pattern.factory.simple.printer;
//该打印机为针式打印机
public class CanonPrinter implements Printer {
	private void clean(){
		System.out.println("clean");
	}
	
	public void close(){
		this.clean();
		System.out.println("Canon close");
	}
	
	public void open(){
		System.out.println("Canon open");
	}
	
	public void print(String s){
		System.out.println("Can print --->" + s);
	}
}
