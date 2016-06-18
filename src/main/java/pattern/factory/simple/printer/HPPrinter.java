package pattern.factory.simple.printer;

//该打印机为喷墨打印机
class HPPrinter implements Printer {
	public void open() {
		System.out.println("HP open");
	}

	public void close(){
		System.out.println("HP close");
	}

	public void print(String s){
		System.out.println("HP print ---->" + s);
	}


}
