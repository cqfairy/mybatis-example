package com.xx.mybatis.example.transcation.service;

import com.xx.common.entity.UserInfo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class UserInfoServiceTest {
    @Test
    public void saveUsers() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring-context.xml");
        UserInfoService userInfoService = (UserInfoService) context.getBean("userInfoService");
        List<UserInfo> userInfos = new ArrayList<>();
        UserInfo user1 = new UserInfo();
        user1.setName("一");
        user1.setBirthday(new Date());
        user1.setSex(UserInfo.Sex.man);
        UserInfo user2 = new UserInfo();
        user2.setName("二");
        user2.setBirthday(new Date());
        user2.setSex(UserInfo.Sex.man);
        UserInfo user3 = new UserInfo();
        user3.setName("三");
        user3.setBirthday(new Date());
        user3.setSex(UserInfo.Sex.man);
        userInfos.add(user1);
        userInfos.add(user2);
        userInfos.add(user3);
        userInfoService.saveUsers(userInfos);
    }

    @Test
    public void saveUsers2() throws Exception {
    }

}