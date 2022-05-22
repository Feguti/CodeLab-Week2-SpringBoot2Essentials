package springboot.feguti.springboot2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.feguti.springboot2.domain.FeGutiUser;

public interface FeGutiUserRepository extends JpaRepository<FeGutiUser, Long> {

    FeGutiUser findByUsername(String username);
}