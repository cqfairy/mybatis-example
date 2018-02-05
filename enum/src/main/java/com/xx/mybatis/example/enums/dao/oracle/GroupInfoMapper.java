/*
 * Copyright (c) 天畅伟业科技有限公司 2017
 * 本著作物的著作权归天畅伟业有限公司所有。
 * -----------------------------------------------
 * 修改记录 :
 * 日 期          版本          修改人         修改内容
 *
 */
package com.xx.mybatis.example.enums.dao.oracle;

import com.xx.common.dto.GroupDto;
import com.xx.common.entity.GroupInfo;

import java.util.Map;

/**
 * [概 要] 描述类 <br/>
 * [环 境] J2SE 1.7
 *
 * @author 研发部-张光富
 * @version 1.0
 */
public interface GroupInfoMapper {

    int insert(GroupInfo record);

    int insertSelective(GroupInfo record);

    GroupInfo selectById(int id);

    GroupInfo selectByPrimaryKey(int id);

    GroupDto selectDetailById(int id);

}
