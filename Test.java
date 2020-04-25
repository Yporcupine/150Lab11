
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test
{


public static void main(String[] args) {
  MyHashTable test = new MyHashTable(10);
  String ID = "12";
  int index = ID.hashCode()%10;
  Student one = new Student("Harry", "Zhu", ID);
  Student two = new Student("Tom", "dumb", "13");
  test.insertStudent(one);
  test.insertStudent(two);
  Student result1 = test.students[index].peek();
  Student psuedo = new Student(ID);

  Student result = test.removeStudent(ID);
  String expected = "Harry Zhu 12";
  
  System.out.println(result1);
  System.out.println(result);
  System.out.println(test.getStudent(ID));
  System.out.println(test.toString());
}

}
