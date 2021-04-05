package day5;

public class Contact {
	
	int no;
	String name;
	String email;
	String phone;
	
	//public으로 갖다쓰라고 public
	
	public Contact() {}
	
	public Contact(int no, String name, String email, String phone) {
		this.no = no;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
}
