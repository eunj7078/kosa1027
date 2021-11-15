package runtime_exception;

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		Cat cat = new Cat();
		changeDog(cat);
	}
	public static void changeDog(Animal animal) {
		if(animal instanceof Dog) {
			try {
				Cat dog = (Cat)animal; // ClassCastException
			}catch (ClassCastException e) {
				System.out.println("�Էµ� ��ü�� �߸��Ǿ����ϴ�.");
			}
			
		}
	}

}
class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}