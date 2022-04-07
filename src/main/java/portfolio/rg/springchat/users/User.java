package portfolio.rg.springchat.users;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }
}
