
public class ArraySum 
{
	public int sumOfarray(Integer[] a, int index)
	{
		int sum;
		if(index<0)
		{
			sum=a[index];
		}
		else
		{
			sum= sumOfarray(a,index-1) + sumOfarray(a,index);
		}
		return sum;
	}
}
