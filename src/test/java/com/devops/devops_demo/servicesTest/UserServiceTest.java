package com.devops.devops_demo.servicesTest;

import com.devops.devops_demo.dto.request.RegisterRequest;
import com.devops.devops_demo.interfaces.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@TestPropertySource(properties = {
        "DATABASE_URL=jdbc:postgresql://localhost:5432/devops_demo",
        "DATABASE_USERNAME=postgres",
        "DATABASE_PASSWORD=password"
})public class UserServiceTest {
    @Autowired
    private UserService userService;
    @Test
    void testUserCanRegister(){
        RegisterRequest request =
                new RegisterRequest("username","password");
        var response = userService.register(request);
        assertNotNull(response);
    }
}
