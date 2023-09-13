class Student {

  String name;
  int engScore;
  int mathScore;

  void display() {
    System.out.println(name + "san");
    System.out.println("eng：" + engScore + "p_math：" + mathScore + "p");
  }

  void setScore(int eng, int math) {
    engScore = eng;
    mathScore = math;
  }

  double getAvg() {
    double avg = ((engScore + mathScore) / 2);
    return avg;
  }

}