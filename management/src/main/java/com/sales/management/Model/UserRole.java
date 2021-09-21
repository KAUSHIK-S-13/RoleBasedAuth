package com.sales.management.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Getter
@Setter
@Table(name="userrole")
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @OneToOne
    @JoinColumn(name = "user_id_fk")
    private User user;

    @ManyToOne
    @JoinColumn(name = "role_id_fk")
    private Role role;


}
