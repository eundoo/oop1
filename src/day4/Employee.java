package day4;

public class Employee {

	//멤버변수
	int no;
	String name;
	String dept;
	String position;
	int salary;
	double commissionPct;
	 
	//기본생성자
	Employee() {}
	
	//no, name, salary를 초기화 하는 작업을 수행하는 생성자
	public Employee(int no, String name, int salary) {
		this.no = no;
		this.name = name;
		this.salary = salary;
	}
	
	//no, name, dept, position, salary, commissionPct를 초기화 하는 작업을 수행하는 상성자
	public Employee(int no, String name, String dept, String position,
			int salary, double commissionPct) {
		this.no = no;
		this.name = name;
		this.dept = dept;
		this.position = position;
		this.salary = salary;
		this.commissionPct = commissionPct;
	}
	
	void printEmployeeInfo(int no) {
		System.out.println("직원번호: " + no);
		System.out.println("직원이름: " + this.name);
		System.out.println("소속부서: " + this.dept);
		System.out.println("직원직위: " + this.position);
		System.out.println("직원급여: " + this.salary);
		System.out.println("커미션지급율: " + this.commissionPct);
	}
}
