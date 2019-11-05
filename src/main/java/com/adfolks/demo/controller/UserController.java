/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adfolks.demo.controller;

import com.adfolks.demo.dto.UserDetails;
import io.swagger.models.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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

    @PostMapping("/add-user")
    @GetMapping("/add-user")
    public ResponseEntity<UserDetails> addUser(UserDetails user) {
        return ResponseEntity.ok(user);
    }

}
