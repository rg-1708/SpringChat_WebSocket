package portfolio.rg.springchat.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RestController;
import portfolio.rg.springchat.model.Message;
import portfolio.rg.springchat.repositories.UserRepository;

@RestController
@RequiredArgsConstructor
public class MessageController {

    private final UserRepository userRepository;
    private final SimpMessagingTemplate simpMessagingTemplate;

    @MessageMapping("/chat/{toUser}")
    public void sendMessage(@DestinationVariable String toUser, Message message) {

        if(userRepository.existsUserByUsername(toUser)) {
            simpMessagingTemplate.convertAndSend("/topic/messages/"+ toUser, message);
        }
    }
}
