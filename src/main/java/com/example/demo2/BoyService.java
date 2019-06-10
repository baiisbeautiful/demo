package com.example.demo2;

import com.example.pojo.Boy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/6/10 17:25
 **/
@Service
public class BoyService {
    @Autowired
    private BoyRepository boyRepository;
    @Transactional
    public void saveMore(){
        Boy boy = new Boy();
        boy.setId(5);
        boy.setName("闻人初阳");
        boy.setSex("男");

        boyRepository.save(boy);

//
//        Boy boy1 = new Boy();
//        boy1.setId(8);
//        boy1.setName("万俟德厚");
//        boy1.setSex("男asdasdasdasdasdasadasd");
//        boyRepository.save(boy1);
    }
}
