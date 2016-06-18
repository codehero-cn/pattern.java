package pattern.decorative;

class Test01 {

	public static void main(String[] args) {
		
		//生成一个A公司水管工对象
		Plumber plumber = new Plumber();
		AWorker aworker1 = new AWorker(plumber);
		aworker1.doSomeWork();
		
		Capenter capenter = new Capenter();
		AWorker aworker2 = new AWorker(capenter);
		aworker2.doSomeWork();
		
	}
}
