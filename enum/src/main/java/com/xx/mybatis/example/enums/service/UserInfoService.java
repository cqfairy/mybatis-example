package com.xx.mybatis.example.enums.service;

import com.xx.common.entity.UserInfo;
import com.xx.mybatis.example.enums.dao.oracle.UserInfoMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by 欣欣 on 2017/7/20.
 */
@Service("userInfoService")
public class UserInfoService {

    private Logger logger = LoggerFactory.getLogger(UserInfoService.class);

    @Autowired
    private UserInfoMapper userInfoMapper ;

    @Transactional()
    public UserInfo findUserById(int id){
        return userInfoMapper.selectById(id);
    }

    @Transactional()
    public UserInfo findUserById2(int id){
        return userInfoMapper.selectById2(id);
    }

    @Transactional()
    public void save(UserInfo userInfo){
        saveUserInfo(userInfo);
    }

    @Transactional
    public void saveUserInfo(UserInfo userInfo){
        userInfoMapper.insert(userInfo);
    }



    public boolean saveUsers(List<UserInfo> userInfos){
//        return ((UserInfoService)AopContext.currentProxy()).saveUsers2(userInfos);
        return saveUsers2(userInfos);
    }


    @Transactional
    public boolean saveUsers2(List<UserInfo> userInfos){
        int userInfosSize = userInfos.size();
        for (int i = 0 ; i < userInfosSize;i++){
//            if(i == 1)
//                throw new RuntimeException("数据异常");
            userInfoMapper.insert(userInfos.get(i));
        }
        return true;
    }
}
