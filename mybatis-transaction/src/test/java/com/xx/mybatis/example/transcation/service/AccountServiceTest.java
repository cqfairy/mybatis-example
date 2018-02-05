package com.xx.mybatis.example.transcation.service;

import com.xx.common.entity.Account;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/*
 * Copyright (c) 天畅伟业科技有限公司 2017
 * 本著作物的著作权归天畅伟业有限公司所有。
 * -----------------------------------------------
 * 修改记录 :
 * 日 期          版本          修改人         修改内容
 *
 */public class AccountServiceTest {
    @Test
    public void findById2() throws Exception {

        ApplicationContext context =  new ClassPathXmlApplicationContext("classpath:spring/spring-context.xml");
        AccountService accountService = (AccountService)context.getBean("accountService");
        Account zhangsan = accountService.findById2(1);
        System.out.println(zhangsan);
        System.out.println(zhangsan.getId());
        System.out.println(zhangsan.getName());
        System.out.println(zhangsan.getPassword());
        System.out.println(zhangsan.getStatus().getText());
        System.out.println(zhangsan.getUserInfo());
    }

    @Test
    public void save() throws Exception {
        ApplicationContext context =  new ClassPathXmlApplicationContext("classpath:spring/spring-context.xml");
        AccountService accountService = (AccountService)context.getBean("accountService");
        Account account = new Account();
        account.setName("张三");
        account.setPassword("123");
        account.setStatus(Account.Status.normal);
        accountService.save(account);
        System.out.println(account.getId());

    }

    @Test
    public void find() throws Exception {
        ApplicationContext context =  new ClassPathXmlApplicationContext("classpath:spring/spring-context.xml");
        AccountService accountService = (AccountService)context.getBean("accountService");
        Account zhangsan = accountService.findById(1);
        System.out.println(zhangsan);
        System.out.println(zhangsan.getId());
        System.out.println(zhangsan.getName());
        System.out.println(zhangsan.getPassword());
        System.out.println(zhangsan.getStatus());
        System.out.println(zhangsan.getUserInfo());

    }

    @Test
    public void findMap() throws Exception {
        ApplicationContext context =  new ClassPathXmlApplicationContext("classpath:spring/spring-context.xml");
        AccountService accountService = (AccountService)context.getBean("accountService");
        Map zhangsan = accountService.findMapById(1);
        System.out.println(zhangsan);

//        Account.Status [] statuses = Account.Status.values();
//        int statusLen = statuses.length;
//        for (int i = 0 ; i < statusLen ; i++) {
//            System.out.println(statuses[i].getText());
//        }



    }

}