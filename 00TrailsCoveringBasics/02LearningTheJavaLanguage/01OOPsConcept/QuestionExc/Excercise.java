/*
    Create new classes for each real-world object that you observed at the
    beginning of this trail. Refer to the Bicycle class if you forget the
    required syntax.
 */

class Main{
    public static void main(String[] args) {
        CarensPublic c = new CarensPublic("St Carens Public School", 10233);
        System.out.println(c.getSchoolName());
    }
}

interface School{
    String getSchoolName();
}

class PatnaCentralSchool implements School{
    public String schoolName;
    public int countOfStudents;

    @java.lang.Override
    public String getSchoolName() {
        return schoolName;
    }

    public PatnaCentralSchool(String schoolName, int countOfStudents) {
        this.schoolName = schoolName;
        this.countOfStudents = countOfStudents;
    }
}

class CarensPublic implements School{
    public String schoolName;
    public int countOfStudents;

    @java.lang.Override
    public String getSchoolName() {
        return schoolName;
    }

    public CarensPublic(String schoolName, int countOfStudents) {
        this.schoolName = schoolName;
        this.countOfStudents = countOfStudents;
    }
}