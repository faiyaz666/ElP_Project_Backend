package com.example.coursemanagementservice.repository;

import com.example.coursemanagementservice.model.CourseEnrollmentInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CourseEnrollmentInfoRepository extends JpaRepository<CourseEnrollmentInfo, UUID> {

    List<CourseEnrollmentInfo> findByUserId(UUID userId);

    List<CourseEnrollmentInfo> findByCourseId(UUID courseId);
}