package com.miljen.demo.javacro2022.repository;

import com.miljen.demo.javacro2022.model.Predavanje;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface PredavanjeRepository extends CrudRepository<Predavanje, String> {
}
