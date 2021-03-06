package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("select case when count (s) > 0 then true else false end from Student s where s.email = ?1")
    Boolean selectExistsEmail(String email);
}
