package oopIntro;

public class Category{
  private int id;
  private String name;
  
  public Category() {
	  
  }
  
  public Category(int id, String name) {
	this.id = id;
	this.name = name;
}

public int getId() {
	  return this.id;
  }
  
  public void setId(int id) { //void -> bir �ey d�nd�rmiycem, bir �ey yap�cam demek.
	  this.id = id;          // this.id -> classtaki id,  id---> parametre olarak verilen id.
  }
  
  public String getName() {
	  return this.name + "!";
  }
  
  public void setName(String name) {
	  this.name = name;
  }
}