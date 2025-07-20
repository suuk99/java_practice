package student;

public class Student {
  private String name;
  private int age;
  private int grade;

  public Student(String name, int age, int grade) {
    setName(name);
    setAge(age);
    setGrade(grade);
  }

  public void setName(String name) {
    if (name.isEmpty()) {
      System.out.println("이름을 입력해야 합니다.");
    }
    this.name = name;
  }
  public String getName() {
    return name;
  }

  public void setAge(int age) {
    if (age < 0) {
      System.out.println("나이는 0이상이어야 합니다.");
    }
    this.age = age;
  }
  public int getAge () {
    return age;
  }

  public void setGrade(int grade) {
    if (grade < 0 || grade > 6) {
      System.out.println("학년은 1이상 6이하여야 합니다.");
    }
    this.grade = grade;
  }
  public int getGrade() {
    return grade;
  }

}