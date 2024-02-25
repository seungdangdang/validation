package com.example.validation.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import java.util.List;

public class User {

    @NotBlank
    private String name;
    @Max(value = 100, message = "나이가 안맞음")
    private int age;
//    @Email
//    private String email;
//    @Pattern(regexp = "^\\d{2,3}-\\d{3,4}-\\d{4}$", message = "핸드폰 양식과 안맞음")
//    private String phoneNumber;
//    @YearMonth()
//    private String reqYearMonth; //yyyymm

    private List<Car> cars;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
