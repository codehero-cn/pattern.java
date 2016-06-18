package pattern.factory.printer;

public class PrinterTest {
	public static void main(String[] args){
		int flag = 1;
		
		if(flag == 0){
			HPPrinter hpprinter = new HPPrinter();
			hpprinter.open();
			hpprinter.print("abc");
			hpprinter.close();
			
		}
		else if (flag == 1){
			CanonPrinter canonprinter = new CanonPrinter();
			canonprinter.open();
			canonprinter.print("123");
			canonprinter.print();
			canonprinter.close();
			
		}
	}
}
