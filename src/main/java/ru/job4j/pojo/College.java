package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setLastFirstPatronomic("Благов Александр Алексеевич");
        student.setGroup("Стажер");
        student.setDate("23.10.23");

        System.out.println(student.getLastFirstPatronomic() + ", группа "
                 + student.getGroup() + ", дата поступления: " + student.getDate());
    }
}
