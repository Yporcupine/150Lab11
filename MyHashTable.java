import java.util.*;
public class MyHashTable{

  public LinkedList<Student>[] students;
  public int size;


  public MyHashTable(int n){
    size = n;
    students = new LinkedList[n];
  }

  public boolean insertStudent(Student student){
    int index = student.hashCode()%size;
    if(students[index] == null){
      students[index] = new LinkedList<Student>();
      students[index].add(student);
      return true;
    }
    if(students[index].contains(student)) return false;
    students[index].add(student);
    return true;
  }

  public Student getStudent(String ID){
    int index = ID.hashCode()%size;
    if(students[index] == null) return null;
    Student psuedo = new Student(ID);
    for (int i = 0; i < students[index].size(); i++) {
      if(students[index].get(i).equals(psuedo))  return students[index].get(i);
    }
    return null;
  }

  public Student removeStudent(String ID){
    int index = ID.hashCode()%size;
    if(students[index] == null) return null;
    Student psuedo = new Student(ID);
    for (int i = 0; i < students[index].size(); i++) {
      if(students[index].get(i).equals(psuedo))  return students[index].remove(i);
    }
    return null;
  }

  public String toString(){
    String s = "";
    for (int i = 0; i < size; i++) {
      if(!(students[i]==null)) s += students[i].toString();
    }
    return s;
  }

}
