import java.util.Random;
public class OddEven
{
	public static void main(String[] args)
	{
		Random random_generator = new Random();
		int x = random_generator.nextInt(101);
		String temp = "";
		if(x == 0)
			temp = "frozen";
		else if(x >= 1 && x <= 14)
			temp = "cold";
		else if(x >= 15 && x <= 24)
			temp = "cool";
		else if(x >= 25 && x <= 40)
			temp = "warm";
		else if(x >= 41 && x <= 60)
			temp = "hot";
		else if(x >= 61 && x <= 80)
			temp = "very hot";
		else if(x >= 81 && x <= 99)
			temp = "extremely hot";
		else
			temp = "boiling";

		System.out.println(x + " is " + temp);
		if(x % 2 == 0)
		{
			System.out.println("The number " + x + " is even");
		}
		else
		{
			System.out.println("The number " + x + " is odd");
		}
	}
}
