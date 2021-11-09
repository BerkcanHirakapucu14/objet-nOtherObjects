package objet›nOtherObjects;

 public class Person {
   private int id;
   private String nickName;
   private String name;
   private String surname;
   private String gender;
 public Person() {
	super();
}
   public Person(int id, String nickName, String name, String surname, String gender) {
	   super();
	   this.id = id;
	   this.nickName = nickName;
	   this.name = name;
	   this.surname = surname;
	   this.gender = gender;
}
   public int getId() {
	   return id;
}
   public void setId(int id) {
	   this.id = id;
}
   public String getNickName() {
	   return nickName;
}
   public void setNickName(String nickName) {
	   this.nickName = nickName;
}
   public String getName() {
	   return name;
}
   public void setName(String name) {
	   this.name = name;
}
   public String getSurname() {
	   return surname;
}
   public void setSurname(String surname) {
	   this.surname = surname;
}
   public String getGender() {
	   return gender;
}
    public void setGender(String gender) {
	     this.gender = gender;
}

}

