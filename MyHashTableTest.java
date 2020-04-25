

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
* The test class MyHashTableTest.
*
* @author  (your name)
* @version (a version number or a date)
*/
public class MyHashTableTest
{
  /**
  * Default constructor for test class MyHashTableTest
  */
  public MyHashTableTest()
  {
  }

  /**
  * Sets up the test fixture.
  *
  * Called before every test case method.
  */
  @Before
  public void setUp()
  {
  }

  /**
  * Tears down the test fixture.
  *
  * Called after every test case method.
  */
  @After
  public void tearDown()
  {
  }

  @Test
  public void insertStudentTest(){
    MyHashTable test = new MyHashTable(10);
    String ID = "L12";
    int index = ID.hashCode()%10;
    Student one = new Student("Harry", "Zhu", ID);
    test.insertStudent(one);
    assertFalse(test.insertStudent(one));
  }

  @Test
  public void getStudentTest(){
    MyHashTable test = new MyHashTable(10);
    String ID = "L12";
    Student one = new Student("Harry", "Zhu", ID);
    test.insertStudent(one);

    Student result = test.getStudent(ID);
    String expected = "Harry Zhu L12";

    assertEquals(result.toString(), expected);
  }

  @Test
  public void removeStudentTest(){
    MyHashTable test = new MyHashTable(10);
    String ID = "L12";
    Student one = new Student("Harry", "Zhu", ID);
    test.insertStudent(one);

    Student result = test.removeStudent(ID);
    String expected = "Harry Zhu L12";

    assertEquals(result.toString(), expected);
  }
}
