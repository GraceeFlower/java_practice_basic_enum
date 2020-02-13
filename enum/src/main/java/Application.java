public class Application {

  public static void main(String[] args) {
      filterFemale();
  }

  public static void filterFemale() {
      for (Student i: Student.values()) {
          if (i.filterSex(i.getSex())) {
              System.out.println(i.getName());
          }
      }
  }
}
