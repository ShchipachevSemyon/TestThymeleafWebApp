package testthymeleafwebapp3.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import testthymeleafwebapp3.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
