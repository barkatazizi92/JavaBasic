package class24;

import java.util.HashSet;
import java.util.Set;

/*
Create a Set that will hold Object of Student type. in this set we do not care about
the insertion order. Each Students object should hava name and studentId. Display name of each student.
 */
public class Students {
    private String name;
    private int id;

  public String getName(){
      return name;
  }
  public int getId(){
      return id;
  }

    public Students(String name, int id) {
        this.name = name;
        this.id = id;
    }

}

class StudentTester {

    public static void main(String[] args) {
        Set<Students> studentsSet = new HashSet<>();
        studentsSet.add(new Students("Hamid",10));
        studentsSet.add(new Students("Jamshid", 11));
        studentsSet.add(new Students("Gul",12));


        for (Students student : studentsSet) {
            System.out.println(student.getName()+" " +student.getId());
        }
    }
}
