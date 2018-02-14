package kvamme.tk.twibblerapi;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MessageRestController {

     @Autowired
     private MessageRepository messageRepository;

    @CrossOrigin
    @RequestMapping(value = "/messages", method = RequestMethod.GET)
    public List<Message> getAllMessages() {
        List<Message> list = new ArrayList<>();
        messageRepository
                .findAll()
                .forEach(list::add);
        return list;
    }

    @CrossOrigin
    @RequestMapping(value = "/messages", method = RequestMethod.POST)
    public Message receiveMessage(@RequestBody Message message){
        return messageRepository.save(message);

    }
}
