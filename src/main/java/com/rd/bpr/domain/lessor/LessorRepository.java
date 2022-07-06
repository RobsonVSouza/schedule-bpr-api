package com.rd.bpr.domain.lessor;


import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessorRepository extends JpaRepository <Lessor, Long> {

    Lessor findByDocument(String document);


}
