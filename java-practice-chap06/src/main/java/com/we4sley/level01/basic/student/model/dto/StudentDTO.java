package com.we4sley.level01.basic.student.model.dto;

public class StudentDTO {

    private int grade;
    private int classroom;
    private String name;
    private int kor;
    private int eng;
    private int math;

    public StudentDTO() {
    }

    public StudentDTO(int grade, int classroom, String name, int kor, int eng, int math) {
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int getAvg() {
        return (this.kor + this.eng + this.math) / 3;
    }

    public String getInformation() {
        return "학년=" + grade + ", 반=" + classroom + ", 이름=" + name
                + ", 국어=" + kor + ", 영어=" + eng + ", 수학=" + math + ", 평균=" + getAvg();
    }
}
