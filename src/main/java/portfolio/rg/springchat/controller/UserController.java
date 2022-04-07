package portfolio.rg.springchat.controller;

import lombok.RequiredArgsConstructor;
import org.assertj.core.util.Sets;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import portfolio.rg.springchat.repositories.UserRepository;
import portfolio.rg.springchat.users.User;

import java.util.Arrays;
import java.util.Set;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    //This Actually will be Post from the form, but for now, it's get with Path Variable.
    @GetMapping("/register/{username}")
    public ResponseEntity<Void> register(@PathVariable String username) {
        User newUser = new User();
        newUser.setUsername(username);
        userRepository.save(newUser);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/showAllUsers")
    public Set<User> showAllUsers() {
        return (Sets.newHashSet(userRepository.findAll()));
    }



}
