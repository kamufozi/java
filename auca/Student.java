package auca;
public class Student {
  //Attributes
  public String studentId;
  private String firstName;
  private String lastName;
  private int age;
  //Setter Methods
  public void setStudent(String studentId, String firstName, String lastName,int age ){
    this.firstName=firstName;
    this.lastName=studentId;
    this.studentId=studentId;
    this.age=age;
  }
  //Getter Method
  public void showStudent(){
    System.out.println("Student Id = "+ studentId);
    System.out.println("First Name = "+ firstName);
    System.out.println("Last Name = "+ lastName);
    System.out.println("age ="+ age);
  }
}
