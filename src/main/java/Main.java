public class Main {

    public static Student student;
    public static University university;

    public static void main(String[] args) {
        university = new University(
                "1234",
                "Лучший университет великих Римлян",
                "ЛУВР",
                1992,
                StudyProfile.ENGINEER
        );
        student = new Student("Ваня", university.getId(), 1, (float) 120.3);

        System.out.println(student);
        System.out.println(university);
    }
}
