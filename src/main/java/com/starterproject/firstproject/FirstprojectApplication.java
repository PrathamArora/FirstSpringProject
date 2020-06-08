package com.starterproject.firstproject;

import com.starterproject.firstproject.models.User;
import com.starterproject.firstproject.utils.Constants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstprojectApplication.class, args);

        User user = new User("Pratham", Constants.Gender.MALE);
        System.out.println(user.getName());
    }

}
