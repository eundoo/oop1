package day5;

public class BookApp2 {

	public static void main(String[] args) {
		Book book1 = new Book(100,"자바의 정석", "남궁성", "도우출판사", 35000, false, 0.15);
		Event event1 = new Event("동영상강의 특가", "구매고객에게 저자의 동영상 강의를 제공합니다.", "4월1일", "4월15일", false);
		Event event2 = new Event("할인이벤트", "30%할인이벤트.", "4월1일", "4월15일", false);
		Gift gift1 = new Gift("책받침",500);
		
		//Book객제와 Event객체, Book객체와 Gift객체 연결짓기
		//book이 참조하는 Book 객체의 event 멤버변수에 event이 참조하는 Event객체의 주소값을 전달한다.
		book1.setEvent(event1);
		//book1이 참조하는 Book객체의 gift 멤버변수에 gift1이 참조하는 Gift객체의 주소값을 전달한다.
		book1.setGift(gift1);
		
		//book1이 참조하는 Book객체에 연결된 Event객체의 주소값 조회하기
		Event e = book1.getEvent();
		
		//Book객체에 event1이 참조하는 Event객체가 연결되어 있는 경우 
		//event1, e, book1.getEvent() 전부 다 같은 Event객체의 주소값을 가지고 있거나, 반환한다.
		//System.out.println(event1);
		//System.out.println(e);
		//System.out.println(book1.getEvent());
		
		//Book객체에 event2이 참조하는 Event객체가 연결되어 있는 경우 
		//event2, e, book1.getEvent() 전부 다 같은 Event객체의 주소값을 가지고 있거나, 반환한다.
		//System.out.println(event2);
		//System.out.println(e);
		//System.out.println(book1.getEvent());
		
		//book1이 참조하는 Book객체에 연결된 Event객체의 정보를 출력하기
		System.out.println(e.getDescription());
		System.out.println(book1.getEvent().getDescription());
		
		//book1이 참조하는 Book이 할인이벤트 진행중인지 확인해보기
		if (book1.getEvent().getTitle().contains("할인")) {
			System.out.println("할인이벤트 진행중입니다.");
		} else {
			System.out.println("현재 할인 이벤트는 진행하지 않습니다.");
		}
		/*
		 * book1.getNo()				정수
		 * book1.getTitle();			String
		 * book1.getWriter();			String
		 * book1.getPublisher();		String
		 * book1.getPrice();			정수
		 * book1.getEvent();			Event, null
		 * book1.getGift();				Gift, null
		 * 
		 * book1.setGift(gift).getDescription(); //오류
		 * book1.setGift(gift)은 반환값이 void이기 때문에
		 * book1.getGift().setPrice(1000); //이건가능
		 * book1.getGift().setPrice(1000) > 400 //오류 왜냐면 set은 값을 반환하지 않으니까
		 * 
		 * book1.getTitle().equals("글자") ->비교할려면 이렇게 해야되고	
		 * book1.getNo() == 1			->비교할려면 이렇게 해야됨
		 * 
		 * book1.getEvent().getTitle();
		 * book1.getEvent().getDescription();
		 * book1.getEvent().getStartDate();
		 * book1.getEvent().getEndDate();
		 * 
		 * book1.getGift().getName();
		 * book1.getGift().getPrice();
		 */
	}
}
