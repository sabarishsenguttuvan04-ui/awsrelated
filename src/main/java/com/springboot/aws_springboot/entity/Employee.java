package com.springboot.aws_springboot.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
public class Employee {
    private String name;
}
