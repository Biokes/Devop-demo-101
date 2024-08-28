package com.devops.devops_demo.interfaces;

import com.devops.devops_demo.dto.request.RegisterRequest;
import com.devops.devops_demo.dto.response.RegisterResponse;

public interface UserService {
    RegisterResponse register(RegisterRequest request);
}
