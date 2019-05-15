package com.kurnianto.dao;

import com.kurnianto.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class FakeStudentDaoImpl implements StudentDao {

    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>(){
            {
                put(1, new Student(1, "Paul", "Chemistry"));
                put(2, new Student(2, "Bangun", "Math"));
                put(3, new Student(3, "Kurnia", "Computer"));
            }
        };
    }

    @Override
    public Collection<Student> getAllStudents()
    {
        return this.students.values();
    }

    @Override
    public Student getStudentById(int id)
    {
        return this.students.get(id);
    }

    @Override
    public void removeStudentById(int id) {
        this.students.remove(id);
    }

    @Override
    public void updateStudent(Student student)
    {
        Student s = students.get(student.getId());
        s.setName(student.getName());
        s.setCourse(student.getCourse());
        students.put(student.getId(), student);
    }

    @Override
    public void insertStudentToDB(Student student) {
        students.put(student.getId(), student);
    }
}
