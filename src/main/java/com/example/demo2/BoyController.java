package com.example.demo2;

import com.example.pojo.Boy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/6/10 16:16
 **/
@RestController
public class BoyController {
    @Autowired
    private BoyService boyService;
    @Autowired
    private BoyRepository boyRepository;
    //查询全部
    @GetMapping("/selectboy")
    public List<Boy> findAll(){
        return boyRepository.findAll();
    }
    //插入
    @PostMapping("/insertboy")
    public Boy addBoy(@RequestParam("name")String name,@RequestParam("sex")String sex){
        Boy boy = new Boy();
        boy.setName(name);
        boy.setSex(sex);

        return boyRepository.save(boy);
    }
    //根据Id查找
    @GetMapping("/selectone/{id}")
    public Optional<Boy> findOne(@PathVariable("id")int id){
        Optional<Boy> boy = boyRepository.findById(id);
        return boy;
    }
    //根据id删除一个
    @DeleteMapping("/deleteone/{id}")
    public String deleteOne(@PathVariable("id")int id){
        boyRepository.deleteById(id);
        return "删除成功";
    }
    //更新一个用户
    @PutMapping("/updateone/{id}")
    public Boy updateOne(@PathVariable("id")int id,@RequestParam("name")String name
    ,@RequestParam("sex")String sex){
        Boy boy = new Boy();
        boy.setId(id);
        boy.setSex(sex);
        boy.setName(name);
      return boyRepository.save(boy);
    }
    //根据性别查询
    @GetMapping("findBySex")
    public List<Boy> findBySex(@RequestParam("sex")String sex){
        return boyRepository.findBySex(sex);
    }

    //事务
    @GetMapping("/more")
    public void saveMore(){
        boyService.saveMore();
    }
}
