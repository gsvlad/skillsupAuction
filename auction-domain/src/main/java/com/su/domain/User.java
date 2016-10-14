package com.su.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String login;

    private String fName;
    private String lName;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.PERSIST)
    private List<Lot> lots;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", lotsCount=" + lots.size() +
                '}';
    }
}