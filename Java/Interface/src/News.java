
public class News implements INews {
	private int ID;
	private String title;
	private String publishDate;
	private String author;
	private String content;
	private float averageRate;

	public int getID() {
		return ID;

	}

	public News() {
		super();
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public float getAverageRate() {
		return averageRate;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(title);
		System.out.println(publishDate);
		System.out.println(author);
		System.out.println(content);
		System.out.println(averageRate);

	}

	@Override
	public float calculate(int[] arrayRates) {
		// TODO Auto-generated method stub

		return (arrayRates[0] + arrayRates[1] + arrayRates[2]) / 3;
	}

}
