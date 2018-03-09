package br.com.devdojo.awesome.model;

import java.util.ArrayList;
import java.util.List;

public class Student {

        public String name;
        public int id;
        public static ArrayList studentList;
        static {

        }

        public Student(int id String name){
             this.setId(id);
            this.setName(name);
        }

        public Student(String name){
                this.setName(name);
        }

        public Student(){

        }

        private static void studentRespository(){
                studentList = new ArrayList<>(asList(new Student(name: "Deku"), new Student(name:"Todoroki")));
        }


    public static List<Student> getStudentList() {
                return studentList;
        }

        public static void setStudentList(ArrayList studentList) {
                Student.studentList = studentList;
        }


        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }


        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }
}

