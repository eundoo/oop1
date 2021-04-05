package day5;

public class ReviewBookApp {

	public static void main(String[] args) {
		
		ReviewBook reviewBook = new ReviewBook(1, "어린왕자", "생택쥐페리", "대일", 20000, false, 0.05, new ReviewEvent(), new ReviewGift());

		ReviewEvent e1 = new ReviewEvent("어린왕자", "소설", "4/1", "5/1", true);
		ReviewGift r1 = new ReviewGift("책갈피",4000);
		reviewBook.setEventReview(e1);
		reviewBook.setGiftReview(r1);
		
		
		ReviewBook reviewBook2 = new ReviewBook(2, "씨씨허니컷구하기", "베스호프먼", "문학동네", 20000, true, 0.03, new ReviewEvent("씨씨허니컷구하기", "소설", "5/1", "5/30", true));
		
		ReviewGift g1 = new ReviewGift("책갈피",3500);
		reviewBook2.setGiftReview(g1);
	}
}
