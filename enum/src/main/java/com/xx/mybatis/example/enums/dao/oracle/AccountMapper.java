package com.xx.mybatis.example.enums.dao.oracle;


import com.xx.common.entity.Account;

import java.util.Map;

public interface AccountMapper {
    int insert(Account record);

    int insertSelective(Account record);

    Account selectById(int id);

    Account selectById2(int id);

    Map selectResultMapById(int id);

}