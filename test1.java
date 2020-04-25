import java.util.*;
/**
 * Write a description of class test1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class test1
{
    public static void main(String[] args) {
      LinkedList<Student> x = new LinkedList<Student>();
      Student a = new Student("12");
      Student b = new Student("Harry", "Zhu", "12");
      x.add(a);
      System.out.println(x.contains(b));
    }

}
