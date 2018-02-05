package com.xx.mybatis.example.enums.service;

import com.xx.common.entity.Account;
import com.xx.common.entity.GroupInfo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/*
 * Copyright (c) 天畅伟业科技有限公司 2017
 * 本著作物的著作权归天畅伟业有限公司所有。
 * -----------------------------------------------
 * 修改记录 :
 * 日 期          版本          修改人         修改内容
 *
 */public class GroupInfoServiceTest {
    @Test
    public void findDetailById() throws Exception {
        ApplicationContext context =  new ClassPathXmlApplicationContext("classpath:spring/spring-context.xml");
        GroupInfoService groupInfoService = (GroupInfoService)context.getBean("groupInfoService");
        GroupInfo zhangsan = groupInfoService.findDetailById(59);
//        System.out.println(zhangsan);
//        System.out.println(zhangsan.getId());
//        System.out.println(zhangsan.getName());
//        System.out.println(zhangsan.getpId());
//        System.out.println(zhangsan.getType());
//        System.out.println(zhangsan.getStatus());
//        System.out.println(zhangsan.getType().getText());
//        System.out.println(zhangsan.getStatus().getText());

        System.out.println(zhangsan);
    }

    @Test
    public void findUserById() throws Exception {
        ApplicationContext context =  new ClassPathXmlApplicationContext("classpath:spring/spring-context.xml");
        GroupInfoService groupInfoService = (GroupInfoService)context.getBean("groupInfoService");
        GroupInfo zhangsan = groupInfoService.findUserById(59);
        System.out.println(zhangsan);
        System.out.println(zhangsan.getId());
        System.out.println(zhangsan.getName());
        System.out.println(zhangsan.getpId());
        System.out.println(zhangsan.getType());
        System.out.println(zhangsan.getStatus());
        System.out.println(zhangsan.getType().getText());
        System.out.println(zhangsan.getStatus().getText());
        System.out.println(zhangsan);
    }

    @Test
    public void findUserById2() throws Exception {
    }

    @Test
    public void save() throws Exception {
        ApplicationContext context =  new ClassPathXmlApplicationContext("classpath:spring/spring-context.xml");
        GroupInfoService groupInfoService = (GroupInfoService)context.getBean("groupInfoService");
        GroupInfo groupInfo = new GroupInfo();
        groupInfo.setName("市场部");
        groupInfo.setpId(1);
        groupInfo.setType(GroupInfo.Type.normal);
        groupInfo.setStatus(GroupInfo.Status.normal);
        groupInfoService.save(groupInfo);

    }

    @Test
    public void saveGroupInfo() throws Exception {
    }

    @Test
    public void saveGroups() throws Exception {
    }

    @Test
    public void saveGroups2() throws Exception {
    }

}