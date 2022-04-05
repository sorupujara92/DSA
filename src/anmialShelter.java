import java.util.LinkedList;


 class Animal{
	
	int order;
	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	int item;
	Animal(){
		
	}
	
	Animal(int item){
		this.item = item;
	}
}

 class Dog extends Animal{
	 Dog(int item){
		 super(item);
	 }
 }
 
 class Cat extends Animal{
	 Cat(int item){
		 super(item);
	 }
 }
public class anmialShelter {
	public static Integer count = 0;
	LinkedList<Dog>  dogL= new LinkedList<Dog>();
	LinkedList<Cat>  catL= new LinkedList<Cat>();

	public void enqeueDog(Integer item){
		Dog d = new Dog(item);
		d.setOrder(count);
		count ++;
		dogL.add(d);
		
		
	}
	
	public void enqeueCat(Integer item){
		Cat d = new Cat(item);
		d.setOrder(count);
		count ++;
		catL.add(d);
		
		
	}
	
	public Dog dequeuDog(){
		return this.dogL.remove();
	}
	public Cat dequeuCat(){
		return this.catL.remove();
	}
	
	public Animal dequeyAny(){
		Dog d = dogL.peek();
		Cat c = catL.peek();
		if(d.getOrder()<c.getOrder()){
			return dogL.remove();
		}
		else{
			return catL.remove();
			
		}
		
	}
	
	public static void main(String x[]){
		anmialShelter a = new anmialShelter();
		a.enqeueDog(1);
		a.enqeueCat(11);
		
		a.enqeueDog(2);
		
		a.enqeueCat(12);

		a.enqeueDog(3);
		a.enqeueCat(13);

		
		a.enqeueDog(4);
		a.enqeueCat(14);

		a.enqeueCat(15);

		a.enqeueDog(5);
		
		System.out.println(a.dequeuCat().item);
		System.out.println(a.dequeuDog().item);
		System.out.println(a.dequeyAny().item);
	}
}

