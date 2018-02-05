/*
 * Copyright (c) 天畅伟业科技有限公司 2017
 * 本著作物的著作权归天畅伟业有限公司所有。
 * -----------------------------------------------
 * 修改记录 :
 * 日 期          版本          修改人         修改内容
 *
 */
package com.xx.mybatis.example.transcation.service;
import com.xx.common.entity.Account;
import com.xx.mybatis.example.transcation.dao.oracle.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * [概 要] 描述类 <br/>
 * [环 境] J2SE 1.7
 *
 * @author 研发部-张光富
 * @version 1.0
 */
@Service("accountService")
public class AccountService {

    @Autowired
    private AccountMapper accountMapper;

    public void save(Account account){
        accountMapper.insert(account);
    }

    public Account findById(int id){
        return accountMapper.selectById(id);
    }

    public Account findById2(int id){
        return accountMapper.selectById2(id);
    }


    public Map<String,String> findMapById(int id){
        return accountMapper.selectResultMapById(id);
    }
}
