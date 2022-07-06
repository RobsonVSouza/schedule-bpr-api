package com.rd.bpr.domain.lessor;

import com.rd.bpr.domain.lessor.dto.LessorDto;
import java.util.List;
import java.util.Optional;
import javax.persistence.EntityExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LessorService {

    @Autowired
    private static LessorRepository repository;

    @Autowired
    private static LessorMapper mapper;



    public LessorDto save(LessorDto dto) {
        Lessor lessorEntity = repository.findByDocument(dto.getDocument());
        if(lessorEntity != null) {
            throw new EntityExistsException("O locador ja existe!");
        }

        return mapper.toDto(repository.save(mapper.toEntity(dto)));
    }

    // Update
    public LessorDto update(LessorDto dto) {
        Lessor lessorEntity = repository.findByDocument(dto.getDocument());
        if (lessorEntity == null ){
            throw new EntityExistsException("O locador não existe");
        }
        return mapper.toDto(repository.save(mapper.toEntity(dto)));
    }

    // getById

    public Optional <LessorDto> findById(Long id){
        Lessor lessorEntity = repository.findByDocument();
        if()
        return mapper.toDto(repository.findById(id));
    }



    //GetAll

    public List<LessorDto> getAll(){
        return mapper.toDto(repository.findAll());
    }



    //DeleteById
}
