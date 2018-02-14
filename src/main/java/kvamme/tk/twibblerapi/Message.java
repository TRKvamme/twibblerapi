package kvamme.tk.twibblerapi;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Message {

    @Id
    @GeneratedValue
    private Long id;
    private String sender;
    private String message;

    public Message() { }

    public Message(String sender, String message) {
        this.message = message;
        this.sender = sender;
    }
}
