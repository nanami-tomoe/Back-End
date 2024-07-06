package edu.allinone.sugang.repository;

import edu.allinone.sugang.domain.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LectureRepository extends JpaRepository<Lecture, Integer> {
    List<Lecture> findByDepartmentId(Integer departmentId);
}
