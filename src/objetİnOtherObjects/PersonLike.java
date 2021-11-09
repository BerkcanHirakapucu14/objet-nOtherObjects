package objet›nOtherObjects;

public class PersonLike {
	private int id;
    private PersonShare personShare;
    private Person person;
    public PersonLike() {
		super();
	
	}
	public PersonLike(int id, PersonShare personShare, Person person) {
		super();
		this.id = id;
		this.personShare = personShare;
		this.person = person;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public PersonShare getPersonShare() {
		return personShare;
	}
	public void setPersonShare(PersonShare personShare) {
		this.personShare = personShare;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
}
