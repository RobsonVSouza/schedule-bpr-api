package com.rd.bpr.domain.lessor;

import com.rd.bpr.domain.lessor.dto.LessorDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class LessorMapper {

    public abstract LessorDto toDto(Lessor entity);

    public abstract Lessor toEntity(LessorDto dto);

}
