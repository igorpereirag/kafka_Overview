package igor.projects.messaging_kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class HelloProduce{
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;




    public void sendMessage(String message){
        kafkaTemplate.send("hello", message);
    }



    




    
}