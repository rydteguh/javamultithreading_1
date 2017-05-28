import java.util.Date;

/*
	A runnable that repeatdly prints 
*/

public class RepeatPrint implements Runnable 
{
	private static final int REPETITIONS = 10;
	private static final int DELAY = 1000;

	private String printed_text;

	/**
		Constructs the runnable object.
	*/

	public RepeatPrint(String text)
	{
		printed_text = text;
	}

	public void run()
	{
		try
		{
			int i = 1;
			while(REPETITIONS > i){
				Date now = new Date();
				System.out.println(now + " " + printed_text);
				Thread.sleep(1);
				i++;
			}
		}
		catch (Exception e){

		}
	}

}