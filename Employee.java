public class Employee
{
	private String fn;
	private String ln;
	private String job;
	private double salary;
	public static void main(String[] args)
	{
		int[] numbers ={41,4,3,2,7,34,6};
		numbers = Sort.insertionSort(numbers);
		int[] g = binarySearch(4,numbers);
		for(int a=0; a<numbers.length; a++)
		{
			System.out.println(numbers[a]);
		}


	}
	Employee(String x, String x2, String x3, double x4)
	{
		fn = x;
		ln = x2;
		job = x3;
		salary = x4;
	}
	public String getFN()
	{
		return fn;
	}
	public String getLN()
	{
		return ln;
	}
	public String getJob()
	{
		return job;
	}
	public double getSalary()
	{
		return salary;
	}
	public static int[] linearSearch(int[] x,int[] y)
	{
		int d = 0;
		int[] fin;
		boolean found = false;
		for(int a = 0; a < y.length; a++)
		{
			if(x == y[a])
			{
				found = true;
				d++;
			}
		}
		fin = new int[d];
		int c = 0;
		for(int a = 0; a < y.length; a++)
		{
			if(x == y[a])
			{
				fin[c] = y[a];
				c++;
			}
		}
		if(found == true)
		return fin;
		else
		return null;
	}
	public static int[] binarySearch(int x, int[] y)
		{
			int a = 0;
			int b = 0;
			int c = 0;
			int mid = y.length/2;
			int max = y.length;
			int min = 0;
			boolean found = false;
			int[] fin = new int[a];

			while(found == false && b < y.length)
			{
				if(x > y[mid])
				{
				}

				if(x < y[mid])
				{
					mid = mid/2;
					if(x == y[mid])
					{
						found = true;
						fin[c] = y[mid];
					}
				}
			}
			return fin;
		}

	public String toString()
	{
		return "" + fn + "\t" + ln  + "\n" + job + salary + "";
	}
}