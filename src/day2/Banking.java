package day2;

/**
 * 신규계좌 등록, 계좌조회, 입금, 이체, 비밀번호 변경, 해지환급금 조회기능을 제공하는 객체를 생성할 때 
 * 필요한 클래스이다. </br>
 * Banking 객체는 Account를 여러개 저장하는 배열을 가지고 있다.
 * Banking 객체는 Account가 배열의 몇번째 칸에 저장되는지를 알려주는 멤버변수를 가지고 있다. </br>
 * @author USER
 *
 *
 * 1. 신규 계좌등록기능
 * 		a. 계좌번호, 예금주명, 최초잔액, 비밀번호를 매개변수로 전달받는다.
 * 		b. 위의 정보를 저장하기 위해서 Account객체를 생성한다.
 * 			Account searchedAccount = null;
 *		c. 생성된 Account객체의 멤버변수(no, owner, balance, password)에 
 *			매개변수로 전달받은 값을 대입한다.
 *		d. 계좌정보가 저장된 Account객체를 accounts 배열에 savePosition번째에 저장한다.
 *			*savePosition의 초기값은 0이다.	
 *		e. savePosition의 값을 1증가 시킨다.
 *			*신규 계좌 등록기능이 호출될 때 마다 배열의 0번째 부터 순서대로Account객체가 저장된다.
 *
 *2. 계좌정보 조회기능
 *		a. 계좌번호, 비밀번호를 매개변수로 전달 받는다.
 *		b. 조회된 계좌정보(Account객체)를 저장할 Account타입의 searchedAccount 변수를 생성한다.
 *		c. 향상된 for문을 이용해서 배열에 저장된 Account객체를 순서대로 하나씩 가져온다.
 *			for (Account accounts) {
 *				i. account 변수에 대입된 Account 객체의 계좌번호/비밀번호와 
 *				매개변수로 전달받은 계좌번호/비밀번호가 일치하는 Account객체가 존재하면
 *				ii. b에서 생성한 searchedAccount에 account변수에 저장된 Account객체를 대입한다.
 *			}
 *		d. searchedAccount에 저장된 Account객체를 반환한다.
 *			*일치하는 계좌정보가 존재하지 않는 경우 null이 반환될 수 있다.
 *
 */			
public class Banking {
		
		//멤버변수
		Account[] accounts = new Account[5];
		int savePosition = 0;
		
		/**
		 * 계좌번호, 예금주, 최초잔액, 비밀번호를 전달받아서, 신규 계좌정보를 배열에 저장한다.
		 * @param accNo
		 * @param accName
		 * @param accBalance
		 * @param accPassword
		 */
		// 매개변수는 빈칸부분이라고 생각하면됨 입력해야 되는부분
		// 신규계좌 개설(등록) 가능
		// 반환값 : 없음 <- 등록기능
		// 매개변수 : 계좌번호, 사용자면, 최초잔액, 비밀번호
		void insertAccount(int accNo, String accName, long accBalance, int accPassword) {
			//메소드 호출시 매개변수로 전달된 값 출력
			System.out.println("신규 계좌번호: " + accNo);
			System.out.println("신규 예금주명: " + accName);
			System.out.println("신규 최초잔액: " + accBalance);
			System.out.println("신규 비밀번호: " + accPassword);
			
			// 메소드 호출시 매개변수로 전달된 정보(계좌번호, 예금주, 잔액, 비밀번호)를 담는 Account객체 생성
			Account account = new Account();
			// 생성된 Account객체의 멤버변수에 매개변수로 전달받은 값 대입
			account.no = accNo;
			account.owner = accName;
			account.balance = accBalance;
			account.password = accPassword;
			
			// 생성된 Account객체를 accounts배열데 저장하기
			// savePosition은 배열에서 저장위치를 지정한다.
			accounts[savePosition] = account;
			// 저장이 완료되면 savePosition의 값을 1증가시켜서 다음 칸에 저장되도록 한다.
			savePosition++;
			System.out.println("### 신규 계좌가 배열에 등록되었습니다.");
			System.out.println();
			
			// 얘네 하나하나가 변수들이 만들어지는 거라고 '매개변수'라고부름
			// 매개변수는 메소드 실행시점에 만들어져서 종료시점에 사라진다.
		}
		
