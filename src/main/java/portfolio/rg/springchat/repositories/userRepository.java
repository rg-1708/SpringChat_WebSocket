package portfolio.rg.springchat.repositories;

import org.springframework.data.repository.CrudRepository;
import portfolio.rg.springchat.users.User;

public interface userRepository extends CrudRepository<User,Long> {
}
