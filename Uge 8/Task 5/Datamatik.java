// // For this task you should reuse the Student class from Task 3. 
// //     Methods of reusing the class could be: 
// //     - copy the Students.java file and add it to a new folder called task5
// //     - copy the content of the Students class from Task 3 and create the class once more in this folder
// //     - Open the task 3 folder and continue working in this.
// //     Either method is fine - it is up to you. 

// // 5.a Create a new class Datamatik or reuse the one you created earlier. Add an array of Students with 10 elements in it. This should be a class variable (static). From the main method, add 10 student instances to the array. Each student must have a unique reference.

// // 5.b Create a function in Datamatik that takes in the array from 5.a as a parameter as well as an integer. The function should return the field "name" (the name of the student) and print it (the integer should be used as the index number of the student to be printed). Call this method with different parameters (only the integer - not the array) from the main() of Datamatik.

// // 5.c Create a similar function to that of 5.b, but instead of receiving the array and an integer, it receives the array and a string. Loop through all elements in the array until you find the element with the name received as a parameter. Then return the index of that student. Call this method with different names from the main method of Datamatik

class Datamatik
{
	
	public static Student[] studentArray = new Student[10];

	public static void main(String[] args)
	{
		
		
		studentArray[0] = new Student("Christian",19,false,6);
		studentArray[1] = new Student("Frederik",23,false,6);
		studentArray[2] = new Student("Inga",28,true,6);
		studentArray[3] = new Student("Asger",24,false,6);
		studentArray[4] = new Student("Bjarke",28,false,5);
		studentArray[5] = new Student("Leo",24,false,5);
		studentArray[6] = new Student("Mohammed",24,false,5);
		studentArray[7] = new Student("Mie",21,true,4);
		studentArray[8] = new Student("Cleve",25,false,4);
		studentArray[9] = new Student("Bentsen",21,false,2);


		
		for (int i = 0; i < studentArray.length; i++)
		{		
			System.out.println(arrNames(studentArray,i));

		}
		
		System.out.println(indexStudent("Cleve"));
		System.out.println(indexStudent("Leo"));
		System.out.println(indexStudent("Mohammed"));
		System.out.println(indexStudent("Asger"));


	}
	public static String arrNames(Student[] studentInfo, int studentNum)
	{
		String name = studentInfo[studentNum].name;
		return name;
	}

	public static int indexStudent(String name)
	{
		int indexStud = 0;
		for (int i = 0; i < studentArray.length; i++)
		{
			if(studentArray[i].name.equals(name))
			{
				indexStud = i;
			}
		}
		return indexStud;
	}
}