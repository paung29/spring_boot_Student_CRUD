package com.adibou.springdemo.student;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class inMemoryStudentDAO {

    private final List<Student> STUDENT = new ArrayList<>();


    public Student save(Student s) {
        STUDENT.add(s);
        return s;
    }

    public Student findByEmail(String email) {
        var lowerEmail = email.toLowerCase();
        for(var student:STUDENT){
            if(student.getEmail().equalsIgnoreCase(lowerEmail)){
                return student;
            }
        }
        return null;
    }


    public void delete(String email) {
        var result = findByEmail(email);
        if(null != result){
            STUDENT.remove(result);
        }
    }




    public Student studentUpdate(Student student) {
        var existStudent = findByEmail(student.getEmail());

        int index = -1;
        for(int i = 0;i < STUDENT.size();i++){
            if(STUDENT.get(i).getEmail().equalsIgnoreCase(student.getEmail())){
                index = i;
                break;
            }
        }


        if(null!= existStudent){
            STUDENT.set(index,student);
        }
        return null;
    }


    public List<Student> findAllStudent() {
        return STUDENT;
    }

}
