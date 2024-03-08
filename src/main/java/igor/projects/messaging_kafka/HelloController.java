package igor.projects.messaging_kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class HelloController {
     @Autowired
    private HelloProduce Service;

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name){
        Service.sendMessage("hello, " + name);
        return "ok";


    }    

}
