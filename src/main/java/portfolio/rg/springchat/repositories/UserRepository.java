package portfolio.rg.springchat.repositories;

import org.springframework.data.repository.CrudRepository;
import portfolio.rg.springchat.users.User;

public interface UserRepository extends CrudRepository<User,Long> {
    boolean existsUserByUsername(String username);
}
