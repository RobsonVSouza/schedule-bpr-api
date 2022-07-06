package com.rd.bpr.domain.player.dto;

import javax.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PlayerDto {

    private Long id;

    private String name;

    private Integer age;

    private String document;

    private String phone;

    private String email;

}
