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
		System.out.printf("안녕, %d살 %s입니다.\n", age, name);
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
		super.setName("김도도");
		super.setAge(20);
		major = "컴퓨터공학과";
	}

	void display_student() {
		System.out.println("이름 : " + super.getAge());
		System.out.println("전공 : " + major);
	}

	void study() {
		System.out.println("하늘 천 따 지 검을 현 누를 황");
	}

	void intro() {
		System.out.println("전공 : " + major);
		System.out.println("학번 : " + stnum);
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
