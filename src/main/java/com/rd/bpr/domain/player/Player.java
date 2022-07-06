package com.rd.bpr.domain.player;

import com.rd.bpr.domain.person.Person;
import javax.persistence.Column;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Player extends Person {

    @Column
    private Integer age;



}
