package com.graphql.demo.repo;

import com.graphql.demo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository<Person, Integer> {

}