		/**
		 * 계좌번호, 비밀번호를 전달받아서 계좌번호에 해당하는 계좌정보를 찾아서 제공한다.
		 * @param accNo 조회할 계좌정 계좌번호
		 * @param accPassword 조회할 계좌의 비밀번호
		 * @return 조회된 계좌번호
		 */
		// 계좌정보 조회가능
		// 반환값 : 있음(Account 객체) < - 조회기능
		// 매개변수 : 계좌번호, 비밀번호
		// 위에 accNo랑은 상관없음
		Account getAccountByNo (int accNo, int accPassword) {
			//System.out.println("\n전달받은 계좌번호 : " + accNo);
			//System.out.println("전달받은 비밀번호 : " + accPassword);
			Account searchedAccount = null;
			
			// 배열에서 Account객체를 하나씩 순서대로 조회해서 계좌번호의 비밀번호가 일치하는 계좌정보를 찾기
			for (Account account : accounts) {
				//System.out.println("배열에서 꺼낸 Account객체의 계좌번호 : " + account.no);
				//System.out.println("배열에서 꺼낸 Account객체의 계좌번호 : " + account.password);
				// 배열에서 꺼낸 Account 객체의 계좌번호와 비밀번호가 매개변수로 전달받은 계좌번호, 비밀번호와 일치하면 
				// 그 Account객체를 searchedAccount에 대입한다. 
				if (account.no == accNo && account.password == accPassword) {
						//System.out.println("일치하는 계좌정보를 가진 Account객체를 searchedAccount에 대입함");
						searchedAccount = account;
						break;
				}
			}
			//System.out.println("최종 조회결과: " + searchedAccount);
			return searchedAccount;
		}
			/**
			 * 계좌번호, 이전비밀번호, 새비밀번호를 전달받아서 해당 계좌
			 * @param accNo 비밀번호를 변경할 계좌의 계좌번호
			 * @param oldPassword 이전비밀번호
			 * @param newPassword 새 비밀번호
			 */
			//비밀번호 변경기능
			// 반환값 : 없음 <- 변경기능
			// 매개변수 : 계좌번호, 구비밀번호, 새비밀번호
			void changePassword(int accNo, int oldPassword, int newPassword) {
		}
		
		
		
		
		
		
//		void changePassword(int accNo, int oldPassword, int newPassword) {
//			
//		void deposit(int accNo, long amount) {
//		/**
//		 * @param accNo
//		 * @param amount
//		 * @param password
//		 * @param otherAccNo
//		 */
//			
//		void transation(int accNo, long amount, int password, int otherAccNo) {
//			
//		}
//		
		/**
			 * 계좌번호, 입금액을 전달받아서 해당 계좌에 입금한다.
			 * @param accNo 입금계좌번호
			 * @param amount 입금액
			 */
			// 적금 기능
			// 반환값 : 없음 <- 잔액 변경기능
			// 매개변수 : 계좌번호, 입금액
			void deposit(int accNo, long amount) {
				
			}

			/**
			 * 계좌번호, 이체금액, 비밀번호, 상대방계좌번호를 전달받아서 이체금액만큼 이체한다.
			 * @param accNo
			 * @param amount
			 * @param password
			 * @param otherAccNo
			 */
			// 이체 기능
			// 반환값 : 없음 <- 잔액 변경기능
			// 매개변수 : 계좌번호, 이체금액, 비밀번호, 수신측계좌번호
			void transaction(int accNo, long amount, int password, int otherAccNo) {
				
			}
			
			/**
			 * 계좌번호, 비밀번호를 전달받아서 해당계좌의 해지환급금액을 알려준다.
			 * @param accNo 계좌번호
			 * @param password 계좌비밀번호
			 * @return 해지 시 환급예상금액
			 */
			// 해지금액 조회 기능
			// 반환값 : 있음 <- 조회 기능
			// 매개변수 : 계좌번호, 비밀번호
			int getCancelBalance(int accNo, int password) {
				return 0;
				
			}
		}
