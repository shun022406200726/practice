class Sample {

  public static void main(String[] args) {
    Student student = new Student();
    student.name = "test";
    student.setScore(70, 85);
    student.display();
    System.out.println(student.getAvg());
  }
}