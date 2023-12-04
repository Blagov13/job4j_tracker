package ru.job4j.map;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class College {
    private final Map<Student, Set<Subject>> students;

    public College(Map<Student, Set<Subject>> students) {
        this.students = students;
    }

    public Optional<Student> findByAccount(String account) {
        for (Student s : students.keySet()) {
            if (s.account().equals(account)) {
                return Optional.of(s);
            }
        }
        return Optional.empty();
    }

    public Optional<Subject> findBySubjectName(String account, String name) {
        Optional<Student> a = findByAccount(account);
        if (a.isPresent()) {
            Set<Subject> subjects = students.get(a.get());
            for (Subject s : subjects) {
                if (s.name().equals(name)) {
                    return Optional.of(s);
                }
            }
            return Optional.empty();
        }
        return Optional.empty();
    }

}
