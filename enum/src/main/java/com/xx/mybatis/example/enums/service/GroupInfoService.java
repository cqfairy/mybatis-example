package com.xx.mybatis.example.enums.service;

import com.xx.common.entity.GroupInfo;
import com.xx.common.entity.UserInfo;
import com.xx.mybatis.example.enums.dao.oracle.GroupInfoMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by 欣欣 on 2017/7/20.
 */
@Service("groupInfoService")
public class GroupInfoService {

    private Logger logger = LoggerFactory.getLogger(GroupInfoService.class);

    @Autowired
    private GroupInfoMapper groupInfoMapper ;

    @Transactional()
    public GroupInfo findUserById(int id){
        return groupInfoMapper.selectById(id);
    }

    @Transactional()
    public GroupInfo findDetailById(int id){
        return groupInfoMapper.selectDetailById(id);
    }

    @Transactional()
    public void save(GroupInfo groupInfo){
        saveGroupInfo(groupInfo);
    }

    @Transactional
    public void saveGroupInfo(GroupInfo groupInfo){
        groupInfoMapper.insert(groupInfo);
    }



    public boolean saveGroups(List<GroupInfo> userInfos){
//        return ((UserInfoService)AopContext.currentProxy()).saveUsers2(userInfos);
        return saveGroups2(userInfos);
    }


    @Transactional
    public boolean saveGroups2(List<GroupInfo> groupInfos){
        int userInfosSize = groupInfos.size();
        for (int i = 0 ; i < userInfosSize;i++){
//            if(i == 1)
//                throw new RuntimeException("数据异常");
            groupInfoMapper.insert(groupInfos.get(i));
        }
        return true;
    }
}
