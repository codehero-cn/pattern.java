package pattern.factory.simple.printer;

interface Printer {
	public void open();
	
	public void close();
	
	public void print(String s);
}
