package pattern.factory.printer;
//该打印机为针式打印机
public class CanonPrinter extends Printer {

	
	void close(){
		this.clean();
		super.close();
	}
	

	void clean(){
		System.out.println("clean");
	}
	
	void print(){
		System.out.println("使用针式打印机进行打印");
	}
}
