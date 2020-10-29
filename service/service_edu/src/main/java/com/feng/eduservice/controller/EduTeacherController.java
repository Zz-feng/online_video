package com.feng.eduservice.controller;


import com.feng.eduservice.service.EduTeacherService;
import com.feng.eduservice.entity.EduTeacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author testjava
 * @since 2020-10-27
 */
@RestController
@RequestMapping("/service_edu")
public class EduTeacherController {

    @Autowired
    private EduTeacherService eduTeacherService;

    @GetMapping("/findAll")
    public List<EduTeacher> findAllTeacher(){
        return eduTeacherService.list(null);
    }

    @DeleteMapping("remove/{id}")
    public boolean removeTeacher(@PathVariable("id") String id){
        return eduTeacherService.removeById(id);
    }
}

