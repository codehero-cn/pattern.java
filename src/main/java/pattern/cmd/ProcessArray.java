package pattern.cmd;

public class ProcessArray
{
	public void process(int[] target , Command cmd) 
	{
		cmd.process(target);
	}
}
