// For all exercises in Task 4, you are allowed to complete them with arrays of a fixed size. But do consider how the functions you write in 4.b, 4.c, 4.d,  4.e would work, if the array received as a parameter would not have a fixed length. 
// 4.a create arrays of the following type and assign it at least 3 different values: 
// - Integer array
// - String array
// - boolean array
// 4.b Write a function that takes in an array of strings as parameter and prints each string.
// 4.c Write a function that receives an integer array as a parameter and returns the sum of all elements in the array.
// 4.d Write a function that receives an integer array as a parameter and returns the average value.	
// 4.e Consider how you could write a function that takes in an integer array as a parameter and returns the array sorted from lowest to highest value.

class Array
{
	public static int intArrSum(int [] intInputArr)
	{
		int sum = 0;
		for (int i = 0; i < intInputArr.length; i++)
		{	
			
			sum = sum + intInputArr[i];

		}
		return sum;
	}

	public static int intArrAverage (int [] inputAverage)
	{
		int sum = 0;
		int averageSum = 0;
		int arrLength = inputAverage.length;
		for (int i = 0; i < inputAverage.length; i++)
		{
			sum = sum + inputAverage[i];
		}
		averageSum = sum / (arrLength);
		return averageSum;
	}


	public static void stringArr(String [] strArray)
	{
		for(int i = 0; i < strArray.length; i++)
		{
			System.out.println(strArray[i]);
		}
	}

	public static void sortArr(int[] inputArr)
	{
		int tmp = 0;

		for(int i = 0; i < inputArr.length; i++)
		{
			for (int j = i + 1; j < inputArr.length; j++)
			{
				
				if (inputArr[i] > inputArr[j])
				{
					tmp = inputArr[i];
					inputArr[i] = inputArr[j];
					inputArr[j] = tmp;
				}
			}
			System.out.println(inputArr[i]);
		}

	}


	public static void main(String[] args)
	{
		int[] arr = {78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};
		int [] intArray = {10, 9, 11};
		String [] stringArray = {"Mads", "Eske", "Rabee"};
		boolean [] boolArray = {true, true, false};

		stringArr(stringArray);

		int sumFromArray = intArrSum(intArray);
		System.out.println(sumFromArray);
		int averageArray = intArrAverage(intArray);
		System.out.println(averageArray);

		sortArr(arr);
		
	}

	
}