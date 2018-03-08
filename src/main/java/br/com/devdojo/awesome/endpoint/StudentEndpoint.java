package br.com.devdojo.awesome.endpoint;


import br.com.devdojo.awesome.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import util.DateUtil;

import java.time.LocalDateTime;
import java.util.List;

import static java.util.Arrays.asList;

@RestController
@RequestMapping("student")

public class StudentEndpoint {

    @Autowired
    private DateUtil dateUtil;

    @RequestMapping(method = RequestMethod.GET, path = "/list")

    public List<Student> listAll() {
        System.out.println(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        String name;
        return asList(new Student( name = "Deku"), new Student( name ="Todoroki"));

    }

}