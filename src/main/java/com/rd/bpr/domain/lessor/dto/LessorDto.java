package com.rd.bpr.domain.lessor.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LessorDto {

    private Long id;

    private String name;

    private String document;

    private String phone;

    private String email;

}
