import java.util.concurrent.ThreadLocalRandom;
public class NRandomNumbers
{
	public int generateRandom(int n)
	{
		return ThreadLocalRandom.current().nextInt(1,n+1);
	}

	public static void main(String[] args)
	{
		NRandomNumbers nrand = new NRandomNumbers();
		for(int i = 0; i < 6; i++)
		{
			System.out.println(nrand.generateRandom(49));
		}
	}
}
