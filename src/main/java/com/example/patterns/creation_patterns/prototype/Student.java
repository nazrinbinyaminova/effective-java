package com.example.patterns.creation_patterns.prototype;

public class Student implements Cloneable {
    private String name;
    private Integer age;
    private Integer grade;
    private StudentType studentType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public StudentType getStudentType() {
        return studentType;
    }

    public void setStudentType(StudentType studentType) {
        this.studentType = studentType;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", studentType=" + studentType +
                '}';
    }

//    /**
//     * shallow clone
//     */
//    @Override
//    protected Student clone() {
//        try {
//            return  (Student) super.clone();
//        } catch (CloneNotSupportedException e) {
//            throw new RuntimeException(e);
//        }
//    }


    /**
     * deep clone
     * @return
     */
    @Override
    protected Student clone() {
        try {
            Student student = (Student) super.clone();
            student.setStudentType(student.getStudentType().clone());
            return student;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
