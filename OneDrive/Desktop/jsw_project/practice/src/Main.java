import student.Student;
import java.util.ArrayList;
class Main{
  public static void main(String[] args) {

    ArrayList<Student> st = new ArrayList<> ();

    st.add(new Student("장성욱", 25,2));
    st.add(new Student("홍길동", 22,1));

    for (Student s : st) {
      System.out.println("이름 :" + s.getName());
      System.out.println("나이 :" + s.getAge());
      System.out.println("학년 :" + s.getGrade());
      System.out.println();
    }
  }
}