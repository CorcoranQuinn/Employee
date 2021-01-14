public class Sort
{
	public static void main(String[] args)
{
	Employee yeet = new Employee("yeet", "meem", "cook", 10);
	Employee freak = new Employee("freak", "abadango", "friar", 40);
	Employee dork = new Employee("dork", "zero", "priest", 20);
	Employee runt = new Employee("runt", "moo", "monk", 6);
	Employee[] employees = {yeet,freak,dork,runt};
	Sort.selectionSortFirstName(employees);
	for(int a = 0; a < employees.length; a++)
	{
		System.out.println(employees[a]);
	}
}
	public static  Employee[] selectionSortFirstName(Employee[]employee)
	{
		Employee temp;
		for(int x = 0; x < employee.length; x++)
		{
			for(int y = 0; y < employee.length; y++)
			{
				if(employee[y].getFN().compareToIgnoreCase(employee[x].getFN()) > 0)
				{
					temp = employee[y];
					employee[y] = employee[x];
					employee[x] = temp;
				}
			}
		}
		return employee;
	}
	public static int[] insertionSort(int[]numbers)
	{
		int temp;
		for(int x = 1; x < numbers.length+1; x++)
		{
			for(int y = 0; y < numbers.length; y++)
			{
				if(numbers[y] > numbers[x-1])
				{
					temp = numbers[x-1];
					numbers[x-1] = numbers[y];
					numbers[y] = temp;
				}
			}
		}
		return numbers;
	}
}