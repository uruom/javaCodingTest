package Q3_06_Animal_Shelter;

public class Question {


	public static void main(String[] args) {
		AnimalQueue animals = new AnimalQueue();
		animals.enqueue(new Cat("Callie"));
		animals.enqueue(new Cat("Kiki"));
		animals.enqueue(new Dog("Fido"));
		animals.enqueue(new Dog("Dora"));
		animals.enqueue(new Cat("Kari"));
		animals.enqueue(new Dog("Dexter"));
		animals.enqueue(new Dog("Dobo"));
		animals.enqueue(new Cat("Copa"));
		MyCodeQ306 myCodeQ306 = new MyCodeQ306();
		myCodeQ306.enqueue(new Cat("Callie"));
		myCodeQ306.enqueue(new Cat("Kiki"));
		myCodeQ306.enqueue(new Dog("Fido"));
		myCodeQ306.enqueue(new Dog("Dora"));
		myCodeQ306.enqueue(new Cat("Kari"));
		myCodeQ306.enqueue(new Dog("Dexter"));
		myCodeQ306.enqueue(new Dog("Dobo"));
		myCodeQ306.enqueue(new Cat("Copa"));
		
		System.out.println(animals.dequeueAny().name());	
		System.out.println(animals.dequeueAny().name());	
		System.out.println(animals.dequeueAny().name());
		System.out.println("-----------------------------------------");
		System.out.println(myCodeQ306.dequeueAny().name());
		System.out.println(myCodeQ306.dequeueAny().name());
		System.out.println(myCodeQ306.dequeueAny().name());
		System.out.println("============================================");
		animals.enqueue(new Dog("Dapa"));
		animals.enqueue(new Cat("Kilo"));

		myCodeQ306.enqueue(new Dog("Dapa"));
		myCodeQ306.enqueue(new Cat("Kilo"));
		
		while (animals.size() != 0) {
			System.out.println(animals.dequeueAny().name()+" , "+myCodeQ306.dequeueAny().name());
		}
	}

}
