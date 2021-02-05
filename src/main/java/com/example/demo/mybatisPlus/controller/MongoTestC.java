//package com.example.demo.mybatisPlus.controller;
//
//import com.example.demo.common.bean.Response;
//import com.example.demo.mybatisPlus.model.entity.User;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.data.mongodb.core.MongoTemplate;
//import org.springframework.data.mongodb.core.query.Criteria;
//import org.springframework.data.mongodb.core.query.Query;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.annotation.Resource;
//import java.util.List;
//
///**
// * @author jieliu
// */
//@Slf4j
//@RestController
//@RequestMapping("mongo")
//public class MongoTestC {
//
//    @Resource
//    private MongoTemplate mongoTemplate;
//
//    @GetMapping(value="/test1")
//    public void saveTest(){
//        User user = new User();
//        user.setId(0L);
//        user.setName("dede");
//        user.setAge(0);
//        user.setEmail("ewee");
//        mongoTemplate.insert(user,"log");
//    }
//
//    @GetMapping(value="/test2")
//    public Response findTestByName(){
//        Query query = Query.query(Criteria.where("name").is("dede"));
//        List<User> test = mongoTemplate.find(query, User.class, "log");
//        log.info("user：信息，{}",test);
//        return Response.success(test);
//    }
//
//}