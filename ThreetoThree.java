import java.util.concurrent.ThreadLocalRandom;
public class ThreetoThree
{
	public static void main(String[] args)
	{
		int x = -4;
		/**
		do
		{
			x = ThreadLocalRandom.current().nextInt(-3,4);
			System.out.println("x is " + x);
		}while(x != 0);
		System.out.println("You can stop now");
		**/
		while(x != 0)
		{
			x = ThreadLocalRandom.current().nextInt(-3,4);
			System.out.println("x is " + x);
		}
		System.out.println("You can stop now");
	}

}
