package chapter11;

public class Notebook {
	String CPU;
	int mem_size;
	int storage_size;
	Human person;
	
	Notebook(String CPU, int mem_size, int storage_size, int age, String name) {
		this.CPU = CPU;
		this.mem_size = mem_size;
		this.storage_size = storage_size;
		person = new Human(age, name); // ����� is a, ������ has a
	}
	
	void display_notebook() {
		System.out.println("CPU : " + CPU);
		
	}
}
