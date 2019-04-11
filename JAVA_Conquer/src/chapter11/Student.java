package chapter11;

class Human {
	private int age;
	private String name;
	
	Human() {}
	
	Human(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	void intro() {
		System.out.printf("�ȳ�, %d�� %s�Դϴ�.\n", age, name);
	}
}


class Student extends Human {
	private int stnum;
	private String major;
	
	Student(int age, String name, int stnum, String major) {
	super(age, name);
	this.stnum = stnum;
	this.major = major;
	}
	
	Student() {
		super();
		stnum = 999;
		super.setName("�赵��");
		super.setAge(20);
		major = "��ǻ�Ͱ��а�";
	}
	
	void display_student() {
		System.out.println("�̸� : " + super.getAge());
		System.out.println("���� : " + major);
	}
	
	void study() {
		System.out.println("�ϴ� õ �� �� ���� �� ���� Ȳ");
	}
	
	void intro() {
		System.out.println("���� : " + major);
		System.out.println("�й� : " + stnum);
		System.out.println("*****************");
		super.intro();
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return super.getAge();
	}

	@Override
	public void setAge(int age) {
		// TODO Auto-generated method stub
		super.setAge(age);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}	
}
