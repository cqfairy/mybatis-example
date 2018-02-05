package com.xx.mybatis.example.transcation.dao.oracle;


import com.xx.common.entity.UserInfo;

public interface UserInfoMapper {
    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectById(int id);

    UserInfo selectById2(int id);
}