package com.example.coursemanagementservice.repository;

import com.example.coursemanagementservice.model.CourseContent;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CourseContentRepository extends JpaRepository<CourseContent, UUID> {

    //    List<CourseContent> findAllBy(PageRequest pageable);
    List<CourseContent> findByCourseId(UUID courseId, PageRequest pageable);

    CourseContent findByContentId(UUID contentId);
}