package com.xx.mybatis.example.cache.service;

import com.xx.common.entity.UserInfo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class UserInfoServiceTest {
    @Test
    public void findUserById1() throws Exception {

    }

    @Test
    public void findUserById() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring-context.xml");
        UserInfoService userInfoService = (UserInfoService) context.getBean("userInfoService");
        UserInfo userInfo = userInfoService.findUserById(1);
        System.out.println(userInfo);
        UserInfo userInfo2 = userInfoService.findUserById(2);
        System.out.println(userInfo2);
        UserInfo userInfo3 = userInfoService.findUserById(1);
        System.out.println(userInfo3);
        UserInfo userInfo4 = userInfoService.findUserById(1);
        System.out.println(userInfo4);
        UserInfo userInfo5 = userInfoService.findUserById(1);
        System.out.println(userInfo5);
        UserInfo userInfo6 = userInfoService.findUserById(1);
        System.out.println(userInfo6);
        UserInfo userInfo7 = userInfoService.findUserById(1);
        System.out.println(userInfo7);
        UserInfo userInfo8 = userInfoService.findUserById(1);
        System.out.println(userInfo8);
    }

    @Test
    public void findUserById2() throws Exception {
    }

    @Test
    public void save() throws Exception {
    }

    @Test
    public void saveUserInfo() throws Exception {
    }

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