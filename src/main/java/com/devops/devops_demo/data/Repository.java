package com.devops.devops_demo.data;

import com.devops.devops_demo.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Customer,Long> {
}
