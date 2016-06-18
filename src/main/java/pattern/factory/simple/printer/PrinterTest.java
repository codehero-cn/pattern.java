package pattern.factory.simple.printer;

public class PrinterTest {
	public static void main(String[] args){
		//根据用户的选择，生成相应的打印机对象
		//并且向上转型为Printer类型
		//Printer getPrint(int flag)
		int flag = 0;
		Printer printer =PrinterFactory.getPrinter(flag);
		printer.open();
		printer.print("test");
		printer.close();
	}
}
