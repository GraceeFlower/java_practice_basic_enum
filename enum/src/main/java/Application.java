import java.util.ArrayList;

public class Application {

  public static void main(String[] args) {
      ArrayList<Student> stuList = new ArrayList<>();
      stuList.add(new Student("Linda", Gender.FEMALE));
      stuList.add(new Student("Bob", Gender.MALE));
      stuList.add(new Student("Solider", Gender.MALE));
      stuList.add(new Student("Cindy", Gender.FEMALE));

      for (Student stu: stuList) {
          if (Gender.FEMALE.filterGender(stu)) {
              System.out.println(stu.getName());
          }
      }
  }
}
