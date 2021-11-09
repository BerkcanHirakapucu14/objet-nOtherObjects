package objet›nOtherObjects;

public class PersonShare {
    private int id;
    private Person person;
    private String caption;
    private String content;
	public PersonShare() {
		super();
	}
	public PersonShare(int id, Person person, String caption, String content) {
		super();
		this.id = id;
		this.person = person;
		this.caption = caption;
		this.content = content;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
