
/*
	Running two repeated prints in parallel
*/

public class RepeatThreadRunner 
{
	public static void main(String[] args)
	{
		RepeatPrint r1 = new RepeatPrint("I will repeat this text");
		RepeatPrint r2 = new RepeatPrint("Just stop this text if you can");		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}

}