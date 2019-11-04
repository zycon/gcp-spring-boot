/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adfolks.demo.controller;

import com.adfolks.demo.dto.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Sachu
 */
@RestController
@RequestMapping("/api/")
public class UserController {

    @PostMapping("/addUser")
    public void addUser(UserDetails user) {
        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
        System.out.println(user.getAge());
    }

}
