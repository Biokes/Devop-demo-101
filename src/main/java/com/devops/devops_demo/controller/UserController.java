package com.devops.devops_demo.controller;

import com.devops.devops_demo.dto.request.RegisterRequest;
import com.devops.devops_demo.dto.response.ApiResponse;
import com.devops.devops_demo.dto.response.RegisterResponse;
import com.devops.devops_demo.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/v1/customer/")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("register")
    public ResponseEntity<?> register(@RequestBody RegisterRequest request){
        return ResponseEntity.status(200).body(new ApiResponse(LocalDateTime.now(),userService.register(request),true));
    }
}
