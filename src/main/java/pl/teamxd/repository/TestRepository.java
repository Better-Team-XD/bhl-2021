package pl.teamxd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.teamxd.model.TestEntity;

public interface TestRepository extends JpaRepository<TestEntity, Long> {
}
