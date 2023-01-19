import java.time.Year;

/**
 * @author 2213111129
 *
 */
public class Book {
	private String title;
	private float price;
	private int publishyear;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getPublishyear() {
		return publishyear ;
	}

	public void setPublishYear(int year) {
        this.publishyear=year;
	}
	
	public int getTotalYear() {
      return Year.now().getValue()-publishyear;
	}
	public String toString() {
		return String.format("Title: "+this.title+" published for "+this.getTotalYear()+ " year (" +this.price+ " baht).");
	}
}
