
package igor.projects.messaging_kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
 public class HelloConsumer {

@KafkaListener(topics = "hello", groupId = "group-1")
public void receiveMessage(String message) {    
    System.out.println("comsumer message: " + message);



}

 }