package day2;

public class BankingApp {

	public static void main(String[] args) {

		//계좌 등록, 조회, 적금, 이체, 예치금액 조회, 비밀번호 변경기능을 제공하는 Banking객체
		Banking banking = new Banking();
		
		// 신규계좌 등록해보기
		// 번호, 예금주, 최초잔액, 비밀번호를 입력받아서 Banking 객체의 신규계좌 개설기능에게 전달한다.
//		int no = 100;
//		String name = "홍길동";
//		long amount = 50000;
//		int password = 1234;
		// 얘네들은 '지역변수'라고 부름
		// 지역변수는 그 변수가 선언된 블록안에서만 사용 할 수 있다. 그래서 '지역'인거
		banking.insertAccount(100, "홍길동", 5000, 1111); 		// 매소드 호출/ no,name..얘네들은 '인자'라고 부름
		banking.insertAccount(200, "김유신", 25000, 1122); 		// 매소드 호출/ no,name..얘네들은 '인자'라고 부름
		banking.insertAccount(300, "강감찬", 125000, 1133); 		// 매소드 호출/ no,name..얘네들은 '인자'라고 부름
		banking.insertAccount(400, "이순신", 5000000, 1144); 		// 매소드 호출/ no,name..얘네들은 '인자'라고 부름
		banking.insertAccount(500, "유관순", 100045000, 1155); 	// 매소드 호출/ no,name..얘네들은 '인자'라고 부름
		
		
		System.out.println("--------------------------------------------------------");
		System.out.println("### 계좌정보 조회하기");
		
		// 조회해보기
		// 계좌번호, 비밀번호를 입력받아서 Banking객체의 조회기능에게 전달해서, 계좌정보를 받아온다.
		Account result1 = banking.getAccountByNo(100, 1111);
		System.out.println("조회된 Account 객체 : " + result1);
		if (result1 != null) {
			System.out.println("###조회된 계좌번호###");
			System.out.println("계좌번호 : " + result1.no);
			System.out.println("현재잔액 : " + result1.balance);
			System.out.println("계좌번호 : " + result1.interestRate);
			
		} else {
			System.out.println("계좌번호/비밀번호와 일치하는 계좌정보를 찾을 수 없습니다.");
		}
		
		Account result2 = banking.getAccountByNo(120, 1234);
		System.out.println("조회된 Account 객체 : " + result2);
		if (result2 != null) {
			
		} else {
			System.out.println("계좌번호/비밀번호와 일치하는 계좌정보를 찾을 수 없습니다.");
		}
		
		// 적금해보기
		// 계좌번호, 입금액을 입력받아서 Banking 객체의 적금기능에게 전달한다.
		
		
		// 비밀번호 변경해보기
		// 계좌번호, 비밀번호, 새 비밀번호를 입력받아서 Banking 객체의 비밀번호 
	}

}
