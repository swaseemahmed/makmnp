package war.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import war.model.Sample;

public interface SampleRepository extends JpaRepository<Sample, Long> {

}
