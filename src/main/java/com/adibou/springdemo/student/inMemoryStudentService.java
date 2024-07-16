package com.adibou.springdemo.student;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class inMemoryStudentService implements StudentService{

    private final inMemoryStudentDAO studentDAO;

    public inMemoryStudentService(inMemoryStudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }


    @Override
    public Student save(Student s) {
        return studentDAO.save(s);
    }
    @Override
    public Student findByEmail(String email) {
        return studentDAO.findByEmail(email);
    }

    @Override
    public void delete(String email) {
        studentDAO.delete(email);
    }

    @Override
    public Student studentUpdate(Student student) {
        return studentDAO.studentUpdate(student);
    }

    @Override
    public List<Student> findAllStudent() {
        return studentDAO.findAllStudent();
    }


}
