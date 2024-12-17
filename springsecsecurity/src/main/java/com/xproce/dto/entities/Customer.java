package com.xproce.dto.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="customer")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String email;
    private String pwd;
    private String role;
}
