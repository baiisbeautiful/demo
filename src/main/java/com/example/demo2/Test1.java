package com.example.demo2;

import com.example.pojo.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/6/10 13:29
 **/
@RestController
public class Test1 {
    @Value("${cupSize}")
    private String cupSize;

    @Value("${name}")
    private String name;
    @Value("${age}")
    private String age;

    @Autowired
    private Girl girl;

    @RequestMapping(value = {"/hi"},method = RequestMethod.GET)
    public String say(@RequestParam("id") String id){
//        return "亲爱的"+name+"同学,虽然你的你年龄只有"+age+"岁，但是你的罩杯却是"+cupSize;
//        return girl.toString();
        System.out.println(id.toString());
        return id.toString();
    }


}
