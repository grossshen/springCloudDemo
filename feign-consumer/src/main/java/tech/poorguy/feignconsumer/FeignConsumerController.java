package tech.poorguy.feignconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author poorguy
 * @version 0.0.1
 * @E-mail 494939649@qq.com
 * @created 2019/2/22
 */
@RestController
public class FeignConsumerController {
    @Autowired
    HelloService helloService;
    @RequestMapping("/hello")
    public String hello(){
        return helloService.hello();
    }
}
