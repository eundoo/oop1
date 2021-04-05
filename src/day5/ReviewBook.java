package day5;

public class ReviewBook extends Object{
	
	private int no;
	private String title;
	private String writer;
	private String publisher;
	private int price;
	private boolean isSoldOut;
	private double discountRate;
	private ReviewEvent eventReview;
	private ReviewGift giftReview;
	
	public ReviewBook() {}
	
	public ReviewBook(int no, String title, String writer, String publisher,
			int price, boolean isSoldOut, double discountRate, ReviewEvent eventReview, ReviewGift giftReview) {
		super();
		this.no = no;
		this.title = title;
		this.writer = writer;
		this.publisher = publisher;
		this.price = price;
		this.isSoldOut = isSoldOut;
		this.discountRate = discountRate;
		this.eventReview = eventReview;
		this.giftReview = giftReview;
	}
	
	public ReviewBook(int no, String title, String writer, String publisher,
			int price, boolean isSoldOut, double discountRate, ReviewEvent eventReview) {
		super();
		this.no = no;
		this.title = title;
		this.writer = writer;
		this.publisher = publisher;
		this.price = price;
		this.isSoldOut = isSoldOut;
		this.discountRate = discountRate;
		this.eventReview = eventReview;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isSoldOut() {
		return isSoldOut;
	}

	public void setSoldOut(boolean isSoldOut) {
		this.isSoldOut = isSoldOut;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public ReviewEvent getEventReview() {
		return eventReview;
	}

	public void setEventReview(ReviewEvent eventReview) {
		this.eventReview = eventReview;
	}

	public ReviewGift getGiftReview() {
		return giftReview;
	}

	public void setGiftReview(ReviewGift giftReview) {
		this.giftReview = giftReview;
	}
}
