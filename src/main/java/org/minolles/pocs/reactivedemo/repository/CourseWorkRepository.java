package org.minolles.pocs.reactivedemo.repository;

import org.minolles.pocs.reactivedemo.model.CourseWork;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import reactor.core.publisher.Mono;

@Repository
public interface CourseWorkRepository extends ReactiveCrudRepository<CourseWork, Long> {
    Mono<Void> deleteByStudentID(Long studentID);
}