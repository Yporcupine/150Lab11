
/**
 * class for one student
 *
 * @author Harry Zhu
 * @version 4/25/2020
 */
public class Student
{
    // instance variables - replace the example below with your own
    private String firstName;
    private String lastName;
    private String studentID;


    public Student(String ID){
      this("a", "a", ID);
    }
    /**
     * Constructor for objects of class Student
     */
    public Student(String firstName, String lastName, String studentID)
    {
      this.firstName = firstName;
      this.lastName = lastName;
      this.studentID = studentID;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int hashCode()
    {
      return studentID.hashCode();
    }

    public String getStudentID()
    {
      return studentID;
    }

    public String getName(){
      return firstName + " " + lastName;
    }

    public boolean equals(Student e){
      if (studentID.equals(e.getStudentID())) return true;
      else return false;
    }

    public String toString(){
      return getName() + " " + getStudentID();
    }

}
