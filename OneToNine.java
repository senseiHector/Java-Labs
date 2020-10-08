import java.util.Random;
public class OneToNine
{
	public static void main(String[] args)
	{
		Random random_generator = new Random();
		int x = random_generator.nextInt(10);
		String num = "";
		switch(x)
		{
		case 1:
			num = "one";
			break;
		case 2:
			num = "two";
			break;
		case 3:
			num = "three";
			break;
		case 4:
			num = "four";
			break;
		case 5:
			num = "five";
			break;
		case 6:
			num = "six";
			break;
		case 7:
			num = "seven";
			break;
		case 8:
			num = "eight";
			break;
		case 9:
			num = "nine";
			break;
		}

		System.out.println(x + " is the number " + num);
	}

}
