package com.example.demo2;

import com.example.pojo.Boy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoyRepository extends JpaRepository<Boy,Integer>{
    /**
     * 通过性别查询
     * @param sex
     * @return
     */
    List<Boy> findBySex(String sex);


}
