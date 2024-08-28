package com.devops.devops_demo.implementations;

import com.devops.devops_demo.data.Repository;
import com.devops.devops_demo.dto.request.RegisterRequest;
import com.devops.devops_demo.dto.response.RegisterResponse;
import com.devops.devops_demo.interfaces.UserService;
import com.devops.devops_demo.models.Customer;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DemoUserService implements UserService {
    @Autowired
    public DemoUserService(ModelMapper modelMapper,Repository repository){
        repo= repository;
        mapper= modelMapper;
    }
    private final ModelMapper mapper;
    private final Repository repo;
    @Override
    public RegisterResponse register(RegisterRequest request) {
        var customer = mapper.map(request, Customer.class);
        customer = repo.save(customer);
        return mapper.map(customer, RegisterResponse.class);
    }
}
