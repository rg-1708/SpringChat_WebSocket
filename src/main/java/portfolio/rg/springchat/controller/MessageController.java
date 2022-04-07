package portfolio.rg.springchat.controller;


import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.web.bind.annotation.RestController;
import portfolio.rg.springchat.model.Message;

@RestController
public class MessageController {

    @MessageMapping("/chat/{toUser}")
    public void sendMessage(@DestinationVariable String toUser, Message message) {
        System.out.println("handling to "); //For Dev purposes only

    }
}
