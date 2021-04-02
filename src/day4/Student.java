package day4;

public class Student {
	
	String name;
	int kor;
	int eng;
	int math;
	int total;
	int avg;

	//기본생성자
	Student() {}
	
	// 학생이름, 국어점수, 영어점수를 전달받아서 멤버변수를 초기화 하는 생성자 정의하기
	public Student(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.avg = this.total/3;
	}
	//학생이름, 국어점수, 영어점수, 수학점수 를 전달받아서 초기화하는 생성자 정의하기
}
