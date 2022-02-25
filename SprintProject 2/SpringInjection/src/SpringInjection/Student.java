package SpringInjection;

public class Student {
private int id;
private String name;
public Student(int id) {
	this.id=id;
}


public Student(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}


public void displayinfo()
   {
	   System.out.println("Display is name:"+ name +  " student id is: " + id);
   }






}
