package org.tns.capgemini.c2tc.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person7 
{
	String name;
	int age;
	
	
	Person7(String name ,int age)
	{
		this.name=name;
		this.age=age;
	}
	
	void displayinfo()
	{
		System.out.println("Name:" + name + " age:"+ age);
		
	}

}
class NameComparator implements Comparator<Person7>
{

	@Override
	public int compare(Person7 p1, Person7 p2) {
		
		return p1.name.compareTo(p2.name);
	}
	
}
class AgeComparator implements Comparator<Person7>
{

	@Override
	public int compare(Person7 p1, Person7 p2) {
		
		return Integer.compare(p1.age, p2.age);
	}
	
}
public class ComparatorDemo {

	public static void main(String[] args) {
		List<Person7> people=new ArrayList<>();
		people.add(new Person7("Suleman",22));
		people.add(new Person7("Abdullah",17));
		people.add(new Person7("Ibrahim",15));
		
		Collections.sort(people, new NameComparator());
		System.out.println("sorted by name");
		for(Person7 person:people)
		{
			person.displayinfo();
		}

		System.out.println();
		
		Collections.sort(people, new AgeComparator());
		System.out.println("sorted by age");
		for(Person7 person:people)
		{
			person.displayinfo();
		}

	}

}