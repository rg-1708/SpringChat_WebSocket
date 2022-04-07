package portfolio.rg.springchat.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import portfolio.rg.springchat.repositories.UserRepository;
import portfolio.rg.springchat.users.User;

import javax.annotation.PostConstruct;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @PostConstruct
    void initSomeUsers() {
        User user1 = new User();
        user1.setUsername("user1");

        User user2 = new User();
        user1.setUsername("user2");

        userRepository.save(user1);
        userRepository.save(user2);
    }
}
