import java.util.*;
/**
* Write a description of class ExperimentController here.
*
* @author (your name)
* @version (a version number or a date)
*/
public class ExperimentController
{
  // instance variables - replace the example below with your own
  public MyHashTable experiment;
  public ArrayList<Student> students;
  public String[] ids;


  /**
  * An example of a method - replace this comment with your own
  *
  * @param  y  a sample parameter for a method
  * @return    the sum of x and y
  */
  public long timeInsert(int NumberOfItems, int seed, int HashTableSize)
  {
    Random random = new Random(seed);
    experiment = new MyHashTable(HashTableSize);
    ids = new int[NumberOfItems];
    for (int i = 0; i<NumberOfItems; i++) {
      int id = random.nextInt();
      students.add(new Student(id));
      ids[i] = Integer.toString(id);
    }
    long startTime = System.currentTimeMillis();
    for (int i = 0; i<NumberOfItems; i++) {
      experiment.insertStudent(students.get(i));
    }
    long endTime = System.currentTimeMillis();
    return endTime - startTime;
  }

  public long timeFind(int[] arrayOfIds, MyHashTable hashTable){

  }
}
