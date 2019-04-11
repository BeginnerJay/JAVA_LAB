package chapter11;

public class Calender {
	public final static int BASEYEAR = 1996;
	int year, month, dayMonth;

	public Calender(int year, int month) {
		this.year = year;
		this.dayMonth = month;
	}

	public boolean leap_year(int year) {
		boolean ret;

		if ( ( (year%4==0) && (year%100!=0) ) || (year%400==0) ) {
			ret = true;
		} else {
			ret = false;
		}
		return ret;
	}

	public int days_in_the_year(int year) {
		leap_year(year);
		int day = 0;
		final int Y366 = 366, Y365 = 365;
		for (int i = BASEYEAR; i <= year; i++) {
			if (leap_year(i) == true) {
				day += Y366;
			} else {
				day += Y365;
			}
		}
		return day;
	}

	public int days_in_a_month(int year, int month) {
		leap_year(year);

		int day = 0;

		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
			day = 31; break;
		case 4: case 6: case 9: case 11:
			day = 30; break;
		case 2:
			if(leap_year(year) == true) {
				day = 29;
			}	
			else {
				day = 28;
			}
		}
		return day;
	}

	public void display(int year, int month) {
		days_in_the_year(year);
		days_in_a_month(year, month);
		int t_day, n_month;

		if (year < BASEYEAR) {
			System.out.print("�Է°� ����!");
			return;
		}

		if (month < 1 || month > 12) {
			System.out.println("�Է°� ����!");
			return;
		}

		t_day = 0;
		t_day += days_in_the_year(year - 1);
		for (int i = 1; i < month; i++) {
			t_day += days_in_a_month(year, i);
		}

		System.out.printf("%9s%9s%9s%9s%9s%9s%9s\n","��","ȭ","��","��","��","��","��");
		for (int i = 1; i < (t_day%7); i++) {
			System.out.printf("%6s", " ");
		}

		n_month = days_in_a_month(year, month);
		for (int i = 1; i <= n_month; i++) {
			System.out.printf("%5d", i);
			if ( ( i + (t_day%7) ) %7 == 0 ) {
				System.out.println();
			}
		}
	}
}