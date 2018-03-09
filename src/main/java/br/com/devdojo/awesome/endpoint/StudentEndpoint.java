package br.com.devdojo.awesome.endpoint;


import br.com.devdojo.awesome.error.CustomErrorType;
import br.com.devdojo.awesome.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import util.DateUtil;

import static br.com.devdojo.awesome.model.Student.studentList;

@RestController
@RequestMapping("students")

public class StudentEndpoint {

    /**
     * @author Ana Caroliny exemplo de spring boot
     */
    @Autowired

    private DateUtil dateUtil;

    @RequestMapping(method = RequestMethod.GET)

    public  ResponseEntity<?> listAll(){
       // System.out.println(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return new ResponseEntity<>(Student.studentList,HttpStatus.OK);

    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable("id") int id){
        Student student = new Student();
        student.setId(id);
        int index = studentList.indexOf(student);
        if (index == -1)
            return new ResponseEntity<>(new CustomErrorType("Student not found") , HttpStatus.NOT_FOUND);
                return new ResponseEntity<>(Student.studentList.get(index) , HttpStatus.OK);

        }
        @RequestMapping(method = RequestMethod.POST)
        public ResponseEntity<?> save(@RequestBody Student student){
            Student.studentList.add(student);
            return  new ResponseEntity<>(student,HttpStatus.OK);

        }

}