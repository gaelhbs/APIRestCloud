package dio.com.apirestcloud.service;
import dio.com.apirestcloud.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}