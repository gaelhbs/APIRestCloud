package dio.com.apirestcloud.domain.repository;

import dio.com.apirestcloud.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    boolean existByAccountNumber(String accountNumber);
}
